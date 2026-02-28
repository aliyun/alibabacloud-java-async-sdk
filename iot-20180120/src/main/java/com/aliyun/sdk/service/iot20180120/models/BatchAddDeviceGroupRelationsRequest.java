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
 * {@link BatchAddDeviceGroupRelationsRequest} extends {@link RequestModel}
 *
 * <p>BatchAddDeviceGroupRelationsRequest</p>
 */
public class BatchAddDeviceGroupRelationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Device")
    private java.util.List<Device> device;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchAddDeviceGroupRelationsRequest(Builder builder) {
        super(builder);
        this.device = builder.device;
        this.groupId = builder.groupId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchAddDeviceGroupRelationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return device
     */
    public java.util.List<Device> getDevice() {
        return this.device;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<BatchAddDeviceGroupRelationsRequest, Builder> {
        private java.util.List<Device> device; 
        private String groupId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchAddDeviceGroupRelationsRequest request) {
            super(request);
            this.device = request.device;
            this.groupId = request.groupId;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * Device.
         */
        public Builder device(java.util.List<Device> device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * <p>The ProductKeys of the products to which the devices belong. You can specify a maximum of 200 ProductKeys.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6VfhebLg5iUe****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the group. The ID is the globally unique identifier (GUID) for the group.</p>
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
        public BatchAddDeviceGroupRelationsRequest build() {
            return new BatchAddDeviceGroupRelationsRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchAddDeviceGroupRelationsRequest} extends {@link TeaModel}
     *
     * <p>BatchAddDeviceGroupRelationsRequest</p>
     */
    public static class Device extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String productKey;

        private Device(Builder builder) {
            this.deviceName = builder.deviceName;
            this.productKey = builder.productKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Device create() {
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

            private Builder(Device model) {
                this.deviceName = model.deviceName;
                this.productKey = model.productKey;
            } 

            /**
             * <p>The error message returned if the call fails.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ZHuPo6sZzv7pOzYh****</p>
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * <p>The names of the devices to be added. You can specify a maximum of 200 devices.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>a1kORrK****</p>
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public Device build() {
                return new Device(this);
            } 

        } 

    }
}
