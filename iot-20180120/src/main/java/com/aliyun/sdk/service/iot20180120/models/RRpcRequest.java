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
 * {@link RRpcRequest} extends {@link RequestModel}
 *
 * <p>RRpcRequest</p>
 */
public class RRpcRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContentType")
    private String contentType;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestBase64Byte")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestBase64Byte;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Topic")
    private String topic;

    private RRpcRequest(Builder builder) {
        super(builder);
        this.contentType = builder.contentType;
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
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
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
        private String contentType; 
        private String deviceName; 
        private String iotInstanceId; 
        private String productKey; 
        private String requestBase64Byte; 
        private Integer timeout; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(RRpcRequest request) {
            super(request);
            this.contentType = request.contentType;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.requestBase64Byte = request.requestBase64Byte;
            this.timeout = request.timeout;
            this.topic = request.topic;
        } 

        /**
         * ContentType.
         */
        public Builder contentType(String contentType) {
            this.putQueryParameter("ContentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The name of the device that receives the request.</p>
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
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
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
         * <p>The ProductKey of the product to which the device belongs.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder requestBase64Byte(String requestBase64Byte) {
            this.putBodyParameter("RequestBase64Byte", requestBase64Byte);
            this.requestBase64Byte = requestBase64Byte;
            return this;
        }

        /**
         * <p>The timeout period of a response. Unit: milliseconds. Valid values: 1000 to 8000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder timeout(Integer timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>The custom revert-RPC (RRPC) topic. Before you can use a custom RRPC topic, you must configure the device. For more information, see <a href="https://help.aliyun.com/document_detail/90570.html">Use custom topics</a>.</p>
         * <p>If you do not configure this parameter, the default RRPC topic is used.</p>
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
