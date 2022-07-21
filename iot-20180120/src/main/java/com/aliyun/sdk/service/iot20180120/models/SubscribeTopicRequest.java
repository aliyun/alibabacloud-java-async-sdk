// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubscribeTopicRequest} extends {@link RequestModel}
 *
 * <p>SubscribeTopicRequest</p>
 */
public class SubscribeTopicRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    @Validation(required = true)
    private String deviceName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("Topic")
    @Validation(required = true)
    private java.util.List < String > topic;

    private SubscribeTopicRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeTopicRequest create() {
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
    public java.util.List < String > getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<SubscribeTopicRequest, Builder> {
        private String deviceName; 
        private String iotInstanceId; 
        private String productKey; 
        private java.util.List < String > topic; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeTopicRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.topic = request.topic;
        } 

        /**
         * DeviceName.
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
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(java.util.List < String > topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public SubscribeTopicRequest build() {
            return new SubscribeTopicRequest(this);
        } 

    } 

}
