// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteDeviceGroupRelationsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteDeviceGroupRelationsRequest</p>
 */
public class BatchDeleteDeviceGroupRelationsRequest extends Request {
    @Query
    @NameInMap("Device")
    private java.util.List < Device> device;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    private BatchDeleteDeviceGroupRelationsRequest(Builder builder) {
        super(builder);
        this.device = builder.device;
        this.groupId = builder.groupId;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteDeviceGroupRelationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return device
     */
    public java.util.List < Device> getDevice() {
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

    public static final class Builder extends Request.Builder<BatchDeleteDeviceGroupRelationsRequest, Builder> {
        private java.util.List < Device> device; 
        private String groupId; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteDeviceGroupRelationsRequest response) {
            super(response);
            this.device = response.device;
            this.groupId = response.groupId;
            this.iotInstanceId = response.iotInstanceId;
        } 

        /**
         * Device.
         */
        public Builder device(java.util.List < Device> device) {
            this.putQueryParameter("Device", device);
            this.device = device;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public BatchDeleteDeviceGroupRelationsRequest build() {
            return new BatchDeleteDeviceGroupRelationsRequest(this);
        } 

    } 

    public static class Device extends TeaModel {
        @NameInMap("DeviceName")
        @Validation(required = true)
        private String deviceName;

        @NameInMap("ProductKey")
        @Validation(required = true)
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

            public Device build() {
                return new Device(this);
            } 

        } 

    }
}
