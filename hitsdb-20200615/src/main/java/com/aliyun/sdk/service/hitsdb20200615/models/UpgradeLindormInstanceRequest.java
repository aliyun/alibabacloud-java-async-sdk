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
    @NameInMap("CoreSingleStorage")
    private Integer coreSingleStorage;

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
    @NameInMap("LogNum")
    private Integer logNum;

    @Query
    @NameInMap("LogSingleStorage")
    private Integer logSingleStorage;

    @Query
    @NameInMap("LogSpec")
    private String logSpec;

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
        this.coreSingleStorage = builder.coreSingleStorage;
        this.filestoreNum = builder.filestoreNum;
        this.filestoreSpec = builder.filestoreSpec;
        this.instanceId = builder.instanceId;
        this.lindormNum = builder.lindormNum;
        this.lindormSpec = builder.lindormSpec;
        this.logNum = builder.logNum;
        this.logSingleStorage = builder.logSingleStorage;
        this.logSpec = builder.logSpec;
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
        this.streamNum = builder.streamNum;
        this.streamSpec = builder.streamSpec;
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
     * @return coreSingleStorage
     */
    public Integer getCoreSingleStorage() {
        return this.coreSingleStorage;
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
        private Integer coreSingleStorage; 
        private Integer filestoreNum; 
        private String filestoreSpec; 
        private String instanceId; 
        private Integer lindormNum; 
        private String lindormSpec; 
        private Integer logNum; 
        private Integer logSingleStorage; 
        private String logSpec; 
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
        private Integer streamNum; 
        private String streamSpec; 
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
            this.coreSingleStorage = request.coreSingleStorage;
            this.filestoreNum = request.filestoreNum;
            this.filestoreSpec = request.filestoreSpec;
            this.instanceId = request.instanceId;
            this.lindormNum = request.lindormNum;
            this.lindormSpec = request.lindormSpec;
            this.logNum = request.logNum;
            this.logSingleStorage = request.logSingleStorage;
            this.logSpec = request.logSpec;
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
            this.streamNum = request.streamNum;
            this.streamSpec = request.streamSpec;
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
         * CoreSingleStorage.
         */
        public Builder coreSingleStorage(Integer coreSingleStorage) {
            this.putQueryParameter("CoreSingleStorage", coreSingleStorage);
            this.coreSingleStorage = coreSingleStorage;
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
         * 变配后实例的流引擎节点数量，取值：**0**~**90**。
         */
        public Builder streamNum(Integer streamNum) {
            this.putQueryParameter("StreamNum", streamNum);
            this.streamNum = streamNum;
            return this;
        }

        /**
         * 变配后实例的流引擎节点规格，取值：
         * <p>
         * 
         * - **lindorm.c.2xlarge**：表示8核16GB（独享规格）。
         * - **lindorm.c.4xlarge**：表示16核32GB（独享规格）。
         * - **lindorm.c.8xlarge**：表示32核64GB（独享规格）。
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
