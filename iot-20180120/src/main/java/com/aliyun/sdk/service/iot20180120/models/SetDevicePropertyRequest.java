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
 * {@link SetDevicePropertyRequest} extends {@link RequestModel}
 *
 * <p>SetDevicePropertyRequest</p>
 */
public class SetDevicePropertyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Items")
    @com.aliyun.core.annotation.Validation(required = true)
    private String items;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qos")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Integer qos;

    private SetDevicePropertyRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.items = builder.items;
        this.productKey = builder.productKey;
        this.qos = builder.qos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDevicePropertyRequest create() {
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
     * @return items
     */
    public String getItems() {
        return this.items;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return qos
     */
    public Integer getQos() {
        return this.qos;
    }

    public static final class Builder extends Request.Builder<SetDevicePropertyRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String items; 
        private String productKey; 
        private Integer qos; 

        private Builder() {
            super();
        } 

        private Builder(SetDevicePropertyRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.items = request.items;
            this.productKey = request.productKey;
            this.qos = request.qos;
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
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         * <blockquote>
         * <p>The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the <strong>IotId</strong> parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for this parameter, you do not need to configure the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. If you specify values for the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
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
         * <p>The ID of the elastic container instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
         * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-v64*****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The properties that you want to specify. The properties must be in the JSON format.</p>
         * <p>Each property consists of a <strong>key-value pair in the key:value format</strong>. Separate multiple properties with commas (,).</p>
         * <p>For example, you can configure the following properties for a smart lamp:</p>
         * <ul>
         * <li>A switch property whose key is <strong>Switch</strong> and whose data type is <strong>BOOLEAN</strong>. The value is <strong>1</strong>. The value 1 indicates that the light is on.</li>
         * <li>A color property whose key is <strong>Color</strong> and whose data type is <strong>STRING</strong>. The value is <strong>blue</strong>.</li>
         * </ul>
         * <p>In this case, you can specify the following properties in the JSON format:</p>
         * <p><code>Items={&quot;Switch&quot;:1,&quot;Color&quot;:&quot;blue&quot;}</code></p>
         * <blockquote>
         * <p> If you specify properties for the custom module testFb, set the Items parameter to <code>{&quot;testFb:Switch&quot;:1,&quot;testFb:Color&quot;:&quot;blue&quot;}</code>. The testFb module is not the default module.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Switch&quot;:1,&quot;Color&quot;:&quot;blue&quot;}</p>
         */
        public Builder items(String items) {
            this.putQueryParameter("Items", items);
            this.items = items;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * <blockquote>
         * <p>If you configure this parameter, you must also specify a value for the <strong>DeviceName</strong> parameter.</p>
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

        /**
         * Qos.
         */
        public Builder qos(Integer qos) {
            this.putQueryParameter("Qos", qos);
            this.qos = qos;
            return this;
        }

        @Override
        public SetDevicePropertyRequest build() {
            return new SetDevicePropertyRequest(this);
        } 

    } 

}
