package shop.mtcoding.hiberpc.model.board;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class BoardRepository {
    private final EntityManager em;

    public Board findById(int id) {
        return em.find(Board.class, id);
    }

    public List<Board> findALL() {
        return em.createQuery("select u from Board u", Board.class).getResultList();
    }

    public Board save(Board board) {
        if (board.getId() == null) {
            em.persist(board);
        } else { // 더티체킹할 것이기 때문에 쓸일이 없다.
            Board boardPS = em.find(Board.class, board.getId());
            if (boardPS != null) {
                em.merge(board);
            } else {
                System.out.println("잘못된 merger 요청");
            }
        }
        return board;
    }

    public void delete(Board user) {
        em.remove(user);
    }

}
