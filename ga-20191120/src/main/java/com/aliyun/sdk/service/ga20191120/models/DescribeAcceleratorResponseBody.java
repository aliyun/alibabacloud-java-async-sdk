// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DescribeAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAcceleratorResponseBody</p>
 */
public class DescribeAcceleratorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("BandwidthBillingType")
    private String bandwidthBillingType;

    @com.aliyun.core.annotation.NameInMap("BasicBandwidthPackage")
    private BasicBandwidthPackage basicBandwidthPackage;

    @com.aliyun.core.annotation.NameInMap("CenId")
    private String cenId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("CrossBorderMode")
    private String crossBorderMode;

    @com.aliyun.core.annotation.NameInMap("CrossBorderStatus")
    private Boolean crossBorderStatus;

    @com.aliyun.core.annotation.NameInMap("CrossDomainBandwidthPackage")
    private CrossDomainBandwidthPackage crossDomainBandwidthPackage;

    @com.aliyun.core.annotation.NameInMap("CrossPrivateState")
    private String crossPrivateState;

    @com.aliyun.core.annotation.NameInMap("DdosConfigList")
    private java.util.List<DdosConfigList> ddosConfigList;

    @com.aliyun.core.annotation.NameInMap("DdosId")
    @Deprecated
    private String ddosId;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DnsName")
    private String dnsName;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private Long expiredTime;

    @com.aliyun.core.annotation.NameInMap("InstanceChargeType")
    private String instanceChargeType;

    @com.aliyun.core.annotation.NameInMap("IpSetConfig")
    private IpSetConfig ipSetConfig;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    @Deprecated
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SecondDnsName")
    private String secondDnsName;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
    private java.util.List<ServiceManagedInfos> serviceManagedInfos;

    @com.aliyun.core.annotation.NameInMap("Spec")
    private String spec;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("UpgradableStatus")
    private String upgradableStatus;

    private DescribeAcceleratorResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.bandwidth = builder.bandwidth;
        this.bandwidthBillingType = builder.bandwidthBillingType;
        this.basicBandwidthPackage = builder.basicBandwidthPackage;
        this.cenId = builder.cenId;
        this.createTime = builder.createTime;
        this.crossBorderMode = builder.crossBorderMode;
        this.crossBorderStatus = builder.crossBorderStatus;
        this.crossDomainBandwidthPackage = builder.crossDomainBandwidthPackage;
        this.crossPrivateState = builder.crossPrivateState;
        this.ddosConfigList = builder.ddosConfigList;
        this.ddosId = builder.ddosId;
        this.description = builder.description;
        this.dnsName = builder.dnsName;
        this.expiredTime = builder.expiredTime;
        this.instanceChargeType = builder.instanceChargeType;
        this.ipSetConfig = builder.ipSetConfig;
        this.name = builder.name;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.secondDnsName = builder.secondDnsName;
        this.serviceId = builder.serviceId;
        this.serviceManaged = builder.serviceManaged;
        this.serviceManagedInfos = builder.serviceManagedInfos;
        this.spec = builder.spec;
        this.state = builder.state;
        this.tags = builder.tags;
        this.upgradableStatus = builder.upgradableStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAcceleratorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return bandwidthBillingType
     */
    public String getBandwidthBillingType() {
        return this.bandwidthBillingType;
    }

    /**
     * @return basicBandwidthPackage
     */
    public BasicBandwidthPackage getBasicBandwidthPackage() {
        return this.basicBandwidthPackage;
    }

    /**
     * @return cenId
     */
    public String getCenId() {
        return this.cenId;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return crossBorderMode
     */
    public String getCrossBorderMode() {
        return this.crossBorderMode;
    }

    /**
     * @return crossBorderStatus
     */
    public Boolean getCrossBorderStatus() {
        return this.crossBorderStatus;
    }

    /**
     * @return crossDomainBandwidthPackage
     */
    public CrossDomainBandwidthPackage getCrossDomainBandwidthPackage() {
        return this.crossDomainBandwidthPackage;
    }

    /**
     * @return crossPrivateState
     */
    public String getCrossPrivateState() {
        return this.crossPrivateState;
    }

    /**
     * @return ddosConfigList
     */
    public java.util.List<DdosConfigList> getDdosConfigList() {
        return this.ddosConfigList;
    }

    /**
     * @return ddosId
     */
    public String getDdosId() {
        return this.ddosId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dnsName
     */
    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return instanceChargeType
     */
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    /**
     * @return ipSetConfig
     */
    public IpSetConfig getIpSetConfig() {
        return this.ipSetConfig;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return secondDnsName
     */
    public String getSecondDnsName() {
        return this.secondDnsName;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceManaged
     */
    public Boolean getServiceManaged() {
        return this.serviceManaged;
    }

    /**
     * @return serviceManagedInfos
     */
    public java.util.List<ServiceManagedInfos> getServiceManagedInfos() {
        return this.serviceManagedInfos;
    }

    /**
     * @return spec
     */
    public String getSpec() {
        return this.spec;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return upgradableStatus
     */
    public String getUpgradableStatus() {
        return this.upgradableStatus;
    }

    public static final class Builder {
        private String acceleratorId; 
        private Integer bandwidth; 
        private String bandwidthBillingType; 
        private BasicBandwidthPackage basicBandwidthPackage; 
        private String cenId; 
        private Long createTime; 
        private String crossBorderMode; 
        private Boolean crossBorderStatus; 
        private CrossDomainBandwidthPackage crossDomainBandwidthPackage; 
        private String crossPrivateState; 
        private java.util.List<DdosConfigList> ddosConfigList; 
        private String ddosId; 
        private String description; 
        private String dnsName; 
        private Long expiredTime; 
        private String instanceChargeType; 
        private IpSetConfig ipSetConfig; 
        private String name; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String secondDnsName; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List<ServiceManagedInfos> serviceManagedInfos; 
        private String spec; 
        private String state; 
        private java.util.List<Tags> tags; 
        private String upgradableStatus; 

        private Builder() {
        } 

        private Builder(DescribeAcceleratorResponseBody model) {
            this.acceleratorId = model.acceleratorId;
            this.bandwidth = model.bandwidth;
            this.bandwidthBillingType = model.bandwidthBillingType;
            this.basicBandwidthPackage = model.basicBandwidthPackage;
            this.cenId = model.cenId;
            this.createTime = model.createTime;
            this.crossBorderMode = model.crossBorderMode;
            this.crossBorderStatus = model.crossBorderStatus;
            this.crossDomainBandwidthPackage = model.crossDomainBandwidthPackage;
            this.crossPrivateState = model.crossPrivateState;
            this.ddosConfigList = model.ddosConfigList;
            this.ddosId = model.ddosId;
            this.description = model.description;
            this.dnsName = model.dnsName;
            this.expiredTime = model.expiredTime;
            this.instanceChargeType = model.instanceChargeType;
            this.ipSetConfig = model.ipSetConfig;
            this.name = model.name;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.secondDnsName = model.secondDnsName;
            this.serviceId = model.serviceId;
            this.serviceManaged = model.serviceManaged;
            this.serviceManagedInfos = model.serviceManagedInfos;
            this.spec = model.spec;
            this.state = model.state;
            this.tags = model.tags;
            this.upgradableStatus = model.upgradableStatus;
        } 

        /**
         * <p>The ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The bandwidth metering method. Valid values:</p>
         * <ul>
         * <li><strong>BandwidthPackage:</strong> billed based on bandwidth plans.</li>
         * <li><strong>CDT</strong>: billed based on data transfer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CDT</p>
         */
        public Builder bandwidthBillingType(String bandwidthBillingType) {
            this.bandwidthBillingType = bandwidthBillingType;
            return this;
        }

        /**
         * <p>The details about the basic bandwidth plan that is associated with the GA instance.</p>
         */
        public Builder basicBandwidthPackage(BasicBandwidthPackage basicBandwidthPackage) {
            this.basicBandwidthPackage = basicBandwidthPackage;
            return this;
        }

        /**
         * <p>The ID of the Cloud Enterprise Network (CEN) instance with which the GA instance is associated.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-hjkduu767hc****</p>
         */
        public Builder cenId(String cenId) {
            this.cenId = cenId;
            return this;
        }

        /**
         * <p>The timestamp that indicates when the GA instance is created.</p>
         * 
         * <strong>example:</strong>
         * <p>1650643200</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The type of cross-border acceleration. This parameter is returned for GA instances whose bandwidth metering method is pay-by-data-transfer (CDT).</p>
         * <p>Only <strong>bpgPro</strong> may be returned, which indicates BGP (Multi-ISP) Pro lines.</p>
         * 
         * <strong>example:</strong>
         * <p>bpgPro</p>
         */
        public Builder crossBorderMode(String crossBorderMode) {
            this.crossBorderMode = crossBorderMode;
            return this;
        }

        /**
         * <p>Indicates whether cross-border acceleration is enabled.</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder crossBorderStatus(Boolean crossBorderStatus) {
            this.crossBorderStatus = crossBorderStatus;
            return this;
        }

        /**
         * <p>The details about the cross-border acceleration bandwidth plan that is associated with the GA instance.</p>
         * <p>This array is returned only for GA instances that are created on the international site (alibabacloud.com).</p>
         */
        public Builder crossDomainBandwidthPackage(CrossDomainBandwidthPackage crossDomainBandwidthPackage) {
            this.crossDomainBandwidthPackage = crossDomainBandwidthPackage;
            return this;
        }

        /**
         * <p>Indicates whether cross-border acceleration is enabled.</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder crossPrivateState(String crossPrivateState) {
            this.crossPrivateState = crossPrivateState;
            return this;
        }

        /**
         * DdosConfigList.
         */
        public Builder ddosConfigList(java.util.List<DdosConfigList> ddosConfigList) {
            this.ddosConfigList = ddosConfigList;
            return this;
        }

        /**
         * <p>The ID of the Anti-DDoS Pro/Premium instance that is associated with the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-zz11vq7j****</p>
         */
        public Builder ddosId(String ddosId) {
            this.ddosId = ddosId;
            return this;
        }

        /**
         * <p>The description of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Accelerator</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The canonical name (CNAME) that is assigned to the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp15u1i2hmtbk8c3i****.aliyunga0019.com</p>
         */
        public Builder dnsName(String dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        /**
         * <p>The timestamp that indicates when the GA instance expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1653235200</p>
         */
        public Builder expiredTime(Long expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The billing method of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder instanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }

        /**
         * <p>The configurations of the acceleration area.</p>
         */
        public Builder ipSetConfig(IpSetConfig ipSetConfig) {
            this.ipSetConfig = ipSetConfig;
            return this;
        }

        /**
         * <p>The name of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Accelerator</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The region ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmw2vwdbujqbq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The CNAME that is used to integrate the GA instance with the Anti-DDoS service.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1f609c76zg6zuna****-1.aliyunga0047.com</p>
         */
        public Builder secondDnsName(String secondDnsName) {
            this.secondDnsName = secondDnsName;
            return this;
        }

        /**
         * <p>The ID of the service that manages the GA instance.</p>
         * <blockquote>
         * <p> This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>Indicates whether the GA instance is managed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * <p>The actions that users can perform on the managed instance.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is returned only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</p>
         * </li>
         * <li><p>Users can perform only specific actions on a managed instance.</p>
         * </li>
         * </ul>
         */
        public Builder serviceManagedInfos(java.util.List<ServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }

        /**
         * <p>The specification of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Small Ⅰ</li>
         * <li><strong>2</strong>: Small Ⅱ</li>
         * <li><strong>3</strong>: Small Ⅲ</li>
         * <li><strong>5</strong>: Medium Ⅰ</li>
         * <li><strong>8</strong>: Medium Ⅱ</li>
         * <li><strong>10</strong>: Medium Ⅲ</li>
         * <li><strong>20</strong>: Large Ⅰ</li>
         * <li><strong>30</strong>: Large Ⅱ</li>
         * <li><strong>40</strong>: Large Ⅲ</li>
         * <li><strong>50</strong>: Large Ⅳ</li>
         * <li><strong>60</strong>: Large Ⅴ</li>
         * <li><strong>70</strong>: Large Ⅵ</li>
         * <li><strong>80</strong>: Large VⅡ</li>
         * <li><strong>90</strong>: Large VⅢ</li>
         * <li><strong>100</strong>: Super Large Ⅰ</li>
         * <li><strong>200</strong>: Super Large Ⅱ</li>
         * </ul>
         * <blockquote>
         * <p> The Large Ⅲ specification and higher specifications are available only to users that are added to the whitelist. To use these specifications, contact your Alibaba Cloud account manager.</p>
         * </blockquote>
         * <p>Different specifications provide different capabilities. For more information, see <a href="https://help.aliyun.com/document_detail/153127.html">Instance specifications</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder spec(String spec) {
            this.spec = spec;
            return this;
        }

        /**
         * <p>The status of the GA instance. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The GA instance is being initialized.</li>
         * <li><strong>active</strong>: The GA instance is available.</li>
         * <li><strong>configuring</strong>: The GA instance is being configured.</li>
         * <li><strong>binding</strong>: The GA instance is being associated.</li>
         * <li><strong>unbinding</strong>: The GA instance is being disassociated.</li>
         * <li><strong>deleting</strong>: The GA instance is being deleted.</li>
         * <li><strong>finacialLocked</strong>: The GA instance is locked due to overdue payments.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The tags of the GA instance.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>Indicates whether the GA instance can be upgraded. Valid values:</p>
         * <ul>
         * <li><strong>notUpgradable:</strong> The GA instance does not need to be upgraded.</li>
         * <li><strong>upgradable:</strong> The GA instance can be upgraded to the latest version.</li>
         * <li><strong>upgradeFailed:</strong> The GA instance failed to be upgraded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>notUpgradable</p>
         */
        public Builder upgradableStatus(String upgradableStatus) {
            this.upgradableStatus = upgradableStatus;
            return this;
        }

        public DescribeAcceleratorResponseBody build() {
            return new DescribeAcceleratorResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAcceleratorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAcceleratorResponseBody</p>
     */
    public static class BasicBandwidthPackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("BandwidthType")
        private String bandwidthType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private BasicBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bandwidthType = builder.bandwidthType;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BasicBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bandwidthType
         */
        public String getBandwidthType() {
            return this.bandwidthType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String bandwidthType; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(BasicBandwidthPackage model) {
                this.bandwidth = model.bandwidth;
                this.bandwidthType = model.bandwidthType;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The bandwidth value of the basic bandwidth plan. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The type of the bandwidth that is provided by the basic bandwidth plan. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: basic</li>
             * <li><strong>Enhanced</strong>: enhanced</li>
             * <li><strong>Advanced</strong>: premium</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Basic</p>
             */
            public Builder bandwidthType(String bandwidthType) {
                this.bandwidthType = bandwidthType;
                return this;
            }

            /**
             * <p>The ID of the basic bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>gbwp-bp1d8xk8bg139j0fw****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public BasicBandwidthPackage build() {
                return new BasicBandwidthPackage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAcceleratorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAcceleratorResponseBody</p>
     */
    public static class CrossDomainBandwidthPackage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Integer bandwidth;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private CrossDomainBandwidthPackage(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossDomainBandwidthPackage create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private Integer bandwidth; 
            private String instanceId; 

            private Builder() {
            } 

            private Builder(CrossDomainBandwidthPackage model) {
                this.bandwidth = model.bandwidth;
                this.instanceId = model.instanceId;
            } 

            /**
             * <p>The bandwidth that is provided by the cross-border acceleration bandwidth plan. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Integer bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The ID of the cross-border acceleration bandwidth plan.</p>
             * 
             * <strong>example:</strong>
             * <p>gbwp-bp1d8xk8bg139j0fw****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public CrossDomainBandwidthPackage build() {
                return new CrossDomainBandwidthPackage(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAcceleratorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAcceleratorResponseBody</p>
     */
    public static class DdosConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DdosId")
        private String ddosId;

        @com.aliyun.core.annotation.NameInMap("DdosRegionId")
        private String ddosRegionId;

        private DdosConfigList(Builder builder) {
            this.ddosId = builder.ddosId;
            this.ddosRegionId = builder.ddosRegionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DdosConfigList create() {
            return builder().build();
        }

        /**
         * @return ddosId
         */
        public String getDdosId() {
            return this.ddosId;
        }

        /**
         * @return ddosRegionId
         */
        public String getDdosRegionId() {
            return this.ddosRegionId;
        }

        public static final class Builder {
            private String ddosId; 
            private String ddosRegionId; 

            private Builder() {
            } 

            private Builder(DdosConfigList model) {
                this.ddosId = model.ddosId;
                this.ddosRegionId = model.ddosRegionId;
            } 

            /**
             * <p>The ID of the Anti-DDoS Pro/Premium instance that is associated with the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddoscoo-cn-zz11vq7j****</p>
             */
            public Builder ddosId(String ddosId) {
                this.ddosId = ddosId;
                return this;
            }

            /**
             * DdosRegionId.
             */
            public Builder ddosRegionId(String ddosRegionId) {
                this.ddosRegionId = ddosRegionId;
                return this;
            }

            public DdosConfigList build() {
                return new DdosConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAcceleratorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAcceleratorResponseBody</p>
     */
    public static class IpSetConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessMode")
        private String accessMode;

        private IpSetConfig(Builder builder) {
            this.accessMode = builder.accessMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpSetConfig create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public String getAccessMode() {
            return this.accessMode;
        }

        public static final class Builder {
            private String accessMode; 

            private Builder() {
            } 

            private Builder(IpSetConfig model) {
                this.accessMode = model.accessMode;
            } 

            /**
             * <p>The access mode of the acceleration area. Valid values:</p>
             * <ul>
             * <li><strong>UserDefine</strong>: custom nearby access mode. You can select acceleration areas and regions based on your business requirements. GA allocates a separate elastic IP address (EIP) to each acceleration region.</li>
             * <li><strong>Anycast</strong>: automatic nearby access mode. You do not need to specify an acceleration area. GA allocates an Anycast EIP to multiple regions across the globe. Users can connect to the nearest access point of the Alibaba Cloud global transmission network by sending requests to the Anycast EIP.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UserDefine</p>
             */
            public Builder accessMode(String accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            public IpSetConfig build() {
                return new IpSetConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAcceleratorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAcceleratorResponseBody</p>
     */
    public static class ServiceManagedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ChildType")
        private String childType;

        @com.aliyun.core.annotation.NameInMap("IsManaged")
        private Boolean isManaged;

        private ServiceManagedInfos(Builder builder) {
            this.action = builder.action;
            this.childType = builder.childType;
            this.isManaged = builder.isManaged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceManagedInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return childType
         */
        public String getChildType() {
            return this.childType;
        }

        /**
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public static final class Builder {
            private String action; 
            private String childType; 
            private Boolean isManaged; 

            private Builder() {
            } 

            private Builder(ServiceManagedInfos model) {
                this.action = model.action;
                this.childType = model.childType;
                this.isManaged = model.isManaged;
            } 

            /**
             * <p>The name of the action performed on the managed instance. Valid values:</p>
             * <ul>
             * <li><strong>Create</strong></li>
             * <li><strong>Update</strong></li>
             * <li><strong>Delete</strong></li>
             * <li><strong>Associate</strong></li>
             * <li><strong>UserUnmanaged</strong></li>
             * <li><strong>CreateChild</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Update</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The type of the child resource. Valid values:</p>
             * <ul>
             * <li><strong>Listener</strong>: a listener.</li>
             * <li><strong>IpSet</strong>: an acceleration region.</li>
             * <li><strong>EndpointGroup</strong>: an endpoint group.</li>
             * <li><strong>ForwardingRule</strong>: a forwarding rule.</li>
             * <li><strong>Endpoint</strong>: an endpoint.</li>
             * <li><strong>EndpointGroupDestination</strong>: a protocol mapping of an endpoint group associated with a custom routing listener.</li>
             * <li><strong>EndpointPolicy</strong>: a traffic policy of an endpoint associated with a custom routing listener.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only if the value of <strong>Action</strong> is <strong>CreateChild</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Listener</p>
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * <p>Indicates whether the specified actions are managed. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The specified actions are managed, and you cannot perform the specified actions on the managed instance.</li>
             * <li><strong>false</strong>: The specified actions are not managed, and you can perform the specified actions on the managed instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            public ServiceManagedInfos build() {
                return new ServiceManagedInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAcceleratorResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAcceleratorResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag N that is added to the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N that is added to the GA instance.</p>
             * 
             * <strong>example:</strong>
             * <p>tag-value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
