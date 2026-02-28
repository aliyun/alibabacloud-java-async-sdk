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
 * {@link AsyncRRpcRequest} extends {@link RequestModel}
 *
 * <p>AsyncRRpcRequest</p>
 */
public class AsyncRRpcRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtInfo")
    private String extInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String messageContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicFullName")
    private String topicFullName;

    private AsyncRRpcRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.extInfo = builder.extInfo;
        this.iotInstanceId = builder.iotInstanceId;
        this.messageContent = builder.messageContent;
        this.productKey = builder.productKey;
        this.topicFullName = builder.topicFullName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AsyncRRpcRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return extInfo
     */
    public String getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return messageContent
     */
    public String getMessageContent() {
        return this.messageContent;
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

    public static final class Builder extends Request.Builder<AsyncRRpcRequest, Builder> {
        private String deviceName; 
        private String extInfo; 
        private String iotInstanceId; 
        private String messageContent; 
        private String productKey; 
        private String topicFullName; 

        private Builder() {
            super();
        } 

        private Builder(AsyncRRpcRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.extInfo = request.extInfo;
            this.iotInstanceId = request.iotInstanceId;
            this.messageContent = request.messageContent;
            this.productKey = request.productKey;
            this.topicFullName = request.topicFullName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device1</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * ExtInfo.
         */
        public Builder extInfo(String extInfo) {
            this.putQueryParameter("ExtInfo", extInfo);
            this.extInfo = extInfo;
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
         * 
         * <strong>example:</strong>
         * <p>eyJ0ZXN0IjoidGFzayBwdWIgYnJvYWRjYXN0In0=</p>
         */
        public Builder messageContent(String messageContent) {
            this.putBodyParameter("MessageContent", messageContent);
            this.messageContent = messageContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aldfeSe****</p>
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
        public AsyncRRpcRequest build() {
            return new AsyncRRpcRequest(this);
        } 

    } 

}
