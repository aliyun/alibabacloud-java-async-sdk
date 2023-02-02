// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsTopicStatusRequest} extends {@link RequestModel}
 *
 * <p>OnsTopicStatusRequest</p>
 */
public class OnsTopicStatusRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsTopicStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsTopicStatusRequest create() {
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
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<OnsTopicStatusRequest, Builder> {
        private String instanceId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsTopicStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topic = request.topic;
        } 

        /**
         * The ID of the instance that contains the topic you want to query.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the topic that you want to query.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsTopicStatusRequest build() {
            return new OnsTopicStatusRequest(this);
        } 

    } 

}
