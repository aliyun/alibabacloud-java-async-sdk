// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeviceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceGroupsResponseBody</p>
 */
public class ListDeviceGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListDeviceGroupsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDeviceGroupsResponseBody build() {
            return new ListDeviceGroupsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("BitRate")
        private String bitRate;

        @NameInMap("CodingFormat")
        private String codingFormat;

        @NameInMap("DataSourceType")
        private String dataSourceType;

        @NameInMap("DeviceCode")
        private String deviceCode;

        @NameInMap("DeviceComputeStatus")
        private String deviceComputeStatus;

        @NameInMap("DeviceGroup")
        private String deviceGroup;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceSn")
        private String deviceSn;

        @NameInMap("DeviceStatus")
        private String deviceStatus;

        @NameInMap("DeviceStreamStatus")
        private String deviceStreamStatus;

        @NameInMap("InstallAddress")
        private String installAddress;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("ResolvingPower")
        private String resolvingPower;

        @NameInMap("Type")
        private String type;

        private List(Builder builder) {
            this.bitRate = builder.bitRate;
            this.codingFormat = builder.codingFormat;
            this.dataSourceType = builder.dataSourceType;
            this.deviceCode = builder.deviceCode;
            this.deviceComputeStatus = builder.deviceComputeStatus;
            this.deviceGroup = builder.deviceGroup;
            this.deviceName = builder.deviceName;
            this.deviceSn = builder.deviceSn;
            this.deviceStatus = builder.deviceStatus;
            this.deviceStreamStatus = builder.deviceStreamStatus;
            this.installAddress = builder.installAddress;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.resolvingPower = builder.resolvingPower;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return bitRate
         */
        public String getBitRate() {
            return this.bitRate;
        }

        /**
         * @return codingFormat
         */
        public String getCodingFormat() {
            return this.codingFormat;
        }

        /**
         * @return dataSourceType
         */
        public String getDataSourceType() {
            return this.dataSourceType;
        }

        /**
         * @return deviceCode
         */
        public String getDeviceCode() {
            return this.deviceCode;
        }

        /**
         * @return deviceComputeStatus
         */
        public String getDeviceComputeStatus() {
            return this.deviceComputeStatus;
        }

        /**
         * @return deviceGroup
         */
        public String getDeviceGroup() {
            return this.deviceGroup;
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
         * @return deviceStreamStatus
         */
        public String getDeviceStreamStatus() {
            return this.deviceStreamStatus;
        }

        /**
         * @return installAddress
         */
        public String getInstallAddress() {
            return this.installAddress;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return resolvingPower
         */
        public String getResolvingPower() {
            return this.resolvingPower;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bitRate; 
            private String codingFormat; 
            private String dataSourceType; 
            private String deviceCode; 
            private String deviceComputeStatus; 
            private String deviceGroup; 
            private String deviceName; 
            private String deviceSn; 
            private String deviceStatus; 
            private String deviceStreamStatus; 
            private String installAddress; 
            private String regionId; 
            private String regionName; 
            private String resolvingPower; 
            private String type; 

            /**
             * BitRate.
             */
            public Builder bitRate(String bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * CodingFormat.
             */
            public Builder codingFormat(String codingFormat) {
                this.codingFormat = codingFormat;
                return this;
            }

            /**
             * DataSourceType.
             */
            public Builder dataSourceType(String dataSourceType) {
                this.dataSourceType = dataSourceType;
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
             * DeviceComputeStatus.
             */
            public Builder deviceComputeStatus(String deviceComputeStatus) {
                this.deviceComputeStatus = deviceComputeStatus;
                return this;
            }

            /**
             * DeviceGroup.
             */
            public Builder deviceGroup(String deviceGroup) {
                this.deviceGroup = deviceGroup;
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
             * DeviceStreamStatus.
             */
            public Builder deviceStreamStatus(String deviceStreamStatus) {
                this.deviceStreamStatus = deviceStreamStatus;
                return this;
            }

            /**
             * InstallAddress.
             */
            public Builder installAddress(String installAddress) {
                this.installAddress = installAddress;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * ResolvingPower.
             */
            public Builder resolvingPower(String resolvingPower) {
                this.resolvingPower = resolvingPower;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("TotalCount")
        private String totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private String totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
