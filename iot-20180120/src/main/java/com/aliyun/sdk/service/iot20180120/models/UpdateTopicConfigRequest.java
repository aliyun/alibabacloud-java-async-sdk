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
 * {@link UpdateTopicConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateTopicConfigRequest</p>
 */
public class UpdateTopicConfigRequest extends Request {
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
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicFullName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicFullName;

    private UpdateTopicConfigRequest(Builder builder) {
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

    public static UpdateTopicConfigRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateTopicConfigRequest, Builder> {
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

        private Builder(UpdateTopicConfigRequest request) {
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
         * <p>Specifies whether to enable the retained message broadcasting feature for a custom topic.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-0pp1n8t****</p>
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
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs. The device receives the retained message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1Q5XoY****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The custom topic for which you want to enable the retained message broadcasting feature.</p>
         * <ul>
         * <li>If you use an MQTT gateway device, set this parameter to the original custom topic of the device. For more information, see <a href="https://help.aliyun.com/document_detail/433806.html">Topics</a>.</li>
         * <li>If you use a non-MQTT gateway device, set this parameter to a custom topic in the following format: <code>/broadcast/${productKey}/${Custom field}</code>. <code>${productKey}</code> is the value of the <strong>ProductKey</strong> request parameter. You can specify <code>${Custom field}</code> based on your business requirements.</li>
         * </ul>
         * <blockquote>
         * <p> When you develop devices, use code to define a broadcast topic. You do not need to create a topic in the IoT Platform console. You must grant devices the Subscribe permission or the Publish and Subscribe permission on the topic.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
