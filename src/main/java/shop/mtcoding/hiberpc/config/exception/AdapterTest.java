package shop.mtcoding.hiberpc.config.exception;

interface 칼 {
    default void 킬() {
    };

    default void 요리() {
    };
}

// abstract class 요리칼어댑터 implements 칼{
// @Override
// public void 킬() {
// }
// }

class 백종원 implements 칼 {
    @Override
    public void 요리() {

    }
}

public class AdapterTest {

}
