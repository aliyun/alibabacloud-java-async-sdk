// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Key} extends {@link TeaModel}
 *
 * <p>Key</p>
 */
public class Key extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("prefix")
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("suffix")
    private String suffix;

    private Key(Builder builder) {
        this.prefix = builder.prefix;
        this.suffix = builder.suffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Key create() {
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

        public Key build() {
            return new Key(this);
        } 

    } 

}
