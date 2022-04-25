// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeLindormInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpgradeLindormInstanceRequest</p>
 */
public class UpgradeLindormInstanceRequest extends Request {
    @Query
    @NameInMap("ClusterStorage")
    private Integer clusterStorage;

    @Query
    @NameInMap("ColdStorage")
    private Integer coldStorage;

    @Query
    @NameInMap("CoreNum")
    private Integer coreNum;

    @Query
    @NameInMap("CoreSpec")
    private String coreSpec;

    @Query
    @NameInMap("FilestoreNum")
    private Integer filestoreNum;

    @Query
    @NameInMap("FilestoreSpec")
    private String filestoreSpec;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("LindormNum")
    private Integer lindormNum;

    @Query
    @NameInMap("LindormSpec")
    private String lindormSpec;

    @Query
    @NameInMap("LtsCoreNum")
    private Integer ltsCoreNum;

    @Query
    @NameInMap("LtsCoreSpec")
    private String ltsCoreSpec;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    @Validation(minimum = 1)
    private Long ownerId;

    @Query
    @NameInMap("PhoenixCoreNum")
    private Integer phoenixCoreNum;

    @Query
    @NameInMap("PhoenixCoreSpec")
    private String phoenixCoreSpec;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
    @NameInMap("TsdbNum")
    private Integer tsdbNum;

    @Query
    @NameInMap("TsdbSpec")
    private String tsdbSpec;

    @Query
    @NameInMap("UpgradeType")
    @Validation(required = true)
    private String upgradeType;

    @Query
    @NameInMap("ZoneId")
    @Validation(required = true)
    private String zoneId;

    private UpgradeLindormInstanceRequest(Builder builder) {
        super(builder);
        this.clusterStorage = builder.clusterStorage;
        this.coldStorage = builder.coldStorage;
        this.coreNum = builder.coreNum;
        this.coreSpec = builder.coreSpec;
        this.filestoreNum = builder.filestoreNum;
        this.filestoreSpec = builder.filestoreSpec;
        this.instanceId = builder.instanceId;
        this.lindormNum = builder.lindormNum;
        this.lindormSpec = builder.lindormSpec;
        this.ltsCoreNum = builder.ltsCoreNum;
        this.ltsCoreSpec = builder.ltsCoreSpec;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.phoenixCoreNum = builder.phoenixCoreNum;
        this.phoenixCoreSpec = builder.phoenixCoreSpec;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityToken = builder.securityToken;
        this.solrNum = builder.solrNum;
        this.solrSpec = builder.solrSpec;
        this.tsdbNum = builder.tsdbNum;
        this.tsdbSpec = builder.tsdbSpec;
        this.upgradeType = builder.upgradeType;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeLindormInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterStorage
     */
    public Integer getClusterStorage() {
        return this.clusterStorage;
    }

    /**
     * @return coldStorage
     */
    public Integer getColdStorage() {
        return this.coldStorage;
    }

    /**
     * @return coreNum
     */
    public Integer getCoreNum() {
        return this.coreNum;
    }

    /**
     * @return coreSpec
     */
    public String getCoreSpec() {
        return this.coreSpec;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return ltsCoreNum
     */
    public Integer getLtsCoreNum() {
        return this.ltsCoreNum;
    }

    /**
     * @return ltsCoreSpec
     */
    public String getLtsCoreSpec() {
        return this.ltsCoreSpec;
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
     * @return phoenixCoreNum
     */
    public Integer getPhoenixCoreNum() {
        return this.phoenixCoreNum;
    }

    /**
     * @return phoenixCoreSpec
     */
    public String getPhoenixCoreSpec() {
        return this.phoenixCoreSpec;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return upgradeType
     */
    public String getUpgradeType() {
        return this.upgradeType;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<UpgradeLindormInstanceRequest, Builder> {
        private Integer clusterStorage; 
        private Integer coldStorage; 
        private Integer coreNum; 
        private String coreSpec; 
        private Integer filestoreNum; 
        private String filestoreSpec; 
        private String instanceId; 
        private Integer lindormNum; 
        private String lindormSpec; 
        private Integer ltsCoreNum; 
        private String ltsCoreSpec; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer phoenixCoreNum; 
        private String phoenixCoreSpec; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityToken; 
        private Integer solrNum; 
        private String solrSpec; 
        private Integer tsdbNum; 
        private String tsdbSpec; 
        private String upgradeType; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeLindormInstanceRequest request) {
            super(request);
            this.clusterStorage = request.clusterStorage;
            this.coldStorage = request.coldStorage;
            this.coreNum = request.coreNum;
            this.coreSpec = request.coreSpec;
            this.filestoreNum = request.filestoreNum;
            this.filestoreSpec = request.filestoreSpec;
            this.instanceId = request.instanceId;
            this.lindormNum = request.lindormNum;
            this.lindormSpec = request.lindormSpec;
            this.ltsCoreNum = request.ltsCoreNum;
            this.ltsCoreSpec = request.ltsCoreSpec;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.phoenixCoreNum = request.phoenixCoreNum;
            this.phoenixCoreSpec = request.phoenixCoreSpec;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityToken = request.securityToken;
            this.solrNum = request.solrNum;
            this.solrSpec = request.solrSpec;
            this.tsdbNum = request.tsdbNum;
            this.tsdbSpec = request.tsdbSpec;
            this.upgradeType = request.upgradeType;
            this.zoneId = request.zoneId;
        } 

        /**
         * ClusterStorage.
         */
        public Builder clusterStorage(Integer clusterStorage) {
            this.putQueryParameter("ClusterStorage", clusterStorage);
            this.clusterStorage = clusterStorage;
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
         * CoreNum.
         */
        public Builder coreNum(Integer coreNum) {
            this.putQueryParameter("CoreNum", coreNum);
            this.coreNum = coreNum;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * LtsCoreNum.
         */
        public Builder ltsCoreNum(Integer ltsCoreNum) {
            this.putQueryParameter("LtsCoreNum", ltsCoreNum);
            this.ltsCoreNum = ltsCoreNum;
            return this;
        }

        /**
         * LtsCoreSpec.
         */
        public Builder ltsCoreSpec(String ltsCoreSpec) {
            this.putQueryParameter("LtsCoreSpec", ltsCoreSpec);
            this.ltsCoreSpec = ltsCoreSpec;
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
         * PhoenixCoreNum.
         */
        public Builder phoenixCoreNum(Integer phoenixCoreNum) {
            this.putQueryParameter("PhoenixCoreNum", phoenixCoreNum);
            this.phoenixCoreNum = phoenixCoreNum;
            return this;
        }

        /**
         * PhoenixCoreSpec.
         */
        public Builder phoenixCoreSpec(String phoenixCoreSpec) {
            this.putQueryParameter("PhoenixCoreSpec", phoenixCoreSpec);
            this.phoenixCoreSpec = phoenixCoreSpec;
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
         * UpgradeType.
         */
        public Builder upgradeType(String upgradeType) {
            this.putQueryParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
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
        public UpgradeLindormInstanceRequest build() {
            return new UpgradeLindormInstanceRequest(this);
        } 

    } 

}
