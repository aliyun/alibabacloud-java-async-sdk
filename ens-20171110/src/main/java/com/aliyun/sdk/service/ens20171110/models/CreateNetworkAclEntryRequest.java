// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateNetworkAclEntryRequest} extends {@link RequestModel}
 *
 * <p>CreateNetworkAclEntryRequest</p>
 */
public class CreateNetworkAclEntryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAclEntryName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String networkAclEntryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkAclId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkAclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    private CreateNetworkAclEntryRequest(Builder builder) {
        super(builder);
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.direction = builder.direction;
        this.networkAclEntryName = builder.networkAclEntryName;
        this.networkAclId = builder.networkAclId;
        this.policy = builder.policy;
        this.portRange = builder.portRange;
        this.priority = builder.priority;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkAclEntryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return networkAclEntryName
     */
    public String getNetworkAclEntryName() {
        return this.networkAclEntryName;
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder extends Request.Builder<CreateNetworkAclEntryRequest, Builder> {
        private String cidrBlock; 
        private String description; 
        private String direction; 
        private String networkAclEntryName; 
        private String networkAclId; 
        private String policy; 
        private String portRange; 
        private Integer priority; 
        private String protocol; 

        private Builder() {
            super();
        } 

        private Builder(CreateNetworkAclEntryRequest request) {
            super(request);
            this.cidrBlock = request.cidrBlock;
            this.description = request.description;
            this.direction = request.direction;
            this.networkAclEntryName = request.networkAclEntryName;
            this.networkAclId = request.networkAclId;
            this.policy = request.policy;
            this.portRange = request.portRange;
            this.priority = request.priority;
            this.protocol = request.protocol;
        } 

        /**
         * <p>The source CIDR block.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.putQueryParameter("CidrBlock", cidrBlock);
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The description of the network ACL.</p>
         * <p>The description must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>This is my NetworkAcl.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether the ACL rule controls inbound or outbound access requests. Valid values:</p>
         * <ul>
         * <li><strong>ingress</strong></li>
         * <li><strong>egress</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * <p>The name must be 1 to 128 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-1</p>
         */
        public Builder networkAclEntryName(String networkAclEntryName) {
            this.putQueryParameter("NetworkAclEntryName", networkAclEntryName);
            this.networkAclEntryName = networkAclEntryName;
            return this;
        }

        /**
         * <p>The ID of the network ACL.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-bp1lhl0taikrbgnh****</p>
         */
        public Builder networkAclId(String networkAclId) {
            this.putQueryParameter("NetworkAclId", networkAclId);
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * <p>The action that is performed on network traffic that matches the rule. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows network traffic.</li>
         * <li><strong>drop</strong>: blocks network traffic.</li>
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
         * <p>The port range.</p>
         * <ul>
         * <li>If you set <strong>Protocol</strong> to <strong>all</strong> or <strong>icmp</strong>, set this parameter to -1/-1, which specifies all ports.</li>
         * <li>If you set <strong>Protocol</strong> to <strong>tcp</strong> or <strong>udp</strong>, the port can be <strong>1 to 65535</strong>. You can set this parameter to <strong>1/200</strong> or <strong>80/80</strong>, which specifies ports 1 to 200 or port 80.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * <p>The priority of the rule. Valid values: <strong>1 to 100</strong>. Default value: <strong>1</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The protocol. Valid values:</p>
         * <ul>
         * <li><strong>icmp</strong>: ICMP</li>
         * <li><strong>tcp</strong>: TCP</li>
         * <li><strong>udp</strong>: UDP</li>
         * <li><strong>all</strong>: all protocols</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        @Override
        public CreateNetworkAclEntryRequest build() {
            return new CreateNetworkAclEntryRequest(this);
        } 

    } 

}
