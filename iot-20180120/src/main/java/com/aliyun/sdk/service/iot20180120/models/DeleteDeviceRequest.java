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
 * {@link DeleteDeviceRequest} extends {@link RequestModel}
 *
 * <p>DeleteDeviceRequest</p>
 */
public class DeleteDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    private DeleteDeviceRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDeviceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDeviceRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDeviceRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The DeviceName of the device.</p>
         * <blockquote>
         * <p>If you configure this parameter, you must specify a value for the <strong>ProductKey</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The ID of the device.</p>
         * <p><strong>Important</strong> The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the <strong>IotId</strong> parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for this parameter, you do not need to configure the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. If you specify values for the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>MpEKNuEUJzIORNANAWJX0010929900*****</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * <blockquote>
         * <p>If you configure this parameter, you must specify a value for the <strong>DeviceName</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1FlqIQ****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public DeleteDeviceRequest build() {
            return new DeleteDeviceRequest(this);
        } 

    } 

}
