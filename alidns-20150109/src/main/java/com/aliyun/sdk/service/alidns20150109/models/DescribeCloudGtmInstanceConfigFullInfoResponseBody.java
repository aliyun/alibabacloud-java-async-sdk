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
 * {@link DescribeCloudGtmInstanceConfigFullInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudGtmInstanceConfigFullInfoResponseBody</p>
 */
public class DescribeCloudGtmInstanceConfigFullInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AddressPoolLbStrategy")
    private String addressPoolLbStrategy;

    @com.aliyun.core.annotation.NameInMap("AddressPools")
    private AddressPools addressPools;

    @com.aliyun.core.annotation.NameInMap("AlertConfig")
    private String alertConfig;

    @com.aliyun.core.annotation.NameInMap("AlertGroup")
    private String alertGroup;

    @com.aliyun.core.annotation.NameInMap("AvailableStatus")
    private String availableStatus;

    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("ConfigId")
    private String configId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
    private Long createTimestamp;

    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.NameInMap("HealthStatus")
    private String healthStatus;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScheduleDomainName")
    private String scheduleDomainName;

    @com.aliyun.core.annotation.NameInMap("ScheduleHostname")
    private String scheduleHostname;

    @com.aliyun.core.annotation.NameInMap("ScheduleRrType")
    private String scheduleRrType;

    @com.aliyun.core.annotation.NameInMap("ScheduleZoneMode")
    private String scheduleZoneMode;

    @com.aliyun.core.annotation.NameInMap("ScheduleZoneName")
    private String scheduleZoneName;

    @com.aliyun.core.annotation.NameInMap("SequenceLbStrategyMode")
    private String sequenceLbStrategyMode;

    @com.aliyun.core.annotation.NameInMap("Ttl")
    private Integer ttl;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
    private Long updateTimestamp;

    @com.aliyun.core.annotation.NameInMap("VersionCode")
    private String versionCode;

    private DescribeCloudGtmInstanceConfigFullInfoResponseBody(Builder builder) {
        this.addressPoolLbStrategy = builder.addressPoolLbStrategy;
        this.addressPools = builder.addressPools;
        this.alertConfig = builder.alertConfig;
        this.alertGroup = builder.alertGroup;
        this.availableStatus = builder.availableStatus;
        this.commodityCode = builder.commodityCode;
        this.configId = builder.configId;
        this.createTime = builder.createTime;
        this.createTimestamp = builder.createTimestamp;
        this.enableStatus = builder.enableStatus;
        this.healthStatus = builder.healthStatus;
        this.instanceId = builder.instanceId;
        this.instanceName = builder.instanceName;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.scheduleDomainName = builder.scheduleDomainName;
        this.scheduleHostname = builder.scheduleHostname;
        this.scheduleRrType = builder.scheduleRrType;
        this.scheduleZoneMode = builder.scheduleZoneMode;
        this.scheduleZoneName = builder.scheduleZoneName;
        this.sequenceLbStrategyMode = builder.sequenceLbStrategyMode;
        this.ttl = builder.ttl;
        this.updateTime = builder.updateTime;
        this.updateTimestamp = builder.updateTimestamp;
        this.versionCode = builder.versionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudGtmInstanceConfigFullInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return addressPoolLbStrategy
     */
    public String getAddressPoolLbStrategy() {
        return this.addressPoolLbStrategy;
    }

    /**
     * @return addressPools
     */
    public AddressPools getAddressPools() {
        return this.addressPools;
    }

    /**
     * @return alertConfig
     */
    public String getAlertConfig() {
        return this.alertConfig;
    }

    /**
     * @return alertGroup
     */
    public String getAlertGroup() {
        return this.alertGroup;
    }

    /**
     * @return availableStatus
     */
    public String getAvailableStatus() {
        return this.availableStatus;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return configId
     */
    public String getConfigId() {
        return this.configId;
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
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return healthStatus
     */
    public String getHealthStatus() {
        return this.healthStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleDomainName
     */
    public String getScheduleDomainName() {
        return this.scheduleDomainName;
    }

    /**
     * @return scheduleHostname
     */
    public String getScheduleHostname() {
        return this.scheduleHostname;
    }

    /**
     * @return scheduleRrType
     */
    public String getScheduleRrType() {
        return this.scheduleRrType;
    }

    /**
     * @return scheduleZoneMode
     */
    public String getScheduleZoneMode() {
        return this.scheduleZoneMode;
    }

    /**
     * @return scheduleZoneName
     */
    public String getScheduleZoneName() {
        return this.scheduleZoneName;
    }

    /**
     * @return sequenceLbStrategyMode
     */
    public String getSequenceLbStrategyMode() {
        return this.sequenceLbStrategyMode;
    }

    /**
     * @return ttl
     */
    public Integer getTtl() {
        return this.ttl;
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
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    public static final class Builder {
        private String addressPoolLbStrategy; 
        private AddressPools addressPools; 
        private String alertConfig; 
        private String alertGroup; 
        private String availableStatus; 
        private String commodityCode; 
        private String configId; 
        private String createTime; 
        private Long createTimestamp; 
        private String enableStatus; 
        private String healthStatus; 
        private String instanceId; 
        private String instanceName; 
        private String remark; 
        private String requestId; 
        private String scheduleDomainName; 
        private String scheduleHostname; 
        private String scheduleRrType; 
        private String scheduleZoneMode; 
        private String scheduleZoneName; 
        private String sequenceLbStrategyMode; 
        private Integer ttl; 
        private String updateTime; 
        private Long updateTimestamp; 
        private String versionCode; 

        /**
         * <p>The policy for load balancing between address pools. Valid values:</p>
         * <ul>
         * <li>round_robin: All address pools are returned for DNS requests from any source. All address pools are sorted in round-robin mode each time they are returned.</li>
         * <li>sequence: The address pool with the smallest sequence number is preferentially returned for DNS requests from any source. The sequence number indicates the priority for returning the address pool. A smaller sequence number indicates a higher priority. If the address pool with the smallest sequence number is unavailable, the address pool with the second smallest sequence number is returned.</li>
         * <li>weight: You can set a different weight value for each address pool. This way, address pools are returned based on the weight values.</li>
         * <li>source_nearest: GTM returns different addresses based on the sources of DNS requests. This way, users can access nearby addresses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>round_robin</p>
         */
        public Builder addressPoolLbStrategy(String addressPoolLbStrategy) {
            this.addressPoolLbStrategy = addressPoolLbStrategy;
            return this;
        }

        /**
         * <p>The address pools.</p>
         */
        public Builder addressPools(AddressPools addressPools) {
            this.addressPools = addressPools;
            return this;
        }

        /**
         * <p>Alert notification configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;NoticeType&quot;:&quot;addr_alert&quot;,&quot;SmsNotice&quot;:true,&quot;EmailNotice&quot;:true,&quot;DingtalkNotice&quot;:true},{&quot;NoticeType&quot;:&quot;addr_resume&quot;,&quot;SmsNotice&quot;:true,&quot;EmailNotice&quot;:true,&quot;DingtalkNotice&quot;:true},{&quot;NoticeType&quot;:&quot;addr_pool_unavailable&quot;,&quot;SmsNotice&quot;:true,&quot;EmailNotice&quot;:true,&quot;DingtalkNotice&quot;:true},{&quot;NoticeType&quot;:&quot;addr_pool_available&quot;,&quot;SmsNotice&quot;:true,&quot;EmailNotice&quot;:true,&quot;DingtalkNotice&quot;:true}]&quot;</p>
         */
        public Builder alertConfig(String alertConfig) {
            this.alertConfig = alertConfig;
            return this;
        }

        /**
         * <p>Alert notification group.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Default Contact Group&quot;]</p>
         */
        public Builder alertGroup(String alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }

        /**
         * <p>The availability state of the access domain name. Valid values:</p>
         * <ul>
         * <li>available: If the access domain name is <strong>enabled</strong> and the health state of the access domain name is <strong>Normal</strong>, the access domain name is deemed <strong>available</strong>.</li>
         * <li>unavailable: If the access domain name is <strong>disabled</strong> or the health state of the access domain name is <strong>Abnormal</strong>, the access domain name is deemed <strong>unavailable</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>available</p>
         */
        public Builder availableStatus(String availableStatus) {
            this.availableStatus = availableStatus;
            return this;
        }

        /**
         * <p>The commodity code. Valid values:</p>
         * <ul>
         * <li>dns_gtm_public_cn: the commodity code on the China site (aliyun.com)</li>
         * <li>dns_gtm_public_intl: the commodity code on the international site (alibabacloud.com)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dns_gtm_public_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The configuration ID of the access domain name. Two configuration IDs exist when the access domain name is bound to the same GTM instance but an A record and an AAAA record are configured for the access domain name. The configuration ID uniquely identifies a configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Config-000**11</p>
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * <p>Instance creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Instance creation time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        public Builder createTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }

        /**
         * <p>The enabling state of the access domain name. Valid values:</p>
         * <ul>
         * <li>enable: The access domain name is enabled and the intelligent scheduling policy of the corresponding GTM instance takes effect.</li>
         * <li>disable: The access domain name is disabled and the intelligent scheduling policy of the corresponding GTM instance does not take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder enableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * <p>The health state of the access domain name. Valid values:</p>
         * <ul>
         * <li>ok: The health state of the access domain name is Normal and all address pools that are referenced by the access domain name are available.</li>
         * <li>ok_alert: The health state of the access domain name is Warning and some of the address pools that are referenced by the access domain name are unavailable. In this case, the available address pools are normally used for DNS resolution, but the unavailable address pools cannot be used for DNS resolution.</li>
         * <li>exceptional: The health state of the access domain name is Abnormal and all address pools that are referenced by the access domain name are unavailable. In this case, addresses in the non-empty address pool with the smallest sequence number are preferentially used for fallback resolution. This returns DNS results for clients as much as possible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder healthStatus(String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        /**
         * <p>The ID of the GTM 3.0 instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gtm-cn-wwo3a3hbz**</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Schedule instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>Remarks of the configuration of domain instance.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * <p>Unique request identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The GTM access domain name. The value of this parameter is composed of the value of ScheduleHostname and the value of ScheduleZoneName.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder scheduleDomainName(String scheduleDomainName) {
            this.scheduleDomainName = scheduleDomainName;
            return this;
        }

        /**
         * <p>Host name of the domain accessed by GTM.</p>
         * 
         * <strong>example:</strong>
         * <p>www</p>
         */
        public Builder scheduleHostname(String scheduleHostname) {
            this.scheduleHostname = scheduleHostname;
            return this;
        }

        /**
         * <p>DNS record types for the ScheduleDomainName:</p>
         * <ul>
         * <li>A: IPv4 address</li>
         * <li>AAAA: IPv6 address</li>
         * <li>CNAME: Domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>A</p>
         */
        public Builder scheduleRrType(String scheduleRrType) {
            this.scheduleRrType = scheduleRrType;
            return this;
        }

        /**
         * <p>The allocation mode of the access domain name. Valid values:</p>
         * <ul>
         * <li>custom: custom allocation. You must specify a custom hostname and associate the hostname with a zone or subzone within the account to which the GTM instance belongs to generate an access domain name.</li>
         * <li>sys_assign: The system assigns an access domain name by default. This mode is no longer supported. Do not choose this mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder scheduleZoneMode(String scheduleZoneMode) {
            this.scheduleZoneMode = scheduleZoneMode;
            return this;
        }

        /**
         * <p>The zone (such as example.com) or subzone (such as a.example.com) associated with the GTM access domain name. In most cases, the zone or subzone is hosted in Authoritative DNS Resolution of the Alibaba Cloud DNS console within the account to which the GTM instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder scheduleZoneName(String scheduleZoneName) {
            this.scheduleZoneName = scheduleZoneName;
            return this;
        }

        /**
         * <p>The mode used if the address pool with the smallest sequence number is recovered. This parameter is required when AddressPoolLbStrategy is set to sequence. Valid values:</p>
         * <ul>
         * <li>preemptive: The address pool with the smallest sequence number is preferentially used if this address pool is recovered.</li>
         * <li>non_preemptive: The current address pool is still used even if the address pool with the smallest sequence number is recovered.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>preemptive</p>
         */
        public Builder sequenceLbStrategyMode(String sequenceLbStrategyMode) {
            this.sequenceLbStrategyMode = sequenceLbStrategyMode;
            return this;
        }

        /**
         * <p>Global TTL (in seconds), the TTL value for resolving the access domain to addresses in the address pool, which affects the caching time of DNS records in the ISP&quot;s LocalDNS. Custom TTL values are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            return this;
        }

        /**
         * <p>Last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-15T01:46Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>Last modified time (timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1527690629357</p>
         */
        public Builder updateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }

        /**
         * <p>Global Traffic Management version 3.0 instances:</p>
         * <ul>
         * <li>standard: Standard Edition</li>
         * <li>ultimate: Ultimate Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ultimate</p>
         */
        public Builder versionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }

        public DescribeCloudGtmInstanceConfigFullInfoResponseBody build() {
            return new DescribeCloudGtmInstanceConfigFullInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCloudGtmInstanceConfigFullInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmInstanceConfigFullInfoResponseBody</p>
     */
    public static class RequestSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private java.util.List<String> requestSource;

        private RequestSource(Builder builder) {
            this.requestSource = builder.requestSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestSource create() {
            return builder().build();
        }

        /**
         * @return requestSource
         */
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

        public static final class Builder {
            private java.util.List<String> requestSource; 

            /**
             * RequestSource.
             */
            public Builder requestSource(java.util.List<String> requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            public RequestSource build() {
                return new RequestSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmInstanceConfigFullInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmInstanceConfigFullInfoResponseBody</p>
     */
    public static class Address extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AddressId")
        private String addressId;

        @com.aliyun.core.annotation.NameInMap("AttributeInfo")
        private String attributeInfo;

        @com.aliyun.core.annotation.NameInMap("AvailableMode")
        private String availableMode;

        @com.aliyun.core.annotation.NameInMap("AvailableStatus")
        private String availableStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("HealthJudgement")
        private String healthJudgement;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("ManualAvailableStatus")
        private String manualAvailableStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private RequestSource requestSource;

        @com.aliyun.core.annotation.NameInMap("SeqNonPreemptiveSchedule")
        private Boolean seqNonPreemptiveSchedule;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private Integer serialNumber;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("WeightValue")
        private Integer weightValue;

        private Address(Builder builder) {
            this.address = builder.address;
            this.addressId = builder.addressId;
            this.attributeInfo = builder.attributeInfo;
            this.availableMode = builder.availableMode;
            this.availableStatus = builder.availableStatus;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.enableStatus = builder.enableStatus;
            this.healthJudgement = builder.healthJudgement;
            this.healthStatus = builder.healthStatus;
            this.manualAvailableStatus = builder.manualAvailableStatus;
            this.name = builder.name;
            this.remark = builder.remark;
            this.requestSource = builder.requestSource;
            this.seqNonPreemptiveSchedule = builder.seqNonPreemptiveSchedule;
            this.serialNumber = builder.serialNumber;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.weightValue = builder.weightValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Address create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return addressId
         */
        public String getAddressId() {
            return this.addressId;
        }

        /**
         * @return attributeInfo
         */
        public String getAttributeInfo() {
            return this.attributeInfo;
        }

        /**
         * @return availableMode
         */
        public String getAvailableMode() {
            return this.availableMode;
        }

        /**
         * @return availableStatus
         */
        public String getAvailableStatus() {
            return this.availableStatus;
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
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return healthJudgement
         */
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return manualAvailableStatus
         */
        public String getManualAvailableStatus() {
            return this.manualAvailableStatus;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return requestSource
         */
        public RequestSource getRequestSource() {
            return this.requestSource;
        }

        /**
         * @return seqNonPreemptiveSchedule
         */
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        /**
         * @return serialNumber
         */
        public Integer getSerialNumber() {
            return this.serialNumber;
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

        /**
         * @return weightValue
         */
        public Integer getWeightValue() {
            return this.weightValue;
        }

        public static final class Builder {
            private String address; 
            private String addressId; 
            private String attributeInfo; 
            private String availableMode; 
            private String availableStatus; 
            private String createTime; 
            private Long createTimestamp; 
            private String enableStatus; 
            private String healthJudgement; 
            private String healthStatus; 
            private String manualAvailableStatus; 
            private String name; 
            private String remark; 
            private RequestSource requestSource; 
            private Boolean seqNonPreemptiveSchedule; 
            private Integer serialNumber; 
            private String type; 
            private String updateTime; 
            private Long updateTimestamp; 
            private Integer weightValue; 

            /**
             * <p>IP address or domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>223.5.XX.XX</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The address ID. This ID uniquely identifies the address.</p>
             * 
             * <strong>example:</strong>
             * <p>addr-89564712295703**96</p>
             */
            public Builder addressId(String addressId) {
                this.addressId = addressId;
                return this;
            }

            /**
             * <p>Address ownership information, not supported in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>The current version does not support returning this parameter.</p>
             */
            public Builder attributeInfo(String attributeInfo) {
                this.attributeInfo = attributeInfo;
                return this;
            }

            /**
             * <p>The failover mode that is used when address exceptions are identified. Valid values:</p>
             * <ul>
             * <li>auto: the automatic mode. The system determines whether to return an address based on the health check results. If the address fails health checks, the system does not return the address. If the address passes health checks, the system returns the address.</li>
             * <li>manual: the manual mode. If an address is in the unavailable state, the address is not returned for DNS requests even if the address passes health checks. If an address is in the available state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder availableMode(String availableMode) {
                this.availableMode = availableMode;
                return this;
            }

            /**
             * <p>The availability state of the address. Valid values:</p>
             * <ul>
             * <li>available</li>
             * <li>unavailable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>available</p>
             */
            public Builder availableStatus(String availableStatus) {
                this.availableStatus = availableStatus;
                return this;
            }

            /**
             * <p>Address creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Address creation time (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The enabling state of the address. Valid values:</p>
             * <ul>
             * <li>enable</li>
             * <li>disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>The condition for determining the health state of the address. Valid values:</p>
             * <ul>
             * <li>any_ok: The health check results of at least one health check template are normal.</li>
             * <li>p30_ok: The health check results of at least 30% of health check templates are normal.</li>
             * <li>p50_ok: The health check results of at least 50% of health check templates are normal.</li>
             * <li>p70_ok: The health check results of at least 70% of health check templates are normal.</li>
             * <li>all_ok: The health check results of all health check templates are normal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>any_ok</p>
             */
            public Builder healthJudgement(String healthJudgement) {
                this.healthJudgement = healthJudgement;
                return this;
            }

            /**
             * <p>The health check state of the address. Valid values:</p>
             * <ul>
             * <li>ok: The address passes all health checks of the referenced health check templates.</li>
             * <li>ok_alert: The address fails some health checks of the referenced health check templates but the address is deemed normal.</li>
             * <li>ok_no_monitor: The address does not reference any health check template and is normal.</li>
             * <li>exceptional: The address fails some or all health checks of the referenced health check templates and the address is deemed abnormal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The availability state of the address when AvailableMode is set to manual. Valid values:</p>
             * <ul>
             * <li>available: The address is normal. In this state, the address is returned for DNS requests even if an alert is triggered when the address fails health checks.</li>
             * <li>unavailable: The address is abnormal. In this state, the address is not returned for DNS requests even if the address passes health checks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>available</p>
             */
            public Builder manualAvailableStatus(String manualAvailableStatus) {
                this.manualAvailableStatus = manualAvailableStatus;
                return this;
            }

            /**
             * <p>Address name.</p>
             * 
             * <strong>example:</strong>
             * <p>Address-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The remark of the address.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>Request source list.</p>
             */
            public Builder requestSource(RequestSource requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            /**
             * <p>Indicates whether it is a sequential (non-preemptive) mode scheduling object, applicable to hybrid cloud management scenarios: </p>
             * <ul>
             * <li>true: yes</li>
             * <li>false: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder seqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
                this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
                return this;
            }

            /**
             * <p>Sequence number, indicating the priority of address return, where smaller numbers have higher priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serialNumber(Integer serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>The type of the address. Valid values:</p>
             * <ul>
             * <li>IPV4: the IPv4 address</li>
             * <li>IPv6: the IPv6 address</li>
             * <li>domain: the domain name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Last modified time of the address.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The last modification time of the address (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>Weight value (an integer between 1 and 100, inclusive), allowing different weight values to be set for each address, enabling resolution queries to return addresses in proportion to their weights.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weightValue(Integer weightValue) {
                this.weightValue = weightValue;
                return this;
            }

            public Address build() {
                return new Address(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmInstanceConfigFullInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmInstanceConfigFullInfoResponseBody</p>
     */
    public static class Addresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private java.util.List<Address> address;

        private Addresses(Builder builder) {
            this.address = builder.address;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Addresses create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public java.util.List<Address> getAddress() {
            return this.address;
        }

        public static final class Builder {
            private java.util.List<Address> address; 

            /**
             * <p>IP address or domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>223.5.XX.XX</p>
             */
            public Builder address(java.util.List<Address> address) {
                this.address = address;
                return this;
            }

            public Addresses build() {
                return new Addresses(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmInstanceConfigFullInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmInstanceConfigFullInfoResponseBody</p>
     */
    public static class AddressPoolRequestSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private java.util.List<String> requestSource;

        private AddressPoolRequestSource(Builder builder) {
            this.requestSource = builder.requestSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressPoolRequestSource create() {
            return builder().build();
        }

        /**
         * @return requestSource
         */
        public java.util.List<String> getRequestSource() {
            return this.requestSource;
        }

        public static final class Builder {
            private java.util.List<String> requestSource; 

            /**
             * <p>Request source list.</p>
             */
            public Builder requestSource(java.util.List<String> requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            public AddressPoolRequestSource build() {
                return new AddressPoolRequestSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmInstanceConfigFullInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmInstanceConfigFullInfoResponseBody</p>
     */
    public static class AddressPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressLbStrategy")
        private String addressLbStrategy;

        @com.aliyun.core.annotation.NameInMap("AddressPoolId")
        private String addressPoolId;

        @com.aliyun.core.annotation.NameInMap("AddressPoolName")
        private String addressPoolName;

        @com.aliyun.core.annotation.NameInMap("AddressPoolType")
        private String addressPoolType;

        @com.aliyun.core.annotation.NameInMap("Addresses")
        private Addresses addresses;

        @com.aliyun.core.annotation.NameInMap("AvailableStatus")
        private String availableStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("EnableStatus")
        private String enableStatus;

        @com.aliyun.core.annotation.NameInMap("HealthJudgement")
        private String healthJudgement;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("RequestSource")
        private AddressPoolRequestSource requestSource;

        @com.aliyun.core.annotation.NameInMap("SeqNonPreemptiveSchedule")
        private Boolean seqNonPreemptiveSchedule;

        @com.aliyun.core.annotation.NameInMap("SequenceLbStrategyMode")
        private String sequenceLbStrategyMode;

        @com.aliyun.core.annotation.NameInMap("SerialNumber")
        private Integer serialNumber;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("WeightValue")
        private Integer weightValue;

        private AddressPool(Builder builder) {
            this.addressLbStrategy = builder.addressLbStrategy;
            this.addressPoolId = builder.addressPoolId;
            this.addressPoolName = builder.addressPoolName;
            this.addressPoolType = builder.addressPoolType;
            this.addresses = builder.addresses;
            this.availableStatus = builder.availableStatus;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.enableStatus = builder.enableStatus;
            this.healthJudgement = builder.healthJudgement;
            this.healthStatus = builder.healthStatus;
            this.requestSource = builder.requestSource;
            this.seqNonPreemptiveSchedule = builder.seqNonPreemptiveSchedule;
            this.sequenceLbStrategyMode = builder.sequenceLbStrategyMode;
            this.serialNumber = builder.serialNumber;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.weightValue = builder.weightValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressPool create() {
            return builder().build();
        }

        /**
         * @return addressLbStrategy
         */
        public String getAddressLbStrategy() {
            return this.addressLbStrategy;
        }

        /**
         * @return addressPoolId
         */
        public String getAddressPoolId() {
            return this.addressPoolId;
        }

        /**
         * @return addressPoolName
         */
        public String getAddressPoolName() {
            return this.addressPoolName;
        }

        /**
         * @return addressPoolType
         */
        public String getAddressPoolType() {
            return this.addressPoolType;
        }

        /**
         * @return addresses
         */
        public Addresses getAddresses() {
            return this.addresses;
        }

        /**
         * @return availableStatus
         */
        public String getAvailableStatus() {
            return this.availableStatus;
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
         * @return enableStatus
         */
        public String getEnableStatus() {
            return this.enableStatus;
        }

        /**
         * @return healthJudgement
         */
        public String getHealthJudgement() {
            return this.healthJudgement;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return requestSource
         */
        public AddressPoolRequestSource getRequestSource() {
            return this.requestSource;
        }

        /**
         * @return seqNonPreemptiveSchedule
         */
        public Boolean getSeqNonPreemptiveSchedule() {
            return this.seqNonPreemptiveSchedule;
        }

        /**
         * @return sequenceLbStrategyMode
         */
        public String getSequenceLbStrategyMode() {
            return this.sequenceLbStrategyMode;
        }

        /**
         * @return serialNumber
         */
        public Integer getSerialNumber() {
            return this.serialNumber;
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
         * @return weightValue
         */
        public Integer getWeightValue() {
            return this.weightValue;
        }

        public static final class Builder {
            private String addressLbStrategy; 
            private String addressPoolId; 
            private String addressPoolName; 
            private String addressPoolType; 
            private Addresses addresses; 
            private String availableStatus; 
            private String createTime; 
            private Long createTimestamp; 
            private String enableStatus; 
            private String healthJudgement; 
            private String healthStatus; 
            private AddressPoolRequestSource requestSource; 
            private Boolean seqNonPreemptiveSchedule; 
            private String sequenceLbStrategyMode; 
            private Integer serialNumber; 
            private String updateTime; 
            private Long updateTimestamp; 
            private Integer weightValue; 

            /**
             * <p>Load balancing policy among addresses in the address pool:</p>
             * <ul>
             * <li>round_robin: Round-robin, for any source of DNS resolution requests, returns all addresses and rotates their order for each request.</li>
             * <li>sequence: Sequential, for any source of DNS resolution requests, returns the address with the smaller sequence number (the sequence number indicates the priority of the address return, with smaller numbers having higher priority). If the address with the smaller sequence number is unavailable, the next address with a smaller sequence number is returned.</li>
             * <li>weight: Weighted, supports setting different weight values for each address to realize returning addresses according to the weight ratio for resolution queries.</li>
             * <li>source_nearest: Source-nearest, i.e., intelligent resolution function, where GTM can return different addresses based on the source of different DNS resolution requests, achieving the effect of users accessing nearby.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>round_robin</p>
             */
            public Builder addressLbStrategy(String addressLbStrategy) {
                this.addressLbStrategy = addressLbStrategy;
                return this;
            }

            /**
             * <p>The ID of the address pool. This ID uniquely identifies the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pool-89528023225442**16</p>
             */
            public Builder addressPoolId(String addressPoolId) {
                this.addressPoolId = addressPoolId;
                return this;
            }

            /**
             * <p>Address pool name.</p>
             * 
             * <strong>example:</strong>
             * <p>AddressPool-1</p>
             */
            public Builder addressPoolName(String addressPoolName) {
                this.addressPoolName = addressPoolName;
                return this;
            }

            /**
             * <p>Address pool type:</p>
             * <ul>
             * <li>IPv4</li>
             * <li>IPv6</li>
             * <li>domain</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder addressPoolType(String addressPoolType) {
                this.addressPoolType = addressPoolType;
                return this;
            }

            /**
             * <p>The addresses.</p>
             */
            public Builder addresses(Addresses addresses) {
                this.addresses = addresses;
                return this;
            }

            /**
             * <p>The availability state of the address pool. Valid values:</p>
             * <ul>
             * <li>Available</li>
             * <li>unavailable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>available</p>
             */
            public Builder availableStatus(String availableStatus) {
                this.availableStatus = availableStatus;
                return this;
            }

            /**
             * <p>Address pool creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Address pool creation time (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The enabling state of the address pool. Valid values:</p>
             * <ul>
             * <li>enable</li>
             * <li>disable</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder enableStatus(String enableStatus) {
                this.enableStatus = enableStatus;
                return this;
            }

            /**
             * <p>The condition for determining the health state of the address pool. Valid values:</p>
             * <ul>
             * <li>any_ok: At least one address in the address pool is available.</li>
             * <li>p30_ok: At least 30% of the addresses in the address pool are available.</li>
             * <li>p50_ok: At least 50% of the addresses in the address pool are available.</li>
             * <li>p70_ok: At least 70% of the addresses in the address pool are available.</li>
             * <li>all_ok: All addresses in the address pool are available.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>any_ok</p>
             */
            public Builder healthJudgement(String healthJudgement) {
                this.healthJudgement = healthJudgement;
                return this;
            }

            /**
             * <p>Address pool health status:</p>
             * <ul>
             * <li>ok: Normal, all addresses referenced by the address pool are available.</li>
             * <li>ok_alert: Warning, some addresses referenced by the address pool are unavailable, but the address pool status is deemed normal. In the warning state, available address pools are resolved normally, while unavailable ones stop resolving.</li>
             * <li>exceptional: Abnormal, some or all of the addresses referenced by the address pool are unavailable, and the address pool status is determined to be abnormal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>Parse the list of request sources.</p>
             */
            public Builder requestSource(AddressPoolRequestSource requestSource) {
                this.requestSource = requestSource;
                return this;
            }

            /**
             * <p>Indicates whether it is a sequential (non-preemptive) scheduling object for hybrid cloud management scenarios: </p>
             * <ul>
             * <li>true: yes </li>
             * <li>false: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder seqNonPreemptiveSchedule(Boolean seqNonPreemptiveSchedule) {
                this.seqNonPreemptiveSchedule = seqNonPreemptiveSchedule;
                return this;
            }

            /**
             * <p>The mode used if the address with the smallest sequence number is recovered. This parameter is required only when AddressLbStrategy is set to sequence. Valid values:</p>
             * <ul>
             * <li>preemptive: The address with the smallest sequence number is preferentially used if this address is recovered.</li>
             * <li>non_preemptive: The current address is still used even if the address with the smallest sequence number is recovered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>preemptive</p>
             */
            public Builder sequenceLbStrategyMode(String sequenceLbStrategyMode) {
                this.sequenceLbStrategyMode = sequenceLbStrategyMode;
                return this;
            }

            /**
             * <p>Sequence number. For any parsing request from any source, the address pool with the smaller sequence number is returned (the sequence number indicates the priority of the address pool returned, with smaller numbers having higher priority).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serialNumber(Integer serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * <p>Last modification time of the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Last modification time of the address pool (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>Weight value (an integer between 1 and 100, inclusive), allowing different weight values to be set for each address pool, enabling resolution queries to return address pools according to the weighted ratio.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder weightValue(Integer weightValue) {
                this.weightValue = weightValue;
                return this;
            }

            public AddressPool build() {
                return new AddressPool(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCloudGtmInstanceConfigFullInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCloudGtmInstanceConfigFullInfoResponseBody</p>
     */
    public static class AddressPools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressPool")
        private java.util.List<AddressPool> addressPool;

        private AddressPools(Builder builder) {
            this.addressPool = builder.addressPool;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressPools create() {
            return builder().build();
        }

        /**
         * @return addressPool
         */
        public java.util.List<AddressPool> getAddressPool() {
            return this.addressPool;
        }

        public static final class Builder {
            private java.util.List<AddressPool> addressPool; 

            /**
             * AddressPool.
             */
            public Builder addressPool(java.util.List<AddressPool> addressPool) {
                this.addressPool = addressPool;
                return this;
            }

            public AddressPools build() {
                return new AddressPools(this);
            } 

        } 

    }
}
