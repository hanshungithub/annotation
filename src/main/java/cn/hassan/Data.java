package cn.hassan;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created with idea
 * Author: hss
 * Date: 11/12/2018 6:02 PM
 * Description:
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface Data {
}
