// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

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
 * {@link CreateLindormInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateLindormInstanceRequest</p>
 */
public class CreateLindormInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArbiterVSwitchId")
    private String arbiterVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArbiterZoneId")
    private String arbiterZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArchVersion")
    private String archVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewDuration")
    private String autoRenewDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdStorage")
    private Integer coldStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreSingleStorage")
    private Integer coreSingleStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreSpec")
    private String coreSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilestoreNum")
    private Integer filestoreNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilestoreSpec")
    private String filestoreSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceAlias")
    private String instanceAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceStorage")
    private String instanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LindormNum")
    private Integer lindormNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LindormSpec")
    private String lindormSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogDiskCategory")
    private String logDiskCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogNum")
    private Integer logNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogSingleStorage")
    private Integer logSingleStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogSpec")
    private String logSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LtsNum")
    private String ltsNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LtsSpec")
    private String ltsSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MultiZoneCombination")
    private String multiZoneCombination;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PricingCycle")
    private String pricingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryVSwitchId")
    private String primaryVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryZoneId")
    private String primaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolrNum")
    private Integer solrNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SolrSpec")
    private String solrSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyZoneId")
    private String standbyZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamNum")
    private Integer streamNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamSpec")
    private String streamSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TsdbNum")
    private Integer tsdbNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TsdbSpec")
    private String tsdbSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String zoneId;

    private CreateLindormInstanceRequest(Builder builder) {
        super(builder);
        this.arbiterVSwitchId = builder.arbiterVSwitchId;
        this.arbiterZoneId = builder.arbiterZoneId;
        this.archVersion = builder.archVersion;
        this.autoRenewDuration = builder.autoRenewDuration;
        this.autoRenewal = builder.autoRenewal;
        this.coldStorage = builder.coldStorage;
        this.coreSingleStorage = builder.coreSingleStorage;
        this.coreSpec = builder.coreSpec;
        this.diskCategory = builder.diskCategory;
        this.duration = builder.duration;
        this.filestoreNum = builder.filestoreNum;
        this.filestoreSpec = builder.filestoreSpec;
        this.instanceAlias = builder.instanceAlias;
        this.instanceStorage = builder.instanceStorage;
        this.lindormNum = builder.lindormNum;
        this.lindormSpec = builder.lindormSpec;
        this.logDiskCategory = builder.logDiskCategory;
        this.logNum = builder.logNum;
        this.logSingleStorage = builder.logSingleStorage;
        this.logSpec = builder.logSpec;
        this.ltsNum = builder.ltsNum;
        this.ltsSpec = builder.ltsSpec;
        this.multiZoneCombination = builder.multiZoneCombination;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.pricingCycle = builder.pricingCycle;
        this.primaryVSwitchId = builder.primaryVSwitchId;
        this.primaryZoneId = builder.primaryZoneId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.solrNum = builder.solrNum;
        this.solrSpec = builder.solrSpec;
        this.standbyVSwitchId = builder.standbyVSwitchId;
        this.standbyZoneId = builder.standbyZoneId;
        this.streamNum = builder.streamNum;
        this.streamSpec = builder.streamSpec;
        this.tag = builder.tag;
        this.tsdbNum = builder.tsdbNum;
        this.tsdbSpec = builder.tsdbSpec;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLindormInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arbiterVSwitchId
     */
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    /**
     * @return arbiterZoneId
     */
    public String getArbiterZoneId() {
        return this.arbiterZoneId;
    }

    /**
     * @return archVersion
     */
    public String getArchVersion() {
        return this.archVersion;
    }

    /**
     * @return autoRenewDuration
     */
    public String getAutoRenewDuration() {
        return this.autoRenewDuration;
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return coldStorage
     */
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    /**
     * @return coreSingleStorage
     */
    public Integer getCoreSingleStorage() {
        return this.coreSingleStorage;
    }

    /**
     * @return coreSpec
     */
    public String getCoreSpec() {
        return this.coreSpec;
    }

    /**
     * @return diskCategory
     */
    public String getDiskCategory() {
        return this.diskCategory;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return filestoreNum
     */
    public Integer getFilestoreNum() {
        return this.filestoreNum;
    }

    /**
     * @return filestoreSpec
     */
    public String getFilestoreSpec() {
        return this.filestoreSpec;
    }

    /**
     * @return instanceAlias
     */
    public String getInstanceAlias() {
        return this.instanceAlias;
    }

    /**
     * @return instanceStorage
     */
    public String getInstanceStorage() {
        return this.instanceStorage;
    }

    /**
     * @return lindormNum
     */
    public Integer getLindormNum() {
        return this.lindormNum;
    }

    /**
     * @return lindormSpec
     */
    public String getLindormSpec() {
        return this.lindormSpec;
    }

    /**
     * @return logDiskCategory
     */
    public String getLogDiskCategory() {
        return this.logDiskCategory;
    }

    /**
     * @return logNum
     */
    public Integer getLogNum() {
        return this.logNum;
    }

    /**
     * @return logSingleStorage
     */
    public Integer getLogSingleStorage() {
        return this.logSingleStorage;
    }

    /**
     * @return logSpec
     */
    public String getLogSpec() {
        return this.logSpec;
    }

    /**
     * @return ltsNum
     */
    public String getLtsNum() {
        return this.ltsNum;
    }

    /**
     * @return ltsSpec
     */
    public String getLtsSpec() {
        return this.ltsSpec;
    }

    /**
     * @return multiZoneCombination
     */
    public String getMultiZoneCombination() {
        return this.multiZoneCombination;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return primaryVSwitchId
     */
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    /**
     * @return primaryZoneId
     */
    public String getPrimaryZoneId() {
        return this.primaryZoneId;
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
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return solrNum
     */
    public Integer getSolrNum() {
        return this.solrNum;
    }

    /**
     * @return solrSpec
     */
    public String getSolrSpec() {
        return this.solrSpec;
    }

    /**
     * @return standbyVSwitchId
     */
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    /**
     * @return standbyZoneId
     */
    public String getStandbyZoneId() {
        return this.standbyZoneId;
    }

    /**
     * @return streamNum
     */
    public Integer getStreamNum() {
        return this.streamNum;
    }

    /**
     * @return streamSpec
     */
    public String getStreamSpec() {
        return this.streamSpec;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tsdbNum
     */
    public Integer getTsdbNum() {
        return this.tsdbNum;
    }

    /**
     * @return tsdbSpec
     */
    public String getTsdbSpec() {
        return this.tsdbSpec;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateLindormInstanceRequest, Builder> {
        private String arbiterVSwitchId; 
        private String arbiterZoneId; 
        private String archVersion; 
        private String autoRenewDuration; 
        private Boolean autoRenewal; 
        private Integer coldStorage; 
        private Integer coreSingleStorage; 
        private String coreSpec; 
        private String diskCategory; 
        private String duration; 
        private Integer filestoreNum; 
        private String filestoreSpec; 
        private String instanceAlias; 
        private String instanceStorage; 
        private Integer lindormNum; 
        private String lindormSpec; 
        private String logDiskCategory; 
        private Integer logNum; 
        private Integer logSingleStorage; 
        private String logSpec; 
        private String ltsNum; 
        private String ltsSpec; 
        private String multiZoneCombination; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String pricingCycle; 
        private String primaryVSwitchId; 
        private String primaryZoneId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private Integer solrNum; 
        private String solrSpec; 
        private String standbyVSwitchId; 
        private String standbyZoneId; 
        private Integer streamNum; 
        private String streamSpec; 
        private java.util.List<Tag> tag; 
        private Integer tsdbNum; 
        private String tsdbSpec; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLindormInstanceRequest request) {
            super(request);
            this.arbiterVSwitchId = request.arbiterVSwitchId;
            this.arbiterZoneId = request.arbiterZoneId;
            this.archVersion = request.archVersion;
            this.autoRenewDuration = request.autoRenewDuration;
            this.autoRenewal = request.autoRenewal;
            this.coldStorage = request.coldStorage;
            this.coreSingleStorage = request.coreSingleStorage;
            this.coreSpec = request.coreSpec;
            this.diskCategory = request.diskCategory;
            this.duration = request.duration;
            this.filestoreNum = request.filestoreNum;
            this.filestoreSpec = request.filestoreSpec;
            this.instanceAlias = request.instanceAlias;
            this.instanceStorage = request.instanceStorage;
            this.lindormNum = request.lindormNum;
            this.lindormSpec = request.lindormSpec;
            this.logDiskCategory = request.logDiskCategory;
            this.logNum = request.logNum;
            this.logSingleStorage = request.logSingleStorage;
            this.logSpec = request.logSpec;
            this.ltsNum = request.ltsNum;
            this.ltsSpec = request.ltsSpec;
            this.multiZoneCombination = request.multiZoneCombination;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.pricingCycle = request.pricingCycle;
            this.primaryVSwitchId = request.primaryVSwitchId;
            this.primaryZoneId = request.primaryZoneId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.solrNum = request.solrNum;
            this.solrSpec = request.solrSpec;
            this.standbyVSwitchId = request.standbyVSwitchId;
            this.standbyZoneId = request.standbyZoneId;
            this.streamNum = request.streamNum;
            this.streamSpec = request.streamSpec;
            this.tag = request.tag;
            this.tsdbNum = request.tsdbNum;
            this.tsdbSpec = request.tsdbSpec;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The vSwitch ID of the arbiter zone for a multi-zone instance. The vSwitch must be in the zone specified by ArbiterZoneId. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6664pqjawb87k36****</p>
         */
        public Builder arbiterVSwitchId(String arbiterVSwitchId) {
            this.putQueryParameter("ArbiterVSwitchId", arbiterVSwitchId);
            this.arbiterVSwitchId = arbiterVSwitchId;
            return this;
        }

        /**
         * <p>The zone ID of the arbiter zone for a multi-zone instance. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-g</p>
         */
        public Builder arbiterZoneId(String arbiterZoneId) {
            this.putQueryParameter("ArbiterZoneId", arbiterZoneId);
            this.arbiterZoneId = arbiterZoneId;
            return this;
        }

        /**
         * <p>The deployment architecture. Valid values:</p>
         * <ul>
         * <li><strong>1.0</strong>: single-zone.</li>
         * <li><strong>2.0</strong>: multi-zone.</li>
         * </ul>
         * <p>If this parameter is not specified, the default value is 1.0. To create a multi-zone instance, set this parameter to 2.0. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        public Builder archVersion(String archVersion) {
            this.putQueryParameter("ArchVersion", archVersion);
            this.archVersion = archVersion;
            return this;
        }

        /**
         * <p>The auto-renewal duration. Unit: months.</p>
         * <p>Valid values: <strong>1</strong> to <strong>12</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>AutoRenewal</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewDuration(String autoRenewDuration) {
            this.putQueryParameter("AutoRenewDuration", autoRenewDuration);
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Auto-renewal is enabled.</li>
         * <li><strong>false</strong>: Auto-renewal is disabled.</li>
         * </ul>
         * <p>Default value: false.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>PayType</strong> is set to <strong>PREPAY</strong> (subscription).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.putQueryParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * <p>The capacity cloud storage capacity of the instance. Unit: GB. If this parameter is not specified, capacity cloud storage is not enabled. Valid values: <strong>800</strong> to <strong>1000000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder coldStorage(Integer coldStorage) {
            this.putQueryParameter("ColdStorage", coldStorage);
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * <p>The storage capacity per core node for a multi-zone instance. Valid values: 400 to 64000. Unit: GB. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder coreSingleStorage(Integer coreSingleStorage) {
            this.putQueryParameter("CoreSingleStorage", coreSingleStorage);
            this.coreSingleStorage = coreSingleStorage;
            return this;
        }

        /**
         * <p>The node specifications for local disk type of the instance.</p>
         * <p>When the local storage type is local_ssd_pro, valid values are as follows. I3 instance types currently support only subscription:</p>
         * <ul>
         * <li><strong>lindorm.i4.xlarge</strong>: 4 cores, 32 GB (I4).</li>
         * <li><strong>lindorm.i4.2xlarge</strong>: 8 cores, 64 GB (I4).</li>
         * <li><strong>lindorm.i4.4xlarge</strong>: 16 cores, 128 GB (I4).</li>
         * <li><strong>lindorm.i4.8xlarge</strong>: 32 cores, 256 GB (I4).</li>
         * <li><strong>lindorm.i3.xlarge</strong>: 4 cores, 32 GB (I3).</li>
         * <li><strong>lindorm.i3.2xlarge</strong>: 8 cores, 64 GB (I3).</li>
         * <li><strong>lindorm.i3.4xlarge</strong>: 16 cores, 128 GB (I3).</li>
         * <li><strong>lindorm.i3.8xlarge</strong>: 32 cores, 256 GB (I3).</li>
         * <li><strong>lindorm.i2.xlarge</strong>: 4 cores, 32 GB (I2).</li>
         * <li><strong>lindorm.i2.2xlarge</strong>: 8 cores, 64 GB (I2).</li>
         * <li><strong>lindorm.i2.4xlarge</strong>: 16 cores, 128 GB (I2).</li>
         * <li><strong>lindorm.i2.8xlarge</strong>: 32 cores, 256 GB (I2).</li>
         * </ul>
         * <p>When the local storage type is local_hdd_pro, valid values are as follows:</p>
         * <ul>
         * <li><strong>lindorm.sd3c.3xlarge</strong>: 14 cores, 56 GB (D3C PRO).</li>
         * <li><strong>lindorm.sd3c.7xlarge</strong>: 28 cores, 112 GB (D3C PRO).</li>
         * <li><strong>lindorm.sd3c.14xlarge</strong>: 56 cores, 224 GB (D3C PRO).</li>
         * <li><strong>lindorm.d2c.6xlarge</strong>: 24 cores, 88 GB (D2C).</li>
         * <li><strong>lindorm.d2c.12xlarge</strong>: 48 cores, 176 GB (D2C).</li>
         * <li><strong>lindorm.d2c.24xlarge</strong>: 96 cores, 352 GB (D2C).</li>
         * <li><strong>lindorm.d2s.5xlarge</strong>: 20 cores, 88 GB (D2S).</li>
         * <li><strong>lindorm.d2s.10xlarge</strong>: 40 cores, 176 GB (D2S).</li>
         * <li><strong>lindorm.d1.2xlarge</strong>: 8 cores, 32 GB (D1NE).</li>
         * <li><strong>lindorm.d1.4xlarge</strong>: 16 cores, 64 GB (D1NE).</li>
         * <li><strong>lindorm.d1.6xlarge</strong>: 24 cores, 96 GB (D1NE).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.i2.xlarge</p>
         */
        public Builder coreSpec(String coreSpec) {
            this.putQueryParameter("CoreSpec", coreSpec);
            this.coreSpec = coreSpec;
            return this;
        }

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: standard cloud storage.</li>
         * <li><strong>cloud_ssd</strong>: performance cloud storage.</li>
         * <li><strong>cloud_essd</strong>: enhanced performance cloud storage.</li>
         * <li><strong>cloud_essd_pl0</strong>: performance cloud storage PL0.</li>
         * <li><strong>capacity_cloud_storage</strong>: capacity cloud storage (not supported for multi-zone instances).</li>
         * <li><strong>local_ssd_pro</strong>: local SSD (not supported for multi-zone instances).</li>
         * <li><strong>local_hdd_pro</strong>: local HDD (not supported for multi-zone instances).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * <p>The subscription duration of the instance. Valid values:</p>
         * <ul>
         * <li>If PricingCycle is set to <strong>Month</strong>, valid values are <strong>1</strong> to <strong>9</strong>.</li>
         * <li>If PricingCycle is set to <strong>Year</strong>, valid values are <strong>1</strong> to <strong>3</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available and required when PayType is set to <strong>PREPAY</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The number of file engine nodes of the instance. Valid values:</p>
         * <ul>
         * <li>If the billing method of the instance is <strong>PREPAY</strong>, valid values are <strong>0</strong> to <strong>60</strong>.</li>
         * <li>If the billing method of the instance is <strong>POSTPAY</strong>, valid values are <strong>0</strong> to <strong>8</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder filestoreNum(Integer filestoreNum) {
            this.putQueryParameter("FilestoreNum", filestoreNum);
            this.filestoreNum = filestoreNum;
            return this;
        }

        /**
         * <p>The file engine node specifications of the instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.c.xlarge</strong>: 4 cores, 8 GB (standard).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.c.xlarge</p>
         */
        public Builder filestoreSpec(String filestoreSpec) {
            this.putQueryParameter("FilestoreSpec", filestoreSpec);
            this.filestoreSpec = filestoreSpec;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lindorm_test</p>
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * <p>The storage capacity of the instance. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        public Builder instanceStorage(String instanceStorage) {
            this.putQueryParameter("InstanceStorage", instanceStorage);
            this.instanceStorage = instanceStorage;
            return this;
        }

        /**
         * <p>The number of LindormTable engine nodes of the instance.</p>
         * <p>To create a single-zone instance, valid values are <strong>0</strong> to <strong>90</strong>.</p>
         * <p><strong>To create a multi-zone instance, this parameter is required.</strong> For instances with non-local disk storage types, valid values are <strong>4</strong> to <strong>400</strong>. For instances with local disk storage types, valid values are <strong>6</strong> to <strong>400</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder lindormNum(Integer lindormNum) {
            this.putQueryParameter("LindormNum", lindormNum);
            this.lindormNum = lindormNum;
            return this;
        }

        /**
         * <p>The LindormTable engine node specifications of the instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
         * <li><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
         * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
         * <li><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB (dedicated).</li>
         * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
         * <li><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB (dedicated).</li>
         * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.4xlarge</p>
         */
        public Builder lindormSpec(String lindormSpec) {
            this.putQueryParameter("LindormSpec", lindormSpec);
            this.lindormSpec = lindormSpec;
            return this;
        }

        /**
         * <p>The disk type of log nodes for a multi-zone instance. Valid values:</p>
         * <ul>
         * <li><strong>cloud_efficiency</strong>: standard cloud storage.</li>
         * <li><strong>cloud_ssd</strong>: performance cloud storage.</li>
         * </ul>
         * <p><strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cloud_ssd</p>
         */
        public Builder logDiskCategory(String logDiskCategory) {
            this.putQueryParameter("LogDiskCategory", logDiskCategory);
            this.logDiskCategory = logDiskCategory;
            return this;
        }

        /**
         * <p>The number of log nodes for a multi-zone instance. Valid values: 4 to 400. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder logNum(Integer logNum) {
            this.putQueryParameter("LogNum", logNum);
            this.logNum = logNum;
            return this;
        }

        /**
         * <p>The storage capacity per log node for a multi-zone instance. Valid values: 400 to 64000. Unit: GB. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder logSingleStorage(Integer logSingleStorage) {
            this.putQueryParameter("LogSingleStorage", logSingleStorage);
            this.logSingleStorage = logSingleStorage;
            return this;
        }

        /**
         * <p>The log node specifications for a multi-zone instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.sn1.large</strong>: 4 cores, 8 GB (dedicated).</li>
         * <li><strong>lindorm.sn1.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
         * </ul>
         * <p><strong>To create a multi-zone instance, this parameter is required and active.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>lindorm.sn1.large</p>
         */
        public Builder logSpec(String logSpec) {
            this.putQueryParameter("LogSpec", logSpec);
            this.logSpec = logSpec;
            return this;
        }

        /**
         * <p>The number of LTS engine nodes of the instance. Valid values: <strong>0</strong> to <strong>60</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder ltsNum(String ltsNum) {
            this.putQueryParameter("LtsNum", ltsNum);
            this.ltsNum = ltsNum;
            return this;
        }

        /**
         * <p>The LTS engine node specifications of the instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.c.xlarge</strong>: 4 cores, 8 GB (dedicated).</li>
         * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
         * <li><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
         * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
         * <li><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB (dedicated).</li>
         * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
         * <li><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB (dedicated).</li>
         * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.xlarge</p>
         */
        public Builder ltsSpec(String ltsSpec) {
            this.putQueryParameter("LtsSpec", ltsSpec);
            this.ltsSpec = ltsSpec;
            return this;
        }

        /**
         * <p>The multi-zone combination. You can check the supported zone combinations on the buy page.</p>
         * <ul>
         * <li><strong>ap-southeast-5abc-aliyun</strong>: Indonesia (Jakarta) A+B+C.</li>
         * <li><strong>cn-hangzhou-ehi-aliyun</strong>: China (Hangzhou) E+H+I.</li>
         * <li><strong>cn-beijing-acd-aliyun</strong>: China (Beijing) A+C+D.</li>
         * <li><strong>ap-southeast-1-abc-aliyun</strong>: Singapore A+B+C.</li>
         * <li><strong>cn-zhangjiakou-abc-aliyun</strong>: China (Zhangjiakou) A+B+C.</li>
         * <li><strong>cn-shanghai-efg-aliyun</strong>: China (Shanghai) E+F+G.</li>
         * <li><strong>cn-shanghai-abd-aliyun</strong>: China (Shanghai) A+B+D.</li>
         * <li><strong>cn-hangzhou-bef-aliyun</strong>: China (Hangzhou) B+E+F.</li>
         * <li><strong>cn-hangzhou-bce-aliyun</strong>: China (Hangzhou) B+C+E.</li>
         * <li><strong>cn-beijing-fgh-aliyun</strong>: China (Beijing) F+G+H.</li>
         * <li><strong>cn-shenzhen-abc-aliyun</strong>: China (Shenzhen) A+B+C.</li>
         * </ul>
         * <p><strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-efg-aliyun</p>
         */
        public Builder multiZoneCombination(String multiZoneCombination) {
            this.putQueryParameter("MultiZoneCombination", multiZoneCombination);
            this.multiZoneCombination = multiZoneCombination;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PREPAY</strong>: subscription.</li>
         * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>POSTPAY</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing cycle of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Month</strong>: monthly billing.</li>
         * <li><strong>Year</strong>: yearly billing.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available and required when PayType is set to <strong>PREPAY</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * <p>The vSwitch ID of the primary zone for a multi-zone instance. The vSwitch must be in the zone specified by PrimaryZoneId. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6fdqa7c0pipnqzq****</p>
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * <p>The zone ID of the primary zone for a multi-zone instance. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-e</p>
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.putQueryParameter("PrimaryZoneId", primaryZoneId);
            this.primaryZoneId = primaryZoneId;
            return this;
        }

        /**
         * <p>The region ID of the instance. You can call <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> to query available regions. Use this parameter to specify the region in which to create the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2i6weeb4nfii</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The number of search index engine nodes of the instance. Valid values: <strong>0</strong> to <strong>60</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder solrNum(Integer solrNum) {
            this.putQueryParameter("SolrNum", solrNum);
            this.solrNum = solrNum;
            return this;
        }

        /**
         * <p>The search index engine node specifications of the instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
         * <li><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
         * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
         * <li><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB (dedicated).</li>
         * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
         * <li><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB (dedicated).</li>
         * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.xlarge</p>
         */
        public Builder solrSpec(String solrSpec) {
            this.putQueryParameter("SolrSpec", solrSpec);
            this.solrSpec = solrSpec;
            return this;
        }

        /**
         * <p>The vSwitch ID of the secondary zone for a multi-zone instance. The vSwitch must be in the zone specified by StandbyZoneId. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zec0kcn08cgdtr6****</p>
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * <p>The zone ID of the secondary zone for a multi-zone instance. <strong>To create a multi-zone instance, this parameter is required.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-f</p>
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.putQueryParameter("StandbyZoneId", standbyZoneId);
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        /**
         * <p>The number of stream engine nodes of the instance. Valid values: <strong>0</strong> to <strong>60</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder streamNum(Integer streamNum) {
            this.putQueryParameter("StreamNum", streamNum);
            this.streamNum = streamNum;
            return this;
        }

        /**
         * <p>The stream engine node specifications of the instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
         * <li><strong>lindorm.c.2xlarge</strong>: 8 cores, 16 GB (dedicated).</li>
         * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
         * <li><strong>lindorm.c.4xlarge</strong>: 16 cores, 32 GB (dedicated).</li>
         * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
         * <li><strong>lindorm.c.8xlarge</strong>: 32 cores, 64 GB (dedicated).</li>
         * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.xlarge</p>
         */
        public Builder streamSpec(String streamSpec) {
            this.putQueryParameter("StreamSpec", streamSpec);
            this.streamSpec = streamSpec;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The number of LindormTSDB engine nodes of the instance. Valid values:</p>
         * <ul>
         * <li>If the billing method of the instance is <strong>PREPAY</strong>, valid values are <strong>0</strong> to <strong>24</strong>.</li>
         * <li>If the billing method of the instance is <strong>POSTPAY</strong>, valid values are <strong>0</strong> to <strong>32</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder tsdbNum(Integer tsdbNum) {
            this.putQueryParameter("TsdbNum", tsdbNum);
            this.tsdbNum = tsdbNum;
            return this;
        }

        /**
         * <p>The LindormTSDB engine node specifications of the instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.g.xlarge</strong>: 4 cores, 16 GB (dedicated).</li>
         * <li><strong>lindorm.g.2xlarge</strong>: 8 cores, 32 GB (dedicated).</li>
         * <li><strong>lindorm.g.4xlarge</strong>: 16 cores, 64 GB (dedicated).</li>
         * <li><strong>lindorm.g.8xlarge</strong>: 32 cores, 128 GB (dedicated).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.xlarge</p>
         */
        public Builder tsdbSpec(String tsdbSpec) {
            this.putQueryParameter("TsdbSpec", tsdbSpec);
            this.tsdbSpec = tsdbSpec;
            return this;
        }

        /**
         * <p>The VPC ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1nme44gek34slfc****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1e7clcw529l773d****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai-f</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateLindormInstanceRequest build() {
            return new CreateLindormInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLindormInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateLindormInstanceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. Valid values of N: 1 to 20.</p>
             * <blockquote>
             * <p>You can specify multiple tag keys. For example, the Key in the first pair specifies the first tag key, and the Key in the second pair specifies the second tag key.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. Valid values of N: 1 to 20.</p>
             * <blockquote>
             * <p>You can specify multiple tag values. For example, the Value in the first pair specifies the first tag value, and the Value in the second pair specifies the second tag value.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
