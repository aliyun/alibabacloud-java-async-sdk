// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRDSToClickhouseDbRequest} extends {@link RequestModel}
 *
 * <p>CreateRDSToClickhouseDbRequest</p>
 */
public class CreateRDSToClickhouseDbRequest extends Request {
    @Query
    @NameInMap("CkPassword")
    @Validation(required = true)
    private String ckPassword;

    @Query
    @NameInMap("CkUserName")
    @Validation(required = true)
    private String ckUserName;

    @Query
    @NameInMap("ClickhousePort")
    private Long clickhousePort;

    @Query
    @NameInMap("DbClusterId")
    @Validation(required = true)
    private String dbClusterId;

    @Query
    @NameInMap("LimitUpper")
    private Long limitUpper;

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
    @NameInMap("RdsVpcId")
    private String rdsVpcId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SkipUnsupported")
    @Validation(required = true)
    private Boolean skipUnsupported;

    @Query
    @NameInMap("SynDbTables")
    @Validation(required = true)
    private String synDbTables;

    private CreateRDSToClickhouseDbRequest(Builder builder) {
        super(builder);
        this.ckPassword = builder.ckPassword;
        this.ckUserName = builder.ckUserName;
        this.clickhousePort = builder.clickhousePort;
        this.dbClusterId = builder.dbClusterId;
        this.limitUpper = builder.limitUpper;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.rdsId = builder.rdsId;
        this.rdsPassword = builder.rdsPassword;
        this.rdsPort = builder.rdsPort;
        this.rdsUserName = builder.rdsUserName;
        this.rdsVpcId = builder.rdsVpcId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.skipUnsupported = builder.skipUnsupported;
        this.synDbTables = builder.synDbTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRDSToClickhouseDbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ckPassword
     */
    public String getCkPassword() {
        return this.ckPassword;
    }

    /**
     * @return ckUserName
     */
    public String getCkUserName() {
        return this.ckUserName;
    }

    /**
     * @return clickhousePort
     */
    public Long getClickhousePort() {
        return this.clickhousePort;
    }

    /**
     * @return dbClusterId
     */
    public String getDbClusterId() {
        return this.dbClusterId;
    }

    /**
     * @return limitUpper
     */
    public Long getLimitUpper() {
        return this.limitUpper;
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
     * @return rdsVpcId
     */
    public String getRdsVpcId() {
        return this.rdsVpcId;
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
     * @return skipUnsupported
     */
    public Boolean getSkipUnsupported() {
        return this.skipUnsupported;
    }

    /**
     * @return synDbTables
     */
    public String getSynDbTables() {
        return this.synDbTables;
    }

    public static final class Builder extends Request.Builder<CreateRDSToClickhouseDbRequest, Builder> {
        private String ckPassword; 
        private String ckUserName; 
        private Long clickhousePort; 
        private String dbClusterId; 
        private Long limitUpper; 
        private String ownerAccount; 
        private Long ownerId; 
        private String rdsId; 
        private String rdsPassword; 
        private Long rdsPort; 
        private String rdsUserName; 
        private String rdsVpcId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Boolean skipUnsupported; 
        private String synDbTables; 

        private Builder() {
            super();
        } 

        private Builder(CreateRDSToClickhouseDbRequest response) {
            super(response);
            this.ckPassword = response.ckPassword;
            this.ckUserName = response.ckUserName;
            this.clickhousePort = response.clickhousePort;
            this.dbClusterId = response.dbClusterId;
            this.limitUpper = response.limitUpper;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.rdsId = response.rdsId;
            this.rdsPassword = response.rdsPassword;
            this.rdsPort = response.rdsPort;
            this.rdsUserName = response.rdsUserName;
            this.rdsVpcId = response.rdsVpcId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.skipUnsupported = response.skipUnsupported;
            this.synDbTables = response.synDbTables;
        } 

        /**
         * CkPassword.
         */
        public Builder ckPassword(String ckPassword) {
            this.putQueryParameter("CkPassword", ckPassword);
            this.ckPassword = ckPassword;
            return this;
        }

        /**
         * CkUserName.
         */
        public Builder ckUserName(String ckUserName) {
            this.putQueryParameter("CkUserName", ckUserName);
            this.ckUserName = ckUserName;
            return this;
        }

        /**
         * ClickhousePort.
         */
        public Builder clickhousePort(Long clickhousePort) {
            this.putQueryParameter("ClickhousePort", clickhousePort);
            this.clickhousePort = clickhousePort;
            return this;
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
         * LimitUpper.
         */
        public Builder limitUpper(Long limitUpper) {
            this.putQueryParameter("LimitUpper", limitUpper);
            this.limitUpper = limitUpper;
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
         * RdsVpcId.
         */
        public Builder rdsVpcId(String rdsVpcId) {
            this.putQueryParameter("RdsVpcId", rdsVpcId);
            this.rdsVpcId = rdsVpcId;
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
         * SkipUnsupported.
         */
        public Builder skipUnsupported(Boolean skipUnsupported) {
            this.putQueryParameter("SkipUnsupported", skipUnsupported);
            this.skipUnsupported = skipUnsupported;
            return this;
        }

        /**
         * SynDbTables.
         */
        public Builder synDbTables(String synDbTables) {
            this.putQueryParameter("SynDbTables", synDbTables);
            this.synDbTables = synDbTables;
            return this;
        }

        @Override
        public CreateRDSToClickhouseDbRequest build() {
            return new CreateRDSToClickhouseDbRequest(this);
        } 

    } 

}
