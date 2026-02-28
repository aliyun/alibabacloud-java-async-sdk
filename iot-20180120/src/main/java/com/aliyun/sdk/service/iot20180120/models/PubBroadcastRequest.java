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
 * {@link PubBroadcastRequest} extends {@link RequestModel}
 *
 * <p>PubBroadcastRequest</p>
 */
public class PubBroadcastRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
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

    private PubBroadcastRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.messageContent = builder.messageContent;
        this.productKey = builder.productKey;
        this.topicFullName = builder.topicFullName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PubBroadcastRequest create() {
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

    public static final class Builder extends Request.Builder<PubBroadcastRequest, Builder> {
        private String iotInstanceId; 
        private String messageContent; 
        private String productKey; 
        private String topicFullName; 

        private Builder() {
            super();
        } 

        private Builder(PubBroadcastRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.messageContent = request.messageContent;
            this.productKey = request.productKey;
            this.topicFullName = request.topicFullName;
        } 

        /**
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify this parameter. Otherwise, the call fails.</li>
         * <li>If the <strong>Overview</strong> page or an instance ID is not displayed in the IoT Platform console, ignore this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The message body that you want to send. The maximum size of a message is 64 KB.</p>
         * <p>To generate a message body, you must convert the raw message into binary data and perform Base64 encoding.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aGVsbG93b3JsZA</p>
         */
        public Builder messageContent(String messageContent) {
            this.putQueryParameter("MessageContent", messageContent);
            this.messageContent = messageContent;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the devices belong.</p>
         * <p>A <strong>ProductKey</strong> is the unique identifier of a product in IoT Platform. You can view the information about all products within the current Alibaba Cloud account in the IoT Platform console or by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aldeji3*****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The name of the topic. This parameter is optional.</p>
         * <ul>
         * <li>If you do not specify this parameter, the message is pushed to all online devices that have the specified <strong>ProductKey</strong>. Devices receive the message from the broadcast topic in the following format: <code>/sys/${productKey}/${deviceName}/broadcast/request/${MessageId}</code>. The <strong>MessageId</strong> variable is generated by IoT Platform.</li>
         * <li>If you specify this parameter, the message is pushed to the devices that have the specified <strong>ProductKey</strong> and subscribe to the specified topic. You must specify a broadcast topic by using the following syntax: <code>/broadcast/${productKey}/Custom field</code>. Replace <strong>${productKey}</strong> with the <strong>ProductKey</strong> of the devices that receive the message. For the custom field, you can specify a value based on your business requirements.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>When you develop devices, you need to only write code to define a broadcast topic. You do not need to create a topic in the IoT Platform console.</li>
         * <li>A maximum of 1,000 devices can subscribe to a broadcast topic. If the number of devices exceeds the limit, you can divide the devices into groups. For example, you can divide 5,000 devices into five groups that contain 1,000 devices. In this case, you must call this operation five times and set the value of the custom field to group1, group2, group3, group4, and group5. Then, configure the devices. This way, each group of devices subscribes to the corresponding topic.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/broadcast/UPqSxj2vXXX/xxx</p>
         */
        public Builder topicFullName(String topicFullName) {
            this.putQueryParameter("TopicFullName", topicFullName);
            this.topicFullName = topicFullName;
            return this;
        }

        @Override
        public PubBroadcastRequest build() {
            return new PubBroadcastRequest(this);
        } 

    } 

}
