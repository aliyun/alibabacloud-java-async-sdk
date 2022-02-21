// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProductTopicRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductTopicRequest</p>
 */
public class DeleteProductTopicRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("TopicId")
    @Validation(required = true)
    private String topicId;

    private DeleteProductTopicRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.topicId = builder.topicId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductTopicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return topicId
     */
    public String getTopicId() {
        return this.topicId;
    }

    public static final class Builder extends Request.Builder<DeleteProductTopicRequest, Builder> {
        private String iotInstanceId; 
        private String topicId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductTopicRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.topicId = response.topicId;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * TopicId.
         */
        public Builder topicId(String topicId) {
            this.putQueryParameter("TopicId", topicId);
            this.topicId = topicId;
            return this;
        }

        @Override
        public DeleteProductTopicRequest build() {
            return new DeleteProductTopicRequest(this);
        } 

    } 

}
