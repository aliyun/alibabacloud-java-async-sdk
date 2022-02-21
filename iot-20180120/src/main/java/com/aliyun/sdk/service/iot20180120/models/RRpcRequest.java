// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RRpcRequest} extends {@link RequestModel}
 *
 * <p>RRpcRequest</p>
 */
public class RRpcRequest extends Request {
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
    @NameInMap("RequestBase64Byte")
    @Validation(required = true)
    private String requestBase64Byte;

    @Query
    @NameInMap("Timeout")
    @Validation(required = true)
    private Integer timeout;

    @Query
    @NameInMap("Topic")
    private String topic;

    private RRpcRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.requestBase64Byte = builder.requestBase64Byte;
        this.timeout = builder.timeout;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RRpcRequest create() {
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
     * @return requestBase64Byte
     */
    public String getRequestBase64Byte() {
        return this.requestBase64Byte;
    }

    /**
     * @return timeout
     */
    public Integer getTimeout() {
        return this.timeout;
    }

    /**
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<RRpcRequest, Builder> {
        private String deviceName; 
        private String iotInstanceId; 
        private String productKey; 
        private String requestBase64Byte; 
        private Integer timeout; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(RRpcRequest response) {
            super(response);
            this.deviceName = response.deviceName;
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
            this.requestBase64Byte = response.requestBase64Byte;
            this.timeout = response.timeout;
            this.topic = response.topic;
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
         * RequestBase64Byte.
         */
        public Builder requestBase64Byte(String requestBase64Byte) {
            this.putQueryParameter("RequestBase64Byte", requestBase64Byte);
            this.requestBase64Byte = requestBase64Byte;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * Topic.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public RRpcRequest build() {
            return new RRpcRequest(this);
        } 

    } 

}
