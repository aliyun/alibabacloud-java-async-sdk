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
 * {@link NotifyAddThingTopoRequest} extends {@link RequestModel}
 *
 * <p>NotifyAddThingTopoRequest</p>
 */
public class NotifyAddThingTopoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceListStr")
    private String deviceListStr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwDeviceName")
    private String gwDeviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwIotId")
    private String gwIotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwProductKey")
    private String gwProductKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private NotifyAddThingTopoRequest(Builder builder) {
        super(builder);
        this.deviceListStr = builder.deviceListStr;
        this.gwDeviceName = builder.gwDeviceName;
        this.gwIotId = builder.gwIotId;
        this.gwProductKey = builder.gwProductKey;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NotifyAddThingTopoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceListStr
     */
    public String getDeviceListStr() {
        return this.deviceListStr;
    }

    /**
     * @return gwDeviceName
     */
    public String getGwDeviceName() {
        return this.gwDeviceName;
    }

    /**
     * @return gwIotId
     */
    public String getGwIotId() {
        return this.gwIotId;
    }

    /**
     * @return gwProductKey
     */
    public String getGwProductKey() {
        return this.gwProductKey;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<NotifyAddThingTopoRequest, Builder> {
        private String deviceListStr; 
        private String gwDeviceName; 
        private String gwIotId; 
        private String gwProductKey; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(NotifyAddThingTopoRequest request) {
            super(request);
            this.deviceListStr = request.deviceListStr;
            this.gwDeviceName = request.gwDeviceName;
            this.gwIotId = request.gwIotId;
            this.gwProductKey = request.gwProductKey;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>A JSON array of the sub-device identity information. You can use a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong> or only <strong>IotId</strong> to specify a device, such as <strong>[{&quot;productKey&quot;:&quot;a1BwAGxxx&quot;,&quot;deviceName&quot;:&quot;device1&quot;},{&quot;IotId&quot;:&quot;Q7uOhxxx&quot;}]</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;productKey&quot;:&quot;a1BwAGV****&quot;,&quot;deviceName&quot;:&quot;device1&quot;},{&quot;IotId&quot;:&quot;Q7uOhVRdZRRlDnTLv****00100&quot;}]</p>
         */
        public Builder deviceListStr(String deviceListStr) {
            this.putQueryParameter("DeviceListStr", deviceListStr);
            this.deviceListStr = deviceListStr;
            return this;
        }

        /**
         * <p>The DeviceName of the gateway.</p>
         * <blockquote>
         * <p> If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gateway</p>
         */
        public Builder gwDeviceName(String gwDeviceName) {
            this.putQueryParameter("GwDeviceName", gwDeviceName);
            this.gwDeviceName = gwDeviceName;
            return this;
        }

        /**
         * <p>The ID of the gateway device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         * <blockquote>
         * <p> If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vWxNur6BUApsqjv****4000100</p>
         */
        public Builder gwIotId(String gwIotId) {
            this.putQueryParameter("GwIotId", gwIotId);
            this.gwIotId = gwIotId;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the gateway belongs.</p>
         * <blockquote>
         * <p> If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>a1T27vz****</p>
         */
        public Builder gwProductKey(String gwProductKey) {
            this.putQueryParameter("GwProductKey", gwProductKey);
            this.gwProductKey = gwProductKey;
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

        @Override
        public NotifyAddThingTopoRequest build() {
            return new NotifyAddThingTopoRequest(this);
        } 

    } 

}
