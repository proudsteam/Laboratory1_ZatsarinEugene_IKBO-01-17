package android.example.laboratorynumber1;

public class PrintWord {
    private int n;

    public PrintWord() {
    }

    String printOfWord(int n)
    {
        int a=0;
        int size=0;
        int n1=n;
        int n2=n;
        while (n1!=0)
        {
            n1/=10;
            size++;

        }

        String[] words = new String[size];
        int fN = n % 10;
        int it = 0;
        if (n==1000000) {
            words[6] = "";
            words[5] = "";
            words[4] = "";
            words[3] = "";
            words[2] = "";
            words[1] = "";
            words[0] = "миллион";
            String allWord="";
            for (int i=words.length-1; i!=-1;i--)
                allWord+=words[i];

            return allWord;
        }
        while(n!=0)
        {
            a=n%10;
            n/=10;

            if (a == 0)   words[it] = "";
            else {


                if ((it == 3)) {
                    if (a == 1) words[it] = "одна тысяча";
                    else if (a == 2) words[it] = "две тысячи";
                    else if (a == 3) words[it] = "три тысячи";
                    else if (a == 4) words[it] = "четыре тысячи";
                    else if (a == 5) words[it] = "пять тысяч";
                    else if (a == 6) words[it] = "шесть тысяч";
                    else if (a == 7) words[it] = "семь тысяч";
                    else if (a == 8) words[it] = "восемь тысяч";
                    else words[it] = "девять тысяч";
                }

                if (((it == 2) || (it == 5))) {
                    if (a == 1) words[it] = "сто";
                    else if (a == 2) words[it] = "двести";
                    else if (a == 3) words[it] = "тристо";
                    else if (a == 4) words[it] = "четыресто";
                    else if (a == 5) words[it] = "пятьсот";
                    else if (a == 6) words[it] = "шестьсот";
                    else if (a == 7) words[it] = "семьсот";
                    else if (a == 8) words[it] = "восемьсот";
                    else words[it] = "девятьсот";
                    if (it == 5)
                        words[it] += " тысяч";
                }

                if (((it == 1) || (it == 4))) {

                    if (it == 4) {
                        fN = n2 / 1000;
                        fN = fN % 10;
                    }

                    if (a == 1) {
                        a = a * 10 + fN;
                        switch (a) {
                            case 10:
                                words[it] = "десять";
                                words[it - 1] = "";
                                break;
                            case 11:
                                words[it] = "одиннадцать";
                                words[it - 1] = "";
                                break;
                            case 12:
                                words[it] = "двеннадцать";
                                words[it - 1] = "";
                                break;
                            case 13:
                                words[it] = "тринадцать";
                                words[it - 1] = "";
                                break;
                            case 14:
                                words[it] = "четырнадцать";
                                words[it - 1] = "";
                                break;
                            case 15:
                                words[it] = "пятнадцать";
                                words[it - 1] = "";
                                break;
                            case 16:
                                words[it] = "шестнадцать";
                                words[it - 1] = "";
                                break;
                            case 17:
                                words[it] = "семнадцать";
                                words[it - 1] = "";
                                break;
                            case 18:
                                words[it] = "восемнадцать";
                                words[it - 1] = "";
                                break;
                            case 19:
                                words[it] = "девятнадцать";
                                words[it - 1] = "";
                                break;

                        }
                    } else if (a == 2) {
                        words[it] = "двадвать";
                    } else if (a == 3) {
                        words[it] = "тридцать";
                    } else if (a == 4) {
                        words[it] = "сорок";
                    } else if (a == 5) {
                        words[it] = "пятьдесят";
                    } else if (a == 6) {
                        words[it] = "шестьдесят";
                    } else if (a == 7) {
                        words[it] = "семьдесят";
                    } else if (a == 8) {
                        words[it] = "восемьдесят";
                    } else  {
                        words[it] = "девяносто";
                    }
                    if (it == 4)
                        words[it] += " тысяч";
                }

                if ((it == 0)) {
                    if (a == 1)
                        words[it] = "один";
                    else if (a == 2) words[it] = "два";
                    else if (a == 3) words[it] = "три";
                    else if (a == 4) words[it] = "четыре";
                    else if (a == 5) words[it] = "пять";
                    else if (a == 6) words[it] = "шесть";
                    else if (a == 7) words[it] = "семь";
                    else if (a == 8) words[it] = "восемь";
                    else words[it] = "девять";
                }
                if (it >= 1)
                    words[it] += " ";
            }

            it++;
        }

        String allWord="";
        for (int i=words.length-1; i!=-1;i--)
            allWord+=words[i];

        return allWord;

    }
}
