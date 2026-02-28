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
 * {@link BatchCheckImportDeviceRequest} extends {@link RequestModel}
 *
 * <p>BatchCheckImportDeviceRequest</p>
 */
public class BatchCheckImportDeviceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<DeviceList> deviceList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private BatchCheckImportDeviceRequest(Builder builder) {
        super(builder);
        this.deviceList = builder.deviceList;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCheckImportDeviceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceList
     */
    public java.util.List<DeviceList> getDeviceList() {
        return this.deviceList;
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

    public static final class Builder extends Request.Builder<BatchCheckImportDeviceRequest, Builder> {
        private java.util.List<DeviceList> deviceList; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(BatchCheckImportDeviceRequest request) {
            super(request);
            this.deviceList = request.deviceList;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder deviceList(java.util.List<DeviceList> deviceList) {
            this.putBodyParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> If your instance has an ID, you must specify this parameter. Otherwise, the request fails. If no Overview page exists or no instance ID is displayed, you do not need to specify this parameter.</p>
         * </blockquote>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the gateway product to which the devices belong.</p>
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
        public BatchCheckImportDeviceRequest build() {
            return new BatchCheckImportDeviceRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCheckImportDeviceRequest} extends {@link TeaModel}
     *
     * <p>BatchCheckImportDeviceRequest</p>
     */
    public static class DeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("DeviceSecret")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceSecret;

        @com.aliyun.core.annotation.NameInMap("Sn")
        private String sn;

        private DeviceList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.deviceSecret = builder.deviceSecret;
            this.sn = builder.sn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceList create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSecret
         */
        public String getDeviceSecret() {
            return this.deviceSecret;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        public static final class Builder {
            private String deviceName; 
            private String deviceSecret; 
            private String sn; 

            private Builder() {
            } 

            private Builder(DeviceList model) {
                this.deviceName = model.deviceName;
                this.deviceSecret = model.deviceSecret;
                this.sn = model.sn;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder deviceSecret(String deviceSecret) {
                this.deviceSecret = deviceSecret;
                return this;
            }

            /**
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
}
