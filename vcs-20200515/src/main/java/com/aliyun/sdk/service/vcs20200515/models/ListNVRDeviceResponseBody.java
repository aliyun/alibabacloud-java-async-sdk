// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNVRDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>ListNVRDeviceResponseBody</p>
 */
public class ListNVRDeviceResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private String total;

    private ListNVRDeviceResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNVRDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 
        private Boolean success; 
        private String total; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public ListNVRDeviceResponseBody build() {
            return new ListNVRDeviceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccessQuota")
        private String accessQuota;

        @NameInMap("Channel")
        private String channel;

        @NameInMap("ComptureStatus")
        private String comptureStatus;

        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("DatasourceType")
        private String datasourceType;

        @NameInMap("DeviceCode")
        private String deviceCode;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceSn")
        private String deviceSn;

        @NameInMap("DeviceStatus")
        private String deviceStatus;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("ProjectName")
        private String projectName;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("RegistrationTime")
        private String registrationTime;

        @NameInMap("StreamStatus")
        private String streamStatus;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.accessQuota = builder.accessQuota;
            this.channel = builder.channel;
            this.comptureStatus = builder.comptureStatus;
            this.corpId = builder.corpId;
            this.datasourceType = builder.datasourceType;
            this.deviceCode = builder.deviceCode;
            this.deviceName = builder.deviceName;
            this.deviceSn = builder.deviceSn;
            this.deviceStatus = builder.deviceStatus;
            this.deviceType = builder.deviceType;
            this.projectName = builder.projectName;
            this.regionName = builder.regionName;
            this.registrationTime = builder.registrationTime;
            this.streamStatus = builder.streamStatus;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accessQuota
         */
        public String getAccessQuota() {
            return this.accessQuota;
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return comptureStatus
         */
        public String getComptureStatus() {
            return this.comptureStatus;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return datasourceType
         */
        public String getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return deviceCode
         */
        public String getDeviceCode() {
            return this.deviceCode;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSn
         */
        public String getDeviceSn() {
            return this.deviceSn;
        }

        /**
         * @return deviceStatus
         */
        public String getDeviceStatus() {
            return this.deviceStatus;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return registrationTime
         */
        public String getRegistrationTime() {
            return this.registrationTime;
        }

        /**
         * @return streamStatus
         */
        public String getStreamStatus() {
            return this.streamStatus;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accessQuota; 
            private String channel; 
            private String comptureStatus; 
            private String corpId; 
            private String datasourceType; 
            private String deviceCode; 
            private String deviceName; 
            private String deviceSn; 
            private String deviceStatus; 
            private String deviceType; 
            private String projectName; 
            private String regionName; 
            private String registrationTime; 
            private String streamStatus; 
            private String type; 

            /**
             * AccessQuota.
             */
            public Builder accessQuota(String accessQuota) {
                this.accessQuota = accessQuota;
                return this;
            }

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * ComptureStatus.
             */
            public Builder comptureStatus(String comptureStatus) {
                this.comptureStatus = comptureStatus;
                return this;
            }

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * DatasourceType.
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
                return this;
            }

            /**
             * DeviceCode.
             */
            public Builder deviceCode(String deviceCode) {
                this.deviceCode = deviceCode;
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
             * DeviceSn.
             */
            public Builder deviceSn(String deviceSn) {
                this.deviceSn = deviceSn;
                return this;
            }

            /**
             * DeviceStatus.
             */
            public Builder deviceStatus(String deviceStatus) {
                this.deviceStatus = deviceStatus;
                return this;
            }

            /**
             * DeviceType.
             */
            public Builder deviceType(String deviceType) {
                this.deviceType = deviceType;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * RegistrationTime.
             */
            public Builder registrationTime(String registrationTime) {
                this.registrationTime = registrationTime;
                return this;
            }

            /**
             * StreamStatus.
             */
            public Builder streamStatus(String streamStatus) {
                this.streamStatus = streamStatus;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
