// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBResourcePoolRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBResourcePoolRequest</p>
 */
public class ModifyDBResourcePoolRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("NodeNum")
    @Validation(maximum = 4294967296D)
    private Integer nodeNum;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PoolName")
    @Validation(required = true)
    private String poolName;

    @Query
    @NameInMap("QueryType")
    private String queryType;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private ModifyDBResourcePoolRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.nodeNum = builder.nodeNum;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.poolName = builder.poolName;
        this.queryType = builder.queryType;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBResourcePoolRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return nodeNum
     */
    public Integer getNodeNum() {
        return this.nodeNum;
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
     * @return poolName
     */
    public String getPoolName() {
        return this.poolName;
    }

    /**
     * @return queryType
     */
    public String getQueryType() {
        return this.queryType;
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

    public static final class Builder extends Request.Builder<ModifyDBResourcePoolRequest, Builder> {
        private String DBClusterId; 
        private Integer nodeNum; 
        private String ownerAccount; 
        private Long ownerId; 
        private String poolName; 
        private String queryType; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBResourcePoolRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.nodeNum = request.nodeNum;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.poolName = request.poolName;
            this.queryType = request.queryType;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The number of nodes.
         * <p>
         * 
         * *   Each node provides 16 cores and 64 GB memory.
         * *   The amount of resources that you want to add to or remove from the cluster cannot exceed the total amount of resources in the cluster.
         * 
         * > 
         * 
         * *   If you do not specify this parameter, the original value is retained.
         * 
         * *   You must specify at least one of the QueryType and NodeNum parameters.
         */
        public Builder nodeNum(Integer nodeNum) {
            this.putQueryParameter("NodeNum", nodeNum);
            this.nodeNum = nodeNum;
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
         * The name of the resource group.
         */
        public Builder poolName(String poolName) {
            this.putQueryParameter("PoolName", poolName);
            this.poolName = poolName;
            return this;
        }

        /**
         * The mode in which SQL statements are executed. Valid values:
         * <p>
         * 
         * *   **batch**
         * *   **interactive**
         * 
         * > If you do not specify this parameter, the original value is retained.
         */
        public Builder queryType(String queryType) {
            this.putQueryParameter("QueryType", queryType);
            this.queryType = queryType;
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

        @Override
        public ModifyDBResourcePoolRequest build() {
            return new ModifyDBResourcePoolRequest(this);
        } 

    } 

}
