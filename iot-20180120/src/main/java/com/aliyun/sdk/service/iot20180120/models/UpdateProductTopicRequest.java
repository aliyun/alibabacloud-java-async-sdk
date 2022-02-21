// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductTopicRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductTopicRequest</p>
 */
public class UpdateProductTopicRequest extends Request {
    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("Operation")
    @Validation(required = true)
    private String operation;

    @Query
    @NameInMap("TopicId")
    @Validation(required = true)
    private String topicId;

    @Query
    @NameInMap("TopicShortName")
    @Validation(required = true)
    private String topicShortName;

    private UpdateProductTopicRequest(Builder builder) {
        super(builder);
        this.desc = builder.desc;
        this.iotInstanceId = builder.iotInstanceId;
        this.operation = builder.operation;
        this.topicId = builder.topicId;
        this.topicShortName = builder.topicShortName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductTopicRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return topicId
     */
    public String getTopicId() {
        return this.topicId;
    }

    /**
     * @return topicShortName
     */
    public String getTopicShortName() {
        return this.topicShortName;
    }

    public static final class Builder extends Request.Builder<UpdateProductTopicRequest, Builder> {
        private String desc; 
        private String iotInstanceId; 
        private String operation; 
        private String topicId; 
        private String topicShortName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductTopicRequest response) {
            super(response);
            this.desc = response.desc;
            this.iotInstanceId = response.iotInstanceId;
            this.operation = response.operation;
            this.topicId = response.topicId;
            this.topicShortName = response.topicShortName;
        } 

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
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
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
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

        /**
         * TopicShortName.
         */
        public Builder topicShortName(String topicShortName) {
            this.putQueryParameter("TopicShortName", topicShortName);
            this.topicShortName = topicShortName;
            return this;
        }

        @Override
        public UpdateProductTopicRequest build() {
            return new UpdateProductTopicRequest(this);
        } 

    } 

}
