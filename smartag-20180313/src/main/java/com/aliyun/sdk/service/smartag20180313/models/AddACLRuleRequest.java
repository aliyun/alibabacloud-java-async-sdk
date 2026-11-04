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
 * {@link AddACLRuleRequest} extends {@link RequestModel}
 *
 * <p>AddACLRuleRequest</p>
 */
public class AddACLRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCidr")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestPortRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String destPortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DpiGroupIds")
    private java.util.List<String> dpiGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DpiSignatureIds")
    private java.util.List<String> dpiSignatureIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourcePortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private AddACLRuleRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
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

    public static AddACLRuleRequest create() {
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

    public static final class Builder extends Request.Builder<AddACLRuleRequest, Builder> {
        private String aclId; 
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

        private Builder(AddACLRuleRequest request) {
            super(request);
            this.aclId = request.aclId;
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
         * <p>The ID of the access control instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-xhwhyuo43l0n*****</p>
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>The description of the access control rule.</p>
         * <p>The description must be <strong>1</strong> to <strong>512</strong> characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The destination CIDR block.</p>
         * <p>The destination CIDR block must be in CIDR format, such as 192.168.10.0/24.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.10.0/24</p>
         */
        public Builder destCidr(String destCidr) {
            this.putQueryParameter("DestCidr", destCidr);
            this.destCidr = destCidr;
            return this;
        }

        /**
         * <p>The destination port range.</p>
         * <p>Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>The destination port range is in the format of 1/200 or 80/80. A value of -1/-1 specifies that all ports are allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1/200</p>
         */
        public Builder destPortRange(String destPortRange) {
            this.putQueryParameter("DestPortRange", destPortRange);
            this.destPortRange = destPortRange;
            return this;
        }

        /**
         * <p>The direction in which the access control rule is applied. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound. This value specifies traffic from external networks to the local branch where the Smart Access Gateway (SAG) instance is deployed.</li>
         * <li><strong>out</strong>: outbound. This value specifies traffic from the local branch where the SAG instance is deployed to external networks.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The IDs of the application groups that match the access control rule.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/196754.html">ListDpiGroups</a> operation to query application group IDs and the included application information. Maximum value of N: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder dpiGroupIds(java.util.List<String> dpiGroupIds) {
            this.putQueryParameter("DpiGroupIds", dpiGroupIds);
            this.dpiGroupIds = dpiGroupIds;
            return this;
        }

        /**
         * <p>The IDs of the applications that match the access control rule.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/196630.html">ListDpiSignatures</a> operation to query application IDs and the corresponding application information. Maximum value of N: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dpiSignatureIds(java.util.List<String> dpiSignatureIds) {
            this.putQueryParameter("DpiSignatureIds", dpiSignatureIds);
            this.dpiSignatureIds = dpiSignatureIds;
            return this;
        }

        /**
         * <p>The protocol used by the access control rule.</p>
         * <p>For the protocol types supported by the access control feature, refer to the console. The protocol format is not case-sensitive.</p>
         * <p>This parameter is required.</p>
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
         * <p>The name of the access control rule.</p>
         * <p>The name must be 2 to 100 characters in length, and must start with a letter or a Chinese character. It can contain digits, periods (.), underscores (_), and hyphens (-).</p>
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
         * <p>The authorization policy of the access control rule. Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: Allows the traffic.</p>
         * </li>
         * <li><p><strong>drop</strong>: Denies the traffic.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The priority of the access control rule.</p>
         * <p>A smaller value indicates a higher priority. If multiple rules have the same priority, the rule that is first delivered to the Smart Access Gateway device takes effect first.</p>
         * <p>Valid values: <strong>1</strong> to <strong>100</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The region ID of the access control instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The source CIDR block must be in CIDR format, such as 192.168.1.0/24.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.20.0/24</p>
         */
        public Builder sourceCidr(String sourceCidr) {
            this.putQueryParameter("SourceCidr", sourceCidr);
            this.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * <p>The source port range.</p>
         * <p>Valid values: <strong>-1</strong> or <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>The source port range is in the format of 1/200 or 80/80. A value of -1/-1 specifies that all ports are allowed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1/200</p>
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * <p>The type of the access control rule. Valid values:</p>
         * <ul>
         * <li><p><strong>LAN</strong>: private network. This is the default value. This value specifies that the access control rule is applied to traffic destined for private IP addresses.</p>
         * </li>
         * <li><p><strong>WAN</strong>: public network. This value specifies that the access control rule is applied to traffic destined for public IP addresses.</p>
         * </li>
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
        public AddACLRuleRequest build() {
            return new AddACLRuleRequest(this);
        } 

    } 

}
