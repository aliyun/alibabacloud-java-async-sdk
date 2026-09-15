// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link UpdateTrafficMirrorFilterRuleAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrafficMirrorFilterRuleAttributeRequest</p>
 */
public class UpdateTrafficMirrorFilterRuleAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
    private String destinationCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationPortRange")
    private String destinationPortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

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
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceCidrBlock")
    private String sourceCidrBlock;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    private String sourcePortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMirrorFilterRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficMirrorFilterRuleId;

    private UpdateTrafficMirrorFilterRuleAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.destinationCidrBlock = builder.destinationCidrBlock;
        this.destinationPortRange = builder.destinationPortRange;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ruleAction = builder.ruleAction;
        this.sourceCidrBlock = builder.sourceCidrBlock;
        this.sourcePortRange = builder.sourcePortRange;
        this.trafficMirrorFilterRuleId = builder.trafficMirrorFilterRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficMirrorFilterRuleAttributeRequest create() {
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
     * @return destinationCidrBlock
     */
    public String getDestinationCidrBlock() {
        return this.destinationCidrBlock;
    }

    /**
     * @return destinationPortRange
     */
    public String getDestinationPortRange() {
        return this.destinationPortRange;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return sourceCidrBlock
     */
    public String getSourceCidrBlock() {
        return this.sourceCidrBlock;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return trafficMirrorFilterRuleId
     */
    public String getTrafficMirrorFilterRuleId() {
        return this.trafficMirrorFilterRuleId;
    }

    public static final class Builder extends Request.Builder<UpdateTrafficMirrorFilterRuleAttributeRequest, Builder> {
        private String clientToken; 
        private String destinationCidrBlock; 
        private String destinationPortRange; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
        private String protocol; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ruleAction; 
        private String sourceCidrBlock; 
        private String sourcePortRange; 
        private String trafficMirrorFilterRuleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrafficMirrorFilterRuleAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.destinationCidrBlock = request.destinationCidrBlock;
            this.destinationPortRange = request.destinationPortRange;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ruleAction = request.ruleAction;
            this.sourceCidrBlock = request.sourceCidrBlock;
            this.sourcePortRange = request.sourcePortRange;
            this.trafficMirrorFilterRuleId = request.trafficMirrorFilterRuleId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe637760</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The destination CIDR block of the network traffic for the inbound or outbound rule to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/24</p>
         */
        public Builder destinationCidrBlock(String destinationCidrBlock) {
            this.putQueryParameter("DestinationCidrBlock", destinationCidrBlock);
            this.destinationCidrBlock = destinationCidrBlock;
            return this;
        }

        /**
         * <p>The destination port range of the network traffic for the inbound or outbound rule to be modified.</p>
         * <blockquote>
         * <p>If <strong>Protocol</strong> is set to <strong>ICMP</strong>, the port range cannot be modified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        public Builder destinationPortRange(String destinationPortRange) {
            this.putQueryParameter("DestinationPortRange", destinationPortRange);
            this.destinationPortRange = destinationPortRange;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the configuration of the inbound or outbound rule is modified.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * <p>The priority of the inbound or outbound rule to be modified. A smaller value indicates a higher priority.</p>
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
         * <p>The Protocol Type of the network traffic to be mirrored by the inbound or outbound rule. Valid values:</p>
         * <ul>
         * <li><p><strong>ALL</strong>: all protocols.</p>
         * </li>
         * <li><p><strong>ICMP</strong>: Internet Control Message Protocol.</p>
         * </li>
         * <li><p><strong>TCP</strong>: Transmission Control Protocol.</p>
         * </li>
         * <li><p><strong>UDP</strong>: User Datagram Protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ICMP</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The region ID of the traffic mirror.</p>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> to query the most recent region list. For more information about regions that support traffic mirroring, see <a href="https://help.aliyun.com/document_detail/207513.html">Traffic mirroring overview</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
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
         * <p>The collection policy of the inbound or outbound rule to be modified. Valid values:</p>
         * <ul>
         * <li><p><strong>accept</strong>: collects network traffic.</p>
         * </li>
         * <li><p><strong>drop</strong>: does not collect network traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>accept</p>
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * <p>The source CIDR block of the network traffic for the inbound or outbound rule to be modified.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder sourceCidrBlock(String sourceCidrBlock) {
            this.putQueryParameter("SourceCidrBlock", sourceCidrBlock);
            this.sourceCidrBlock = sourceCidrBlock;
            return this;
        }

        /**
         * <p>The source port range of the network traffic for the inbound or outbound rule to be modified.</p>
         * <blockquote>
         * <p>If <strong>Protocol</strong> is set to <strong>ICMP</strong>, the port range cannot be modified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>22/40</p>
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.putQueryParameter("SourcePortRange", sourcePortRange);
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * <p>The instance ID of the inbound or outbound rule of the traffic mirroring filter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tmr-j6c89rzmtd3hhdugq****</p>
         */
        public Builder trafficMirrorFilterRuleId(String trafficMirrorFilterRuleId) {
            this.putQueryParameter("TrafficMirrorFilterRuleId", trafficMirrorFilterRuleId);
            this.trafficMirrorFilterRuleId = trafficMirrorFilterRuleId;
            return this;
        }

        @Override
        public UpdateTrafficMirrorFilterRuleAttributeRequest build() {
            return new UpdateTrafficMirrorFilterRuleAttributeRequest(this);
        } 

    } 

}
