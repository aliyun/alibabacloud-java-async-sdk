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
 * {@link ClearDeviceDesiredPropertyRequest} extends {@link RequestModel}
 *
 * <p>ClearDeviceDesiredPropertyRequest</p>
 */
public class ClearDeviceDesiredPropertyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Identifies")
    private java.util.List<String> identifies;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    private ClearDeviceDesiredPropertyRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.identifies = builder.identifies;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClearDeviceDesiredPropertyRequest create() {
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
     * @return identifies
     */
    public java.util.List<String> getIdentifies() {
        return this.identifies;
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

    public static final class Builder extends Request.Builder<ClearDeviceDesiredPropertyRequest, Builder> {
        private String deviceName; 
        private java.util.List<String> identifies; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ClearDeviceDesiredPropertyRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.identifies = request.identifies;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The DeviceName of the device.</p>
         * <blockquote>
         * <p> If you specify a value for this parameter, you must configure the <strong>ProductKey</strong> parameter.</p>
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
         * Identifies.
         */
        public Builder identifies(java.util.List<String> identifies) {
            this.putBodyParameter("Identifies", identifies);
            this.identifies = identifies;
            return this;
        }

        /**
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         * <blockquote>
         * <p> The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the <strong>IotId</strong> parameter is equivalent to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for the IotId parameter, you do not need to configure the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. If you specify values for the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.****</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
         * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-2w****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the device belongs.</p>
         * <blockquote>
         * <p> If you specify a value for this parameter, you must configure the <strong>DeviceName</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public ClearDeviceDesiredPropertyRequest build() {
            return new ClearDeviceDesiredPropertyRequest(this);
        } 

    } 

}
