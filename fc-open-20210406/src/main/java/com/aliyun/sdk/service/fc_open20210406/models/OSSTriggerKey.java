// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OSSTriggerKey} extends {@link TeaModel}
 *
 * <p>OSSTriggerKey</p>
 */
public class OSSTriggerKey extends TeaModel {
    @NameInMap("prefix")
    private String prefix;

    @NameInMap("suffix")
    private String suffix;

    private OSSTriggerKey(Builder builder) {
        this.prefix = builder.prefix;
        this.suffix = builder.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSTriggerKey create() {
        return builder().build();
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return suffix
     */
    public String getSuffix() {
        return this.suffix;
    }

    public static final class Builder {
        private String prefix; 
        private String suffix; 

        /**
         * prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * suffix.
         */
        public Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        public OSSTriggerKey build() {
            return new OSSTriggerKey(this);
        } 

    } 

}
