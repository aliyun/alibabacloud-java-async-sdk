// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAssistDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAssistDevicesResponseBody</p>
 */
public class ListAssistDevicesResponseBody extends TeaModel {
    @NameInMap("Devices")
    private java.util.List < Devices> devices;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PerPage")
    private Integer perPage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAssistDevicesResponseBody(Builder builder) {
        this.devices = builder.devices;
        this.pageIndex = builder.pageIndex;
        this.perPage = builder.perPage;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAssistDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return devices
     */
    public java.util.List < Devices> getDevices() {
        return this.devices;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return perPage
     */
    public Integer getPerPage() {
        return this.perPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Devices> devices; 
        private Integer pageIndex; 
        private Integer perPage; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Devices.
         */
        public Builder devices(java.util.List < Devices> devices) {
            this.devices = devices;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PerPage.
         */
        public Builder perPage(Integer perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAssistDevicesResponseBody build() {
            return new ListAssistDevicesResponseBody(this);
        } 

    } 

    public static class Devices extends TeaModel {
        @NameInMap("AccessTime")
        private Long accessTime;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("HardwareId")
        private String hardwareId;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("UUID")
        private String UUID;

        @NameInMap("VIN")
        private String VIN;

        private Devices(Builder builder) {
            this.accessTime = builder.accessTime;
            this.deviceId = builder.deviceId;
            this.deviceName = builder.deviceName;
            this.hardwareId = builder.hardwareId;
            this.serialNumber = builder.serialNumber;
            this.UUID = builder.UUID;
            this.VIN = builder.VIN;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Devices create() {
            return builder().build();
        }

        /**
         * @return accessTime
         */
        public Long getAccessTime() {
            return this.accessTime;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return hardwareId
         */
        public String getHardwareId() {
            return this.hardwareId;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return UUID
         */
        public String getUUID() {
            return this.UUID;
        }

        /**
         * @return VIN
         */
        public String getVIN() {
            return this.VIN;
        }

        public static final class Builder {
            private Long accessTime; 
            private String deviceId; 
            private String deviceName; 
            private String hardwareId; 
            private String serialNumber; 
            private String UUID; 
            private String VIN; 

            /**
             * AccessTime.
             */
            public Builder accessTime(Long accessTime) {
                this.accessTime = accessTime;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * HardwareId.
             */
            public Builder hardwareId(String hardwareId) {
                this.hardwareId = hardwareId;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * UUID.
             */
            public Builder UUID(String UUID) {
                this.UUID = UUID;
                return this;
            }

            /**
             * VIN.
             */
            public Builder VIN(String VIN) {
                this.VIN = VIN;
                return this;
            }

            public Devices build() {
                return new Devices(this);
            } 

        } 

    }
}
