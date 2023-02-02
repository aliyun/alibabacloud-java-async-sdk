// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsConsumerTimeSpanRequest} extends {@link RequestModel}
 *
 * <p>OnsConsumerTimeSpanRequest</p>
 */
public class OnsConsumerTimeSpanRequest extends Request {
    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private String topic;

    private OnsConsumerTimeSpanRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.instanceId = builder.instanceId;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsConsumerTimeSpanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
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

    public static final class Builder extends Request.Builder<OnsConsumerTimeSpanRequest, Builder> {
        private String groupId; 
        private String instanceId; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(OnsConsumerTimeSpanRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.instanceId = request.instanceId;
            this.topic = request.topic;
        } 

        /**
         * The ID of the consumer group whose reset time range you want to query.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The ID of the instance to which the consumer group belongs.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The topic to which the consumer group subscribes.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public OnsConsumerTimeSpanRequest build() {
            return new OnsConsumerTimeSpanRequest(this);
        } 

    } 

}
