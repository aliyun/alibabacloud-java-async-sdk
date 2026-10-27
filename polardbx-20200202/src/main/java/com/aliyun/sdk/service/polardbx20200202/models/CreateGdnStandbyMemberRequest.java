// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CreateGdnStandbyMemberRequest} extends {@link RequestModel}
 *
 * <p>CreateGdnStandbyMemberRequest</p>
 */
public class CreateGdnStandbyMemberRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CNNodeCount")
    private String CNNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloneInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cloneInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CnClass")
    private String cnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DNNodeCount")
    private String DNNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DnClass")
    private String dnClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryZone")
    private String primaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZone")
    private String secondaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Series")
    private String series;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceInstanceRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceInstanceRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TertiaryZone")
    private String tertiaryZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopologyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topologyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    private CreateGdnStandbyMemberRequest(Builder builder) {
        super(builder);
        this.autoRenew = builder.autoRenew;
        this.CNNodeCount = builder.CNNodeCount;
        this.clientToken = builder.clientToken;
        this.cloneInstanceName = builder.cloneInstanceName;
        this.cnClass = builder.cnClass;
        this.DNNodeCount = builder.DNNodeCount;
        this.description = builder.description;
        this.dnClass = builder.dnClass;
        this.engineVersion = builder.engineVersion;
        this.networkType = builder.networkType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.primaryZone = builder.primaryZone;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.secondaryZone = builder.secondaryZone;
        this.series = builder.series;
        this.sourceInstanceRegion = builder.sourceInstanceRegion;
        this.storageType = builder.storageType;
        this.tertiaryZone = builder.tertiaryZone;
        this.topologyType = builder.topologyType;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGdnStandbyMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return CNNodeCount
     */
    public String getCNNodeCount() {
        return this.CNNodeCount;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloneInstanceName
     */
    public String getCloneInstanceName() {
        return this.cloneInstanceName;
    }

    /**
     * @return cnClass
     */
    public String getCnClass() {
        return this.cnClass;
    }

    /**
     * @return DNNodeCount
     */
    public String getDNNodeCount() {
        return this.DNNodeCount;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dnClass
     */
    public String getDnClass() {
        return this.dnClass;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return primaryZone
     */
    public String getPrimaryZone() {
        return this.primaryZone;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return secondaryZone
     */
    public String getSecondaryZone() {
        return this.secondaryZone;
    }

    /**
     * @return series
     */
    public String getSeries() {
        return this.series;
    }

    /**
     * @return sourceInstanceRegion
     */
    public String getSourceInstanceRegion() {
        return this.sourceInstanceRegion;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return tertiaryZone
     */
    public String getTertiaryZone() {
        return this.tertiaryZone;
    }

    /**
     * @return topologyType
     */
    public String getTopologyType() {
        return this.topologyType;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<CreateGdnStandbyMemberRequest, Builder> {
        private Boolean autoRenew; 
        private String CNNodeCount; 
        private String clientToken; 
        private String cloneInstanceName; 
        private String cnClass; 
        private String DNNodeCount; 
        private String description; 
        private String dnClass; 
        private String engineVersion; 
        private String networkType; 
        private String payType; 
        private String period; 
        private String primaryZone; 
        private String regionId; 
        private String resourceGroupId; 
        private String secondaryZone; 
        private String series; 
        private String sourceInstanceRegion; 
        private String storageType; 
        private String tertiaryZone; 
        private String topologyType; 
        private Integer usedTime; 
        private String VPCId; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(CreateGdnStandbyMemberRequest request) {
            super(request);
            this.autoRenew = request.autoRenew;
            this.CNNodeCount = request.CNNodeCount;
            this.clientToken = request.clientToken;
            this.cloneInstanceName = request.cloneInstanceName;
            this.cnClass = request.cnClass;
            this.DNNodeCount = request.DNNodeCount;
            this.description = request.description;
            this.dnClass = request.dnClass;
            this.engineVersion = request.engineVersion;
            this.networkType = request.networkType;
            this.payType = request.payType;
            this.period = request.period;
            this.primaryZone = request.primaryZone;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.secondaryZone = request.secondaryZone;
            this.series = request.series;
            this.sourceInstanceRegion = request.sourceInstanceRegion;
            this.storageType = request.storageType;
            this.tertiaryZone = request.tertiaryZone;
            this.topologyType = request.topologyType;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * <p>Specifies whether to enable auto-renewal. Default value: true.</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The number of compute nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder CNNodeCount(String CNNodeCount) {
            this.putQueryParameter("CNNodeCount", CNNodeCount);
            this.CNNodeCount = CNNodeCount;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Make sure that the value is different for each request.</p>
         * 
         * <strong>example:</strong>
         * <p>FEA5DC20-6D8A-5979-97AA-FC57546ADC20</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The name of the source instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-***</p>
         */
        public Builder cloneInstanceName(String cloneInstanceName) {
            this.putQueryParameter("CloneInstanceName", cloneInstanceName);
            this.cloneInstanceName = cloneInstanceName;
            return this;
        }

        /**
         * <p>The compute node specifications. This parameter is required for Enterprise Edition instances and is not required for Standard Edition instances.</p>
         * <p>Enterprise Edition with local disks:</p>
         * <ul>
         * <li><strong>polarx.x4.medium.2e</strong>: 2 cores, 8 GB (general-purpose)</li>
         * <li><strong>polarx.x4.large.2e</strong>: 4 cores, 16 GB (general-purpose)</li>
         * <li><strong>polarx.x4.xlarge.2e</strong>: 8 cores, 32 GB (general-purpose)</li>
         * <li><strong>polarx.x4.2xlarge.2e</strong>: 16 cores, 64 GB (general-purpose)</li>
         * <li><strong>polarx.x8.large.2e</strong>: 4 cores, 32 GB (dedicated)</li>
         * <li><strong>polarx.x2.large.2x</strong>: 8 cores, 16 GB (dedicated)</li>
         * <li><strong>polarx.x4.xlarge.2x</strong>: 8 cores, 32 GB (dedicated)</li>
         * <li><strong>polarx.x8.xlarge.2e</strong>: 8 cores, 64 GB (dedicated)</li>
         * <li><strong>polarx.x8.2xlarge.2e</strong>: 16 cores, 128 GB (dedicated)</li>
         * <li><strong>polarx.x4.4xlarge.2e</strong>: 32 cores, 128 GB (dedicated)</li>
         * <li><strong>polarx.x8.4xlarge.2e</strong>: 32 cores, 256 GB (dedicated)</li>
         * <li><strong>polarx.st.8xlarge.2e</strong>: 60 cores, 470 GB (dedicated)</li>
         * <li><strong>polarx.st.12xlarge.2e</strong>: 90 cores, 720 GB (dedicated)</li>
         * </ul>
         * <p>Enterprise Edition with cloud disks:</p>
         * <ul>
         * <li><strong>polarx.x4.medium.c2e</strong>: 2 cores, 8 GB (general-purpose)</li>
         * <li><strong>polarx.x4.large.c2e</strong>: 4 cores, 16 GB (general-purpose)</li>
         * <li><strong>polarx.x4.xlarge.c2e</strong>: 8 cores, 32 GB (general-purpose)</li>
         * <li><strong>polarx.x4.2xlarge.c2e</strong>: 16 cores, 64 GB (general-purpose)</li>
         * <li><strong>polarx.x8.large.c2e</strong>: 4 cores, 32 GB (dedicated)</li>
         * <li><strong>polarx.x2.large.c2x</strong>: 8 cores, 16 GB (dedicated)</li>
         * <li><strong>polarx.x4.xlarge.c2x</strong>: 8 cores, 32 GB (dedicated)</li>
         * <li><strong>polarx.x8.xlarge.c2e</strong>: 8 cores, 64 GB (dedicated)</li>
         * <li><strong>polarx.x8.2xlarge.c2e</strong>: 16 cores, 128 GB (dedicated)</li>
         * <li><strong>polarx.x4.4xlarge.c2e</strong>: 32 cores, 128 GB (dedicated)</li>
         * <li><strong>polarx.x8.4xlarge.c2e</strong>: 32 cores, 256 GB (dedicated)</li>
         * <li><strong>polarx.st.8xlarge.c2e</strong>: 60 cores, 470 GB (dedicated)</li>
         * <li><strong>polarx.st.12xlarge.c2e</strong>: 90 cores, 720 GB (dedicated)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4 cores, 32 GB</p>
         */
        public Builder cnClass(String cnClass) {
            this.putQueryParameter("CnClass", cnClass);
            this.cnClass = cnClass;
            return this;
        }

        /**
         * <p>The number of storage nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DNNodeCount(String DNNodeCount) {
            this.putQueryParameter("DNNodeCount", DNNodeCount);
            this.DNNodeCount = DNNodeCount;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>go-to-the-docks-for-french-fries</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The storage node specifications. This parameter is required for Enterprise Edition instances and is not required for Standard Edition instances.</p>
         * <p>Enterprise Edition with local disks:</p>
         * <ul>
         * <li><strong>mysql.n2.medium.25</strong>: 2 cores, 4 GB (general-purpose)</li>
         * <li><strong>mysql.n4.medium.25</strong>: 2 cores, 8 GB (general-purpose)</li>
         * <li><strong>mysql.n2.large.25</strong>: 4 cores, 8 GB (general-purpose)</li>
         * <li><strong>mysql.n4.large.25</strong>: 4 cores, 16 GB (general-purpose)</li>
         * <li><strong>mysql.n4.xlarge.25</strong>: 8 cores, 32 GB (general-purpose)</li>
         * <li><strong>mysql.n4.2xlarge.25</strong>: 16 cores, 64 GB (general-purpose)</li>
         * <li><strong>mysql.x4.large.25</strong>: 4 cores, 16 GB (dedicated)</li>
         * <li><strong>mysql.x8.large.25</strong>: 4 cores, 32 GB (dedicated)</li>
         * <li><strong>mysql.x2.xlarge.25</strong>: 8 cores, 16 GB (dedicated)</li>
         * <li><strong>mysql.x8.xlarge.25</strong>: 8 cores, 64 GB (dedicated)</li>
         * <li><strong>mysql.x8.2xlarge.25</strong>: 16 cores, 128 GB (dedicated)</li>
         * <li><strong>mysql.x4.4xlarge.25</strong>: 32 cores, 128 GB (dedicated)</li>
         * <li><strong>mysql.x8.4xlarge.25</strong>: 32 cores, 256 GB (dedicated)</li>
         * <li><strong>mysql.st.8xlarge.25</strong>: 60 cores, 470 GB (dedicated)</li>
         * <li><strong>mysql.st.12xlarge.25</strong>: 90 cores, 720 GB (dedicated)</li>
         * <li><strong>mysql.x8.45xlarge.25</strong>: 180 cores, 1440 GB (dedicated)</li>
         * <li><strong>mysql.x8.60xlarge.25</strong>: 240 cores, 1920 GB (dedicated)</li>
         * </ul>
         * <p>Enterprise Edition with cloud disks:</p>
         * <ul>
         * <li><strong>polarx.mysql.n2.medium.c25</strong>: 2 cores, 4 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.medium.c25</strong>: 2 cores, 8 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n2.large.c25</strong>: 4 cores, 8 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.large.c25</strong>: 4 cores, 16 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.xlarge.c25</strong>: 8 cores, 32 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.n4.2xlarge.c25</strong>: 16 cores, 64 GB (general-purpose)</li>
         * <li><strong>polarx.mysql.x4.large.c25</strong>: 4 cores, 16 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.large.c25</strong>: 4 cores, 32 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x2.xlarge.c25</strong>: 8 cores, 16 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.xlarge.c25</strong>: 8 cores, 64 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.2xlarge.c25</strong>: 16 cores, 128 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x4.4xlarge.c25</strong>: 32 cores, 128 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.4xlarge.c25</strong>: 32 cores, 256 GB (dedicated)</li>
         * <li><strong>polarx.mysql.st.8xlarge.c25</strong>: 60 cores, 470 GB (dedicated)</li>
         * <li><strong>polarx.mysql.st.12xlarge.c25</strong>: 90 cores, 720 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.45xlarge.c25</strong>: 180 cores, 1440 GB (dedicated)</li>
         * <li><strong>polarx.mysql.x8.60xlarge.c25</strong>: 240 cores, 1920 GB (dedicated)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>4 cores, 32 GB</p>
         */
        public Builder dnClass(String dnClass) {
            this.putQueryParameter("DnClass", dnClass);
            this.dnClass = dnClass;
            return this;
        }

        /**
         * <p>The MySQL DPI engine version. Valid values: 5.7 and 8.0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.7</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The network type. Only VPC is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The billing method of the instance.</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PREPAY</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li>Year</li>
         * <li>Month</li>
         * </ul>
         * <p>For pay-as-you-go instances, the default value is Hour.</p>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The primary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        public Builder primaryZone(String primaryZone) {
            this.putQueryParameter("PrimaryZone", primaryZone);
            this.primaryZone = primaryZone;
            return this;
        }

        /**
         * <p>The region in which the instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID. This parameter can be left empty. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The secondary zone.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-a</p>
         */
        public Builder secondaryZone(String secondaryZone) {
            this.putQueryParameter("SecondaryZone", secondaryZone);
            this.secondaryZone = secondaryZone;
            return this;
        }

        /**
         * <p>The edition of the instance. Valid values:</p>
         * <ul>
         * <li>enterprise: Enterprise Edition.</li>
         * <li>standard: Standard Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enterprise</p>
         */
        public Builder series(String series) {
            this.putQueryParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * <p>The region in which the source instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu</p>
         */
        public Builder sourceInstanceRegion(String sourceInstanceRegion) {
            this.putQueryParameter("SourceInstanceRegion", sourceInstanceRegion);
            this.sourceInstanceRegion = sourceInstanceRegion;
            return this;
        }

        /**
         * <p>The storage type.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The zone for Three-zone deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen-e</p>
         */
        public Builder tertiaryZone(String tertiaryZone) {
            this.putQueryParameter("TertiaryZone", tertiaryZone);
            this.tertiaryZone = tertiaryZone;
            return this;
        }

        /**
         * <p>The topology type. Valid values:</p>
         * <ul>
         * <li><strong>3azones</strong>: three-zone deployment.</li>
         * <li><strong>1azone</strong>: single-zone deployment.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3azones</p>
         */
        public Builder topologyType(String topologyType) {
            this.putQueryParameter("TopologyType", topologyType);
            this.topologyType = topologyType;
            return this;
        }

        /**
         * <p>The subscription duration. Unit: months or years.</p>
         * <blockquote>
         * <p>If Period is set to Year, valid values of this parameter are 1, 2, and 3.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public CreateGdnStandbyMemberRequest build() {
            return new CreateGdnStandbyMemberRequest(this);
        } 

    } 

}
