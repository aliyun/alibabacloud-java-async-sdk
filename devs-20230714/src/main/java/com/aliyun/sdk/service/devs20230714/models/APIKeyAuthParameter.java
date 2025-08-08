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
 * {@link APIKeyAuthParameter} extends {@link TeaModel}
 *
 * <p>APIKeyAuthParameter</p>
 */
public class APIKeyAuthParameter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.NameInMap("in")
    private String in;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private APIKeyAuthParameter(Builder builder) {
        this.encrypted = builder.encrypted;
        this.in = builder.in;
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static APIKeyAuthParameter create() {
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
     * @return in
     */
    public String getIn() {
        return this.in;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private Boolean encrypted; 
        private String in; 
        private String key; 
        private String value; 

        private Builder() {
        } 

        private Builder(APIKeyAuthParameter model) {
            this.encrypted = model.encrypted;
            this.in = model.in;
            this.key = model.key;
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
         * in.
         */
        public Builder in(String in) {
            this.in = in;
            return this;
        }

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public APIKeyAuthParameter build() {
            return new APIKeyAuthParameter(this);
        } 

    } 

}
