public class ch_16_09
{
    /*
    Write a method called stutter that doubles the size of a list by replacing every integer in the list with two
    of that integer. For example, suppose a variable list stores the values [1, 8, 19, 4, 17], after a call of
    list.stutter(), it should store [1, 1, 8, 8, 19, 19, 4, 4, 17, 17].
    */

    public static void main(String[] args)
    {
        LinkedIntList LL = new LinkedIntList();
        LL.add(1);
        LL.add(8);
        LL.add(19);
        LL.add(4);
        LL.add(17);

        stutter(LL);
    }
    public static LinkedIntList stutter(LinkedIntList list) {
        LinkedIntList LI = new LinkedIntList();
        boolean isEmpty = false;
        for (int i = 0; i < list.size() ; i++)
        {
            LI.add(LI.size(), list.get(i));
            LI.add(LI.size(), list.get(i));
        }
            for (int j = 0; 0 >= list.size(); j++)
            {
                list.remove(j);
            }

        for (int p = 0; p < LI.size() ; p++)
        {
            list.add(LI.get(p));
        }
        System.out.println(LI);
        return LI;
    }
}
