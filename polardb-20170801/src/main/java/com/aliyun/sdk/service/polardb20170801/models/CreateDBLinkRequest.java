// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBLinkRequest} extends {@link RequestModel}
 *
 * <p>CreateDBLinkRequest</p>
 */
public class CreateDBLinkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBLinkName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBLinkName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceDBName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceDBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBAccount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDBAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBInstanceName")
    private String targetDBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDBName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDBPasswd")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetDBPasswd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetIp")
    private String targetIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetPort")
    private String targetPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private CreateDBLinkRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.DBLinkName = builder.DBLinkName;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceDBName = builder.sourceDBName;
        this.targetDBAccount = builder.targetDBAccount;
        this.targetDBInstanceName = builder.targetDBInstanceName;
        this.targetDBName = builder.targetDBName;
        this.targetDBPasswd = builder.targetDBPasswd;
        this.targetIp = builder.targetIp;
        this.targetPort = builder.targetPort;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBLinkName
     */
    public String getDBLinkName() {
        return this.DBLinkName;
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
     * @return sourceDBName
     */
    public String getSourceDBName() {
        return this.sourceDBName;
    }

    /**
     * @return targetDBAccount
     */
    public String getTargetDBAccount() {
        return this.targetDBAccount;
    }

    /**
     * @return targetDBInstanceName
     */
    public String getTargetDBInstanceName() {
        return this.targetDBInstanceName;
    }

    /**
     * @return targetDBName
     */
    public String getTargetDBName() {
        return this.targetDBName;
    }

    /**
     * @return targetDBPasswd
     */
    public String getTargetDBPasswd() {
        return this.targetDBPasswd;
    }

    /**
     * @return targetIp
     */
    public String getTargetIp() {
        return this.targetIp;
    }

    /**
     * @return targetPort
     */
    public String getTargetPort() {
        return this.targetPort;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<CreateDBLinkRequest, Builder> {
        private String clientToken; 
        private String DBClusterId; 
        private String DBLinkName; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceDBName; 
        private String targetDBAccount; 
        private String targetDBInstanceName; 
        private String targetDBName; 
        private String targetDBPasswd; 
        private String targetIp; 
        private String targetPort; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBLinkRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
            this.DBLinkName = request.DBLinkName;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceDBName = request.sourceDBName;
            this.targetDBAccount = request.targetDBAccount;
            this.targetDBInstanceName = request.targetDBInstanceName;
            this.targetDBName = request.targetDBName;
            this.targetDBPasswd = request.targetDBPasswd;
            this.targetIp = request.targetIp;
            this.targetPort = request.targetPort;
            this.vpcId = request.vpcId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length. The token is case-sensitive.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the source cluster that the database link connects.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~173433~~) operation to query PolarDB clusters.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the database link.
         * <p>
         * 
         * *   The name must contain lowercase letters and can also contain digits and underscores (\_).
         * *   The name must start with a letter and end with a letter or digit.
         * *   The name must be 1 to 64 characters in length.
         */
        public Builder DBLinkName(String DBLinkName) {
            this.putQueryParameter("DBLinkName", DBLinkName);
            this.DBLinkName = DBLinkName;
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
         * The ID of the region.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~98041~~) operation to query information about regions.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
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
         * The name of the source database.
         * <p>
         * 
         * >  You can call the [DescribeDatabases](~~173558~~) operation to query information about databases in a PolarDB cluster.
         */
        public Builder sourceDBName(String sourceDBName) {
            this.putQueryParameter("SourceDBName", sourceDBName);
            this.sourceDBName = sourceDBName;
            return this;
        }

        /**
         * The account of the destination database.
         * <p>
         * 
         * >  You can call the [DescribeAccounts](~~173549~~) operation to query the account of a PolarDB cluster.
         */
        public Builder targetDBAccount(String targetDBAccount) {
            this.putQueryParameter("TargetDBAccount", targetDBAccount);
            this.targetDBAccount = targetDBAccount;
            return this;
        }

        /**
         * The ID of the destination cluster that the database link connects.
         * <p>
         * 
         * > *   If the destination cluster is a user-created Oracle database on an ECS instance, set the value to `null`.
         * > *   You can call the [DescribeDBClusters](~~173433~~) operation to query PolarDB clusters.
         */
        public Builder targetDBInstanceName(String targetDBInstanceName) {
            this.putQueryParameter("TargetDBInstanceName", targetDBInstanceName);
            this.targetDBInstanceName = targetDBInstanceName;
            return this;
        }

        /**
         * The name of the destination database.
         * <p>
         * 
         * >  You can call the [DescribeDatabases](~~173558~~) operation to query information about databases in a PolarDB cluster.
         */
        public Builder targetDBName(String targetDBName) {
            this.putQueryParameter("TargetDBName", targetDBName);
            this.targetDBName = targetDBName;
            return this;
        }

        /**
         * The account password of the destination database.
         */
        public Builder targetDBPasswd(String targetDBPasswd) {
            this.putQueryParameter("TargetDBPasswd", targetDBPasswd);
            this.targetDBPasswd = targetDBPasswd;
            return this;
        }

        /**
         * The IP address of the user-created Oracle database on an ECS instance.
         */
        public Builder targetIp(String targetIp) {
            this.putQueryParameter("TargetIp", targetIp);
            this.targetIp = targetIp;
            return this;
        }

        /**
         * The port number of the user-created Oracle database on an ECS instance.
         */
        public Builder targetPort(String targetPort) {
            this.putQueryParameter("TargetPort", targetPort);
            this.targetPort = targetPort;
            return this;
        }

        /**
         * The ID of the virtual private cloud (VPC).
         * <p>
         * 
         * >  You can call the [DescribeVpcs](~~35739~~) operation to query information about VPCs.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public CreateDBLinkRequest build() {
            return new CreateDBLinkRequest(this);
        } 

    } 

}
