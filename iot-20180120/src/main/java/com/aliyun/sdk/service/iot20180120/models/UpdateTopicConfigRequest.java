// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTopicConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateTopicConfigRequest</p>
 */
public class UpdateTopicConfigRequest extends Request {
    @Query
    @NameInMap("EnableBroadcast")
    @Validation(required = true)
    private Boolean enableBroadcast;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("TopicFullName")
    @Validation(required = true)
    private String topicFullName;

    private UpdateTopicConfigRequest(Builder builder) {
        super(builder);
        this.enableBroadcast = builder.enableBroadcast;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.topicFullName = builder.topicFullName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTopicConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableBroadcast
     */
    public Boolean getEnableBroadcast() {
        return this.enableBroadcast;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return topicFullName
     */
    public String getTopicFullName() {
        return this.topicFullName;
    }

    public static final class Builder extends Request.Builder<UpdateTopicConfigRequest, Builder> {
        private Boolean enableBroadcast; 
        private String iotInstanceId; 
        private String productKey; 
        private String topicFullName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTopicConfigRequest request) {
            super(request);
            this.enableBroadcast = request.enableBroadcast;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.topicFullName = request.topicFullName;
        } 

        /**
         * EnableBroadcast.
         */
        public Builder enableBroadcast(Boolean enableBroadcast) {
            this.putQueryParameter("EnableBroadcast", enableBroadcast);
            this.enableBroadcast = enableBroadcast;
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
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * TopicFullName.
         */
        public Builder topicFullName(String topicFullName) {
            this.putQueryParameter("TopicFullName", topicFullName);
            this.topicFullName = topicFullName;
            return this;
        }

        @Override
        public UpdateTopicConfigRequest build() {
            return new UpdateTopicConfigRequest(this);
        } 

    } 

}
