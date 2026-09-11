// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ModifyDtsJobEndpointRequest} extends {@link RequestModel}
 *
 * <p>ModifyDtsJobEndpointRequest</p>
 */
public class ModifyDtsJobEndpointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunUid")
    private String aliyunUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsInstanceId")
    private String dtsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DtsJobId")
    private String dtsJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointInstanceId")
    private String endpointInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointInstanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointIp")
    private String endpointIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointPort")
    private String endpointPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointPrimaryVswId")
    private String endpointPrimaryVswId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointRegionId")
    private String endpointRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointSecondaryVswId")
    private String endpointSecondaryVswId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointVpcId")
    private String endpointVpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyAccount")
    private Boolean modifyAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardPassword")
    private String shardPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShardUsername")
    private String shardUsername;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    private String username;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZeroEtlJob")
    private Boolean zeroEtlJob;

    private ModifyDtsJobEndpointRequest(Builder builder) {
        super(builder);
        this.aliyunUid = builder.aliyunUid;
        this.database = builder.database;
        this.dryRun = builder.dryRun;
        this.dtsInstanceId = builder.dtsInstanceId;
        this.dtsJobId = builder.dtsJobId;
        this.endpoint = builder.endpoint;
        this.endpointInstanceId = builder.endpointInstanceId;
        this.endpointInstanceType = builder.endpointInstanceType;
        this.endpointIp = builder.endpointIp;
        this.endpointPort = builder.endpointPort;
        this.endpointPrimaryVswId = builder.endpointPrimaryVswId;
        this.endpointRegionId = builder.endpointRegionId;
        this.endpointSecondaryVswId = builder.endpointSecondaryVswId;
        this.endpointVpcId = builder.endpointVpcId;
        this.modifyAccount = builder.modifyAccount;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.roleName = builder.roleName;
        this.shardPassword = builder.shardPassword;
        this.shardUsername = builder.shardUsername;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.username = builder.username;
        this.zeroEtlJob = builder.zeroEtlJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDtsJobEndpointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunUid
     */
    public String getAliyunUid() {
        return this.aliyunUid;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return dtsInstanceId
     */
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    /**
     * @return dtsJobId
     */
    public String getDtsJobId() {
        return this.dtsJobId;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return endpointInstanceId
     */
    public String getEndpointInstanceId() {
        return this.endpointInstanceId;
    }

    /**
     * @return endpointInstanceType
     */
    public String getEndpointInstanceType() {
        return this.endpointInstanceType;
    }

    /**
     * @return endpointIp
     */
    public String getEndpointIp() {
        return this.endpointIp;
    }

    /**
     * @return endpointPort
     */
    public String getEndpointPort() {
        return this.endpointPort;
    }

    /**
     * @return endpointPrimaryVswId
     */
    public String getEndpointPrimaryVswId() {
        return this.endpointPrimaryVswId;
    }

    /**
     * @return endpointRegionId
     */
    public String getEndpointRegionId() {
        return this.endpointRegionId;
    }

    /**
     * @return endpointSecondaryVswId
     */
    public String getEndpointSecondaryVswId() {
        return this.endpointSecondaryVswId;
    }

    /**
     * @return endpointVpcId
     */
    public String getEndpointVpcId() {
        return this.endpointVpcId;
    }

    /**
     * @return modifyAccount
     */
    public Boolean getModifyAccount() {
        return this.modifyAccount;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
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
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    /**
     * @return shardPassword
     */
    public String getShardPassword() {
        return this.shardPassword;
    }

    /**
     * @return shardUsername
     */
    public String getShardUsername() {
        return this.shardUsername;
    }

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * @return zeroEtlJob
     */
    public Boolean getZeroEtlJob() {
        return this.zeroEtlJob;
    }

    public static final class Builder extends Request.Builder<ModifyDtsJobEndpointRequest, Builder> {
        private String aliyunUid; 
        private String database; 
        private Boolean dryRun; 
        private String dtsInstanceId; 
        private String dtsJobId; 
        private String endpoint; 
        private String endpointInstanceId; 
        private String endpointInstanceType; 
        private String endpointIp; 
        private String endpointPort; 
        private String endpointPrimaryVswId; 
        private String endpointRegionId; 
        private String endpointSecondaryVswId; 
        private String endpointVpcId; 
        private Boolean modifyAccount; 
        private String password; 
        private String regionId; 
        private String resourceGroupId; 
        private String roleName; 
        private String shardPassword; 
        private String shardUsername; 
        private String synchronizationDirection; 
        private String username; 
        private Boolean zeroEtlJob; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDtsJobEndpointRequest request) {
            super(request);
            this.aliyunUid = request.aliyunUid;
            this.database = request.database;
            this.dryRun = request.dryRun;
            this.dtsInstanceId = request.dtsInstanceId;
            this.dtsJobId = request.dtsJobId;
            this.endpoint = request.endpoint;
            this.endpointInstanceId = request.endpointInstanceId;
            this.endpointInstanceType = request.endpointInstanceType;
            this.endpointIp = request.endpointIp;
            this.endpointPort = request.endpointPort;
            this.endpointPrimaryVswId = request.endpointPrimaryVswId;
            this.endpointRegionId = request.endpointRegionId;
            this.endpointSecondaryVswId = request.endpointSecondaryVswId;
            this.endpointVpcId = request.endpointVpcId;
            this.modifyAccount = request.modifyAccount;
            this.password = request.password;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.roleName = request.roleName;
            this.shardPassword = request.shardPassword;
            this.shardUsername = request.shardUsername;
            this.synchronizationDirection = request.synchronizationDirection;
            this.username = request.username;
            this.zeroEtlJob = request.zeroEtlJob;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account that owns the database instance.</p>
         * <blockquote>
         * <p>Specifying this parameter indicates cross-account data synchronization. You must also specify the <strong>RoleName</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>150780020300****</p>
         */
        public Builder aliyunUid(String aliyunUid) {
            this.putQueryParameter("AliyunUid", aliyunUid);
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * <p>The database name when the database type is <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, or <strong>AnalyticDB PostgreSQL</strong>. The authentication database name when the database type is <strong>MongoDB</strong>.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the database type is <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, <strong>AnalyticDB PostgreSQL</strong>, or <strong>MongoDB</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes. After the dry run succeeds, the instance is not modified.</li>
         * <li><strong>false</strong> (default): No. After the dry run succeeds, the database instance of the DTS task is modified and the task runs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the DTS instance.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, you must specify <strong>DtsJobId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtsaw012y2g15q****</p>
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * <p>The ID of the DTS task. You can call <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a> to query the task ID.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, you must specify <strong>DtsInstanceId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>m4312mab158****</p>
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * <p>The database instance to be modified. Valid values:</p>
         * <ul>
         * <li><strong>src</strong>: source instance.</li>
         * <li><strong>dest</strong>: destination instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>src</p>
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp10k50h8374w****</p>
         */
        public Builder endpointInstanceId(String endpointInstanceId) {
            this.putQueryParameter("EndpointInstanceId", endpointInstanceId);
            this.endpointInstanceId = endpointInstanceId;
            return this;
        }

        /**
         * <p>The type of the database instance. Valid values:</p>
         * <ul>
         * <li><strong>rds</strong>: ApsaraDB RDS for MySQL or ApsaraDB RDS for PostgreSQL.</li>
         * <li><strong>polardb</strong>: PolarDB for MySQL or PolarDB for PostgreSQL.</li>
         * <li><strong>mongodb</strong>: when used as the source, ApsaraDB for MongoDB (replica set architecture). When used as the destination, ApsaraDB for MongoDB (replica set or sharded cluster architecture).</li>
         * <li><strong>distributed_mongodb</strong>: supported only as the source of a distributed instance. Indicates ApsaraDB for MongoDB (sharded cluster architecture).</li>
         * </ul>
         * <blockquote>
         * <p>The incremental node of a distributed instance must obtain data changes from the source through Oplog.</p>
         * </blockquote>
         * <ul>
         * <li><strong>greenplum</strong>: cloud-native data warehouse AnalyticDB for PostgreSQL.</li>
         * <li><strong>kafka</strong>: ApsaraMQ for Kafka.</li>
         * <li><strong>ecs</strong>: self-managed database on an ECS instance (only supported database types).</li>
         * <li><strong>express</strong>: database connected over Express Connect (only supported database types).</li>
         * <li><strong>other</strong>: database connected over the Internet (only supported database types).</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Currently supported database types include <strong>MySQL</strong>, <strong>PolarDB for MySQL</strong>, <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, <strong>MongoDB</strong>, <strong>Kafka</strong>, and <strong>AnalyticDB PostgreSQL</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If the database is MongoDB (sharded cluster), the number of shards in the new database must be the same as that in the original MongoDB (sharded cluster).</li>
         * <li>If the source instance is to be modified and the database type is <strong>PostgreSQL</strong>, make sure that the latency of the DTS instance is less than 30 seconds and stop writing data to the source. Otherwise, inconsistent data may occur.</li>
         * <li>The parameter values are case-insensitive.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder endpointInstanceType(String endpointInstanceType) {
            this.putQueryParameter("EndpointInstanceType", endpointInstanceType);
            this.endpointInstanceType = endpointInstanceType;
            return this;
        }

        /**
         * <p>The IP address of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>172.168.XX.XXX</p>
         */
        public Builder endpointIp(String endpointIp) {
            this.putQueryParameter("EndpointIp", endpointIp);
            this.endpointIp = endpointIp;
            return this;
        }

        /**
         * <p>The port of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder endpointPort(String endpointPort) {
            this.putQueryParameter("EndpointPort", endpointPort);
            this.endpointPort = endpointPort;
            return this;
        }

        /**
         * <p>The primary vSwitch for Express Connect access.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1w7gscw7pky*******</p>
         */
        public Builder endpointPrimaryVswId(String endpointPrimaryVswId) {
            this.putQueryParameter("EndpointPrimaryVswId", endpointPrimaryVswId);
            this.endpointPrimaryVswId = endpointPrimaryVswId;
            return this;
        }

        /**
         * <p>The region to which the database instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder endpointRegionId(String endpointRegionId) {
            this.putQueryParameter("EndpointRegionId", endpointRegionId);
            this.endpointRegionId = endpointRegionId;
            return this;
        }

        /**
         * <p>The secondary vSwitch for Express Connect access.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1ud8e2mhw*****</p>
         */
        public Builder endpointSecondaryVswId(String endpointSecondaryVswId) {
            this.putQueryParameter("EndpointSecondaryVswId", endpointSecondaryVswId);
            this.endpointSecondaryVswId = endpointSecondaryVswId;
            return this;
        }

        /**
         * <p>The VPC ID for Express Connect access.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1q00qitocaem****</p>
         */
        public Builder endpointVpcId(String endpointVpcId) {
            this.putQueryParameter("EndpointVpcId", endpointVpcId);
            this.endpointVpcId = endpointVpcId;
            return this;
        }

        /**
         * <p>Specifies whether to modify the account and password. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong> (default): No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder modifyAccount(Boolean modifyAccount) {
            this.putQueryParameter("ModifyAccount", modifyAccount);
            this.modifyAccount = modifyAccount;
            return this;
        }

        /**
         * <p>The database password.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>DTStest****</p>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The region to which the DTS instance belongs.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The name of the RAM role for cross-account access.</p>
         * <blockquote>
         * <p>Specify this parameter when performing cross-account data synchronization. For the required permissions and authorization method of this role, see <a href="https://help.aliyun.com/document_detail/48468.html">Configure RAM authorization for cross-account data migration or synchronization</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ram-for-dts</p>
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * <p>The password of the shard in the MongoDB sharded cluster instance.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required only when the source database instance is ApsaraDB for MongoDB (sharded cluster architecture).</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter takes effect only when <strong>ModifyAccount</strong> is set to <strong>true</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DTStest****</p>
         */
        public Builder shardPassword(String shardPassword) {
            this.putQueryParameter("ShardPassword", shardPassword);
            this.shardPassword = shardPassword;
            return this;
        }

        /**
         * <p>The account of the shard in the MongoDB sharded cluster instance.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required only when the source database instance is ApsaraDB for MongoDB (sharded cluster architecture).</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>This parameter takes effect only when <strong>ModifyAccount</strong> is set to <strong>true</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shard</p>
         */
        public Builder shardUsername(String shardUsername) {
            this.putQueryParameter("ShardUsername", shardUsername);
            this.shardUsername = shardUsername;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong> (default): forward.</li>
         * <li><strong>Reverse</strong>: reverse.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * <p>The database account.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dtstest</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        /**
         * <p>Specifies whether this is a seamless integration (zero-ETL) node. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder zeroEtlJob(Boolean zeroEtlJob) {
            this.putQueryParameter("ZeroEtlJob", zeroEtlJob);
            this.zeroEtlJob = zeroEtlJob;
            return this;
        }

        @Override
        public ModifyDtsJobEndpointRequest build() {
            return new ModifyDtsJobEndpointRequest(this);
        } 

    } 

}
