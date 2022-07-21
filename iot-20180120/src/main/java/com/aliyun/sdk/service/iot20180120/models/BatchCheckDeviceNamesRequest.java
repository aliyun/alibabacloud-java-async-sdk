// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCheckDeviceNamesRequest} extends {@link RequestModel}
 *
 * <p>BatchCheckDeviceNamesRequest</p>
 */
public class BatchCheckDeviceNamesRequest extends Request {
    @Query
    @NameInMap("DeviceName")
    private java.util.List < String > deviceName;

    @Query
    @NameInMap("DeviceNameList")
    private java.util.List < DeviceNameList> deviceNameList;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
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
    public java.util.List < String > getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceNameList
     */
    public java.util.List < DeviceNameList> getDeviceNameList() {
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
        private java.util.List < String > deviceName; 
        private java.util.List < DeviceNameList> deviceNameList; 
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
        public Builder deviceName(java.util.List < String > deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * DeviceNameList.
         */
        public Builder deviceNameList(java.util.List < DeviceNameList> deviceNameList) {
            this.putQueryParameter("DeviceNameList", deviceNameList);
            this.deviceNameList = deviceNameList;
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

        /**
         * ProductKey.
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

    public static class DeviceNameList extends TeaModel {
        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceNickname")
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
