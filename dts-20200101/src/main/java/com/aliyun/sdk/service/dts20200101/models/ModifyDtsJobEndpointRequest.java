// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * AliyunUid.
         */
        public Builder aliyunUid(String aliyunUid) {
            this.putQueryParameter("AliyunUid", aliyunUid);
            this.aliyunUid = aliyunUid;
            return this;
        }

        /**
         * Database.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * DtsInstanceId.
         */
        public Builder dtsInstanceId(String dtsInstanceId) {
            this.putQueryParameter("DtsInstanceId", dtsInstanceId);
            this.dtsInstanceId = dtsInstanceId;
            return this;
        }

        /**
         * DtsJobId.
         */
        public Builder dtsJobId(String dtsJobId) {
            this.putQueryParameter("DtsJobId", dtsJobId);
            this.dtsJobId = dtsJobId;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * EndpointInstanceId.
         */
        public Builder endpointInstanceId(String endpointInstanceId) {
            this.putQueryParameter("EndpointInstanceId", endpointInstanceId);
            this.endpointInstanceId = endpointInstanceId;
            return this;
        }

        /**
         * EndpointInstanceType.
         */
        public Builder endpointInstanceType(String endpointInstanceType) {
            this.putQueryParameter("EndpointInstanceType", endpointInstanceType);
            this.endpointInstanceType = endpointInstanceType;
            return this;
        }

        /**
         * EndpointIp.
         */
        public Builder endpointIp(String endpointIp) {
            this.putQueryParameter("EndpointIp", endpointIp);
            this.endpointIp = endpointIp;
            return this;
        }

        /**
         * EndpointPort.
         */
        public Builder endpointPort(String endpointPort) {
            this.putQueryParameter("EndpointPort", endpointPort);
            this.endpointPort = endpointPort;
            return this;
        }

        /**
         * EndpointRegionId.
         */
        public Builder endpointRegionId(String endpointRegionId) {
            this.putQueryParameter("EndpointRegionId", endpointRegionId);
            this.endpointRegionId = endpointRegionId;
            return this;
        }

        /**
         * ModifyAccount.
         */
        public Builder modifyAccount(Boolean modifyAccount) {
            this.putQueryParameter("ModifyAccount", modifyAccount);
            this.modifyAccount = modifyAccount;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
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
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.putQueryParameter("RoleName", roleName);
            this.roleName = roleName;
            return this;
        }

        /**
         * ShardPassword.
         */
        public Builder shardPassword(String shardPassword) {
            this.putQueryParameter("ShardPassword", shardPassword);
            this.shardPassword = shardPassword;
            return this;
        }

        /**
         * ShardUsername.
         */
        public Builder shardUsername(String shardUsername) {
            this.putQueryParameter("ShardUsername", shardUsername);
            this.shardUsername = shardUsername;
            return this;
        }

        /**
         * SynchronizationDirection.
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * Username.
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
