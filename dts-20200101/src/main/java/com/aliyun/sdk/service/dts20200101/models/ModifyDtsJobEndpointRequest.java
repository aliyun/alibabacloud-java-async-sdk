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
    @com.aliyun.core.annotation.NameInMap("EndpointRegionId")
    private String endpointRegionId;

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
        this.endpointRegionId = builder.endpointRegionId;
        this.modifyAccount = builder.modifyAccount;
        this.password = builder.password;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.roleName = builder.roleName;
        this.shardPassword = builder.shardPassword;
        this.shardUsername = builder.shardUsername;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.username = builder.username;
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
     * @return endpointRegionId
     */
    public String getEndpointRegionId() {
        return this.endpointRegionId;
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
        private String endpointRegionId; 
        private Boolean modifyAccount; 
        private String password; 
        private String regionId; 
        private String resourceGroupId; 
        private String roleName; 
        private String shardPassword; 
        private String shardUsername; 
        private String synchronizationDirection; 
        private String username; 

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
            this.endpointRegionId = request.endpointRegionId;
            this.modifyAccount = request.modifyAccount;
            this.password = request.password;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.roleName = request.roleName;
            this.shardPassword = request.shardPassword;
            this.shardUsername = request.shardUsername;
            this.synchronizationDirection = request.synchronizationDirection;
            this.username = request.username;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account (primary account) to which the database instance belongs.</p>
         * <blockquote>
         * <p> Passing this parameter indicates that cross-Alibaba Cloud account data synchronization will be performed, and you also need to pass the <strong>RoleName</strong> parameter.</p>
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
         * <p>When the database type is <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, or <strong>AnalyticDB PostgreSQL</strong>, it represents the database name; when the database type is <strong>MongoDB</strong>, it represents the authentication database name.</p>
         * <blockquote>
         * <p>This parameter is only available and must be provided when the database type is <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, <strong>AnalyticDB PostgreSQL</strong>, or <strong>MongoDB</strong>.</p>
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
         * <p>Specifies whether to perform only a precheck. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes. After the precheck is passed, the database is not changed.</li>
         * <li><strong>false</strong> (default): No. After the precheck is passed, the system changes the original database of the DTS task and runs the task.</li>
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
         * <p>The ID of the DTS instance. If this parameter is not provided, <strong>DtsJobId</strong> must be specified.</p>
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
         * <p>DTS job ID, which can be queried by calling <a href="https://help.aliyun.com/document_detail/209702.html">DescribeDtsJobs</a>.</p>
         * <blockquote>
         * <p>If this parameter is not provided, <strong>DtsInstanceId</strong> must be filled in.</p>
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
         * <p>The database instance to be modified, with values:</p>
         * <ul>
         * <li><strong>src</strong>: Source database instance. - <strong>dest</strong>: Target database instance.</li>
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
         * <p>ID of the database instance.</p>
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
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li><strong>rds</strong>: ApsaraDB RDS for MySQL instance, ApsaraDB RDS for SQL Server instance, or ApsaraDB RDS for PostgreSQL instance.</li>
         * <li><strong>polardb</strong>: PolarDB for MySQL cluster or PolarDB for PostgreSQL cluster.</li>
         * <li><strong>mongodb</strong>: ApsaraDB for MongoDB replica set instance.</li>
         * <li><strong>distributed_mongodb</strong>: ApsaraDB for MongoDB sharded cluster instance.</li>
         * <li><strong>greenplum</strong>: AnalyticDB for PostgreSQL instance.</li>
         * <li><strong>kafka</strong>: ApsaraMQ for Kafka instance.</li>
         * <li><strong>ecs</strong>: self-managed database that is hosted on an Elastic Compute Service (ECS) instance. If you set this parameter to ecs, the database must be the supported one.</li>
         * <li><strong>express</strong>: database that is connected over Express Connect. If you set this parameter to express, the database must be the supported one.</li>
         * <li><strong>other</strong>: database that is connected over Internet. If you set this parameter to other, the database must be the supported one.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The following types of databases are supported: <strong>MySQL</strong>, <strong>PolarDB for MySQL</strong>, <strong>PostgreSQL</strong>, <strong>PolarDB for PostgreSQL</strong>, <strong>MongoDB</strong>, <strong>SQL Server</strong>, <strong>Kafka</strong>, and <strong>AnalyticDB for PostgreSQL</strong>.</p>
         * </li>
         * <li><p>If the original database is an ApsaraDB for MongoDB sharded cluster instance, the new database must have the same number of shards as the original database.</p>
         * </li>
         * <li><p>If the database that you want to change is a source <strong>PostgreSQL</strong> database, you must make sure that the latency of the DTS instance is less than 30 seconds and no data is written to the source database during the change. Otherwise, data inconsistency may occur.</p>
         * </li>
         * <li><p>The value of this parameter is case-insensitive.</p>
         * </li>
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
         * <p>The IP of the database instance.</p>
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
         * <p>port of the database instance.</p>
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
         * <p>The ID of the region in which the database resides.</p>
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
         * <p>Specifies whether to change the password of the database account. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
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
         * <p>The password of the database account.</p>
         * <blockquote>
         * <p> This parameter is valid only if <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
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
         * <p>The ID of the region in which the DTS instance resides.</p>
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
         * <p>Resource group ID.</p>
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
         * <p>Cross Alibaba Cloud account role name. When performing data synchronization across Alibaba Cloud accounts, this parameter must be passed. For the required permissions and authorization methods for this role, please refer to <a href="https://help.aliyun.com/document_detail/48468.html">How to Configure RAM Authorization for Cross-Account Data Migration or Synchronization</a>.</p>
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
         * <p>The account password of the shard of the ApsaraDB for MongoDB sharded cluster instance.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is valid and required only if the source database is an ApsaraDB for MongoDB sharded cluster instance.</p>
         * </li>
         * <li><p>This parameter is valid only if <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
         * </li>
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
         * <p>The account username of the shard of the ApsaraDB for MongoDB sharded cluster instance.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is valid and required only if the source database is an ApsaraDB for MongoDB sharded cluster instance.</p>
         * </li>
         * <li><p>This parameter is valid only if <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
         * </li>
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
         * <p>Synchronization direction, with values:</p>
         * <ul>
         * <li><strong>Forward</strong> (default): Forward. - <strong>Reverse</strong>: Reverse.</li>
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
         * <p> This parameter is valid only if <strong>ModifyAccount</strong> is set to <strong>true</strong>.</p>
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

        @Override
        public ModifyDtsJobEndpointRequest build() {
            return new ModifyDtsJobEndpointRequest(this);
        } 

    } 

}
