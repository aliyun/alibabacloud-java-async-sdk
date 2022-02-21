// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmInstanceAddressPoolResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstanceAddressPoolResponseBody</p>
 */
public class DescribeDnsGtmInstanceAddressPoolResponseBody extends TeaModel {
    @NameInMap("AddrCount")
    private Integer addrCount;

    @NameInMap("AddrPoolId")
    private String addrPoolId;

    @NameInMap("Addrs")
    private Addrs addrs;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @NameInMap("LbaStrategy")
    private String lbaStrategy;

    @NameInMap("MonitorConfigId")
    private String monitorConfigId;

    @NameInMap("MonitorStatus")
    private String monitorStatus;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Type")
    private String type;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    private DescribeDnsGtmInstanceAddressPoolResponseBody(Builder builder) {
        this.addrCount = builder.addrCount;
        this.addrPoolId = builder.addrPoolId;
        this.addrs = builder.addrs;
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.lbaStrategy = builder.lbaStrategy;
        this.monitorConfigId = builder.monitorConfigId;
        this.monitorStatus = builder.monitorStatus;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmInstanceAddressPoolResponseBody create() {
        return builder().build();
    }

    /**
     * @return addrCount
     */
    public Integer getAddrCount() {
        return this.addrCount;
    }

    /**
     * @return addrPoolId
     */
    public String getAddrPoolId() {
        return this.addrPoolId;
    }

    /**
     * @return addrs
     */
    public Addrs getAddrs() {
        return this.addrs;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimestamp
     */
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    /**
     * @return lbaStrategy
     */
    public String getLbaStrategy() {
        return this.lbaStrategy;
    }

    /**
     * @return monitorConfigId
     */
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    /**
     * @return monitorStatus
     */
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return updateTimestamp
     */
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static final class Builder {
        private Integer addrCount; 
        private String addrPoolId; 
        private Addrs addrs; 
        private String createTime; 
        private Long createTimestamp; 
        private String lbaStrategy; 
        private String monitorConfigId; 
        private String monitorStatus; 
        private String name; 
        private String requestId; 
        private String type; 
        private String updateTime; 
        private Long updateTimestamp; 

        /**
         * AddrCount.
         */
        public Builder addrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }

        /**
         * AddrPoolId.
         */
        public Builder addrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * Addrs.
         */
        public Builder addrs(Addrs addrs) {
            this.addrs = addrs;
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
         * CreateTimestamp.
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * LbaStrategy.
         */
        public Builder lbaStrategy(String lbaStrategy) {
            this.lbaStrategy = lbaStrategy;
            return this;
        }

        /**
         * MonitorConfigId.
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * MonitorStatus.
         */
        public Builder monitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
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
         * UpdateTimestamp.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBody build() {
            return new DescribeDnsGtmInstanceAddressPoolResponseBody(this);
        } 

    } 

    public static class Addr extends TeaModel {
        @NameInMap("Addr")
        private String addr;

        @NameInMap("AlertStatus")
        private String alertStatus;

        @NameInMap("AttributeInfo")
        private String attributeInfo;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("LbaWeight")
        private Integer lbaWeight;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        private Addr(Builder builder) {
            this.addr = builder.addr;
            this.alertStatus = builder.alertStatus;
            this.attributeInfo = builder.attributeInfo;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.lbaWeight = builder.lbaWeight;
            this.mode = builder.mode;
            this.remark = builder.remark;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addr create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public String getAddr() {
            return this.addr;
        }

        /**
         * @return alertStatus
         */
        public String getAlertStatus() {
            return this.alertStatus;
        }

        /**
         * @return attributeInfo
         */
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return lbaWeight
         */
        public Integer getLbaWeight() {
            return this.lbaWeight;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String addr; 
            private String alertStatus; 
            private String attributeInfo; 
            private String createTime; 
            private Long createTimestamp; 
            private Integer lbaWeight; 
            private String mode; 
            private String remark; 
            private String updateTime; 
            private Long updateTimestamp; 

            /**
             * Addr.
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * AlertStatus.
             */
            public Builder alertStatus(String alertStatus) {
                this.alertStatus = alertStatus;
                return this;
            }

            /**
             * AttributeInfo.
             */
            public Builder attributeInfo(String attributeInfo) {
                this.attributeInfo = attributeInfo;
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
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * LbaWeight.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
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
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Addr build() {
                return new Addr(this);
            } 

        } 

    }
    public static class Addrs extends TeaModel {
        @NameInMap("Addr")
        private java.util.List < Addr> addr;

        private Addrs(Builder builder) {
            this.addr = builder.addr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addrs create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public java.util.List < Addr> getAddr() {
            return this.addr;
        }

        public static final class Builder {
            private java.util.List < Addr> addr; 

            /**
             * Addr.
             */
            public Builder addr(java.util.List < Addr> addr) {
                this.addr = addr;
                return this;
            }

            public Addrs build() {
                return new Addrs(this);
            } 

        } 

    }
}
