// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRDSschemasRequest} extends {@link RequestModel}
 *
 * <p>DescribeRDSschemasRequest</p>
 */
public class DescribeRDSschemasRequest extends Request {
    @Query
    @NameInMap("DbClusterId")
    @Validation(required = true)
    private String dbClusterId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RdsId")
    @Validation(required = true)
    private String rdsId;

    @Query
    @NameInMap("RdsPassword")
    @Validation(required = true)
    private String rdsPassword;

    @Query
    @NameInMap("RdsPort")
    private Long rdsPort;

    @Query
    @NameInMap("RdsUserName")
    @Validation(required = true)
    private String rdsUserName;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private DescribeRDSschemasRequest(Builder builder) {
        super(builder);
        this.dbClusterId = builder.dbClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.rdsId = builder.rdsId;
        this.rdsPassword = builder.rdsPassword;
        this.rdsPort = builder.rdsPort;
        this.rdsUserName = builder.rdsUserName;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRDSschemasRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbClusterId
     */
    public String getDbClusterId() {
        return this.dbClusterId;
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
     * @return rdsId
     */
    public String getRdsId() {
        return this.rdsId;
    }

    /**
     * @return rdsPassword
     */
    public String getRdsPassword() {
        return this.rdsPassword;
    }

    /**
     * @return rdsPort
     */
    public Long getRdsPort() {
        return this.rdsPort;
    }

    /**
     * @return rdsUserName
     */
    public String getRdsUserName() {
        return this.rdsUserName;
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

    public static final class Builder extends Request.Builder<DescribeRDSschemasRequest, Builder> {
        private String dbClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String rdsId; 
        private String rdsPassword; 
        private Long rdsPort; 
        private String rdsUserName; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRDSschemasRequest response) {
            super(response);
            this.dbClusterId = response.dbClusterId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.rdsId = response.rdsId;
            this.rdsPassword = response.rdsPassword;
            this.rdsPort = response.rdsPort;
            this.rdsUserName = response.rdsUserName;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
        } 

        /**
         * DbClusterId.
         */
        public Builder dbClusterId(String dbClusterId) {
            this.putQueryParameter("DbClusterId", dbClusterId);
            this.dbClusterId = dbClusterId;
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
         * RdsId.
         */
        public Builder rdsId(String rdsId) {
            this.putQueryParameter("RdsId", rdsId);
            this.rdsId = rdsId;
            return this;
        }

        /**
         * RdsPassword.
         */
        public Builder rdsPassword(String rdsPassword) {
            this.putQueryParameter("RdsPassword", rdsPassword);
            this.rdsPassword = rdsPassword;
            return this;
        }

        /**
         * RdsPort.
         */
        public Builder rdsPort(Long rdsPort) {
            this.putQueryParameter("RdsPort", rdsPort);
            this.rdsPort = rdsPort;
            return this;
        }

        /**
         * RdsUserName.
         */
        public Builder rdsUserName(String rdsUserName) {
            this.putQueryParameter("RdsUserName", rdsUserName);
            this.rdsUserName = rdsUserName;
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
        public DescribeRDSschemasRequest build() {
            return new DescribeRDSschemasRequest(this);
        } 

    } 

}
