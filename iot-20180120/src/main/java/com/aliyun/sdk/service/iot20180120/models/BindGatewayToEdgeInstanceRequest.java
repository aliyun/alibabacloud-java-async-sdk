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
 * {@link BindGatewayToEdgeInstanceRequest} extends {@link RequestModel}
 *
 * <p>BindGatewayToEdgeInstanceRequest</p>
 */
public class BindGatewayToEdgeInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    private BindGatewayToEdgeInstanceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.instanceId = builder.instanceId;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindGatewayToEdgeInstanceRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
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

    public static final class Builder extends Request.Builder<BindGatewayToEdgeInstanceRequest, Builder> {
        private String deviceName; 
        private String instanceId; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(BindGatewayToEdgeInstanceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.instanceId = request.instanceId;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The name of the gateway.</p>
         * <blockquote>
         * <p> If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
         * </blockquote>
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
         * <p>The ID of the edge instance. To obtain the instance ID, perform the following steps: Log on to the <a href="https://iot.console.aliyun.com/le/instance/list">Link IoT Edge console</a>. On the <strong>Edge Instances</strong> page, move the pointer over the name of the edge instance to which you want to bind a gateway and obtain the instance ID.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/135214.html">QueryEdgeInstance</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>F3APY0tPLhmgGtx0****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the gateway in IoT Platform. This parameter corresponds to the combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters.</p>
         * <blockquote>
         * <p> If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. If you use the <strong>IotId</strong> parameter and the combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters, only the <strong>IotId</strong> parameter takes effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4z819VQHk6VSLmmBJfrf0010******</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The ID of the Internet of Things (IoT) service instance. This parameter is not required for the public instance but required for Enterprise Edition instances.</p>
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
         * <p>The key that uniquely identifies the product to which the gateway belongs.</p>
         * <blockquote>
         * <p> If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1mAdeG****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public BindGatewayToEdgeInstanceRequest build() {
            return new BindGatewayToEdgeInstanceRequest(this);
        } 

    } 

}
