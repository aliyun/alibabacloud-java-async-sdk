// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployTaskByModelIdAndDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListDeployTaskByModelIdAndDevicesRequest</p>
 */
public class ListDeployTaskByModelIdAndDevicesRequest extends Request {
    @Query
    @NameInMap("DeviceList")
    @Validation(required = true)
    private java.util.List < DeviceList> deviceList;

    @Query
    @NameInMap("ModelId")
    @Validation(required = true)
    private Integer modelId;

    private ListDeployTaskByModelIdAndDevicesRequest(Builder builder) {
        super(builder);
        this.deviceList = builder.deviceList;
        this.modelId = builder.modelId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeployTaskByModelIdAndDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceList
     */
    public java.util.List < DeviceList> getDeviceList() {
        return this.deviceList;
    }

    /**
     * @return modelId
     */
    public Integer getModelId() {
        return this.modelId;
    }

    public static final class Builder extends Request.Builder<ListDeployTaskByModelIdAndDevicesRequest, Builder> {
        private java.util.List < DeviceList> deviceList; 
        private Integer modelId; 

        private Builder() {
            super();
        } 

        private Builder(ListDeployTaskByModelIdAndDevicesRequest response) {
            super(response);
            this.deviceList = response.deviceList;
            this.modelId = response.modelId;
        } 

        /**
         * DeviceList.
         */
        public Builder deviceList(java.util.List < DeviceList> deviceList) {
            this.putQueryParameter("DeviceList", deviceList);
            this.deviceList = deviceList;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(Integer modelId) {
            this.putQueryParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        @Override
        public ListDeployTaskByModelIdAndDevicesRequest build() {
            return new ListDeployTaskByModelIdAndDevicesRequest(this);
        } 

    } 

    public static class DeviceList extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("IotId")
        private String iotId;

        @NameInMap("ProductKey")
        private String productKey;

        private DeviceList(Builder builder) {
            this.deviceName = builder.deviceName;
            this.iotId = builder.iotId;
            this.productKey = builder.productKey;
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
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        public static final class Builder {
            private String deviceName; 
            private String iotId; 
            private String productKey; 

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
}
