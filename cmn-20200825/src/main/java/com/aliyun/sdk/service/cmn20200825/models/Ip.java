// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Ip} extends {@link TeaModel}
 *
 * <p>Ip</p>
 */
public class Ip extends TeaModel {
    @NameInMap("BusinessTypeId")
    private String businessTypeId;

    @NameInMap("BusinessTypeName")
    private String businessTypeName;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DeviceMac")
    private String deviceMac;

    @NameInMap("DeviceName")
    private String deviceName;

    @NameInMap("IpAddress")
    private String ipAddress;

    @NameInMap("IpId")
    private String ipId;

    @NameInMap("IpName")
    private String ipName;

    @NameInMap("ParentIpBlock")
    private String parentIpBlock;

    @NameInMap("Port")
    private String port;

    @NameInMap("Status")
    private String status;

    @NameInMap("ZoneLayer")
    private java.util.List < ZoneLayer> zoneLayer;

    private Ip(Builder builder) {
        this.businessTypeId = builder.businessTypeId;
        this.businessTypeName = builder.businessTypeName;
        this.createTime = builder.createTime;
        this.deviceMac = builder.deviceMac;
        this.deviceName = builder.deviceName;
        this.ipAddress = builder.ipAddress;
        this.ipId = builder.ipId;
        this.ipName = builder.ipName;
        this.parentIpBlock = builder.parentIpBlock;
        this.port = builder.port;
        this.status = builder.status;
        this.zoneLayer = builder.zoneLayer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Ip create() {
        return builder().build();
    }

    /**
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return this.businessTypeId;
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
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return ipId
     */
    public String getIpId() {
        return this.ipId;
    }

    /**
     * @return ipName
     */
    public String getIpName() {
        return this.ipName;
    }

    /**
     * @return parentIpBlock
     */
    public String getParentIpBlock() {
        return this.parentIpBlock;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return zoneLayer
     */
    public java.util.List < ZoneLayer> getZoneLayer() {
        return this.zoneLayer;
    }

    public static final class Builder {
        private String businessTypeId; 
        private String businessTypeName; 
        private String createTime; 
        private String deviceMac; 
        private String deviceName; 
        private String ipAddress; 
        private String ipId; 
        private String ipName; 
        private String parentIpBlock; 
        private String port; 
        private String status; 
        private java.util.List < ZoneLayer> zoneLayer; 

        /**
         * BusinessTypeId.
         */
        public Builder businessTypeId(String businessTypeId) {
            this.businessTypeId = businessTypeId;
            return this;
        }

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
         * IpAddress.
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * IpId.
         */
        public Builder ipId(String ipId) {
            this.ipId = ipId;
            return this;
        }

        /**
         * IpName.
         */
        public Builder ipName(String ipName) {
            this.ipName = ipName;
            return this;
        }

        /**
         * ParentIpBlock.
         */
        public Builder parentIpBlock(String parentIpBlock) {
            this.parentIpBlock = parentIpBlock;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * ZoneLayer.
         */
        public Builder zoneLayer(java.util.List < ZoneLayer> zoneLayer) {
            this.zoneLayer = zoneLayer;
            return this;
        }

        public Ip build() {
            return new Ip(this);
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
}
