// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link TagCondition} extends {@link TeaModel}
 *
 * <p>TagCondition</p>
 */
public class TagCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("op")
    private String op;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private TagCondition(Builder builder) {
        this.key = builder.key;
        this.op = builder.op;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TagCondition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return op
     */
    public String getOp() {
        return this.op;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String key; 
        private String op; 
        private String value; 

        private Builder() {
        } 

        private Builder(TagCondition model) {
            this.key = model.key;
            this.op = model.op;
            this.value = model.value;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * op.
         */
        public Builder op(String op) {
            this.op = op;
            return this;
        }

        /**
         * value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public TagCondition build() {
            return new TagCondition(this);
        } 

    } 

}
