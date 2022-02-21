// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDevicesResponseBody</p>
 */
public class ListDevicesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListDevicesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevicesResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
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
        public Builder data(Data data) {
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

        public ListDevicesResponseBody build() {
            return new ListDevicesResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("AccessProtocolType")
        private String accessProtocolType;

        @NameInMap("BitRate")
        private String bitRate;

        @NameInMap("CoverImageUrl")
        private String coverImageUrl;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeviceAddress")
        private String deviceAddress;

        @NameInMap("DeviceDirection")
        private String deviceDirection;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceSite")
        private String deviceSite;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("GbId")
        private String gbId;

        @NameInMap("Latitude")
        private String latitude;

        @NameInMap("Longitude")
        private String longitude;

        @NameInMap("Resolution")
        private String resolution;

        @NameInMap("SipGBId")
        private String sipGBId;

        @NameInMap("SipPassword")
        private String sipPassword;

        @NameInMap("SipServerIp")
        private String sipServerIp;

        @NameInMap("SipServerPort")
        private String sipServerPort;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Vendor")
        private String vendor;

        private Records(Builder builder) {
            this.accessProtocolType = builder.accessProtocolType;
            this.bitRate = builder.bitRate;
            this.coverImageUrl = builder.coverImageUrl;
            this.createTime = builder.createTime;
            this.deviceAddress = builder.deviceAddress;
            this.deviceDirection = builder.deviceDirection;
            this.deviceName = builder.deviceName;
            this.deviceSite = builder.deviceSite;
            this.deviceType = builder.deviceType;
            this.gbId = builder.gbId;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.resolution = builder.resolution;
            this.sipGBId = builder.sipGBId;
            this.sipPassword = builder.sipPassword;
            this.sipServerIp = builder.sipServerIp;
            this.sipServerPort = builder.sipServerPort;
            this.status = builder.status;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return accessProtocolType
         */
        public String getAccessProtocolType() {
            return this.accessProtocolType;
        }

        /**
         * @return bitRate
         */
        public String getBitRate() {
            return this.bitRate;
        }

        /**
         * @return coverImageUrl
         */
        public String getCoverImageUrl() {
            return this.coverImageUrl;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceAddress
         */
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        /**
         * @return deviceDirection
         */
        public String getDeviceDirection() {
            return this.deviceDirection;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return deviceSite
         */
        public String getDeviceSite() {
            return this.deviceSite;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return gbId
         */
        public String getGbId() {
            return this.gbId;
        }

        /**
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return sipGBId
         */
        public String getSipGBId() {
            return this.sipGBId;
        }

        /**
         * @return sipPassword
         */
        public String getSipPassword() {
            return this.sipPassword;
        }

        /**
         * @return sipServerIp
         */
        public String getSipServerIp() {
            return this.sipServerIp;
        }

        /**
         * @return sipServerPort
         */
        public String getSipServerPort() {
            return this.sipServerPort;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String accessProtocolType; 
            private String bitRate; 
            private String coverImageUrl; 
            private String createTime; 
            private String deviceAddress; 
            private String deviceDirection; 
            private String deviceName; 
            private String deviceSite; 
            private String deviceType; 
            private String gbId; 
            private String latitude; 
            private String longitude; 
            private String resolution; 
            private String sipGBId; 
            private String sipPassword; 
            private String sipServerIp; 
            private String sipServerPort; 
            private Integer status; 
            private String vendor; 

            /**
             * AccessProtocolType.
             */
            public Builder accessProtocolType(String accessProtocolType) {
                this.accessProtocolType = accessProtocolType;
                return this;
            }

            /**
             * BitRate.
             */
            public Builder bitRate(String bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * CoverImageUrl.
             */
            public Builder coverImageUrl(String coverImageUrl) {
                this.coverImageUrl = coverImageUrl;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeviceAddress.
             */
            public Builder deviceAddress(String deviceAddress) {
                this.deviceAddress = deviceAddress;
                return this;
            }

            /**
             * DeviceDirection.
             */
            public Builder deviceDirection(String deviceDirection) {
                this.deviceDirection = deviceDirection;
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
             * DeviceSite.
             */
            public Builder deviceSite(String deviceSite) {
                this.deviceSite = deviceSite;
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
             * GbId.
             */
            public Builder gbId(String gbId) {
                this.gbId = gbId;
                return this;
            }

            /**
             * Latitude.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * Longitude.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * SipGBId.
             */
            public Builder sipGBId(String sipGBId) {
                this.sipGBId = sipGBId;
                return this;
            }

            /**
             * SipPassword.
             */
            public Builder sipPassword(String sipPassword) {
                this.sipPassword = sipPassword;
                return this;
            }

            /**
             * SipServerIp.
             */
            public Builder sipServerIp(String sipServerIp) {
                this.sipServerIp = sipServerIp;
                return this;
            }

            /**
             * SipServerPort.
             */
            public Builder sipServerPort(String sipServerPort) {
                this.sipServerPort = sipServerPort;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * Vendor.
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("TotalPage")
        private Integer totalPage;

        private Data(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
            this.totalPage = builder.totalPage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Integer getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private java.util.List < Records> records; 
            private Integer totalCount; 
            private Integer totalPage; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Integer totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
