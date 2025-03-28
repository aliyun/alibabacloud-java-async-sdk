// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link Variable} extends {@link TeaModel}
 *
 * <p>Variable</p>
 */
public class Variable extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.NameInMap("sensitive")
    private Boolean sensitive;

    @com.aliyun.core.annotation.NameInMap("value")
    private Object value;

    private Variable(Builder builder) {
        this.encrypted = builder.encrypted;
        this.sensitive = builder.sensitive;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Variable create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return sensitive
     */
    public Boolean getSensitive() {
        return this.sensitive;
    }

    /**
     * @return value
     */
    public Object getValue() {
        return this.value;
    }

    public static final class Builder {
        private Boolean encrypted; 
        private Boolean sensitive; 
        private Object value; 

        private Builder() {
        } 

        private Builder(Variable model) {
            this.encrypted = model.encrypted;
            this.sensitive = model.sensitive;
            this.value = model.value;
        } 

        /**
         * encrypted.
         */
        public Builder encrypted(Boolean encrypted) {
            this.encrypted = encrypted;
            return this;
        }

        /**
         * sensitive.
         */
        public Builder sensitive(Boolean sensitive) {
            this.sensitive = sensitive;
            return this;
        }

        /**
         * value.
         */
        public Builder value(Object value) {
            this.value = value;
            return this;
        }

        public Variable build() {
            return new Variable(this);
        } 

    } 

}
