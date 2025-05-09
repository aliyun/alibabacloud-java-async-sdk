// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyADInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyADInfoRequest</p>
 */
public class ModifyADInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ADAccountName")
    private String ADAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ADDNS")
    private String ADDNS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ADPassword")
    private String ADPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ADServerIpAddress")
    private String ADServerIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
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
    private Long resourceOwnerId;

    private ModifyADInfoRequest(Builder builder) {
        super(builder);
        this.ADAccountName = builder.ADAccountName;
        this.ADDNS = builder.ADDNS;
        this.ADPassword = builder.ADPassword;
        this.ADServerIpAddress = builder.ADServerIpAddress;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyADInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ADAccountName
     */
    public String getADAccountName() {
        return this.ADAccountName;
    }

    /**
     * @return ADDNS
     */
    public String getADDNS() {
        return this.ADDNS;
    }

    /**
     * @return ADPassword
     */
    public String getADPassword() {
        return this.ADPassword;
    }

    /**
     * @return ADServerIpAddress
     */
    public String getADServerIpAddress() {
        return this.ADServerIpAddress;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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

    public static final class Builder extends Request.Builder<ModifyADInfoRequest, Builder> {
        private String ADAccountName; 
        private String ADDNS; 
        private String ADPassword; 
        private String ADServerIpAddress; 
        private String clientToken; 
        private String DBInstanceId; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyADInfoRequest request) {
            super(request);
            this.ADAccountName = request.ADAccountName;
            this.ADDNS = request.ADDNS;
            this.ADPassword = request.ADPassword;
            this.ADServerIpAddress = request.ADServerIpAddress;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The account of the AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>test_account</p>
         */
        public Builder ADAccountName(String ADAccountName) {
            this.putQueryParameter("ADAccountName", ADAccountName);
            this.ADAccountName = ADAccountName;
            return this;
        }

        /**
         * <p>The DNS information about the AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder ADDNS(String ADDNS) {
            this.putQueryParameter("ADDNS", ADDNS);
            this.ADDNS = ADDNS;
            return this;
        }

        /**
         * <p>The password for the account of the AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>test_password</p>
         */
        public Builder ADPassword(String ADPassword) {
            this.putQueryParameter("ADPassword", ADPassword);
            this.ADPassword = ADPassword;
            return this;
        }

        /**
         * <p>The IP address of the AD domain.</p>
         * 
         * <strong>example:</strong>
         * <p>47.100.XX.XX</p>
         */
        public Builder ADServerIpAddress(String ADServerIpAddress) {
            this.putQueryParameter("ADServerIpAddress", ADServerIpAddress);
            this.ADServerIpAddress = ADServerIpAddress;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
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
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
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
        public ModifyADInfoRequest build() {
            return new ModifyADInfoRequest(this);
        } 

    } 

}
