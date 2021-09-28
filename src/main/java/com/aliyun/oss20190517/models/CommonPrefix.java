// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CommonPrefix} extends {@link TeaModel}
 *
 * <p>CommonPrefix</p>
 */
public class CommonPrefix extends TeaModel {
    @NameInMap("Prefix")
    private String prefix;


    private CommonPrefix(Builder builder) {
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommonPrefix create() {
        return builder().build();
    }

    /**
     * @return prefix
     */
    public String prefix() {
        return this.prefix;
    }

    public static final class Builder {
        private String prefix; 

        /**
         * <p>The prefix that the names of returned objects contain</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public CommonPrefix build() {
            return new CommonPrefix(this);
        } 

    } 

}
