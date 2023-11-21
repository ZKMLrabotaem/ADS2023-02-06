package by.it.group251001.smychek.lesson13;

import by.it.HomeWork;
import org.junit.Test;

@SuppressWarnings("NewClassNamingConvention")
public class Test_Part2_Lesson13 extends HomeWork {
    @Test
    public void testGraphA() {
        run("0 -> 1", true).include("0 1");
        run("0 -> 1, 1 -> 2", true).include("0 1 2");
        run("0 -> 2, 1 -> 2, 0 -> 1", true).include("0 1 2");
        run("0 -> 2, 1 -> 3, 2 -> 3, 0 -> 1", true).include("0 1 2 3");
        run("1 -> 3, 2 -> 3, 2 -> 3, 0 -> 1, 0 -> 2", true).include("0 1 2 3");
        run("0 -> 1, 0 -> 2, 0 -> 2, 1 -> 3, 1 -> 3, 2 -> 3", true).include("0 1 2 3");
        run("A -> B, A -> C, B -> D, C -> D", true).include("A B C D");
        run("A -> B, A -> C, B -> D, C -> D, A -> D", true).include("A B C D");
        run("A -> B, A -> C, A -> D, B -> E, B -> F, C -> G, D -> H, D -> I, E -> J, F -> J, G -> K, H -> L",true).include("A B C D E F G H I J K L");
        run("A -> B, B -> C, C -> D", true).include("A B C D");
        run("A -> B, B -> C, C -> D, D -> E, E -> F", true).include("A B C D E F");
        run("I -> J, K -> L, J -> K, K -> M", true).include("I J K L M");
        run("A -> B, B -> C, C -> D, C -> E, E -> F, E -> G, G -> H", true).include("A B C D E F G H");
        run("A -> B, B -> C, C -> D, C -> E, E -> F, E -> G, G -> H", true).include("A B C D E F G H");
        run("0 -> 1, 1 -> 3, 1 -> 2, 1 -> 5, 2 -> 3, 2 -> 4, 3 -> 4, 4 -> 5", true).include("0 1 2 3 4 5");
        run("5 -> 4, 5 -> 2, 4 -> 3, 4 -> 2, 3 -> 2, 3 -> 1, 3 -> 0, 2 -> 1, 1 -> 0", true).include("5 4 3 2 1 0");
    }

    @Test
    public void testGraphB() {
        run("0 -> 1", true).include("no").exclude("yes");
        run("0 -> 1, 1 -> 2", true).include("no").exclude("yes");
        run("0 -> 1, 1 -> 2, 2 -> 0", true).include("yes").exclude("no");
        run("0 -> 1, 1 -> 3, 2 -> 3, 0 -> 2", true).include("no").exclude("yes");
        run("0 -> 1, 1 -> 3, 2 -> 3, 0 -> 2, 3 -> 0", true).include("yes").exclude("no");
        run("0 -> 1, 1 -> 3, 1 -> 2, 1 -> 5, 2 -> 3, 2 -> 4, 3 -> 4, 4 -> 5", true).include("no").exclude("yes");
        run("0 -> 1, 1 -> 3, 1 -> 2, 1 -> 5, 2 -> 3, 2 -> 4, 3 -> 4, 4 -> 5, 4 -> 1", true).include("yes").exclude("no");
        run("0 -> 1, 1 -> 3, 1 -> 2, 1 -> 5, 2 -> 3, 2 -> 4, 3 -> 4, 4 -> 5, 5 -> 0", true).include("yes").exclude("no");
        run("0 -> 1, 0 -> 3, 1 -> 2, 1 -> 3, 2 -> 3, 2 -> 4, 2 -> 5, 3 -> 4, 4 -> 5", true).include("no").exclude("yes");
    }

    @Test
    public void testGraphC() {
        run("1->2, 2->3, 3->1, 3->4, 4->5, 5->6, 6->4", true)
                .include("123\n456");
        run("C->B, C->I, I->A, A->D, D->I, D->B, B->H, H->D, D->E, H->E, E->G, A->F, G->F, F->K, K->G", true)
                .include("C\nABDHI\nE\nFGK");
        //Дополните эти тесты СВОИМИ более сложными примерами и проверьте их работоспособность.
        //Параметр метода run - это ввод. Параметр метода include - это вывод.
        //Общее число примеров должно быть не менее 8 (сейчас их 2).
    }


}