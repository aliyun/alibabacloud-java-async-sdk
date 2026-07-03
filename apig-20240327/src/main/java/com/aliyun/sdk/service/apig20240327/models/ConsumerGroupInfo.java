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
 * {@link ConsumerGroupInfo} extends {@link TeaModel}
 *
 * <p>ConsumerGroupInfo</p>
 */
public class ConsumerGroupInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("consumerGroupId")
    private String consumerGroupId;

    @com.aliyun.core.annotation.NameInMap("gatewayType")
    private String gatewayType;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ConsumerGroupInfo(Builder builder) {
        this.consumerGroupId = builder.consumerGroupId;
        this.gatewayType = builder.gatewayType;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsumerGroupInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupId
     */
    public String getConsumerGroupId() {
        return this.consumerGroupId;
    }

    /**
     * @return gatewayType
     */
    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String consumerGroupId; 
        private String gatewayType; 
        private String name; 

        private Builder() {
        } 

        private Builder(ConsumerGroupInfo model) {
            this.consumerGroupId = model.consumerGroupId;
            this.gatewayType = model.gatewayType;
            this.name = model.name;
        } 

        /**
         * consumerGroupId.
         */
        public Builder consumerGroupId(String consumerGroupId) {
            this.consumerGroupId = consumerGroupId;
            return this;
        }

        /**
         * gatewayType.
         */
        public Builder gatewayType(String gatewayType) {
            this.gatewayType = gatewayType;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ConsumerGroupInfo build() {
            return new ConsumerGroupInfo(this);
        } 

    } 

}
