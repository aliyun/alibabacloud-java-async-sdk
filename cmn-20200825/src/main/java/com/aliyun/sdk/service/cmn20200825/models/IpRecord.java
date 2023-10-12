// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IpRecord} extends {@link TeaModel}
 *
 * <p>IpRecord</p>
 */
public class IpRecord extends TeaModel {
    @NameInMap("BusinessTypeName")
    private String businessTypeName;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Creator")
    private String creator;

    @NameInMap("Description")
    private String description;

    @NameInMap("Detail")
    private java.util.List < Detail> detail;

    @NameInMap("IpBlock")
    private String ipBlock;

    @NameInMap("IpCode")
    private java.util.List < String > ipCode;

    @NameInMap("IpRecordId")
    private String ipRecordId;

    @NameInMap("RecodeType")
    private String recodeType;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("ZoneName")
    private String zoneName;

    private IpRecord(Builder builder) {
        this.businessTypeName = builder.businessTypeName;
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.description = builder.description;
        this.detail = builder.detail;
        this.ipBlock = builder.ipBlock;
        this.ipCode = builder.ipCode;
        this.ipRecordId = builder.ipRecordId;
        this.recodeType = builder.recodeType;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IpRecord create() {
        return builder().build();
    }

    /**
     * @return businessTypeName
     */
    public String getBusinessTypeName() {
        return this.businessTypeName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detail
     */
    public java.util.List < Detail> getDetail() {
        return this.detail;
    }

    /**
     * @return ipBlock
     */
    public String getIpBlock() {
        return this.ipBlock;
    }

    /**
     * @return ipCode
     */
    public java.util.List < String > getIpCode() {
        return this.ipCode;
    }

    /**
     * @return ipRecordId
     */
    public String getIpRecordId() {
        return this.ipRecordId;
    }

    /**
     * @return recodeType
     */
    public String getRecodeType() {
        return this.recodeType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder {
        private String businessTypeName; 
        private String createTime; 
        private String creator; 
        private String description; 
        private java.util.List < Detail> detail; 
        private String ipBlock; 
        private java.util.List < String > ipCode; 
        private String ipRecordId; 
        private String recodeType; 
        private String status; 
        private String updateTime; 
        private String zoneName; 

        /**
         * BusinessTypeName.
         */
        public Builder businessTypeName(String businessTypeName) {
            this.businessTypeName = businessTypeName;
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
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(java.util.List < Detail> detail) {
            this.detail = detail;
            return this;
        }

        /**
         * IpBlock.
         */
        public Builder ipBlock(String ipBlock) {
            this.ipBlock = ipBlock;
            return this;
        }

        /**
         * IpCode.
         */
        public Builder ipCode(java.util.List < String > ipCode) {
            this.ipCode = ipCode;
            return this;
        }

        /**
         * IpRecordId.
         */
        public Builder ipRecordId(String ipRecordId) {
            this.ipRecordId = ipRecordId;
            return this;
        }

        /**
         * RecodeType.
         */
        public Builder recodeType(String recodeType) {
            this.recodeType = recodeType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.zoneName = zoneName;
            return this;
        }

        public IpRecord build() {
            return new IpRecord(this);
        } 

    } 

    public static class ZoneLayer extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Value")
        private String value;

        private ZoneLayer(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneLayer create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ZoneLayer build() {
                return new ZoneLayer(this);
            } 

        } 

    }
    public static class Detail extends TeaModel {
        @NameInMap("DeviceMac")
        private String deviceMac;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("Gateway")
        private String gateway;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("ParentIpBlocks")
        private java.util.List < String > parentIpBlocks;

        @NameInMap("Port")
        private String port;

        @NameInMap("RemoteDeviceName")
        private String remoteDeviceName;

        @NameInMap("RemoteIp")
        private String remoteIp;

        @NameInMap("RemotePort")
        private String remotePort;

        @NameInMap("ZoneLayer")
        private java.util.List < ZoneLayer> zoneLayer;

        private Detail(Builder builder) {
            this.deviceMac = builder.deviceMac;
            this.deviceName = builder.deviceName;
            this.gateway = builder.gateway;
            this.ip = builder.ip;
            this.parentIpBlocks = builder.parentIpBlocks;
            this.port = builder.port;
            this.remoteDeviceName = builder.remoteDeviceName;
            this.remoteIp = builder.remoteIp;
            this.remotePort = builder.remotePort;
            this.zoneLayer = builder.zoneLayer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return deviceMac
         */
        public String getDeviceMac() {
            return this.deviceMac;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return gateway
         */
        public String getGateway() {
            return this.gateway;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return parentIpBlocks
         */
        public java.util.List < String > getParentIpBlocks() {
            return this.parentIpBlocks;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return remoteDeviceName
         */
        public String getRemoteDeviceName() {
            return this.remoteDeviceName;
        }

        /**
         * @return remoteIp
         */
        public String getRemoteIp() {
            return this.remoteIp;
        }

        /**
         * @return remotePort
         */
        public String getRemotePort() {
            return this.remotePort;
        }

        /**
         * @return zoneLayer
         */
        public java.util.List < ZoneLayer> getZoneLayer() {
            return this.zoneLayer;
        }

        public static final class Builder {
            private String deviceMac; 
            private String deviceName; 
            private String gateway; 
            private String ip; 
            private java.util.List < String > parentIpBlocks; 
            private String port; 
            private String remoteDeviceName; 
            private String remoteIp; 
            private String remotePort; 
            private java.util.List < ZoneLayer> zoneLayer; 

            /**
             * DeviceMac.
             */
            public Builder deviceMac(String deviceMac) {
                this.deviceMac = deviceMac;
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
             * Gateway.
             */
            public Builder gateway(String gateway) {
                this.gateway = gateway;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * ParentIpBlocks.
             */
            public Builder parentIpBlocks(java.util.List < String > parentIpBlocks) {
                this.parentIpBlocks = parentIpBlocks;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * RemoteDeviceName.
             */
            public Builder remoteDeviceName(String remoteDeviceName) {
                this.remoteDeviceName = remoteDeviceName;
                return this;
            }

            /**
             * RemoteIp.
             */
            public Builder remoteIp(String remoteIp) {
                this.remoteIp = remoteIp;
                return this;
            }

            /**
             * RemotePort.
             */
            public Builder remotePort(String remotePort) {
                this.remotePort = remotePort;
                return this;
            }

            /**
             * ZoneLayer.
             */
            public Builder zoneLayer(java.util.List < ZoneLayer> zoneLayer) {
                this.zoneLayer = zoneLayer;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
}
