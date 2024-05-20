// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TextTheme} extends {@link TeaModel}
 *
 * <p>TextTheme</p>
 */
public class TextTheme extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("desc")
    private String desc;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private TextTheme(Builder builder) {
        this.desc = builder.desc;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TextTheme create() {
        return builder().build();
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String desc; 
        private String name; 

        /**
         * desc.
         */
        public Builder desc(String desc) {
            this.desc = desc;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public TextTheme build() {
            return new TextTheme(this);
        } 

    } 

}
