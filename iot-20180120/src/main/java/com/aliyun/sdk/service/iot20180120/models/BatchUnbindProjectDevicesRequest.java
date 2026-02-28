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
 * {@link BatchUnbindProjectDevicesRequest} extends {@link RequestModel}
 *
 * <p>BatchUnbindProjectDevicesRequest</p>
 */
public class BatchUnbindProjectDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Devices")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Devices> devices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    private BatchUnbindProjectDevicesRequest(Builder builder) {
        super(builder);
        this.devices = builder.devices;
        this.iotInstanceId = builder.iotInstanceId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchUnbindProjectDevicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return devices
     */
    public java.util.List<Devices> getDevices() {
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

    public static final class Builder extends Request.Builder<BatchUnbindProjectDevicesRequest, Builder> {
        private java.util.List<Devices> devices; 
        private String iotInstanceId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(BatchUnbindProjectDevicesRequest request) {
            super(request);
            this.devices = request.devices;
            this.iotInstanceId = request.iotInstanceId;
            this.projectId = request.projectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder devices(java.util.List<Devices> devices) {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a12******</p>
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public BatchUnbindProjectDevicesRequest build() {
            return new BatchUnbindProjectDevicesRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchUnbindProjectDevicesRequest} extends {@link TeaModel}
     *
     * <p>BatchUnbindProjectDevicesRequest</p>
     */
    public static class Devices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(Devices model) {
                this.deviceName = model.deviceName;
                this.productKey = model.productKey;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Ee2******</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>a1BwAGV****</p>
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
