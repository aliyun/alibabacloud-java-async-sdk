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
 * {@link UpdateTrafficMarkingPolicyAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrafficMarkingPolicyAttributeRequest</p>
 */
public class UpdateTrafficMarkingPolicyAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddTrafficMatchRules")
    private java.util.List<AddTrafficMatchRules> addTrafficMatchRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteTrafficMatchRules")
    private java.util.List<DeleteTrafficMatchRules> deleteTrafficMatchRules;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyDescription")
    private String trafficMarkingPolicyDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trafficMarkingPolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrafficMarkingPolicyName")
    private String trafficMarkingPolicyName;

    private UpdateTrafficMarkingPolicyAttributeRequest(Builder builder) {
        super(builder);
        this.addTrafficMatchRules = builder.addTrafficMatchRules;
        this.clientToken = builder.clientToken;
        this.deleteTrafficMatchRules = builder.deleteTrafficMatchRules;
        this.dryRun = builder.dryRun;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.trafficMarkingPolicyDescription = builder.trafficMarkingPolicyDescription;
        this.trafficMarkingPolicyId = builder.trafficMarkingPolicyId;
        this.trafficMarkingPolicyName = builder.trafficMarkingPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTrafficMarkingPolicyAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addTrafficMatchRules
     */
    public java.util.List<AddTrafficMatchRules> getAddTrafficMatchRules() {
        return this.addTrafficMatchRules;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deleteTrafficMatchRules
     */
    public java.util.List<DeleteTrafficMatchRules> getDeleteTrafficMatchRules() {
        return this.deleteTrafficMatchRules;
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
     * @return trafficMarkingPolicyId
     */
    public String getTrafficMarkingPolicyId() {
        return this.trafficMarkingPolicyId;
    }

    /**
     * @return trafficMarkingPolicyName
     */
    public String getTrafficMarkingPolicyName() {
        return this.trafficMarkingPolicyName;
    }

    public static final class Builder extends Request.Builder<UpdateTrafficMarkingPolicyAttributeRequest, Builder> {
        private java.util.List<AddTrafficMatchRules> addTrafficMatchRules; 
        private String clientToken; 
        private java.util.List<DeleteTrafficMatchRules> deleteTrafficMatchRules; 
        private Boolean dryRun; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String trafficMarkingPolicyDescription; 
        private String trafficMarkingPolicyId; 
        private String trafficMarkingPolicyName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTrafficMarkingPolicyAttributeRequest request) {
            super(request);
            this.addTrafficMatchRules = request.addTrafficMatchRules;
            this.clientToken = request.clientToken;
            this.deleteTrafficMatchRules = request.deleteTrafficMatchRules;
            this.dryRun = request.dryRun;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.trafficMarkingPolicyDescription = request.trafficMarkingPolicyDescription;
            this.trafficMarkingPolicyId = request.trafficMarkingPolicyId;
            this.trafficMarkingPolicyName = request.trafficMarkingPolicyName;
        } 

        /**
         * <p>The traffic classification rules to be added to the traffic marking policy.</p>
         * <p>You can add at most 50 traffic classification rules in each call.</p>
         */
        public Builder addTrafficMatchRules(java.util.List<AddTrafficMatchRules> addTrafficMatchRules) {
            this.putQueryParameter("AddTrafficMatchRules", addTrafficMatchRules);
            this.addTrafficMatchRules = addTrafficMatchRules;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The traffic classification rules to be deleted from the traffic marking policy.</p>
         * <blockquote>
         * <p> Specify detailed information about the traffic classification rule, such as the source CIDR block, destination CIDR block, source port, destination port, and DSCP value. If you do not specify sufficient information, the system may fail to match the traffic classification rule that you want to delete.</p>
         * </blockquote>
         */
        public Builder deleteTrafficMatchRules(java.util.List<DeleteTrafficMatchRules> deleteTrafficMatchRules) {
            this.putQueryParameter("DeleteTrafficMatchRules", deleteTrafficMatchRules);
            this.deleteTrafficMatchRules = deleteTrafficMatchRules;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: preforms a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
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
         * <p>The new description of the traffic marking policy.</p>
         * <p>The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). The description must start with a letter.</p>
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
         * <p>The ID of the traffic marking policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tm-u9nxup5kww5po8****</p>
         */
        public Builder trafficMarkingPolicyId(String trafficMarkingPolicyId) {
            this.putQueryParameter("TrafficMarkingPolicyId", trafficMarkingPolicyId);
            this.trafficMarkingPolicyId = trafficMarkingPolicyId;
            return this;
        }

        /**
         * <p>The new name of the traffic marking policy.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder trafficMarkingPolicyName(String trafficMarkingPolicyName) {
            this.putQueryParameter("TrafficMarkingPolicyName", trafficMarkingPolicyName);
            this.trafficMarkingPolicyName = trafficMarkingPolicyName;
            return this;
        }

        @Override
        public UpdateTrafficMarkingPolicyAttributeRequest build() {
            return new UpdateTrafficMarkingPolicyAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTrafficMarkingPolicyAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateTrafficMarkingPolicyAttributeRequest</p>
     */
    public static class AddTrafficMatchRules extends TeaModel {
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

        private AddTrafficMatchRules(Builder builder) {
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

        public static AddTrafficMatchRules create() {
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

            /**
             * <p>The address family. Valid values: You can set the value to IPv4 or IPv6, or leave the value empty.</p>
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
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a destination CIDR block for each traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>172.30.0.0/24</p>
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * <p>The destination port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>Packets whose destination ports fall within the specified destination port range are considered a match. If you do not specify a destination port range, packets are considered a match regardless of the destination port.</p>
             * <p>You can enter up to two port numbers. Take note of the following rules:</p>
             * <ul>
             * <li>If you enter only one port number, such as 1, packets whose destination port is 1 match the traffic classification rule. A value of -1 specifies all destination ports.</li>
             * <li>If you enter two port numbers, such as 1 and 200, packets whose destination ports fall into 1 and 200 are considered a match.</li>
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
             * <p>Requests that carry the specified DSCP value are considered a match. If you do not specify a DSCP value, packets are considered a match regardless of the DSCP value.</p>
             * <blockquote>
             * <p> The DSCP value that you specify for this parameter is the DSCP value that packets carry before they are transmitted over the inter-region connection.</p>
             * </blockquote>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a DSCP value for each traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
             * <li>If the protocol is <strong>ICMP</strong>, set the destination port to <strong>-1</strong>.</li>
             * <li>If the protocol is <strong>GRE</strong>, set the destination port to <strong>-1</strong>.</li>
             * <li>If the protocol is <strong>SSH</strong>, set the destination port to <strong>22</strong>.</li>
             * <li>If the protocol is <strong>Telnet</strong>, set the destination port to <strong>23</strong>.</li>
             * <li>If the protocol is <strong>HTTP</strong>, set the destination port to <strong>80</strong>.</li>
             * <li>If the protocol is <strong>HTTPS</strong>, set the destination port to <strong>443</strong>.</li>
             * <li>If the protocol is <strong>MS SQL</strong>, set the destination port to <strong>1443</strong>.</li>
             * <li>If the protocol is <strong>Oracle</strong>, set the destination port to <strong>1521</strong>.</li>
             * <li>If the protocol is <strong>Mysql</strong>, set the destination port to <strong>3306</strong>.</li>
             * <li>If the protocol is <strong>RDP</strong>, set the destination port to <strong>3389</strong>.</li>
             * <li>If the protocol is <strong>Postgre SQL</strong>, set the destination port to <strong>5432</strong>.</li>
             * <li>If the protocol is <strong>Redis</strong>, the destination port must be <strong>6379</strong>.</li>
             * </ul>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a protocol for each traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>UDP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
             * <p>Packets whose source IP addresses fall into the specified source CIDR block meet the traffic classification rule. If you do not specify a source CIDR block, all packets meet the traffic classification rule.</p>
             * <p>You can create up to 50 traffic classification rules in each call. You can specify a source CIDR block for each traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>10.128.32.0/19</p>
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * <p>The source port range that is used to match packets. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>The traffic classification rule matches the packets whose source ports fall within the source port range. If you do not specify this parameter, packets are considered a match regardless of the source port.</p>
             * <p>You can enter up to two port numbers. Take note of the following rules:</p>
             * <ul>
             * <li>If you enter only one port number, such as 1, packets whose source port is 1 are considered a match. A value of -1 specifies all source ports.</li>
             * <li>If you enter two port numbers, such as 1 and 200, packets whose source ports fall into 1 and 200 are considered a match.</li>
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
             * <p>test1</p>
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
             * <p>Guangzhou Testing</p>
             */
            public Builder trafficMatchRuleName(String trafficMatchRuleName) {
                this.trafficMatchRuleName = trafficMatchRuleName;
                return this;
            }

            public AddTrafficMatchRules build() {
                return new AddTrafficMatchRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateTrafficMarkingPolicyAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateTrafficMarkingPolicyAttributeRequest</p>
     */
    public static class DeleteTrafficMatchRules extends TeaModel {
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

        private DeleteTrafficMatchRules(Builder builder) {
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

        public static DeleteTrafficMatchRules create() {
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

            /**
             * <p>The address family. Valid values: You can set the value to IPv4 or IPv6, or leave the value empty.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv6</p>
             */
            public Builder addressFamily(String addressFamily) {
                this.addressFamily = addressFamily;
                return this;
            }

            /**
             * <p>The destination CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.200.3/32</p>
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * <p>The destination port range that is used to match packets.</p>
             */
            public Builder dstPortRange(java.util.List<Integer> dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * <p>The DSCP value that is used to match packets.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * <p>The protocol that is used to match packets.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/468322.html">ListTrafficMarkingPolicies</a> operation to query the details about a traffic classification rule.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of packets. IPv4 and IPv6 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>10.72.0.0/16</p>
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * <p>The source port range that is used to match packets.</p>
             */
            public Builder srcPortRange(java.util.List<Integer> srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * <p>The description of the traffic classification rule.</p>
             * <p>This parameter is optional. If you enter a description, it must be 1 to 256 characters in length and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou-to-Qingdao CAT</p>
             */
            public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
                this.trafficMatchRuleDescription = trafficMatchRuleDescription;
                return this;
            }

            /**
             * <p>The name of the traffic classification rule.</p>
             * <p>The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder trafficMatchRuleName(String trafficMatchRuleName) {
                this.trafficMatchRuleName = trafficMatchRuleName;
                return this;
            }

            public DeleteTrafficMatchRules build() {
                return new DeleteTrafficMatchRules(this);
            } 

        } 

    }
}
