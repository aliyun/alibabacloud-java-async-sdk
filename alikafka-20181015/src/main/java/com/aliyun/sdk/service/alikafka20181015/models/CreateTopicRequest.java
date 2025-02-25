// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20181015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTopicRequest} extends {@link RequestModel}
 *
 * <p>CreateTopicRequest</p>
 */
public class CreateTopicRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Remark")
    @Validation(required = true)
    private String remark;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private CreateTopicRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTopicRequest create() {
        return builder().build();
    }

    @Override
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<CreateTopicRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String remark; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(CreateTopicRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.topic = request.topic;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public CreateTopicRequest build() {
            return new CreateTopicRequest(this);
        } 

    } 

}
