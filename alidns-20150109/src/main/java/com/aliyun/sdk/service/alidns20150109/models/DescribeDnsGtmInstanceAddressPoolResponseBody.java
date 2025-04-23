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
 * {@link DescribeDnsGtmInstanceAddressPoolResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmInstanceAddressPoolResponseBody</p>
 */
public class DescribeDnsGtmInstanceAddressPoolResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("LbaStrategy")
    private String lbaStrategy;

    @com.aliyun.core.annotation.NameInMap("MonitorConfigId")
    private String monitorConfigId;

    @com.aliyun.core.annotation.NameInMap("MonitorStatus")
    private String monitorStatus;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
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

        private Builder() {
        } 

        private Builder(DescribeDnsGtmInstanceAddressPoolResponseBody model) {
            this.addrCount = model.addrCount;
            this.addrPoolId = model.addrPoolId;
            this.addrs = model.addrs;
            this.createTime = model.createTime;
            this.createTimestamp = model.createTimestamp;
            this.lbaStrategy = model.lbaStrategy;
            this.monitorConfigId = model.monitorConfigId;
            this.monitorStatus = model.monitorStatus;
            this.name = model.name;
            this.requestId = model.requestId;
            this.type = model.type;
            this.updateTime = model.updateTime;
            this.updateTimestamp = model.updateTimestamp;
        } 

        /**
         * <p>The number of addresses in the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder addrCount(Integer addrCount) {
            this.addrCount = addrCount;
            return this;
        }

        /**
         * <p>The ID of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>testpool1</p>
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
         * <p>The timestamp that indicates the time when the address pool was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The load balancing policy for the address pool. Valid values:</p>
         * <ul>
         * <li>ALL_RR: returns all addresses.</li>
         * <li>RATIO: returns addresses by weight.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all_rr</p>
         */
        public Builder lbaStrategy(String lbaStrategy) {
            this.lbaStrategy = lbaStrategy;
            return this;
        }

        /**
         * <p>The ID of the health check configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * <p>Indicates the status of the health check. Valid values:</p>
         * <ul>
         * <li>OPEN: The health check is enabled.</li>
         * <li>CLOSE: The health check is disabled.</li>
         * <li>UNCONFIGURED: The health check is not configured.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder monitorStatus(String monitorStatus) {
            this.monitorStatus = monitorStatus;
            return this;
        }

        /**
         * <p>The name of the address pool.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
         * <p>The type of the address pool. Valid values:</p>
         * <ul>
         * <li>IPV4: IPv4 address</li>
         * <li>IPV6: IPv6 address</li>
         * <li>DOMAIN: domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ipv4</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The time when the address pool was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-12-28T13:08Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The timestamp that indicates the time when the address pool was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        public DescribeDnsGtmInstanceAddressPoolResponseBody build() {
            return new DescribeDnsGtmInstanceAddressPoolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsGtmInstanceAddressPoolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstanceAddressPoolResponseBody</p>
     */
    public static class Addr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addr")
        private String addr;

        @com.aliyun.core.annotation.NameInMap("AlertStatus")
        private String alertStatus;

        @com.aliyun.core.annotation.NameInMap("AttributeInfo")
        private String attributeInfo;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("LbaWeight")
        private Integer lbaWeight;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
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

            private Builder() {
            } 

            private Builder(Addr model) {
                this.addr = model.addr;
                this.alertStatus = model.alertStatus;
                this.attributeInfo = model.attributeInfo;
                this.createTime = model.createTime;
                this.createTimestamp = model.createTimestamp;
                this.lbaWeight = model.lbaWeight;
                this.mode = model.mode;
                this.remark = model.remark;
                this.updateTime = model.updateTime;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * <p>The address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * <p>The status of the last health check on the address. Valid values:</p>
             * <ul>
             * <li>OK: No active alerts are triggered.</li>
             * <li>ALERT: Alerts are triggered based on the alert rules.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder alertStatus(String alertStatus) {
                this.alertStatus = alertStatus;
                return this;
            }

            /**
             * <p>The source region of the address.</p>
             * <ul>
             * <li>lineCode: the line code of the source region of the address. This parameter is deprecated, and lineCodes prevails.</li>
             * <li>lineName: the line name of the source region of the address. This parameter is deprecated.</li>
             * <li>lineCodes: the line codes of the source regions of the address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&quot;lineCode&quot;:&quot;aliyun_r_cn-zhangjiakou&quot;, &quot;lineName&quot;: &quot;Alibaba Cloud_China (Zhangjiakou)&quot;, &quot;lineCodes&quot;: [&quot;aliyun_r_cn-zhangjiakou&quot;]</p>
             */
            public Builder attributeInfo(String attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            /**
             * <p>The time when the address was added into the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-28T13:08Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The timestamp that indicates the time when the address was added into the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
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
             * <li>SMART: smart return</li>
             * <li>ONLINE: always online</li>
             * <li>OFFLINE: always offline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * <p>The description of the address.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The time when the address was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-12-28T13:08Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The timestamp that indicates the time when the address was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
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
    /**
     * 
     * {@link DescribeDnsGtmInstanceAddressPoolResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmInstanceAddressPoolResponseBody</p>
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
             * <p>The address.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.1.1</p>
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
