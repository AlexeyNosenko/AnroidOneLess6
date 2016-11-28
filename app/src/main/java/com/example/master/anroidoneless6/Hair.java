package com.example.master.anroidoneless6;

/**
 * Created by Master on 28.11.2016.
 */

public class Hair extends MyPage {
    public Hair(String name, String description, int imageId){
        super(name, description, imageId);
    }

    public static final Nail[] nails = {
            new Nail("Классический маникюр",
                    "Классический обрезной маникюр подходит для любого состояния ногтей. Процедура начинается с обязательной обработки кожи рук специальным дезинфицирующим средством. Ногтям придается желаемая форма. Руки погружают в теплый раствор, после чего размягченную кутикулу удаляют маникюрными щипчиками, избавляются от заусенцев. В конце процедуры массажными движениями на кожу вокруг ногтя наносится питательное масло – оно оказывает заживляющее воздействие, питает ногтевую пластину.",
                    R.drawable.kl_man),
            new Nail("Аппаратный маникюр",
                    "Отличное решение для проблемных ногтей. Аппаратный маникюр будет эффективен как при поврежденной ногтевой пластине, так и при различных грибковых инфекциях. Аппаратный маникюр выполняется с использованием специального аппарата: боры и фрезы устраняют ороговевшие участки эпидермиса вокруг ногтевого ложа, придают форму ногтям, оставляя кутикулу без повреждений. Маникюр обязательно делают только на сухой коже, что полностью исключает травматизм и риск заражения. Процедура абсолютно               безопасна и безболезненна.",
                    R.drawable.ap_man),
            new Nail("Аппаратный педикюр",
                    "Благодаря особой технике проведения аппаратного педикюра - решение  проблем стопы, вросшего ногтя, трещин, мозолей, грибковых заболеваний - становится реальным. Аппаратный педикюр абсолютно гигиеничен. Стопа не подвергается распариванию в воде, а обрабатывается специальным смягчающим средством для ороговевшей кожи. В качестве инструментов для обработки ногтей, кутикулы и загрубевшей кожи –используют профессиональные насадки, боры и фрезы различных размеров и диаметров. Они удаляют жесткий роговой слой, не трогая здоровую кожу, что  делает процедуру полностью безболезненной.",
                    R.drawable.ap_ped) };
}
