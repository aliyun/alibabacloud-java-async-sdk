// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTopicRequest} extends {@link RequestModel}
 *
 * <p>DeleteTopicRequest</p>
 */
public class DeleteTopicRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("topicName")
    @Validation(required = true)
    private String topicName;

    private DeleteTopicRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTopicRequest create() {
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
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<DeleteTopicRequest, Builder> {
        private String instanceId; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTopicRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.topicName = request.topicName;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 主题名称
         */
        public Builder topicName(String topicName) {
            this.putPathParameter("topicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public DeleteTopicRequest build() {
            return new DeleteTopicRequest(this);
        } 

    } 

}
