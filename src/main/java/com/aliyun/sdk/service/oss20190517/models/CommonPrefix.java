// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder {
        private String prefix; 

        /**
         * The prefix that the names of returned objects contain
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
