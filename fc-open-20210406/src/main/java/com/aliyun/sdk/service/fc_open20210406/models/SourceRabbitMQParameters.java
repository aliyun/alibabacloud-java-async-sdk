// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SourceRabbitMQParameters} extends {@link TeaModel}
 *
 * <p>SourceRabbitMQParameters</p>
 */
public class SourceRabbitMQParameters extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @NameInMap("QueueName")
    @Validation(required = true)
    private String queueName;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("VirtualHostName")
    @Validation(required = true)
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

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.queueName = queueName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * VirtualHostName.
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
