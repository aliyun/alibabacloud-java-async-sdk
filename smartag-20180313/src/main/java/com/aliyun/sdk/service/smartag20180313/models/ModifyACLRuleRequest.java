// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ModifyACLRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyACLRuleRequest</p>
 */
public class ModifyACLRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acrId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCidr")
    private String destCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestPortRange")
    private String destPortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DpiGroupIds")
    private java.util.List<String> dpiGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DpiSignatureIds")
    private java.util.List<String> dpiSignatureIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCidr")
    private String sourceCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    private String sourcePortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private ModifyACLRuleRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.acrId = builder.acrId;
        this.description = builder.description;
        this.destCidr = builder.destCidr;
        this.destPortRange = builder.destPortRange;
        this.direction = builder.direction;
        this.dpiGroupIds = builder.dpiGroupIds;
        this.dpiSignatureIds = builder.dpiSignatureIds;
        this.ipProtocol = builder.ipProtocol;
        this.name = builder.name;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.policy = builder.policy;
        this.priority = builder.priority;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceCidr = builder.sourceCidr;
        this.sourcePortRange = builder.sourcePortRange;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyACLRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return acrId
     */
    public String getAcrId() {
        return this.acrId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destCidr
     */
    public String getDestCidr() {
        return this.destCidr;
    }

    /**
     * @return destPortRange
     */
    public String getDestPortRange() {
        return this.destPortRange;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return dpiGroupIds
     */
    public java.util.List<String> getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    /**
     * @return dpiSignatureIds
     */
    public java.util.List<String> getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
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

    /**
     * @return sourceCidr
     */
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyACLRuleRequest, Builder> {
        private String aclId; 
        private String acrId; 
        private String description; 
        private String destCidr; 
        private String destPortRange; 
        private String direction; 
        private java.util.List<String> dpiGroupIds; 
        private java.util.List<String> dpiSignatureIds; 
        private String ipProtocol; 
        private String name; 
        private String ownerAccount; 
        private Long ownerId; 
        private String policy; 
        private Integer priority; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceCidr; 
        private String sourcePortRange; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyACLRuleRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.acrId = request.acrId;
            this.description = request.description;
            this.destCidr = request.destCidr;
            this.destPortRange = request.destPortRange;
            this.direction = request.direction;
            this.dpiGroupIds = request.dpiGroupIds;
            this.dpiSignatureIds = request.dpiSignatureIds;
            this.ipProtocol = request.ipProtocol;
            this.name = request.name;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.policy = request.policy;
            this.priority = request.priority;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceCidr = request.sourceCidr;
            this.sourcePortRange = request.sourcePortRange;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the ACL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-xhwhyuo43l0n*******</p>
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>The ID of the ACL rule.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/114017.html">DescribeACLAttribute</a> operation to query the ID of the ACL rule that is added to the ACL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acr-u98qztgtgvhb********</p>
         */
        public Builder acrId(String acrId) {
            this.putQueryParameter("AcrId", acrId);
            this.acrId = acrId;
            return this;
        }

        /**
         * <p>The description of the ACL rule.</p>
         * <p>The description must be <strong>1</strong> to <strong>512</strong> characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination CIDR block.</p>
         * <p>Specify the value of this parameter in CIDR notation. Example: 192.168.10.0/24.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder destCidr(String destCidr) {
            this.putQueryParameter("DestCidr", destCidr);
            this.destCidr = destCidr;
            return this;
        }

        /**
         * <p>The destination port range. Valid values: <strong>1</strong> to <strong>65535</strong> and <strong>-1</strong>.</p>
         * <p>Examples:</p>
         * <ul>
         * <li>1/200: port 1 to port 200.</li>
         * <li>80/80: port 80.</li>
         * <li>-1/-1: all ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder destPortRange(String destPortRange) {
            this.putQueryParameter("DestPortRange", destPortRange);
            this.destPortRange = destPortRange;
            return this;
        }

        /**
         * <p>The direction of traffic in which the ACL rule is applied. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: The ACL rule controls inbound network traffic of the on-premises network that is associated with the SAG instance.</li>
         * <li><strong>out</strong>: The ACL rule controls outbound network traffic of the on-premises network that is associated with the SAG instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * DpiGroupIds.
         */
        public Builder dpiGroupIds(java.util.List<String> dpiGroupIds) {
            this.putQueryParameter("DpiGroupIds", dpiGroupIds);
            this.dpiGroupIds = dpiGroupIds;
            return this;
        }

        /**
         * DpiSignatureIds.
         */
        public Builder dpiSignatureIds(java.util.List<String> dpiSignatureIds) {
            this.putQueryParameter("DpiSignatureIds", dpiSignatureIds);
            this.dpiSignatureIds = dpiSignatureIds;
            return this;
        }

        /**
         * <p>The protocol used by the ACL rule.</p>
         * <p>The supported protocols provided in this topic are for reference only. The actual protocols in the SAG console shall prevail. The value of the parameter is not case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.putQueryParameter("IpProtocol", ipProtocol);
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>The name of the ACL rule.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>doctest</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * <p>The action of the ACL rule. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows network traffic.</li>
         * <li><strong>drop</strong>: blocks network traffic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        public Builder policy(String policy) {
            this.putQueryParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        /**
         * <p>The priority of the ACL rule.</p>
         * <p>A smaller value indicates a higher priority. If multiple rules have the same priority, the rule that is applied earlier takes effect.</p>
         * <p>Valid values: <strong>1 to 100</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the region where the ACL is deployed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
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

        /**
         * <p>The source CIDR block.</p>
         * <p>Specify the value of this parameter in CIDR notation. Example: 192.168.1.0/24.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder sourceCidr(String sourceCidr) {
            this.putQueryParameter("SourceCidr", sourceCidr);
            this.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * <p>The source port range. Valid values: <strong>1</strong> to <strong>65535</strong> and <strong>-1</strong>.</p>
         * <p>Examples:</p>
         * <ul>
         * <li>1/200: port 1 to port 200.</li>
         * <li>80/80: port 80.</li>
         * <li>-1/-1: all ports.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * <p>The type of the ACL rule: Valid values:</p>
         * <ul>
         * <li><strong>LAN</strong>: The ACL rule controls traffic of private IP addresses.</li>
         * <li><strong>WAN</strong>: The ACL rule controls traffic of public IP addresses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LAN</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyACLRuleRequest build() {
            return new ModifyACLRuleRequest(this);
        } 

    } 

}
