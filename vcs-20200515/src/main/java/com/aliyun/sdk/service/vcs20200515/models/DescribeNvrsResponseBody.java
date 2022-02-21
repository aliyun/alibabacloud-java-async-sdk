// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNvrsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNvrsResponseBody</p>
 */
public class DescribeNvrsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeNvrsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNvrsResponseBody create() {
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

        public DescribeNvrsResponseBody build() {
            return new DescribeNvrsResponseBody(this);
        } 

    } 

    public static class SubDeviceInfo extends TeaModel {
        @NameInMap("SubDeviceId")
        private String subDeviceId;

        private SubDeviceInfo(Builder builder) {
            this.subDeviceId = builder.subDeviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDeviceInfo create() {
            return builder().build();
        }

        /**
         * @return subDeviceId
         */
        public String getSubDeviceId() {
            return this.subDeviceId;
        }

        public static final class Builder {
            private String subDeviceId; 

            /**
             * SubDeviceId.
             */
            public Builder subDeviceId(String subDeviceId) {
                this.subDeviceId = subDeviceId;
                return this;
            }

            public SubDeviceInfo build() {
                return new SubDeviceInfo(this);
            } 

        } 

    }
    public static class Records extends TeaModel {
        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DatasourceType")
        private String datasourceType;

        @NameInMap("DeviceAddress")
        private String deviceAddress;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceSn")
        private String deviceSn;

        @NameInMap("DeviceStatus")
        private String deviceStatus;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("InProtocol")
        private String inProtocol;

        @NameInMap("Latitude")
        private String latitude;

        @NameInMap("Longitude")
        private String longitude;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("Password")
        private String password;

        @NameInMap("ServerId")
        private String serverId;

        @NameInMap("ServerIp")
        private String serverIp;

        @NameInMap("ServerPort")
        private String serverPort;

        @NameInMap("ServerRealm")
        private String serverRealm;

        @NameInMap("SubDeviceCount")
        private String subDeviceCount;

        @NameInMap("SubDeviceInfo")
        private java.util.List < SubDeviceInfo> subDeviceInfo;

        @NameInMap("Vendor")
        private String vendor;

        private Records(Builder builder) {
            this.corpId = builder.corpId;
            this.createTime = builder.createTime;
            this.datasourceType = builder.datasourceType;
            this.deviceAddress = builder.deviceAddress;
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.deviceName = builder.deviceName;
            this.deviceSn = builder.deviceSn;
            this.deviceStatus = builder.deviceStatus;
            this.deviceType = builder.deviceType;
            this.inProtocol = builder.inProtocol;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.modifyTime = builder.modifyTime;
            this.password = builder.password;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverPort = builder.serverPort;
            this.serverRealm = builder.serverRealm;
            this.subDeviceCount = builder.subDeviceCount;
            this.subDeviceInfo = builder.subDeviceInfo;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return datasourceType
         */
        public String getDatasourceType() {
            return this.datasourceType;
        }

        /**
         * @return deviceAddress
         */
        public String getDeviceAddress() {
            return this.deviceAddress;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
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
         * @return inProtocol
         */
        public String getInProtocol() {
            return this.inProtocol;
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
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return serverId
         */
        public String getServerId() {
            return this.serverId;
        }

        /**
         * @return serverIp
         */
        public String getServerIp() {
            return this.serverIp;
        }

        /**
         * @return serverPort
         */
        public String getServerPort() {
            return this.serverPort;
        }

        /**
         * @return serverRealm
         */
        public String getServerRealm() {
            return this.serverRealm;
        }

        /**
         * @return subDeviceCount
         */
        public String getSubDeviceCount() {
            return this.subDeviceCount;
        }

        /**
         * @return subDeviceInfo
         */
        public java.util.List < SubDeviceInfo> getSubDeviceInfo() {
            return this.subDeviceInfo;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String corpId; 
            private String createTime; 
            private String datasourceType; 
            private String deviceAddress; 
            private String deviceId; 
            private String deviceModel; 
            private String deviceName; 
            private String deviceSn; 
            private String deviceStatus; 
            private String deviceType; 
            private String inProtocol; 
            private String latitude; 
            private String longitude; 
            private String modifyTime; 
            private String password; 
            private String serverId; 
            private String serverIp; 
            private String serverPort; 
            private String serverRealm; 
            private String subDeviceCount; 
            private java.util.List < SubDeviceInfo> subDeviceInfo; 
            private String vendor; 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
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
             * DatasourceType.
             */
            public Builder datasourceType(String datasourceType) {
                this.datasourceType = datasourceType;
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
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
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
             * InProtocol.
             */
            public Builder inProtocol(String inProtocol) {
                this.inProtocol = inProtocol;
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
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * ServerId.
             */
            public Builder serverId(String serverId) {
                this.serverId = serverId;
                return this;
            }

            /**
             * ServerIp.
             */
            public Builder serverIp(String serverIp) {
                this.serverIp = serverIp;
                return this;
            }

            /**
             * ServerPort.
             */
            public Builder serverPort(String serverPort) {
                this.serverPort = serverPort;
                return this;
            }

            /**
             * ServerRealm.
             */
            public Builder serverRealm(String serverRealm) {
                this.serverRealm = serverRealm;
                return this;
            }

            /**
             * SubDeviceCount.
             */
            public Builder subDeviceCount(String subDeviceCount) {
                this.subDeviceCount = subDeviceCount;
                return this;
            }

            /**
             * SubDeviceInfo.
             */
            public Builder subDeviceInfo(java.util.List < SubDeviceInfo> subDeviceInfo) {
                this.subDeviceInfo = subDeviceInfo;
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
        @NameInMap("PageNum")
        private Long pageNum;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Records")
        private java.util.List < Records> records;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("TotalPage")
        private Long totalPage;

        private Data(Builder builder) {
            this.pageNum = builder.pageNum;
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
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
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
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        public static final class Builder {
            private Long pageNum; 
            private Long pageSize; 
            private java.util.List < Records> records; 
            private Long totalCount; 
            private Long totalPage; 

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
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
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
