// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateTopicConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateTopicConfigRequest</p>
 */
public class CreateTopicConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Codec")
    private String codec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableBroadcast")
    private Boolean enableBroadcast;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableProxySubscribe")
    private Boolean enableProxySubscribe;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicFullName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicFullName;

    private CreateTopicConfigRequest(Builder builder) {
        super(builder);
        this.codec = builder.codec;
        this.description = builder.description;
        this.enableBroadcast = builder.enableBroadcast;
        this.enableProxySubscribe = builder.enableProxySubscribe;
        this.iotInstanceId = builder.iotInstanceId;
        this.operation = builder.operation;
        this.productKey = builder.productKey;
        this.topicFullName = builder.topicFullName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTopicConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return codec
     */
    public String getCodec() {
        return this.codec;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableBroadcast
     */
    public Boolean getEnableBroadcast() {
        return this.enableBroadcast;
    }

    /**
     * @return enableProxySubscribe
     */
    public Boolean getEnableProxySubscribe() {
        return this.enableProxySubscribe;
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

    public static final class Builder extends Request.Builder<CreateTopicConfigRequest, Builder> {
        private String codec; 
        private String description; 
        private Boolean enableBroadcast; 
        private Boolean enableProxySubscribe; 
        private String iotInstanceId; 
        private String operation; 
        private String productKey; 
        private String topicFullName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTopicConfigRequest request) {
            super(request);
            this.codec = request.codec;
            this.description = request.description;
            this.enableBroadcast = request.enableBroadcast;
            this.enableProxySubscribe = request.enableProxySubscribe;
            this.iotInstanceId = request.iotInstanceId;
            this.operation = request.operation;
            this.productKey = request.productKey;
            this.topicFullName = request.topicFullName;
        } 

        /**
         * Codec.
         */
        public Builder codec(String codec) {
            this.putQueryParameter("Codec", codec);
            this.codec = codec;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
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
         * EnableProxySubscribe.
         */
        public Builder enableProxySubscribe(Boolean enableProxySubscribe) {
            this.putQueryParameter("EnableProxySubscribe", enableProxySubscribe);
            this.enableProxySubscribe = enableProxySubscribe;
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
         * <p>This parameter is required.</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder topicFullName(String topicFullName) {
            this.putQueryParameter("TopicFullName", topicFullName);
            this.topicFullName = topicFullName;
            return this;
        }

        @Override
        public CreateTopicConfigRequest build() {
            return new CreateTopicConfigRequest(this);
        } 

    } 

}
