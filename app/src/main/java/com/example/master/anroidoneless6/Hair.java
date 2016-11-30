package com.example.master.anroidoneless6;

/**
 * Created by Master on 28.11.2016.
 */

public class Hair extends MyPage {
    public Hair(String name, String description, int imageId){
        super(name, description, imageId);
    }

    private static final String hairBeforeName = "Передние причёски";
    private static final String hairBeforeDesc = "Они подразумевают укладку волос от затылочной к теменной области. Подходят к локонам абсолютно любой длины, но лучше всего смотрятся на средних и длинных волосах. Причёски такого типа чаще всего делаются на квадратную, прямоугольную и вытянутую овальную формы лица, чтобы скрыть видимые недостатки: широкие скулы, большой подбородок и т. д.";

    private static final String hairReverseName = "Обратные причёски ";
    private static final String hairReverseDesc = "Этот вид подразумевает укладку волос от теменной области к затылку — зачёс назад. У причёсок этого типа не бывает чёлок, а подходят они в основном женщинам с овальной, круглой и треугольной формой лица, а также и другим при условии явных достоинств. Если вы хотите, наоборот, скрыть недостатки своего лица, то такая причёска вам не подойдёт. Также стоит заметить, что среди причёсок данного типа довольно много женских свадебных причёсок.";

    private static final String hairFlowingName = "Ниспадающие причёски";
    private static final String hairFlowingDesc = "Как вы, наверное, могли бы догадаться — это причёски, суть которых заключается в свободно лежащих распущенных волосах, в общем, этот вид причёсок придуман для девушек, которые хотят показать красоту и изящность своих волос, а подходят они практически для любой ситуации. Заметим, что к данному виду причёсок относятся как каре, так и «косы до пояса», то есть ограничений по длине волос нет. Также заметим, что абсолютно все причёски из этого разряда имеют прямой пробор.";

    private static final String hairClassicName = "Классика";
    private static final String hairClassicDesc = "Название этого вида звучит слишком обширно, поэтому я поясню вам его значение. Классические причёски  — это причёски, что на протяжении многих лет не выходят из моды. К ним относятся: стрижка боб, верхний пучок, классическая коса и т. д. Также подобные причёски сейчас очень популярны для подростков.";


    public static final Hair[] hairs = {
            new Hair(hairBeforeName,     hairBeforeDesc,     R.drawable.hair_before),
            new Hair(hairReverseName,    hairReverseDesc,    R.drawable.hair_reverse),
            new Hair(hairFlowingName,    hairFlowingDesc,    R.drawable.hair_flowing),
            new Hair(hairClassicName,    hairClassicDesc,    R.drawable.hair_classic)};
}
