// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link SparkConf} extends {@link TeaModel}
 *
 * <p>SparkConf</p>
 */
public class SparkConf extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.NameInMap("value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private SparkConf(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SparkConf create() {
        return builder().build();
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
        private String key; 
        private String value; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public SparkConf build() {
            return new SparkConf(this);
        } 

    } 

}
