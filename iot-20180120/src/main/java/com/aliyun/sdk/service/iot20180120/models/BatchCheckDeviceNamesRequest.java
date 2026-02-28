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
 * {@link BatchCheckDeviceNamesRequest} extends {@link RequestModel}
 *
 * <p>BatchCheckDeviceNamesRequest</p>
 */
public class BatchCheckDeviceNamesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private java.util.List<String> deviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceNameList")
    private java.util.List<DeviceNameList> deviceNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private BatchCheckDeviceNamesRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.deviceNameList = builder.deviceNameList;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCheckDeviceNamesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public java.util.List<String> getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceNameList
     */
    public java.util.List<DeviceNameList> getDeviceNameList() {
        return this.deviceNameList;
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

    public static final class Builder extends Request.Builder<BatchCheckDeviceNamesRequest, Builder> {
        private java.util.List<String> deviceName; 
        private java.util.List<DeviceNameList> deviceNameList; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(BatchCheckDeviceNamesRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.deviceNameList = request.deviceNameList;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * DeviceName.
         */
        public Builder deviceName(java.util.List<String> deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * DeviceNameList.
         */
        public Builder deviceNameList(java.util.List<DeviceNameList> deviceNameList) {
            this.putBodyParameter("DeviceNameList", deviceNameList);
            this.deviceNameList = deviceNameList;
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
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the devices belong.</p>
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

        @Override
        public BatchCheckDeviceNamesRequest build() {
            return new BatchCheckDeviceNamesRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCheckDeviceNamesRequest} extends {@link TeaModel}
     *
     * <p>BatchCheckDeviceNamesRequest</p>
     */
    public static class DeviceNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceNickname")
        private String deviceNickname;

        private DeviceNameList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.deviceNickname = builder.deviceNickname;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceNameList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceNickname
         */
        public String getDeviceNickname() {
            return this.deviceNickname;
        }

        public static final class Builder {
            private String deviceName; 
            private String deviceNickname; 

            private Builder() {
            } 

            private Builder(DeviceNameList model) {
                this.deviceName = model.deviceName;
                this.deviceNickname = model.deviceNickname;
            } 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * DeviceNickname.
             */
            public Builder deviceNickname(String deviceNickname) {
                this.deviceNickname = deviceNickname;
                return this;
            }

            public DeviceNameList build() {
                return new DeviceNameList(this);
            } 

        } 

    }
}
