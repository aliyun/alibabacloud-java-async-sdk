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
 * {@link UnsubscribeTopicRequest} extends {@link RequestModel}
 *
 * <p>UnsubscribeTopicRequest</p>
 */
public class UnsubscribeTopicRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> topic;

    private UnsubscribeTopicRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnsubscribeTopicRequest create() {
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
     * @return topic
     */
    public java.util.List<String> getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<UnsubscribeTopicRequest, Builder> {
        private String deviceName; 
        private String iotInstanceId; 
        private String productKey; 
        private java.util.List<String> topic; 

        private Builder() {
            super();
        } 

        private Builder(UnsubscribeTopicRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.topic = request.topic;
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
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder topic(java.util.List<String> topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public UnsubscribeTopicRequest build() {
            return new UnsubscribeTopicRequest(this);
        } 

    } 

}
