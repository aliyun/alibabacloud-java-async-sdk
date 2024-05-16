// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConsumerGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteConsumerGroupRequest</p>
 */
public class DeleteConsumerGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteConsumerGroupRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConsumerGroupRequest create() {
        return builder().build();
    }

    @Override
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteConsumerGroupRequest, Builder> {
        private String consumerId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConsumerGroupRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * The name of the consumer group.
         */
        public Builder consumerId(String consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteConsumerGroupRequest build() {
            return new DeleteConsumerGroupRequest(this);
        } 

    } 

}
