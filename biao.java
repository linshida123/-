public class biao

{

         publicstatic void main(String[] args)

         {

                   //外层循环控制行数

                   for(inti = 1; i <= 9;  i++)

                   {

                            //内层循环控制每行表达式个数

                            for(intj = 1; j <= i; j++)

                            {

                                     System.out.print("" + i + "*" + j + "=" + (i * j));

                            }

                            //一行结束换行

                            System.out.println();

                   }

         }

}
