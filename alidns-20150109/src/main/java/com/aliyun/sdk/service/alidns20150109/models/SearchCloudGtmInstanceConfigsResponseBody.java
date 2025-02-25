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
 * {@link SearchCloudGtmInstanceConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>SearchCloudGtmInstanceConfigsResponseBody</p>
 */
public class SearchCloudGtmInstanceConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceConfigs")
    private InstanceConfigs instanceConfigs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private SearchCloudGtmInstanceConfigsResponseBody(Builder builder) {
        this.instanceConfigs = builder.instanceConfigs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchCloudGtmInstanceConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceConfigs
     */
    public InstanceConfigs getInstanceConfigs() {
        return this.instanceConfigs;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private InstanceConfigs instanceConfigs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        /**
         * <p>The instances list.</p>
         */
        public Builder instanceConfigs(InstanceConfigs instanceConfigs) {
            this.instanceConfigs = instanceConfigs;
            return this;
        }

        /**
         * <p>Current page number, starting from 1, default is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of rows per page when paginating queries, with a maximum value of <strong>100</strong>, and a default of <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Unique request identification code.</p>
         * 
         * <strong>example:</strong>
         * <p>6AEC7A64-3CB1-4C49-8B35-0B901F1E26BF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total number of instance configuration entries.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public SearchCloudGtmInstanceConfigsResponseBody build() {
            return new SearchCloudGtmInstanceConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SearchCloudGtmInstanceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmInstanceConfigsResponseBody</p>
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
     * {@link SearchCloudGtmInstanceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmInstanceConfigsResponseBody</p>
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
        private RequestSource requestSource;

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
            private String availableStatus; 
            private String createTime; 
            private Long createTimestamp; 
            private String enableStatus; 
            private String healthJudgement; 
            private String healthStatus; 
            private RequestSource requestSource; 
            private Boolean seqNonPreemptiveSchedule; 
            private String sequenceLbStrategyMode; 
            private Integer serialNumber; 
            private String updateTime; 
            private Long updateTimestamp; 
            private Integer weightValue; 

            /**
             * <p>Load balancing policy among addresses in the address pool:</p>
             * <ul>
             * <li>round_robin: Round-robin, where for any source of DNS resolution requests, all addresses are returned, with a rotation of the order for every request.</li>
             * <li>sequence: Sequential, where for any source of DNS resolution requests, the address with the lower sequence number (indicating a higher priority, the smaller the number, the higher the priority) is returned. If the address with the lower sequence number is unavailable, the next address with a lower sequence number is returned.</li>
             * <li>weight: Weighted, supporting the setting of different weight values for each address to realize returning addresses according to the ratio of weights in DNS query resolutions.</li>
             * <li>source_nearest: Source-nearest, referring to the intelligent resolution feature, where GTM can return different addresses based on the source of different DNS resolution requests, achieving the effect of users accessing the nearest server.</li>
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
             * <p>Address pool ID, uniquely identifying the address pool.</p>
             * 
             * <strong>example:</strong>
             * <p>pool-89564504435014**60</p>
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
             * <p>Address pool availability status:</p>
             * <ul>
             * <li>available: Available</li>
             * <li>unavailable: Unavailable</li>
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
             * <p>Address pool status:</p>
             * <ul>
             * <li>enable: Enabled status</li>
             * <li>disable: Disabled status</li>
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
             * <p>The condition for determining the health status of the address pool. Valid values:</p>
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
             * <p>The health state of the address pool. Valid values:</p>
             * <ul>
             * <li>ok: The health state of the address pool is normal and all addresses that are referenced by the address pool are available.</li>
             * <li>ok_alert: The health state of the address pool is warning and some of the addresses that are referenced by the address pool are unavailable. However, the address pool is deemed normal. In this case, only the available addresses are returned for DNS requests.</li>
             * <li>exceptional: The health state of the address pool is abnormal and some or all of the addresses that are referenced by the address pool are unavailable. In this case, the address pool is deemed abnormal.</li>
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
             * <p>Parse the request source list.</p>
             */
            public Builder requestSource(RequestSource requestSource) {
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
             * <p>The mode used if the address with the smallest sequence number is recovered. This parameter is required only when the policy for load balancing between addresses is sequence. Valid values:</p>
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
             * <p>Sequence number. For any parsing request, the address pool with the smaller sequence number (indicating the priority of the address pool returned, with smaller numbers having higher priority) will be returned.</p>
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
             * <p>Update time (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>Weight value (an integer between 1 and 100, inclusive), allowing different weight values to be set for each address pool, implementing the return of address pools according to weight ratios in resolution queries.</p>
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
     * {@link SearchCloudGtmInstanceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmInstanceConfigsResponseBody</p>
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
    /**
     * 
     * {@link SearchCloudGtmInstanceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmInstanceConfigsResponseBody</p>
     */
    public static class InstanceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressPoolLbStrategy")
        private String addressPoolLbStrategy;

        @com.aliyun.core.annotation.NameInMap("AddressPools")
        private AddressPools addressPools;

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

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

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

        private InstanceConfig(Builder builder) {
            this.addressPoolLbStrategy = builder.addressPoolLbStrategy;
            this.addressPools = builder.addressPools;
            this.availableStatus = builder.availableStatus;
            this.commodityCode = builder.commodityCode;
            this.configId = builder.configId;
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.enableStatus = builder.enableStatus;
            this.healthStatus = builder.healthStatus;
            this.instanceId = builder.instanceId;
            this.remark = builder.remark;
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

        public static InstanceConfig create() {
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
         * @return remark
         */
        public String getRemark() {
            return this.remark;
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
            private String availableStatus; 
            private String commodityCode; 
            private String configId; 
            private String createTime; 
            private Long createTimestamp; 
            private String enableStatus; 
            private String healthStatus; 
            private String instanceId; 
            private String remark; 
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
             * <li>source_nearest: Different address pools are returned based on the sources of DNS requests. This way, users can access nearby address pools.</li>
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
             * <p>The availability state of the access domain name. Valid values:</p>
             * <ul>
             * <li>available: If the access domain name is <strong>enabled</strong> and the health state is <strong>normal</strong>, the access domain name is deemed <strong>available</strong>.</li>
             * <li>unavailable: If the access domain name is <strong>disabled</strong> or the health state is <strong>abnormal</strong>, the access domain name is deemed <strong>unavailable</strong>.</li>
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
             * <p>Domain instance creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Domain instance creation time (timestamp).</p>
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
             * <li>ok: The health state of the access domain name is normal and all address pools that are referenced by the access domain name are available.</li>
             * <li>ok_alert: The health state of the access domain name is warning and some of the address pools that are referenced by the access domain name are unavailable. In this case, only the available address pools are returned for DNS requests.</li>
             * <li>exceptional: The health state of the access domain name is abnormal and all address pools that are referenced by the access domain name are unavailable. In this case, addresses in the non-empty address pool with the smallest sequence number are preferentially used for fallback resolution. This returns DNS results for clients as much as possible.</li>
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
             * <p>gtm-cn-x0r38e0**03</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Remarks for the domain instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The access domain name. The value of this parameter is composed of the value of ScheduleHostname and the value of ScheduleZoneName.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder scheduleDomainName(String scheduleDomainName) {
                this.scheduleDomainName = scheduleDomainName;
                return this;
            }

            /**
             * <p>Host record of the domain accessed by GTM.</p>
             * 
             * <strong>example:</strong>
             * <p>www</p>
             */
            public Builder scheduleHostname(String scheduleHostname) {
                this.scheduleHostname = scheduleHostname;
                return this;
            }

            /**
             * <p>DNS record types for the scheduling domain:</p>
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
             * <li>custom: custom allocation. You must specify a custom hostname and associate the hostname with a zone that is hosted by the Public Authoritative DNS module within the account to which the GTM instance belongs to generate an access domain name.</li>
             * <li>sys_assign: system allocation. This mode is not supported. Do not set ScheduleZoneMode to sys_assign.</li>
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
             * <p>The zone such as example.com or subzone such as a.example.com of the access domain name. In most cases, the zone or subzone is hosted by the Public Authoritative DNS module of Alibaba Cloud DNS. This zone belongs to the account to which the GTM instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder scheduleZoneName(String scheduleZoneName) {
                this.scheduleZoneName = scheduleZoneName;
                return this;
            }

            /**
             * <p>The mode used if the address pool with the smallest sequence number is recovered. This parameter is returned when AddressPoolLbStrategy is set to sequence. Valid values:</p>
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
             * <p>Global TTL (in seconds), the TTL value for resolving the access domain name to the address pool, which affects the caching time of DNS records in the operator&quot;s LocalDNS. Supports custom TTL values.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder ttl(Integer ttl) {
                this.ttl = ttl;
                return this;
            }

            /**
             * <p>The last modification time of the domain instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-15T01:46Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The last modification time of the domain instance (timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1527690629357</p>
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * <p>Global Traffic Management version 3.0 instance types:</p>
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

            public InstanceConfig build() {
                return new InstanceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link SearchCloudGtmInstanceConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>SearchCloudGtmInstanceConfigsResponseBody</p>
     */
    public static class InstanceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceConfig")
        private java.util.List<InstanceConfig> instanceConfig;

        private InstanceConfigs(Builder builder) {
            this.instanceConfig = builder.instanceConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceConfigs create() {
            return builder().build();
        }

        /**
         * @return instanceConfig
         */
        public java.util.List<InstanceConfig> getInstanceConfig() {
            return this.instanceConfig;
        }

        public static final class Builder {
            private java.util.List<InstanceConfig> instanceConfig; 

            /**
             * InstanceConfig.
             */
            public Builder instanceConfig(java.util.List<InstanceConfig> instanceConfig) {
                this.instanceConfig = instanceConfig;
                return this;
            }

            public InstanceConfigs build() {
                return new InstanceConfigs(this);
            } 

        } 

    }
}
