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
 * {@link SourceRabbitMQParameters} extends {@link TeaModel}
 *
 * <p>SourceRabbitMQParameters</p>
 */
public class SourceRabbitMQParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("QueueName")
    private String queueName;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("VirtualHostName")
    private String virtualHostName;

    private SourceRabbitMQParameters(Builder builder) {
        this.instanceId = builder.instanceId;
        this.queueName = builder.queueName;
        this.regionId = builder.regionId;
        this.virtualHostName = builder.virtualHostName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceRabbitMQParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return virtualHostName
     */
    public String getVirtualHostName() {
        return this.virtualHostName;
    }

    public static final class Builder {
        private String instanceId; 
        private String queueName; 
        private String regionId; 
        private String virtualHostName; 

        private Builder() {
        } 

        private Builder(SourceRabbitMQParameters model) {
            this.instanceId = model.instanceId;
            this.queueName = model.queueName;
            this.regionId = model.regionId;
            this.virtualHostName = model.virtualHostName;
        } 

        /**
         * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>amqp-cn-nif22u74****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The queue name of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * <p>The region in which the ApsaraMQ for RabbitMQ instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The vhost name of the ApsaraMQ for RabbitMQ instance.</p>
         * 
         * <strong>example:</strong>
         * <p>eb-connect</p>
         */
        public Builder virtualHostName(String virtualHostName) {
            this.virtualHostName = virtualHostName;
            return this;
        }

        public SourceRabbitMQParameters build() {
            return new SourceRabbitMQParameters(this);
        } 

    } 

}
