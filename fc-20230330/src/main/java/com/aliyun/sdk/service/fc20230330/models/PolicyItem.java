// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PolicyItem} extends {@link TeaModel}
 *
 * <p>PolicyItem</p>
 */
public class PolicyItem extends TeaModel {
    @NameInMap("key")
    private String key;

    @NameInMap("operator")
    private String operator;

    @NameInMap("type")
    private String type;

    @NameInMap("value")
    private String value;

    private PolicyItem(Builder builder) {
        this.key = builder.key;
        this.operator = builder.operator;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PolicyItem create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String key; 
        private String operator; 
        private String type; 
        private String value; 

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public PolicyItem build() {
            return new PolicyItem(this);
        } 

    } 

}
