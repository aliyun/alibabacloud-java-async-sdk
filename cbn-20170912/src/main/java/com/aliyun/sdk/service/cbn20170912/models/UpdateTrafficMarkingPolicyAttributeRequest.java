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
         * <p>The list of traffic classification rules to add.</p>
         * <p>You can add up to 50 traffic classification rules at a time.</p>
         */
        public Builder addTrafficMatchRules(java.util.List<AddTrafficMatchRules> addTrafficMatchRules) {
            this.putQueryParameter("AddTrafficMatchRules", addTrafficMatchRules);
            this.addTrafficMatchRules = addTrafficMatchRules;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>The client generates the value of this parameter. Ensure that the value is unique among different requests. The token can be up to 64 ASCII characters in length.</p>
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
         * <p>The list of traffic classification rules to delete.</p>
         * <blockquote>
         * <p>Provide as much information as possible for the traffic classification rules, such as the source CIDR block, destination CIDR block, source port, destination port, and DSCP value. Otherwise, the system may fail to locate the target traffic classification rules and will not delete them.</p>
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
         * <li><strong>true</strong>: performs a dry run. The system checks the required parameters, request syntax, and business restrictions without modifying the name, description, or traffic classification rules of the traffic marking policy. If the request fails the dry run, the corresponding error message is returned. If the request passes the dry run, the error code <code>DryRunOperation</code> is returned.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request. After the request passes the dry run, the name, description, and traffic classification rules of the traffic marking policy are directly modified.</li>
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
         * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
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
         * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
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

            private Builder() {
            } 

            private Builder(AddTrafficMatchRules model) {
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
             * <p>The address family. Valid values: IPv4, IPv6, or empty.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder addressFamily(String addressFamily) {
                this.addressFamily = addressFamily;
                return this;
            }

            /**
             * <p>The destination CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
             * <p>The traffic classification rule matches traffic whose destination IP address falls within the destination CIDR block. If you do not set this parameter, the traffic classification rule matches traffic with any destination IP address.</p>
             * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can specify one destination CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>172.30.0.0/24</p>
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * <p>The destination port of the traffic packet. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>The traffic classification rule matches traffic whose destination port falls within the destination port range. If you do not set this parameter, the traffic classification rule matches traffic with any destination port.</p>
             * <p>This parameter supports up to two port numbers. The input format is described as follows:</p>
             * <ul>
             * <li>If you enter only one port number, such as 1, the system matches traffic whose destination port is 1 by default. If the value is -1, the system matches traffic with any destination port.</li>
             * <li>If you enter two port numbers, such as 1 and 200, the system matches traffic whose destination port is in the range of 1 to 200 by default.</li>
             * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1, which indicates that traffic with any destination port is matched.</li>
             * </ul>
             * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can specify one destination port range.</p>
             */
            public Builder dstPortRange(java.util.List<Integer> dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * <p>The Differentiated Services Code Point (DSCP) value of the traffic packet. Valid values: <strong>0</strong> to <strong>63</strong>.</p>
             * <p>The traffic classification rule matches traffic that contains the specified DSCP value. If you do not set this parameter, the traffic classification rule matches traffic with any DSCP value.</p>
             * <blockquote>
             * <p>The DSCP value refers to the DSCP value that the traffic packet already carries before entering the inter-region connection.</p>
             * </blockquote>
             * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can match one DSCP value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * <p>The protocol type of the traffic packet.</p>
             * <p>The traffic marking policy supports matching traffic of multiple protocol types, such as <strong>HTTP</strong>, <strong>HTTPS</strong>, <strong>TCP</strong>, <strong>UDP</strong>, <strong>SSH</strong>, and <strong>Telnet</strong>. For more protocol types, log on to the <a href="https://cen.console.aliyun.com/cen/list">Cloud Enterprise Network (CEN) console</a>.</p>
             * <details>
             * <summary>Some protocols have fixed ports. Click to view port details.</summary>
             * 
             * <ul>
             * <li>If the protocol type is <strong>ICMP</strong>, the destination port must be set to <strong>-1</strong>.</li>
             * <li>If the protocol type is <strong>GRE</strong>, the destination port must be set to <strong>-1</strong>.</li>
             * <li>If the protocol type is <strong>SSH</strong>, the destination port must be set to <strong>22</strong>.</li>
             * <li>If the protocol type is <strong>Telnet</strong>, the destination port must be set to <strong>23</strong>.</li>
             * <li>If the protocol type is <strong>HTTP</strong>, the destination port must be set to <strong>80</strong>.</li>
             * <li>If the protocol type is <strong>HTTPS</strong>, the destination port must be set to <strong>443</strong>.</li>
             * <li>If the protocol type is <strong>MS SQL</strong>, the destination port must be set to <strong>1443</strong>.</li>
             * <li>If the protocol type is <strong>Oracle</strong>, the destination port must be set to <strong>1521</strong>.</li>
             * <li>If the protocol type is <strong>Mysql</strong>, the destination port must be set to <strong>3306</strong>.</li>
             * <li>If the protocol type is <strong>RDP</strong>, the destination port must be set to <strong>3389</strong>.</li>
             * <li>If the protocol type is <strong>Postgre SQL</strong>, the destination port must be set to <strong>5432</strong>.</li>
             * <li>If the protocol type is <strong>Redis</strong>, the destination port must be set to <strong>6379</strong>.</li>
             * </ul>
             * </details>
             * 
             * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can match one protocol type.</p>
             * 
             * <strong>example:</strong>
             * <p>UDP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
             * <p>The traffic classification rule matches traffic whose source IP address falls within the source CIDR block. If you do not set this parameter, the traffic classification rule matches traffic with any source IP address.</p>
             * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can match one source CIDR block.</p>
             * 
             * <strong>example:</strong>
             * <p>10.128.32.0/19</p>
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * <p>The source port of the traffic packet. Valid values: <strong>-1</strong> and <strong>1</strong> to <strong>65535</strong>.</p>
             * <p>The traffic classification rule matches traffic whose source port falls within the source port range. If you do not set this parameter, the traffic classification rule matches traffic with any source port.</p>
             * <p>This parameter supports up to two port numbers. The input format is described as follows:</p>
             * <ul>
             * <li>If you enter only one port number, such as 1, the system matches traffic whose source port is 1 by default. If the value is -1, the system matches traffic with any source port.</li>
             * <li>If you enter two port numbers, such as 1 and 200, the system matches traffic whose source port is in the range of 1 to 200 by default.</li>
             * <li>If you enter two port numbers and one of them is -1, the other port number must also be -1, which indicates that traffic with any source port is matched.</li>
             * </ul>
             * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can specify one source port range.</p>
             */
            public Builder srcPortRange(java.util.List<Integer> srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * <p>The description of the traffic classification rule.</p>
             * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can have one description.</p>
             * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
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
             * <p>You can add up to 50 traffic classification rules at a time. Each traffic classification rule can have one name.</p>
             * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>Guangzhou test</p>
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

            private Builder() {
            } 

            private Builder(DeleteTrafficMatchRules model) {
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
             * <p>The address family. Valid values: IPv4, IPv6, or empty.</p>
             * 
             * <strong>example:</strong>
             * <p>IPv6</p>
             */
            public Builder addressFamily(String addressFamily) {
                this.addressFamily = addressFamily;
                return this;
            }

            /**
             * <p>The destination CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.200.3/32</p>
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * <p>The destination port of the traffic packet.</p>
             */
            public Builder dstPortRange(java.util.List<Integer> dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * <p>The DSCP value of the traffic packet.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * <p>The protocol type of the traffic packet.</p>
             * <p>You can call the <a href="https://help.aliyun.com/document_detail/468322.html">ListTrafficMarkingPolicies</a> operation to query the details of the traffic classification rules that you want to delete.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The source CIDR block of the traffic packet. IPv4 and IPv6 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>10.72.0.0/16</p>
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * <p>The source port of the traffic packet.</p>
             */
            public Builder srcPortRange(java.util.List<Integer> srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * <p>The description of the traffic classification rule.</p>
             * <p>The description can be empty or 1 to 256 characters in length and cannot start with http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou-Qingdao CAT</p>
             */
            public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
                this.trafficMatchRuleDescription = trafficMatchRuleDescription;
                return this;
            }

            /**
             * <p>The name of the traffic classification rule.</p>
             * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
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
