// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterAccessWhitelistRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterAccessWhitelistRequest</p>
 */
public class ModifyDBClusterAccessWhitelistRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterIPArrayAttribute")
    private String DBClusterIPArrayAttribute;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterIPArrayName")
    private String DBClusterIPArrayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

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
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private String securityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIps")
    private String securityIps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhiteListType")
    private String whiteListType;

    private ModifyDBClusterAccessWhitelistRequest(Builder builder) {
        super(builder);
        this.DBClusterIPArrayAttribute = builder.DBClusterIPArrayAttribute;
        this.DBClusterIPArrayName = builder.DBClusterIPArrayName;
        this.DBClusterId = builder.DBClusterId;
        this.modifyMode = builder.modifyMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupIds = builder.securityGroupIds;
        this.securityIps = builder.securityIps;
        this.whiteListType = builder.whiteListType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterAccessWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterIPArrayAttribute
     */
    public String getDBClusterIPArrayAttribute() {
        return this.DBClusterIPArrayAttribute;
    }

    /**
     * @return DBClusterIPArrayName
     */
    public String getDBClusterIPArrayName() {
        return this.DBClusterIPArrayName;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
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
     * @return securityGroupIds
     */
    public String getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * @return securityIps
     */
    public String getSecurityIps() {
        return this.securityIps;
    }

    /**
     * @return whiteListType
     */
    public String getWhiteListType() {
        return this.whiteListType;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterAccessWhitelistRequest, Builder> {
        private String DBClusterIPArrayAttribute; 
        private String DBClusterIPArrayName; 
        private String DBClusterId; 
        private String modifyMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupIds; 
        private String securityIps; 
        private String whiteListType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterAccessWhitelistRequest request) {
            super(request);
            this.DBClusterIPArrayAttribute = request.DBClusterIPArrayAttribute;
            this.DBClusterIPArrayName = request.DBClusterIPArrayName;
            this.DBClusterId = request.DBClusterId;
            this.modifyMode = request.modifyMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupIds = request.securityGroupIds;
            this.securityIps = request.securityIps;
            this.whiteListType = request.whiteListType;
        } 

        /**
         * <p>The attributes of the IP whitelist group. Set this parameter to <strong>hidden</strong> to hide the IP whitelist group in the console.</p>
         * <blockquote>
         * <ul>
         * <li>The IP whitelist group that has appeared in the console cannot be hidden.</li>
         * <li>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hidden</p>
         */
        public Builder DBClusterIPArrayAttribute(String DBClusterIPArrayAttribute) {
            this.putQueryParameter("DBClusterIPArrayAttribute", DBClusterIPArrayAttribute);
            this.DBClusterIPArrayAttribute = DBClusterIPArrayAttribute;
            return this;
        }

        /**
         * <p>The name of the IP whitelist group. The group name must be 2 to 120 characters in length and consists of lowercase letters and digits. It must start with a letter, and end with a letter or a digit.</p>
         * <ul>
         * <li>If the specified whitelist group name does not exist, the whitelist group is created.</li>
         * <li>If the specified whitelist group name exists, the whitelist group is modified.</li>
         * <li>If you do not specify this parameter, the default group is modified.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can create a maximum of 50 IP whitelist groups for a cluster.</p>
         * </li>
         * <li><p>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder DBClusterIPArrayName(String DBClusterIPArrayName) {
            this.putQueryParameter("DBClusterIPArrayName", DBClusterIPArrayName);
            this.DBClusterIPArrayName = DBClusterIPArrayName;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The method used to modify the IP whitelist. Valid values:</p>
         * <ul>
         * <li><strong>Cover</strong> (default): overwrites the original IP whitelist.</li>
         * <li><strong>Append</strong>: appends IP addresses to the original whitelist.</li>
         * <li><strong>Delete</strong>: deletes IP addresses.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
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
         * <p>The ID of the security group. Separate multiple security groups with commas (,).</p>
         * <blockquote>
         * <ul>
         * <li>You can add a maximum of three security groups to a cluster.</li>
         * <li>This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>SecurityGroup</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sg-*********</p>
         */
        public Builder securityGroupIds(String securityGroupIds) {
            this.putQueryParameter("SecurityGroupIds", securityGroupIds);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>The IP addresses or Classless Inter-Domain Routing (CIDR) blocks in the IP whitelist group. You can add 1,000 IP addresses or CIDR blocks to all the IP whitelist groups. Separate multiple IP addresses with commas (,). The following two formats are supported:</p>
         * <ul>
         * <li>IP addresses. Example: 10.23.12.24.</li>
         * <li>CIDR blocks. Example: 10.23.12.24/24. 24 indicates the length of the prefix of the CIDR block. The length is the range of 1 to 32.</li>
         * </ul>
         * <blockquote>
         * <p> This parameter can be specified only when the <strong>WhiteListType</strong> parameter is set to <strong>IP</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.23.12.24</p>
         */
        public Builder securityIps(String securityIps) {
            this.putQueryParameter("SecurityIps", securityIps);
            this.securityIps = securityIps;
            return this;
        }

        /**
         * <p>The type of the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>IP</strong>: IP whitelist group.</li>
         * <li><strong>SecurityGroup</strong>: security group.</li>
         * </ul>
         * <p>Default value: <strong>IP</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>IP</p>
         */
        public Builder whiteListType(String whiteListType) {
            this.putQueryParameter("WhiteListType", whiteListType);
            this.whiteListType = whiteListType;
            return this;
        }

        @Override
        public ModifyDBClusterAccessWhitelistRequest build() {
            return new ModifyDBClusterAccessWhitelistRequest(this);
        } 

    } 

}
