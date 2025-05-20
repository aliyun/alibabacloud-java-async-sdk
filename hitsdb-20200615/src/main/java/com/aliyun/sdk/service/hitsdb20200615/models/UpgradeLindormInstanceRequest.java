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
 * {@link UpgradeLindormInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpgradeLindormInstanceRequest</p>
 */
public class UpgradeLindormInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterStorage")
    private Integer clusterStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdStorage")
    private Integer coldStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreSingleStorage")
    private Integer coreSingleStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilestoreNum")
    private Integer filestoreNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilestoreSpec")
    private String filestoreSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LindormNum")
    private Integer lindormNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LindormSpec")
    private String lindormSpec;

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
    @com.aliyun.core.annotation.NameInMap("LtsCoreNum")
    private Integer ltsCoreNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LtsCoreSpec")
    private String ltsCoreSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("StreamNum")
    private Integer streamNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamSpec")
    private String streamSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TsdbNum")
    private Integer tsdbNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TsdbSpec")
    private String tsdbSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpgradeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String upgradeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The storage capacity of the instance after it is upgraded. Unit: GB. Valid values: <strong>480</strong> to <strong>1017600</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>480</p>
         */
        public Builder clusterStorage(Integer clusterStorage) {
            this.putQueryParameter("ClusterStorage", clusterStorage);
            this.clusterStorage = clusterStorage;
            return this;
        }

        /**
         * <p>The cold storage capacity of the instance after it is upgraded. Unit: GB. Valid values: <strong>800</strong> to <strong>1000000</strong>.</p>
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
         * <p>The storage capacity of a single core node in the instance after the instance upgraded. This parameter is available only if the instance you want to upgrade is a multi-zone instance. Unit: GB. Valid values: 400 to 64000. <strong>This parameter is optional</strong>.</p>
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
         * <p>The number of LindormDFS nodes in the instance after the instance is upgraded. Valid values: integers from <strong>0</strong> to <strong>60</strong>.</p>
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
         * <p>The specification of LindormDFS nodes in the instance after the instance is upgraded. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.g.xlarge</strong>: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.2xlarge</strong>: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.4xlarge</strong>: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.8xlarge</strong>: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.xlarge</p>
         */
        public Builder filestoreSpec(String filestoreSpec) {
            this.putQueryParameter("FilestoreSpec", filestoreSpec);
            this.filestoreSpec = filestoreSpec;
            return this;
        }

        /**
         * <p>The ID of the instance that you want to upgrade, scale up, or enable cold storage. You can call the <a href="https://help.aliyun.com/document_detail/426069.html">GetLindormInstanceList</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp1o3y0yme2i2****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of LindormTable nodes in the instance after the instance is upgraded. Valid values: integers from <strong>0</strong> to <strong>90</strong>.</p>
         * <blockquote>
         * <p>This parameter must be specified together with the LindormSpec parameter.</p>
         * </blockquote>
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
         * <p>The specification of LindormTable nodes in the instance after the instance is upgraded. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.c.xlarge</strong>: Each node has 4 dedicated CPU cores and 8 GB of dedicated memory.</li>
         * <li><strong>lindorm.c.2xlarge</strong>: Each node has 8 dedicated CPU cores and 16 GB of dedicated memory.</li>
         * <li><strong>lindorm.c.4xlarge</strong>: Each node has 16 dedicated CPU cores and 32 GB of dedicated memory.</li>
         * <li><strong>lindorm.c.8xlarge</strong>: Each node has 32 dedicated CPU cores and 64 GB of dedicated memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.c.xlarge</p>
         */
        public Builder lindormSpec(String lindormSpec) {
            this.putQueryParameter("LindormSpec", lindormSpec);
            this.lindormSpec = lindormSpec;
            return this;
        }

        /**
         * <p>The number of log nodes in the instance after the instance is upgraded. This parameter is available only if the instance you want to upgrade is a multi-zone instance. <strong>This parameter is optional</strong>.</p>
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
         * <p>The storage capacity of a single log node in the instance after the instance upgraded. This parameter is available only if the instance you want to upgrade is a multi-zone instance. <strong>This parameter is optional</strong>.</p>
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
         * <p>The specification of log nodes in the instance after the instance is upgraded. This parameter is available only if the instance you want to upgrade is a multi-zone instance. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.sn1.large</strong>: Each node has 4 dedicated CPU cores and 8 GB of dedicated memory.</li>
         * <li><strong>lindorm.sn1.2xlarge</strong>: Each node has 8 dedicated CPU cores and 16 GB of dedicated memory.</li>
         * </ul>
         * <p><strong>This parameter is optional</strong>.</p>
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
         * <p>The number of LTS nodes in the instance after the instance is upgraded. Valid values: integers from <strong>0</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder ltsCoreNum(Integer ltsCoreNum) {
            this.putQueryParameter("LtsCoreNum", ltsCoreNum);
            this.ltsCoreNum = ltsCoreNum;
            return this;
        }

        /**
         * <p>The specification of Lindorm Tunnel Service (LTS) nodes in the instance after the instance is upgraded. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.g.xlarge</strong>: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.2xlarge</strong>: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lindorm.g.xlarge</p>
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
         * <p>The ID of the region in which the instance that you want to upgrade, scale up, or enable cold storage is located. You can call the <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The number of LindormSearch nodes in the instance after the instance is upgraded. Valid values: integers from <strong>0</strong> to <strong>60</strong>.</p>
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
         * <p>The specification of LindormSearch nodes in the instance after the instance is upgraded. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.g.xlarge</strong>: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.2xlarge</strong>: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.4xlarge</strong>: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.8xlarge</strong>: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</li>
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
         * <p>The number of LindormStream nodes in the instance after the instance is upgraded. Valid values: integers from <strong>0</strong> to <strong>60</strong>.</p>
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
         * <p>The specification of LindormStream nodes in the instance after the instance is upgraded. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.g.xlarge</strong>: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.2xlarge</strong>: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.4xlarge</strong>: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.8xlarge</strong>: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</li>
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
         * <p>The number of LindormTSDB nodes in the instance after the instance is upgraded. Valid values: integers from <strong>0</strong> to <strong>24</strong>.</p>
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
         * <p>The specification of LindormTSDB nodes in the instance after the instance is upgraded. Valid values:</p>
         * <ul>
         * <li><strong>lindorm.g.xlarge</strong>: Each node has 4 dedicated CPU cores and 16 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.2xlarge</strong>: Each node has 8 dedicated CPU cores and 32 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.4xlarge</strong>: Each node has 16 dedicated CPU cores and 64 GB of dedicated memory.</li>
         * <li><strong>lindorm.g.8xlarge</strong>: Each node has 32 dedicated CPU cores and 128 GB of dedicated memory.</li>
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
         * <p>The upgrade type of the operation. For more information about upgrade types, see the UpgradeType parameters section.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>upgrade-cold-storage</p>
         */
        public Builder upgradeType(String upgradeType) {
            this.putQueryParameter("UpgradeType", upgradeType);
            this.upgradeType = upgradeType;
            return this;
        }

        /**
         * <p>The ID of the zone in which the instance that you want to upgrade, scale up, or enable cold storage is located. You can call the <a href="https://help.aliyun.com/document_detail/426067.html">GetLindormInstance</a> operation to query the zone ID.</p>
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
        public UpgradeLindormInstanceRequest build() {
            return new UpgradeLindormInstanceRequest(this);
        } 

    } 

}
