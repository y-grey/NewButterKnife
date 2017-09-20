package butterknife;

import android.support.annotation.LayoutRes;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.RetentionPolicy.CLASS;
import static java.lang.annotation.ElementType.TYPE;

/**
 * Created by _yph on 2017/5/1 0001.
 */

@Retention(CLASS) @Target(TYPE)
public @interface BindLayout {
    @LayoutRes int value();
}
