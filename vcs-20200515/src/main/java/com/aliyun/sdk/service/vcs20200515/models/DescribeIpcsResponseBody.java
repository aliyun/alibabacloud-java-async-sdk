// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpcsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIpcsResponseBody</p>
 */
public class DescribeIpcsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeIpcsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIpcsResponseBody create() {
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

        public DescribeIpcsResponseBody build() {
            return new DescribeIpcsResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("AudioEnable")
        private String audioEnable;

        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DatasourceType")
        private String datasourceType;

        @NameInMap("DeviceAddress")
        private String deviceAddress;

        @NameInMap("DeviceDirection")
        private String deviceDirection;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceIp")
        private String deviceIp;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("DeviceRate")
        private String deviceRate;

        @NameInMap("DeviceResolution")
        private String deviceResolution;

        @NameInMap("DeviceSite")
        private String deviceSite;

        @NameInMap("DeviceSn")
        private String deviceSn;

        @NameInMap("DeviceStatus")
        private String deviceStatus;

        @NameInMap("DeviceSubType")
        private String deviceSubType;

        @NameInMap("DeviceType")
        private String deviceType;

        @NameInMap("EncodeFormat")
        private String encodeFormat;

        @NameInMap("FrameRate")
        private String frameRate;

        @NameInMap("GovLength")
        private String govLength;

        @NameInMap("InProtocol")
        private String inProtocol;

        @NameInMap("Latitude")
        private String latitude;

        @NameInMap("Longitude")
        private String longitude;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("OSDTimeEnable")
        private String OSDTimeEnable;

        @NameInMap("OSDTimeType")
        private String OSDTimeType;

        @NameInMap("OSDTimeX")
        private String OSDTimeX;

        @NameInMap("OSDTimeY")
        private String OSDTimeY;

        @NameInMap("ParentDeviceId")
        private String parentDeviceId;

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

        @NameInMap("StreamAction")
        private String streamAction;

        @NameInMap("StreamStatus")
        private String streamStatus;

        @NameInMap("Vap")
        private String vap;

        @NameInMap("Vendor")
        private String vendor;

        private Records(Builder builder) {
            this.audioEnable = builder.audioEnable;
            this.corpId = builder.corpId;
            this.createTime = builder.createTime;
            this.datasourceType = builder.datasourceType;
            this.deviceAddress = builder.deviceAddress;
            this.deviceDirection = builder.deviceDirection;
            this.deviceId = builder.deviceId;
            this.deviceIp = builder.deviceIp;
            this.deviceModel = builder.deviceModel;
            this.deviceName = builder.deviceName;
            this.deviceRate = builder.deviceRate;
            this.deviceResolution = builder.deviceResolution;
            this.deviceSite = builder.deviceSite;
            this.deviceSn = builder.deviceSn;
            this.deviceStatus = builder.deviceStatus;
            this.deviceSubType = builder.deviceSubType;
            this.deviceType = builder.deviceType;
            this.encodeFormat = builder.encodeFormat;
            this.frameRate = builder.frameRate;
            this.govLength = builder.govLength;
            this.inProtocol = builder.inProtocol;
            this.latitude = builder.latitude;
            this.longitude = builder.longitude;
            this.modifyTime = builder.modifyTime;
            this.OSDTimeEnable = builder.OSDTimeEnable;
            this.OSDTimeType = builder.OSDTimeType;
            this.OSDTimeX = builder.OSDTimeX;
            this.OSDTimeY = builder.OSDTimeY;
            this.parentDeviceId = builder.parentDeviceId;
            this.password = builder.password;
            this.serverId = builder.serverId;
            this.serverIp = builder.serverIp;
            this.serverPort = builder.serverPort;
            this.serverRealm = builder.serverRealm;
            this.streamAction = builder.streamAction;
            this.streamStatus = builder.streamStatus;
            this.vap = builder.vap;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return audioEnable
         */
        public String getAudioEnable() {
            return this.audioEnable;
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
         * @return deviceDirection
         */
        public String getDeviceDirection() {
            return this.deviceDirection;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceIp
         */
        public String getDeviceIp() {
            return this.deviceIp;
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
         * @return deviceRate
         */
        public String getDeviceRate() {
            return this.deviceRate;
        }

        /**
         * @return deviceResolution
         */
        public String getDeviceResolution() {
            return this.deviceResolution;
        }

        /**
         * @return deviceSite
         */
        public String getDeviceSite() {
            return this.deviceSite;
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
         * @return deviceSubType
         */
        public String getDeviceSubType() {
            return this.deviceSubType;
        }

        /**
         * @return deviceType
         */
        public String getDeviceType() {
            return this.deviceType;
        }

        /**
         * @return encodeFormat
         */
        public String getEncodeFormat() {
            return this.encodeFormat;
        }

        /**
         * @return frameRate
         */
        public String getFrameRate() {
            return this.frameRate;
        }

        /**
         * @return govLength
         */
        public String getGovLength() {
            return this.govLength;
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
         * @return OSDTimeEnable
         */
        public String getOSDTimeEnable() {
            return this.OSDTimeEnable;
        }

        /**
         * @return OSDTimeType
         */
        public String getOSDTimeType() {
            return this.OSDTimeType;
        }

        /**
         * @return OSDTimeX
         */
        public String getOSDTimeX() {
            return this.OSDTimeX;
        }

        /**
         * @return OSDTimeY
         */
        public String getOSDTimeY() {
            return this.OSDTimeY;
        }

        /**
         * @return parentDeviceId
         */
        public String getParentDeviceId() {
            return this.parentDeviceId;
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
         * @return streamAction
         */
        public String getStreamAction() {
            return this.streamAction;
        }

        /**
         * @return streamStatus
         */
        public String getStreamStatus() {
            return this.streamStatus;
        }

        /**
         * @return vap
         */
        public String getVap() {
            return this.vap;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String audioEnable; 
            private String corpId; 
            private String createTime; 
            private String datasourceType; 
            private String deviceAddress; 
            private String deviceDirection; 
            private String deviceId; 
            private String deviceIp; 
            private String deviceModel; 
            private String deviceName; 
            private String deviceRate; 
            private String deviceResolution; 
            private String deviceSite; 
            private String deviceSn; 
            private String deviceStatus; 
            private String deviceSubType; 
            private String deviceType; 
            private String encodeFormat; 
            private String frameRate; 
            private String govLength; 
            private String inProtocol; 
            private String latitude; 
            private String longitude; 
            private String modifyTime; 
            private String OSDTimeEnable; 
            private String OSDTimeType; 
            private String OSDTimeX; 
            private String OSDTimeY; 
            private String parentDeviceId; 
            private String password; 
            private String serverId; 
            private String serverIp; 
            private String serverPort; 
            private String serverRealm; 
            private String streamAction; 
            private String streamStatus; 
            private String vap; 
            private String vendor; 

            /**
             * AudioEnable.
             */
            public Builder audioEnable(String audioEnable) {
                this.audioEnable = audioEnable;
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
             * DeviceDirection.
             */
            public Builder deviceDirection(String deviceDirection) {
                this.deviceDirection = deviceDirection;
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
             * DeviceIp.
             */
            public Builder deviceIp(String deviceIp) {
                this.deviceIp = deviceIp;
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
             * DeviceRate.
             */
            public Builder deviceRate(String deviceRate) {
                this.deviceRate = deviceRate;
                return this;
            }

            /**
             * DeviceResolution.
             */
            public Builder deviceResolution(String deviceResolution) {
                this.deviceResolution = deviceResolution;
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
             * DeviceSubType.
             */
            public Builder deviceSubType(String deviceSubType) {
                this.deviceSubType = deviceSubType;
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
             * EncodeFormat.
             */
            public Builder encodeFormat(String encodeFormat) {
                this.encodeFormat = encodeFormat;
                return this;
            }

            /**
             * FrameRate.
             */
            public Builder frameRate(String frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * GovLength.
             */
            public Builder govLength(String govLength) {
                this.govLength = govLength;
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
             * OSDTimeEnable.
             */
            public Builder OSDTimeEnable(String OSDTimeEnable) {
                this.OSDTimeEnable = OSDTimeEnable;
                return this;
            }

            /**
             * OSDTimeType.
             */
            public Builder OSDTimeType(String OSDTimeType) {
                this.OSDTimeType = OSDTimeType;
                return this;
            }

            /**
             * OSDTimeX.
             */
            public Builder OSDTimeX(String OSDTimeX) {
                this.OSDTimeX = OSDTimeX;
                return this;
            }

            /**
             * OSDTimeY.
             */
            public Builder OSDTimeY(String OSDTimeY) {
                this.OSDTimeY = OSDTimeY;
                return this;
            }

            /**
             * ParentDeviceId.
             */
            public Builder parentDeviceId(String parentDeviceId) {
                this.parentDeviceId = parentDeviceId;
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
             * StreamAction.
             */
            public Builder streamAction(String streamAction) {
                this.streamAction = streamAction;
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
             * Vap.
             */
            public Builder vap(String vap) {
                this.vap = vap;
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
