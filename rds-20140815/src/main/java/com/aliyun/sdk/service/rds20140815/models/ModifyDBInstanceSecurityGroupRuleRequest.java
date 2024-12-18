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
 * {@link ModifyDBInstanceSecurityGroupRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstanceSecurityGroupRuleRequest</p>
 */
public class ModifyDBInstanceSecurityGroupRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityGroupRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCidrIp;

    private ModifyDBInstanceSecurityGroupRuleRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.description = builder.description;
        this.ipProtocol = builder.ipProtocol;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.portRange = builder.portRange;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.securityGroupRuleId = builder.securityGroupRuleId;
        this.sourceCidrIp = builder.sourceCidrIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstanceSecurityGroupRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
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
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
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
     * @return securityGroupRuleId
     */
    public String getSecurityGroupRuleId() {
        return this.securityGroupRuleId;
    }

    /**
     * @return sourceCidrIp
     */
    public String getSourceCidrIp() {
        return this.sourceCidrIp;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstanceSecurityGroupRuleRequest, Builder> {
        private String DBInstanceId; 
        private String description; 
        private String ipProtocol; 
        private String ownerAccount; 
        private String ownerId; 
        private String portRange; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String securityGroupRuleId; 
        private String sourceCidrIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstanceSecurityGroupRuleRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.description = request.description;
            this.ipProtocol = request.ipProtocol;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.portRange = request.portRange;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.securityGroupRuleId = request.securityGroupRuleId;
            this.sourceCidrIp = request.sourceCidrIp;
        } 

        /**
         * <p>The ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/2628785.html">DescribeDBInstances</a> operation to query the IDs of instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp15i4hn07r******</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The description of the security group rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zht_test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The type of the transport layer protocol. Valid values:</p>
         * <ul>
         * <li>TCP</li>
         * <li>UDP</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
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
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The range of destination ports over which TCP and UDP traffic is allowed in the security group rule.</p>
         * <p>Valid values: 1 to 65535. Separate the start port number and the end port number with a forward slash (/). Example: 1/200.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1/200</p>
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
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
         * <p>The ID of the security group rule. You can call the <a href="https://help.aliyun.com/document_detail/2834044.html">DescribeDBInstanceSecurityGroupRule</a> to obtain the ID of the security group rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgr-2ze17u******</p>
         */
        public Builder securityGroupRuleId(String securityGroupRuleId) {
            this.putQueryParameter("SecurityGroupRuleId", securityGroupRuleId);
            this.securityGroupRuleId = securityGroupRuleId;
            return this;
        }

        /**
         * <p>The range of source IP addresses. CIDR blocks and IPv4 addresses are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XX.XX.100</p>
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            this.putQueryParameter("SourceCidrIp", sourceCidrIp);
            this.sourceCidrIp = sourceCidrIp;
            return this;
        }

        @Override
        public ModifyDBInstanceSecurityGroupRuleRequest build() {
            return new ModifyDBInstanceSecurityGroupRuleRequest(this);
        } 

    } 

}
