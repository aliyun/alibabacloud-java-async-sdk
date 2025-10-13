// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link LabelDetail} extends {@link TeaModel}
 *
 * <p>LabelDetail</p>
 */
public class LabelDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("values")
    private java.util.List<String> values;

    private LabelDetail(Builder builder) {
        this.key = builder.key;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LabelDetail create() {
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
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String key; 
        private java.util.List<String> values; 

        private Builder() {
        } 

        private Builder(LabelDetail model) {
            this.key = model.key;
            this.values = model.values;
        } 

        /**
         * key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * values.
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public LabelDetail build() {
            return new LabelDetail(this);
        } 

    } 

}
