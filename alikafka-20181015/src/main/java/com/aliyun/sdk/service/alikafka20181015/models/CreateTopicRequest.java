// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20181015.models;

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
 * {@link CreateTopicRequest} extends {@link RequestModel}
 *
 * <p>CreateTopicRequest</p>
 */
public class CreateTopicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    @com.aliyun.core.annotation.Validation(required = true)
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_topic_test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_topic_test</p>
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
