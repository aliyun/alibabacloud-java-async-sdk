// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGtmInstanceAddressPoolResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmInstanceAddressPoolResponseBody</p>
 */
public class DescribeGtmInstanceAddressPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddrCount")
    private Integer addrCount;

    @com.aliyun.core.annotation.NameInMap("AddrPoolId")
    private String addrPoolId;

    @com.aliyun.core.annotation.NameInMap("Addrs")
    private Addrs addrs;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("MinAvailableAddrNum")
    private Integer minAvailableAddrNum;

    @com.aliyun.core.annotation.NameInMap("MonitorConfigId")
    private String monitorConfigId;

    @com.aliyun.core.annotation.NameInMap("MonitorStatus")
    private String monitorStatus;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeGtmInstanceAddressPoolResponseBody model) {
            this.addrCount = model.addrCount;
            this.addrPoolId = model.addrPoolId;
            this.addrs = model.addrs;
            this.createTime = model.createTime;
            this.createTimestamp = model.createTimestamp;
            this.minAvailableAddrNum = model.minAvailableAddrNum;
            this.monitorConfigId = model.monitorConfigId;
            this.monitorStatus = model.monitorStatus;
            this.name = model.name;
            this.requestId = model.requestId;
            this.status = model.status;
            this.type = model.type;
            this.updateTime = model.updateTime;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * <p>The number of addresses in the address pool queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder addrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }

        /**
         * <p>The ID of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1234abc</p>
         */
        public Builder addrPoolId(String addrPoolId) {
            this.addrPoolId = addrPoolId;
            return this;
        }

        /**
         * <p>The addresses in the address pool.</p>
         */
        public Builder addrs(Addrs addrs) {
            this.addrs = addrs;
            return this;
        }

        /**
         * <p>The time when the address pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
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
         * <p>The minimum number of available addresses in the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder minAvailableAddrNum(Integer minAvailableAddrNum) {
            this.minAvailableAddrNum = minAvailableAddrNum;
            return this;
        }

        /**
         * <p>The health check ID of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>100abc</p>
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * <p>Indicates whether health check was enabled for the address pool. Valid values:</p>
         * <ul>
         * <li><strong>OPEN</strong>: Enabled</li>
         * <li><strong>CLOSE</strong>: Disabled</li>
         * <li><strong>UNCONFIGURED</strong>: Not configured</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPEN</p>
         */
        public Builder monitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }

        /**
         * <p>The name of the address pool.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The availability status of the address pool. Valid values:</p>
         * <ul>
         * <li><strong>AVAILABLE</strong>: Available</li>
         * <li><strong>NOT_AVAILABLE</strong>: Unavailable</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the address pool. Valid values:</p>
         * <ul>
         * <li><strong>IP</strong>: IP address</li>
         * <li><strong>DOMAIN</strong>: Domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The last time when the address pool was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>A timestamp that indicates the last time the address pool was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeGtmInstanceAddressPoolResponseBody build() {
            return new DescribeGtmInstanceAddressPoolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGtmInstanceAddressPoolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmInstanceAddressPoolResponseBody</p>
     */
    public static class Addr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddrId")
        private Long addrId;

        @com.aliyun.core.annotation.NameInMap("AlertStatus")
        private String alertStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("LbaWeight")
        private Integer lbaWeight;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Addr model) {
                this.addrId = model.addrId;
                this.alertStatus = model.alertStatus;
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.lbaWeight = model.lbaWeight;
                this.mode = model.mode;
                this.updateTime = model.updateTime;
                this.updateTimestamp = model.updateTimestamp;
                this.value = model.value;
            } 

            /**
             * <p>The ID of the address.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder addrId(Long addrId) {
                this.addrId = addrId;
                return this;
            }

            /**
             * <p>Indicates whether health check was enabled for the address. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong>: Normal</li>
             * <li><strong>ALERT</strong>: Alert</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder alertStatus(String alertStatus) {
                this.alertStatus = alertStatus;
                return this;
            }

            /**
             * <p>The time when the address pool was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-28T13:08Z</p>
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
             * <p>The weight of the address.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder lbaWeight(Integer lbaWeight) {
                this.lbaWeight = lbaWeight;
                return this;
            }

            /**
             * <p>The mode of the address. Valid values:</p>
             * <ul>
             * <li><strong>SMART</strong>: Intelligent return</li>
             * <li><strong>ONLINE</strong>: Always online</li>
             * <li><strong>OFFLINE</strong>: Always offline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SMART</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The last time when the address was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-28T13:08Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>A timestamp that indicates the last time when the address was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>The address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
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
    /**
     * 
     * {@link DescribeGtmInstanceAddressPoolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmInstanceAddressPoolResponseBody</p>
     */
    public static class Addrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addr")
        private java.util.List<Addr> addr;

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
        public java.util.List<Addr> getAddr() {
            return this.addr;
        }

        public static final class Builder {
            private java.util.List<Addr> addr; 

            private Builder() {
            } 

            private Builder(Addrs model) {
                this.addr = model.addr;
            } 

            /**
             * Addr.
             */
            public Builder addr(java.util.List<Addr> addr) {
                this.addr = addr;
                return this;
            }

            public Addrs build() {
                return new Addrs(this);
            } 

        } 

    }
}
