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
 * {@link ConsumerConfig} extends {@link TeaModel}
 *
 * <p>ConsumerConfig</p>
 */
public class ConsumerConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("consumerId")
    private String consumerId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ConsumerConfig(Builder builder) {
        this.consumerId = builder.consumerId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsumerConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerId
     */
    public String getConsumerId() {
        return this.consumerId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String consumerId; 
        private String name; 

        private Builder() {
        } 

        private Builder(ConsumerConfig model) {
            this.consumerId = model.consumerId;
            this.name = model.name;
        } 

        /**
         * consumerId.
         */
        public Builder consumerId(String consumerId) {
            this.consumerId = consumerId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ConsumerConfig build() {
            return new ConsumerConfig(this);
        } 

    } 

}
