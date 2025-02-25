// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link GetConsumerProgressRequest} extends {@link RequestModel}
 *
 * <p>GetConsumerProgressRequest</p>
 */
public class GetConsumerProgressRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consumerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HideLastTimestamp")
    private Boolean hideLastTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetConsumerProgressRequest(Builder builder) {
        super(builder);
        this.consumerId = builder.consumerId;
        this.hideLastTimestamp = builder.hideLastTimestamp;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConsumerProgressRequest create() {
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
     * @return hideLastTimestamp
     */
    public Boolean getHideLastTimestamp() {
        return this.hideLastTimestamp;
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

    public static final class Builder extends Request.Builder<GetConsumerProgressRequest, Builder> {
        private String consumerId; 
        private Boolean hideLastTimestamp; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetConsumerProgressRequest request) {
            super(request);
            this.consumerId = request.consumerId;
            this.hideLastTimestamp = request.hideLastTimestamp;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The name of the consumer group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kafka-test</p>
         */
        public Builder consumerId(String consumerId) {
            this.putQueryParameter("ConsumerId", consumerId);
            this.consumerId = consumerId;
            return this;
        }

        /**
         * <p>Specifies whether to hide LastTimestamp. Default value: false. We recommend that you set this parameter to true.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you set this parameter to true, -1 is returned for LastTimestamp. If you set this parameter to false, a specific value is returned for LastTimestamp. This parameter is supported only by topics that use cloud storage on reserved instances.</p>
         * </li>
         * <li><p>A large amount of data is processed by this operation, which causes performance loss. We recommend that you set this parameter to true to accelerate processing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hideLastTimestamp(Boolean hideLastTimestamp) {
            this.putQueryParameter("HideLastTimestamp", hideLastTimestamp);
            this.hideLastTimestamp = hideLastTimestamp;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-mp919o4v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetConsumerProgressRequest build() {
            return new GetConsumerProgressRequest(this);
        } 

    } 

}
