// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLindormInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateLindormInstanceRequest</p>
 */
public class CreateLindormInstanceRequest extends Request {
    @Query
    @NameInMap("ArbiterVSwitchId")
    private String arbiterVSwitchId;

    @Query
    @NameInMap("ArbiterZoneId")
    private String arbiterZoneId;

    @Query
    @NameInMap("ArchVersion")
    private String archVersion;

    @Query
    @NameInMap("ColdStorage")
    private Integer coldStorage;

    @Query
    @NameInMap("CoreSingleStorage")
    private Integer coreSingleStorage;

    @Query
    @NameInMap("CoreSpec")
    private String coreSpec;

    @Query
    @NameInMap("DiskCategory")
    @Validation(required = true)
    private String diskCategory;

    @Query
    @NameInMap("Duration")
    private String duration;

    @Query
    @NameInMap("FilestoreNum")
    private Integer filestoreNum;

    @Query
    @NameInMap("FilestoreSpec")
    private String filestoreSpec;

    @Query
    @NameInMap("InstanceAlias")
    private String instanceAlias;

    @Query
    @NameInMap("InstanceStorage")
    private String instanceStorage;

    @Query
    @NameInMap("LindormNum")
    private Integer lindormNum;

    @Query
    @NameInMap("LindormSpec")
    private String lindormSpec;

    @Query
    @NameInMap("LogDiskCategory")
    private String logDiskCategory;

    @Query
    @NameInMap("LogNum")
    private Integer logNum;

    @Query
    @NameInMap("LogSingleStorage")
    private Integer logSingleStorage;

    @Query
    @NameInMap("LogSpec")
    private String logSpec;

    @Query
    @NameInMap("MultiZoneCombination")
    private String multiZoneCombination;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    @Validation(minimum = 1)
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("PrimaryVSwitchId")
    private String primaryVSwitchId;

    @Query
    @NameInMap("PrimaryZoneId")
    private String primaryZoneId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    @Validation(minimum = 1)
    private Long resourceOwnerId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SolrNum")
    private Integer solrNum;

    @Query
    @NameInMap("SolrSpec")
    private String solrSpec;

    @Query
    @NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    @Query
    @NameInMap("StandbyZoneId")
    private String standbyZoneId;

    @Query
    @NameInMap("StreamNum")
    private Integer streamNum;

    @Query
    @NameInMap("StreamSpec")
    private String streamSpec;

    @Query
    @NameInMap("TsdbNum")
    private Integer tsdbNum;

    @Query
    @NameInMap("TsdbSpec")
    private String tsdbSpec;

