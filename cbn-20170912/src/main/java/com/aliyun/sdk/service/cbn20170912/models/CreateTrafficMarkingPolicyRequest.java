// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link CreateTrafficMarkingPolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateTrafficMarkingPolicyRequest</p>
 */
public class CreateTrafficMarkingPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MarkingDscp")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer markingDscp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Priority")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyDescription")
    private String trafficMarkingPolicyDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyName")
    private String trafficMarkingPolicyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMatchRules")
    private java.util.List<TrafficMatchRules> trafficMatchRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterId;

    private CreateTrafficMarkingPolicyRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.markingDscp = builder.markingDscp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMarkingPolicyDescription = builder.trafficMarkingPolicyDescription;
        this.trafficMarkingPolicyName = builder.trafficMarkingPolicyName;
        this.trafficMatchRules = builder.trafficMatchRules;
        this.transitRouterId = builder.transitRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMarkingPolicyRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return markingDscp
     */
    public Integer getMarkingDscp() {
        return this.markingDscp;
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
     * @return trafficMarkingPolicyDescription
     */
    public String getTrafficMarkingPolicyDescription() {
        return this.trafficMarkingPolicyDescription;
    }

    /**
     * @return trafficMarkingPolicyName
     */
    public String getTrafficMarkingPolicyName() {
        return this.trafficMarkingPolicyName;
    }

    /**
     * @return trafficMatchRules
     */
    public java.util.List<TrafficMatchRules> getTrafficMatchRules() {
        return this.trafficMatchRules;
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    public static final class Builder extends Request.Builder<CreateTrafficMarkingPolicyRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private Integer markingDscp; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMarkingPolicyDescription; 
        private String trafficMarkingPolicyName; 
        private java.util.List<TrafficMatchRules> trafficMatchRules; 
        private String transitRouterId; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrafficMarkingPolicyRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.markingDscp = request.markingDscp;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMarkingPolicyDescription = request.trafficMarkingPolicyDescription;
            this.trafficMarkingPolicyName = request.trafficMarkingPolicyName;
            this.trafficMatchRules = request.trafficMatchRules;
            this.transitRouterId = request.transitRouterId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not set this parameter, <strong>ClientToken</strong> is set to the value of <strong>RequestId</strong>. The value of <strong>RequestId</strong> for each API request may be different.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request format, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request.</li>
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
         * <p>The differentiated services code point (DSCP) value to be added to packets that match the traffic classification rule. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
         * <p>The DSCP value of each traffic marking policy on a transit router must be unique.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder markingDscp(Integer markingDscp) {
            this.putQueryParameter("MarkingDscp", markingDscp);
            this.markingDscp = markingDscp;
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
         * <p>The priority value of the traffic marking policy. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * <p>The priority value of each traffic marking policy on a transit router must be unique. A smaller value specifies a higher priority.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder priority(Integer priority) {
            this.putQueryParameter("Priority", priority);
            this.priority = priority;
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
         * <p>The description of the traffic marking policy.</p>
         * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder trafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
            this.putQueryParameter("TrafficMarkingPolicyDescription", trafficMarkingPolicyDescription);
            this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
            return this;
        }

        /**
         * <p>The name of the traffic marking policy.</p>
         * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder trafficMarkingPolicyName(String trafficMarkingPolicyName) {
            this.putQueryParameter("TrafficMarkingPolicyName", trafficMarkingPolicyName);
            this.trafficMarkingPolicyName = trafficMarkingPolicyName;
            return this;
        }

        /**
         * <p>The traffic classification rules in the traffic marking policy.</p>
         * <p>Data packets that meet the traffic classification rule is assigned the DSCP value of quality of service (QoS) policy.</p>
         * <p>You can create up to 50 traffic classification rules.</p>
         */
        public Builder trafficMatchRules(java.util.List<TrafficMatchRules> trafficMatchRules) {
            this.putQueryParameter("TrafficMatchRules", trafficMatchRules);
            this.trafficMatchRules = trafficMatchRules;
            return this;
        }

        /**
         * <p>The ID of the transit router.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-8vbuqeo5h5pu3m01d****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        @Override
        public CreateTrafficMarkingPolicyRequest build() {
            return new CreateTrafficMarkingPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTrafficMarkingPolicyRequest} extends {@link TeaModel}
     *
     * <p>CreateTrafficMarkingPolicyRequest</p>
     */
    public static class TrafficMatchRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressFamily")
        private String addressFamily;

        @com.aliyun.core.annotation.NameInMap("DstCidr")
        private String dstCidr;

        @com.aliyun.core.annotation.NameInMap("DstPortRange")
        private java.util.List<Integer> dstPortRange;

        @com.aliyun.core.annotation.NameInMap("MatchDscp")
        private Integer matchDscp;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SrcCidr")
        private String srcCidr;

        @com.aliyun.core.annotation.NameInMap("SrcPortRange")
        private java.util.List<Integer> srcPortRange;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleDescription")
        private String trafficMatchRuleDescription;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleName")
        private String trafficMatchRuleName;

        private TrafficMatchRules(Builder builder) {
            this.addressFamily = builder.addressFamily;
            this.dstCidr = builder.dstCidr;
            this.dstPortRange = builder.dstPortRange;
            this.matchDscp = builder.matchDscp;
            this.protocol = builder.protocol;
            this.srcCidr = builder.srcCidr;
            this.srcPortRange = builder.srcPortRange;
            this.trafficMatchRuleDescription = builder.trafficMatchRuleDescription;
            this.trafficMatchRuleName = builder.trafficMatchRuleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficMatchRules create() {
            return builder().build();
        }

        /**
         * @return addressFamily
         */
        public String getAddressFamily() {
            return this.addressFamily;
        }

        /**
         * @return dstCidr
         */
        public String getDstCidr() {
            return this.dstCidr;
        }

        /**
         * @return dstPortRange
         */
        public java.util.List<Integer> getDstPortRange() {
            return this.dstPortRange;
        }

        /**
         * @return matchDscp
         */
        public Integer getMatchDscp() {
            return this.matchDscp;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return srcCidr
         */
        public String getSrcCidr() {
            return this.srcCidr;
        }

        /**
         * @return srcPortRange
         */
        public java.util.List<Integer> getSrcPortRange() {
            return this.srcPortRange;
        }

        /**
         * @return trafficMatchRuleDescription
         */
        public String getTrafficMatchRuleDescription() {
            return this.trafficMatchRuleDescription;
        }

        /**
         * @return trafficMatchRuleName
         */
        public String getTrafficMatchRuleName() {
            return this.trafficMatchRuleName;
        }

        public static final class Builder {
            private String addressFamily; 
            private String dstCidr; 
            private java.util.List<Integer> dstPortRange; 
            private Integer matchDscp; 
            private String protocol; 
            private String srcCidr; 
            private java.util.List<Integer> srcPortRange; 
            private String trafficMatchRuleDescription; 
            private String trafficMatchRuleName; 

            private Builder() {
            } 

            private Builder(TrafficMatchRules model) {
                this.addressFamily = model.addressFamily;
                this.dstCidr = model.dstCidr;
                this.dstPortRange = model.dstPortRange;
                this.matchDscp = model.matchDscp;
                this.protocol = model.protocol;
                this.srcCidr = model.srcCidr;
                this.srcPortRange = model.srcPortRange;
                this.trafficMatchRuleDescription = model.trafficMatchRuleDescription;
                this.trafficMatchRuleName = model.trafficMatchRuleName;
            } 

            /**
             * <p>The address family. You can set the value to IPv4 or IPv6, or leave the value empty.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder addressFamily(String addressFamily) {
                this.addressFamily = addressFamily;
                return this;
            }

            /**
             * <p>The destination CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
             * <p>Packets whose destination IP addresses fall into the specified destination CIDR block meet the traffic classification rule. If you do not specify a destination CIDR block, all packets meet the traffic classification rule.</p>
             * <p>You can create up to 50 traffic classification rules in each call You can specify a destination CIDR block for each traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10.10.10.0/24</p>
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * <p>The destination port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>Packets whose destination ports fall within the destination port range meet the traffic classification rule. If you do not specify destination port range, all packets meet the traffic classification rule.</p>
             * <p>You can enter up to two port numbers. Take note of the following rules:</p>
             * <ul>
             * <li>If you enter only one port number, such as 1, packets whose destination port is 1 meet the traffic classification rule. A value of -1 specifies all destination ports.</li>
             * <li>If you enter two port numbers, such as 1 and 200, packets whose destination ports fall into 1 and 200 meet the traffic classification rule.</li>
             * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, all packets meet the traffic classification rule.</li>
             * </ul>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a destination port range for each traffic classification rule.</p>
             */
            public Builder dstPortRange(java.util.List<Integer> dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * <p>The Differentiated Service Code Point (DSCP) value that is used to match packets. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
             * <p>Packets that carry the specified DSCP value meet the traffic classification rule. If you do not specify a DSCP value, all packets meet the traffic classification rule.</p>
             * <blockquote>
             * <p> The DSCP value that you specify for this parameter is the DSCP value that packets carry before they are transmitted over the inter-region connection.</p>
             * </blockquote>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a DSCP value for each traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * <p>The protocol that is used to match packets.</p>
             * <p>Traffic classification rules support the following protocols: <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more information, log on to the <a href="https://cen.console.aliyun.com/cen/list">CEN console</a>.</p>
             * <p><strong>Some protocols use a fixed port. Click to view the protocols and ports.</strong></p>
             * <ul>
             * <li>If the protocol is <strong>ICMP</strong>, the destination port must be <strong>-1</strong>.</li>
             * <li>If the protocol is <strong>GRE</strong>, the destination port must be <strong>1</strong>.</li>
             * <li>If the protocol is <strong>SSH</strong>, the destination port must be <strong>22</strong>.</li>
             * <li>If the protocol is <strong>Telnet</strong>, the destination port must be <strong>23</strong>.</li>
             * <li>If the protocol is <strong>HTTP</strong>, the destination port must be <strong>80</strong>.</li>
             * <li>If the protocol is <strong>HTTPS</strong>, the destination port must be <strong>443</strong>.</li>
             * <li>If the protocol is <strong>MS SQL</strong>, the destination port must be <strong>1443</strong>.</li>
             * <li>If the protocol is <strong>Oracle</strong>, the destination port must be <strong>1521</strong>.</li>
             * <li>If the protocol is <strong>Mysql</strong>, the destination port must be <strong>3306</strong>.</li>
             * <li>If the protocol is <strong>RDP</strong>, the destination port must be <strong>3389</strong>.</li>
             * <li>If the protocol is <strong>Postgre SQL</strong>, the destination port must be <strong>5432</strong>.</li>
             * <li>If the protocol is <strong>Redis</strong>, the destination port must be <strong>6379</strong>.</li>
             * </ul>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a protocol for each traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of packets. IPv6 and IPv4 addresses are supported.</p>
             * <p>Packets whose source IP addresses fall into the specified source CIDR block meet the traffic classification rule. If you do not specify a source CIDR block, all packets meet the traffic classification rule.</p>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a source CIDR block for each traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.10.0/24</p>
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * <p>The source port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>Packets whose source ports fall within the source port range meet the traffic classification rule. If you do not specify a source port range, all packets meet the traffic classification rule.</p>
             * <p>You can enter up to two port numbers. Take note of the following rules:</p>
             * <ul>
             * <li>If you enter only one port number, such as 1, packets whose source port is 1 meet the traffic classification rule. A value of -1 specifies all source ports.</li>
             * <li>If you enter two port numbers, such as 1 and 200, packets whose source ports fall into 1 and 200 meet the traffic classification rule.</li>
             * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, all packets meet the traffic classification rule.</li>
             * </ul>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a source port range for each traffic classification rule.</p>
             */
            public Builder srcPortRange(java.util.List<Integer> srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * <p>The description of the traffic classification rule.</p>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a description for each traffic classification rule.</p>
             * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>desctest</p>
             */
            public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
                this.trafficMatchRuleDescription = trafficMatchRuleDescription;
                return this;
            }

            /**
             * <p>The name of the traffic classification rule.</p>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a name for each traffic classification rule.</p>
             * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder trafficMatchRuleName(String trafficMatchRuleName) {
                this.trafficMatchRuleName = trafficMatchRuleName;
                return this;
            }

            public TrafficMatchRules build() {
                return new TrafficMatchRules(this);
            } 

        } 

    }
}
