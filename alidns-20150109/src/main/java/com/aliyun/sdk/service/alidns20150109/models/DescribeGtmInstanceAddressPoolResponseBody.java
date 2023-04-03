// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmInstanceAddressPoolResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstanceAddressPoolResponseBody</p>
 */
public class DescribeGtmInstanceAddressPoolResponseBody extends TeaModel {
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

    @NameInMap("MinAvailableAddrNum")
    private Integer minAvailableAddrNum;

    @NameInMap("MonitorConfigId")
    private String monitorConfigId;

    @NameInMap("MonitorStatus")
    private String monitorStatus;

    @NameInMap("Name")
    private String name;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Type")
    private String type;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    private DescribeGtmInstanceAddressPoolResponseBody(Builder builder) {
        this.addrCount = builder.addrCount;
        this.addrPoolId = builder.addrPoolId;
        this.addrs = builder.addrs;
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.minAvailableAddrNum = builder.minAvailableAddrNum;
        this.monitorConfigId = builder.monitorConfigId;
        this.monitorStatus = builder.monitorStatus;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstanceAddressPoolResponseBody create() {
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
     * @return minAvailableAddrNum
     */
    public Integer getMinAvailableAddrNum() {
        return this.minAvailableAddrNum;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private Integer minAvailableAddrNum; 
        private String monitorConfigId; 
        private String monitorStatus; 
        private String name; 
        private String requestId; 
        private String status; 
        private String type; 
        private String updateTime; 
        private Long updateTimestamp; 

        /**
         * The number of addresses in the address pool queried.
         */
        public Builder addrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }

        /**
         * The ID of the address pool.
         */
        public Builder addrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * The addresses in the address pool.
         */
        public Builder addrs(Addrs addrs) {
            this.addrs = addrs;
            return this;
        }

        /**
         * The time when the address pool was created.
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
         * The minimum number of available addresses in the address pool.
         */
        public Builder minAvailableAddrNum(Integer minAvailableAddrNum) {
            this.minAvailableAddrNum = minAvailableAddrNum;
            return this;
        }

        /**
         * The health check ID of the address pool.
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * Indicates whether health check was enabled for the address pool. Valid values:
         * <p>
         * 
         * *   **OPEN**: Enabled
         * *   **CLOSE**: Disabled
         * *   **UNCONFIGURED**: Not configured
         */
        public Builder monitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }

        /**
         * The name of the address pool.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The availability status of the address pool. Valid values:
         * <p>
         * 
         * *   **AVAILABLE**: Available
         * *   **NOT_AVAILABLE**: Unavailable
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The type of the address pool. Valid values:
         * <p>
         * 
         * *   **IP**: IP address
         * *   **DOMAIN**: Domain name
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * The last time when the address pool was updated.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * A timestamp that indicates the last time the address pool was updated.
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeGtmInstanceAddressPoolResponseBody build() {
            return new DescribeGtmInstanceAddressPoolResponseBody(this);
        } 

    } 

    public static class Addr extends TeaModel {
        @NameInMap("AddrId")
        private Long addrId;

        @NameInMap("AlertStatus")
        private String alertStatus;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("LbaWeight")
        private Integer lbaWeight;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @NameInMap("Value")
        private String value;

        private Addr(Builder builder) {
            this.addrId = builder.addrId;
            this.alertStatus = builder.alertStatus;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.lbaWeight = builder.lbaWeight;
            this.mode = builder.mode;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addr create() {
            return builder().build();
        }

        /**
         * @return addrId
         */
        public Long getAddrId() {
            return this.addrId;
        }

        /**
         * @return alertStatus
         */
        public String getAlertStatus() {
            return this.alertStatus;
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

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Long addrId; 
            private String alertStatus; 
            private String createTime; 
            private Long createTimestamp; 
            private Integer lbaWeight; 
            private String mode; 
            private String updateTime; 
            private Long updateTimestamp; 
            private String value; 

            /**
             * The ID of the address.
             */
            public Builder addrId(Long addrId) {
                this.addrId = addrId;
                return this;
            }

            /**
             * Indicates whether health check was enabled for the address. Valid values:
             * <p>
             * 
             * *   **OK**: Normal
             * *   **ALERT**: Alert
             */
            public Builder alertStatus(String alertStatus) {
                this.alertStatus = alertStatus;
                return this;
            }

            /**
             * The time when the address pool was created.
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
             * The weight of the address.
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * The mode of the address. Valid values:
             * <p>
             * 
             * *   **SMART**: Intelligent return
             * *   **ONLINE**: Always online
             * *   **OFFLINE**: Always offline
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The last time when the address was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * A timestamp that indicates the last time when the address was updated.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * The address.
             */
            public Builder value(String value) {
                this.value = value;
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
