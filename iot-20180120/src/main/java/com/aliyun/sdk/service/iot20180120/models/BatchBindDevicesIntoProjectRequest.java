// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindDevicesIntoProjectRequest} extends {@link RequestModel}
 *
 * <p>BatchBindDevicesIntoProjectRequest</p>
 */
public class BatchBindDevicesIntoProjectRequest extends Request {
    @Body
    @NameInMap("Devices")
    @Validation(required = true)
    private java.util.List < Devices> devices;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private BatchBindDevicesIntoProjectRequest(Builder builder) {
        super(builder);
        this.devices = builder.devices;
        this.iotInstanceId = builder.iotInstanceId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchBindDevicesIntoProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<BatchBindDevicesIntoProjectRequest, Builder> {
        private java.util.List < Devices> devices; 
        private String iotInstanceId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(BatchBindDevicesIntoProjectRequest response) {
            super(response);
            this.devices = response.devices;
            this.iotInstanceId = response.iotInstanceId;
            this.projectId = response.projectId;
        } 

        /**
         * Devices.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.putBodyParameter("Devices", devices);
            this.devices = devices;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public BatchBindDevicesIntoProjectRequest build() {
            return new BatchBindDevicesIntoProjectRequest(this);
        } 

    } 

    public static class Devices extends TeaModel {
        @NameInMap("DeviceName")
        @Validation(required = true)
        private String deviceName;

        @NameInMap("ProductKey")
        @Validation(required = true)
        private String productKey;

        private Devices(Builder builder) {
            this.deviceName = builder.deviceName;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String deviceName; 
            private String productKey; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