    @Query
    @NameInMap("VPCId")
    @Validation(required = true)
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private CreateLindormInstanceRequest(Builder builder) {
        super(builder);
        this.arbiterVSwitchId = builder.arbiterVSwitchId;
        this.arbiterZoneId = builder.arbiterZoneId;
        this.archVersion = builder.archVersion;
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
            this.tsdbNum = request.tsdbNum;
            this.tsdbSpec = request.tsdbSpec;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * ArbiterVSwitchId.
         */
        public Builder arbiterVSwitchId(String arbiterVSwitchId) {
            this.putQueryParameter("ArbiterVSwitchId", arbiterVSwitchId);
            this.arbiterVSwitchId = arbiterVSwitchId;
            return this;
        }

        /**
         * ArbiterZoneId.
         */
        public Builder arbiterZoneId(String arbiterZoneId) {
            this.putQueryParameter("ArbiterZoneId", arbiterZoneId);
            this.arbiterZoneId = arbiterZoneId;
            return this;
        }

        /**
         * ArchVersion.
         */
        public Builder archVersion(String archVersion) {
            this.putQueryParameter("ArchVersion", archVersion);
            this.archVersion = archVersion;
            return this;
        }

        /**
         * ColdStorage.
         */
        public Builder coldStorage(Integer coldStorage) {
            this.putQueryParameter("ColdStorage", coldStorage);
            this.coldStorage = coldStorage;
            return this;
        }

        /**
         * CoreSingleStorage.
         */
        public Builder coreSingleStorage(Integer coreSingleStorage) {
            this.putQueryParameter("CoreSingleStorage", coreSingleStorage);
            this.coreSingleStorage = coreSingleStorage;
            return this;
        }

        /**
         * CoreSpec.
         */
        public Builder coreSpec(String coreSpec) {
            this.putQueryParameter("CoreSpec", coreSpec);
            this.coreSpec = coreSpec;
            return this;
        }

        /**
         * DiskCategory.
         */
        public Builder diskCategory(String diskCategory) {
            this.putQueryParameter("DiskCategory", diskCategory);
            this.diskCategory = diskCategory;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * FilestoreNum.
         */
        public Builder filestoreNum(Integer filestoreNum) {
            this.putQueryParameter("FilestoreNum", filestoreNum);
            this.filestoreNum = filestoreNum;
            return this;
        }

        /**
         * FilestoreSpec.
         */
        public Builder filestoreSpec(String filestoreSpec) {
            this.putQueryParameter("FilestoreSpec", filestoreSpec);
            this.filestoreSpec = filestoreSpec;
            return this;
        }

        /**
         * InstanceAlias.
         */
        public Builder instanceAlias(String instanceAlias) {
            this.putQueryParameter("InstanceAlias", instanceAlias);
            this.instanceAlias = instanceAlias;
            return this;
        }

        /**
         * InstanceStorage.
         */
        public Builder instanceStorage(String instanceStorage) {
            this.putQueryParameter("InstanceStorage", instanceStorage);
            this.instanceStorage = instanceStorage;
            return this;
        }

        /**
         * LindormNum.
         */
        public Builder lindormNum(Integer lindormNum) {
            this.putQueryParameter("LindormNum", lindormNum);
            this.lindormNum = lindormNum;
            return this;
        }

        /**
         * LindormSpec.
         */
        public Builder lindormSpec(String lindormSpec) {
            this.putQueryParameter("LindormSpec", lindormSpec);
            this.lindormSpec = lindormSpec;
            return this;
        }

        /**
         * LogDiskCategory.
         */
        public Builder logDiskCategory(String logDiskCategory) {
            this.putQueryParameter("LogDiskCategory", logDiskCategory);
            this.logDiskCategory = logDiskCategory;
            return this;
        }

        /**
         * LogNum.
         */
        public Builder logNum(Integer logNum) {
            this.putQueryParameter("LogNum", logNum);
            this.logNum = logNum;
            return this;
        }

        /**
         * LogSingleStorage.
         */
        public Builder logSingleStorage(Integer logSingleStorage) {
            this.putQueryParameter("LogSingleStorage", logSingleStorage);
            this.logSingleStorage = logSingleStorage;
            return this;
        }

        /**
         * LogSpec.
         */
        public Builder logSpec(String logSpec) {
            this.putQueryParameter("LogSpec", logSpec);
            this.logSpec = logSpec;
            return this;
        }

        /**
         * MultiZoneCombination.
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * PrimaryVSwitchId.
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * PrimaryZoneId.
         */
        public Builder primaryZoneId(String primaryZoneId) {
            this.putQueryParameter("PrimaryZoneId", primaryZoneId);
            this.primaryZoneId = primaryZoneId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
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
         * SolrNum.
         */
        public Builder solrNum(Integer solrNum) {
            this.putQueryParameter("SolrNum", solrNum);
            this.solrNum = solrNum;
            return this;
        }

        /**
         * SolrSpec.
         */
        public Builder solrSpec(String solrSpec) {
            this.putQueryParameter("SolrSpec", solrSpec);
            this.solrSpec = solrSpec;
            return this;
        }

        /**
         * StandbyVSwitchId.
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        /**
         * StandbyZoneId.
         */
        public Builder standbyZoneId(String standbyZoneId) {
            this.putQueryParameter("StandbyZoneId", standbyZoneId);
            this.standbyZoneId = standbyZoneId;
            return this;
        }

        /**
         * 实例的流引擎节点数量，取值：**0**~**60**。
         */
        public Builder streamNum(Integer streamNum) {
            this.putQueryParameter("StreamNum", streamNum);
            this.streamNum = streamNum;
            return this;
        }

        /**
         * 实例的流引擎节点规格，取值：
         * <p>
         * 
         * - **lindorm.g.xlarge**：表示4核16GB（独享规格）。
         * - **lindorm.c.2xlarge**：表示8核16GB（独享规格）。
         * - **lindorm.g.2xlarge**：表示8核32GB（独享规格）。
         * - **lindorm.c.4xlarge**：表示16核32GB（独享规格）。
         * - **lindorm.g.4xlarge**：表示16核64GB（独享规格）。
         * - **lindorm.c.8xlarge**：表示32核64GB（独享规格）。
         * - **lindorm.g.8xlarge**：表示32核128GB（独享规格）。
         */
        public Builder streamSpec(String streamSpec) {
            this.putQueryParameter("StreamSpec", streamSpec);
            this.streamSpec = streamSpec;
            return this;
        }

        /**
         * TsdbNum.
         */
        public Builder tsdbNum(Integer tsdbNum) {
            this.putQueryParameter("TsdbNum", tsdbNum);
            this.tsdbNum = tsdbNum;
            return this;
        }

        /**
         * TsdbSpec.
         */
        public Builder tsdbSpec(String tsdbSpec) {
            this.putQueryParameter("TsdbSpec", tsdbSpec);
            this.tsdbSpec = tsdbSpec;
            return this;
        }

        /**
         * VPCId.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * ZoneId.
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

}
