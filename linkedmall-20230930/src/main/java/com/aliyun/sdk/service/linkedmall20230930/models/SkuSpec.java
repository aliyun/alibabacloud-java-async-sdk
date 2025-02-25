// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link SkuSpec} extends {@link TeaModel}
 *
 * <p>SkuSpec</p>
 */
public class SkuSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("keyId")
    private Long keyId;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    @com.aliyun.core.annotation.NameInMap("valueAlias")
    private String valueAlias;

    @com.aliyun.core.annotation.NameInMap("valueId")
    private Long valueId;

    private SkuSpec(Builder builder) {
        this.key = builder.key;
        this.keyId = builder.keyId;
        this.value = builder.value;
        this.valueAlias = builder.valueAlias;
        this.valueId = builder.valueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SkuSpec create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return keyId
     */
    public Long getKeyId() {
        return this.keyId;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    /**
     * @return valueAlias
     */
    public String getValueAlias() {
        return this.valueAlias;
    }

    /**
     * @return valueId
     */
    public Long getValueId() {
        return this.valueId;
    }

    public static final class Builder {
        private String key; 
        private Long keyId; 
        private String value; 
        private String valueAlias; 
        private Long valueId; 

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * keyId.
         */
        public Builder keyId(Long keyId) {
            this.keyId = keyId;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /**
         * valueAlias.
         */
        public Builder valueAlias(String valueAlias) {
            this.valueAlias = valueAlias;
            return this;
        }

        /**
         * valueId.
         */
        public Builder valueId(Long valueId) {
            this.valueId = valueId;
            return this;
        }

        public SkuSpec build() {
            return new SkuSpec(this);
        } 

    } 

}
