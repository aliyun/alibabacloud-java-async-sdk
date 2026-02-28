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
 * {@link SetDeviceDesiredPropertyRequest} extends {@link RequestModel}
 *
 * <p>SetDeviceDesiredPropertyRequest</p>
 */
public class SetDeviceDesiredPropertyRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Versions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versions;

    private SetDeviceDesiredPropertyRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.items = builder.items;
        this.productKey = builder.productKey;
        this.versions = builder.versions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDeviceDesiredPropertyRequest create() {
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
     * @return versions
     */
    public String getVersions() {
        return this.versions;
    }

    public static final class Builder extends Request.Builder<SetDeviceDesiredPropertyRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String items; 
        private String productKey; 
        private String versions; 

        private Builder() {
            super();
        } 

        private Builder(SetDeviceDesiredPropertyRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.items = request.items;
            this.productKey = request.productKey;
            this.versions = request.versions;
        } 

        /**
         * <p>The name of the device.</p>
         * <blockquote>
         * <p>If you specify a value for this parameter, you must also specify a value for the <strong>ProductKey</strong> parameter.</p>
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
         * <p>The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the <strong>IotId</strong> parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for this parameter, you do not need to specify the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameters. If you specify values for the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
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
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The property value that you want to specify. The value of this parameter is a JSON string. Format: <strong>Key:Value</strong>. Example: {&quot;Temperature&quot;:35}. You can specify up to 10 desired property values.</p>
         * <ul>
         * <li><p><strong>Key</strong> specifies the identifier of the property. You can view the property identifier on the <strong>Define Feature</strong><a href="https://help.aliyun.com/document_detail/150321.html"> tab of the Product Details page in the IoT Platform console. You can also call the </a>QueryThingModel operation and view the property identifier in the returned TSL data.</p>
         * <p>If the temperature property belongs to a custom module named testFb, this parameter is set to <strong>{&quot;testFb:temperature&quot;:35}</strong>.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The specified property must allow read/write access. If you specify a read-only property, the setting fails. The property identifier must be unique.</p>
         * </blockquote>
         * <ul>
         * <li><strong>Value</strong> specifies the desired value of the property. The value must match the data type and value range that are defined for the property.</li>
         * </ul>
         * <blockquote>
         * <p>If you set Value to null, the desired value of the property is cleared.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Temperature&quot;:35}</p>
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
         * <p>The version number of the desired property value. The value of this parameter is a JSON string. Format: Key:Value. Example: {&quot;Temperature&quot;:2}.</p>
         * <ul>
         * <li><strong>Key</strong> specifies the identifier of the property. You can view the property identifier on the Define Feature tab of the Product Details page in the IoT Platform console.</li>
         * </ul>
         * <blockquote>
         * <p>The property identifier must be unique.</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>Value</strong> specifies the version number of the desired property value.</p>
         * <p>The first time you specify a desired property value, set the Value parameter to 0. After you set the property value, the version number changes to 1. Each time you specify a desired property value, IoT Platform automatically increases the version number by 1. The second time that you specify a desired property value, the version number changes to 2. The third time that you specify a desired property value, set the version number to 2. After you specify the desired property value, the version number changes to 3.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the version number that you specify for this parameter is not the current version number, the server rejects the request. If you are not sure about the current version number, you do not need to specify a version number. However, you must enter a valid JSON object {}.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Temperature&quot;:2}</p>
         */
        public Builder versions(String versions) {
            this.putQueryParameter("Versions", versions);
            this.versions = versions;
            return this;
        }

        @Override
        public SetDeviceDesiredPropertyRequest build() {
            return new SetDeviceDesiredPropertyRequest(this);
        } 

    } 

}
