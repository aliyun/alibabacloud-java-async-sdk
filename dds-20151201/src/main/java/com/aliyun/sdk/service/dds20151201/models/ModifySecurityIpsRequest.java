// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link ModifySecurityIpsRequest} extends {@link RequestModel}
 *
 * <p>ModifySecurityIpsRequest</p>
 */
public class ModifySecurityIpsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyMode")
    private String modifyMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIpGroupAttribute")
    private String securityIpGroupAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIpGroupName")
    private String securityIpGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIps")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIps;

    private ModifySecurityIpsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.DBInstanceId = builder.DBInstanceId;
        this.dryRun = builder.dryRun;
        this.modifyMode = builder.modifyMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityIpGroupAttribute = builder.securityIpGroupAttribute;
        this.securityIpGroupName = builder.securityIpGroupName;
        this.securityIps = builder.securityIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySecurityIpsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
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
     * @return securityIpGroupAttribute
     */
    public String getSecurityIpGroupAttribute() {
        return this.securityIpGroupAttribute;
    }

    /**
     * @return securityIpGroupName
     */
    public String getSecurityIpGroupName() {
        return this.securityIpGroupName;
    }

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    public static final class Builder extends Request.Builder<ModifySecurityIpsRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String DBInstanceId; 
        private Boolean dryRun; 
        private String modifyMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityIpGroupAttribute; 
        private String securityIpGroupName; 
        private String securityIps; 

        private Builder() {
            super();
        } 

        private Builder(ModifySecurityIpsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.DBInstanceId = request.DBInstanceId;
            this.dryRun = request.dryRun;
            this.modifyMode = request.modifyMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityIpGroupAttribute = request.securityIpGroupAttribute;
            this.securityIpGroupName = request.securityIpGroupName;
            this.securityIps = request.securityIps;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. Example: qwertyui1234567</p>
         * 
         * <strong>example:</strong>
         * <p>qwertyui1234567</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds-bp*****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:
         * true: performs a dry run without calling the operation. The system checks the request parameters, request format, service limits, and available resources. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.
         * false (default): sends the request. If the check succeeds, the operation is performed.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The modification method. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong>: Overwrites the original whitelist.</li>
         * <li><strong>Append</strong>: Appends to the whitelist. An error is returned if duplicate IP addresses exist.</li>
         * <li><strong>Extend</strong>: Appends to the whitelist. Duplicate IP addresses are merged.</li>
         * <li><strong>Delete</strong>: Deletes the whitelist.</li>
         * </ul>
         * <p>Default value: <strong>Cover</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>Append</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("ModifyMode", modifyMode);
            this.modifyMode = modifyMode;
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
         * <p>The attribute of the whitelist group. The value can contain uppercase letters, lowercase letters, and digits. The maximum length is 120 characters.</p>
         * <p>Default value: empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder securityIpGroupAttribute(String securityIpGroupAttribute) {
            this.putQueryParameter("SecurityIpGroupAttribute", securityIpGroupAttribute);
            this.securityIpGroupAttribute = securityIpGroupAttribute;
            return this;
        }

        /**
         * <p>The name of the IP whitelist group to modify. Default value: <strong>default</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>allowserver</p>
         */
        public Builder securityIpGroupName(String securityIpGroupName) {
            this.putQueryParameter("SecurityIpGroupName", securityIpGroupName);
            this.securityIpGroupName = securityIpGroupName;
            return this;
        }

        /**
         * <p>The list of IP addresses in the IP whitelist group. Separate multiple IP addresses with commas (,). IP addresses cannot be duplicated. A maximum of 1000 IP addresses are supported. The following two formats are supported:</p>
         * <ul>
         * <li>IP address format, such as 127.0.0.1.</li>
         * <li>CIDR format, such as 127.0.0.1/24 (Classless Inter-Domain Routing, where 24 indicates the length of the prefix in the address. The value ranges from 1 to 32).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1/24,127.0.0.1</p>
         */
        public Builder securityIps(String securityIps) {
            this.putQueryParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        @Override
        public ModifySecurityIpsRequest build() {
            return new ModifySecurityIpsRequest(this);
        } 

    } 

}
