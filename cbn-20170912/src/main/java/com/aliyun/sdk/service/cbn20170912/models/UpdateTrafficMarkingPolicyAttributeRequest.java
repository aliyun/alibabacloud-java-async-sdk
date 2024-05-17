// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTrafficMarkingPolicyAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateTrafficMarkingPolicyAttributeRequest</p>
 */
public class UpdateTrafficMarkingPolicyAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddTrafficMatchRules")
    private java.util.List < AddTrafficMatchRules> addTrafficMatchRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteTrafficMatchRules")
    private java.util.List < DeleteTrafficMatchRules> deleteTrafficMatchRules;

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
    public java.util.List < AddTrafficMatchRules> getAddTrafficMatchRules() {
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
    public java.util.List < DeleteTrafficMatchRules> getDeleteTrafficMatchRules() {
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
        private java.util.List < AddTrafficMatchRules> addTrafficMatchRules; 
        private String clientToken; 
        private java.util.List < DeleteTrafficMatchRules> deleteTrafficMatchRules; 
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
         * The traffic classification rules to be added to the traffic marking policy.
         */
        public Builder addTrafficMatchRules(java.util.List < AddTrafficMatchRules> addTrafficMatchRules) {
            this.putQueryParameter("AddTrafficMatchRules", addTrafficMatchRules);
            this.addTrafficMatchRules = addTrafficMatchRules;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The traffic classification rules to be deleted from the traffic marking policy.
         * <p>
         * 
         * >  Specify detailed information about the traffic classification rule, such as the source CIDR block, destination CIDR block, source port, destination port, and DSCP value. If you do not specify sufficient information, the system may fail to match the traffic classification rule that you want to delete.
         */
        public Builder deleteTrafficMatchRules(java.util.List < DeleteTrafficMatchRules> deleteTrafficMatchRules) {
            this.putQueryParameter("DeleteTrafficMatchRules", deleteTrafficMatchRules);
            this.deleteTrafficMatchRules = deleteTrafficMatchRules;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **true**: preforms a dry run. The system checks the required parameters, request syntax, and limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false** (default): performs a dry run and sends the request.
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
         * The new description of the traffic marking policy.
         * <p>
         * 
         * The description must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The description must start with a letter.
         */
        public Builder trafficMarkingPolicyDescription(String trafficMarkingPolicyDescription) {
            this.putQueryParameter("TrafficMarkingPolicyDescription", trafficMarkingPolicyDescription);
            this.trafficMarkingPolicyDescription = trafficMarkingPolicyDescription;
            return this;
        }

        /**
         * The ID of the traffic marking policy.
         */
        public Builder trafficMarkingPolicyId(String trafficMarkingPolicyId) {
            this.putQueryParameter("TrafficMarkingPolicyId", trafficMarkingPolicyId);
            this.trafficMarkingPolicyId = trafficMarkingPolicyId;
            return this;
        }

        /**
         * The new name of the traffic marking policy.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). It must start with a letter.
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

    public static class AddTrafficMatchRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstCidr")
        private String dstCidr;

        @com.aliyun.core.annotation.NameInMap("DstPortRange")
        private java.util.List < Integer > dstPortRange;

        @com.aliyun.core.annotation.NameInMap("MatchDscp")
        private Integer matchDscp;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SrcCidr")
        private String srcCidr;

        @com.aliyun.core.annotation.NameInMap("SrcPortRange")
        private java.util.List < Integer > srcPortRange;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleDescription")
        private String trafficMatchRuleDescription;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleName")
        private String trafficMatchRuleName;

        private AddTrafficMatchRules(Builder builder) {
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
         * @return dstCidr
         */
        public String getDstCidr() {
            return this.dstCidr;
        }

        /**
         * @return dstPortRange
         */
        public java.util.List < Integer > getDstPortRange() {
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
        public java.util.List < Integer > getSrcPortRange() {
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
            private String dstCidr; 
            private java.util.List < Integer > dstPortRange; 
            private Integer matchDscp; 
            private String protocol; 
            private String srcCidr; 
            private java.util.List < Integer > srcPortRange; 
            private String trafficMatchRuleDescription; 
            private String trafficMatchRuleName; 

            /**
             * The destination CIDR block that is used to match packets.
             * <p>
             * 
             * Packets whose destination IP addresses fall into the specified destination CIDR block are considered a match. If you do not specify a destination CIDR block, packets are considered a match regardless of the destination IP address.
             * 
             * You can create up to 50 traffic classification rules in each call. You can specify a destination CIDR block for each traffic classification rule.
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * The destination port range that is used to match packets. Valid values: **-1** and **1** to **65535**.
             * <p>
             * 
             * Packets whose destination ports fall into the specified destination port range are considered a match. If you do not specify a destination port range, packets are considered a match regardless of the destination port.
             * 
             * You can enter up to two port numbers. Take note of the following rules:
             * 
             * *   If you enter only one port number, such as 1, packets whose destination port is 1 match the traffic classification rule.
             * *   If you enter two port numbers, such as 1 and 200, packets whose destination ports fall into 1 and 200 are considered a match.
             * *   If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, packets are considered a match regardless of the destination port.
             * 
             * You can create up to 50 traffic classification rules in each call. You can specify a destination port range for each traffic classification rule.
             */
            public Builder dstPortRange(java.util.List < Integer > dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * The Differentiated Service Code Point (DSCP) value that is used to match packets. Valid values: **0** to **63**.
             * <p>
             * 
             * Requests that carry the specified DSCP value are considered a match. If you do not specify a DSCP value, packets are considered a match regardless of the DSCP value.
             * 
             * >  The DSCP value that you specify for this parameter is the DSCP value that packets carry before they are transmitted over the inter-region connection.
             * 
             * You can create up to 50 traffic classification rules in each call. You can specify a DSCP value for each traffic classification rule.
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * The protocol that is used to match packets.
             * <p>
             * 
             * Traffic classification rules support the following protocols: **HTTP**, **HTTPS**, **TCP**, **UDP**, **SSH**, and **Telnet**. For more information, log on to the [CEN console](https://cen.console.aliyun.com/cen/list).
             * 
             * **Some protocols use a fixed port. Click to view the protocols and ports.**
             * 
             * *   If the protocol is **ICMP**, set the destination port to **-1**.
             * *   If the protocol is **GRE**, set the destination port to **-1**.
             * *   If the protocol is **SSH**, set the destination port to **22**.
             * *   If the protocol is **Telnet**, set the destination port to **23**.
             * *   If the protocol is **HTTP**, set the destination port to **80**.
             * *   If the protocol is **HTTPS**, set the destination port to **443**.
             * *   If the protocol is **MS SQL**, set the destination port to **1443**.
             * *   If the protocol is **Oracle**, set the destination port to **1521**.
             * *   If the protocol is **Mysql**, set the destination port to **3306**.
             * *   If the protocol is **RDP**, set the destination port to **3389**.
             * *   If the protocol is **Postgre SQL**, set the destination port to **5432**.
             * *   If the protocol is **Redis**, set the destination port to **6379**.
             * 
             * You can create up to 50 traffic classification rules in each call. You can specify a protocol for each traffic classification rule.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The source CIDR block that is used to match packets.
             * <p>
             * 
             * Packets whose source IP addresses fall into the specified source CIDR block are considered a match. If you do not specify a source CIDR block, packets are considered a match regardless of the source IP address.
             * 
             * You can create up to 50 traffic classification rules in each call. You can specify a source CIDR block for each traffic classification rule.
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * The source port range that is used to match packets. Valid values: **-1** and **1** to **65535**.
             * <p>
             * 
             * Packets whose source ports fall into the specified source port range are considered a match. If you do not specify a source port range, packets are considered a match regardless of the source port.
             * 
             * You can enter up to two port numbers. Take note of the following rules:
             * 
             * *   If you enter only one port number, such as 1, packets whose source port is 1 are considered a match.
             * *   If you enter two port numbers, such as 1 and 200, packets whose source ports fall into 1 and 200 are considered a match.
             * *   If you enter two port numbers and one of them is -1, the other port number must also be -1. In this case, packets are considered a match regardless of the source port.
             * 
             * You can create up to 50 traffic classification rules in each call. You can specify a source port range for each traffic classification rule.
             */
            public Builder srcPortRange(java.util.List < Integer > srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * The description of the traffic classification rule.
             * <p>
             * 
             * You can create up to 50 traffic classification rules in each call. You can specify a description for each traffic classification rule.
             * 
             * This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.
             */
            public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
                this.trafficMatchRuleDescription = trafficMatchRuleDescription;
                return this;
            }

            /**
             * The name of the traffic classification rule.
             * <p>
             * 
             * You can create up to 50 traffic classification rules in each call. You can specify a name for each traffic classification rule.
             * 
             * The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.
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
    public static class DeleteTrafficMatchRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DstCidr")
        private String dstCidr;

        @com.aliyun.core.annotation.NameInMap("DstPortRange")
        private java.util.List < Integer > dstPortRange;

        @com.aliyun.core.annotation.NameInMap("MatchDscp")
        private Integer matchDscp;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("SrcCidr")
        private String srcCidr;

        @com.aliyun.core.annotation.NameInMap("SrcPortRange")
        private java.util.List < Integer > srcPortRange;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleDescription")
        private String trafficMatchRuleDescription;

        @com.aliyun.core.annotation.NameInMap("TrafficMatchRuleName")
        private String trafficMatchRuleName;

        private DeleteTrafficMatchRules(Builder builder) {
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
         * @return dstCidr
         */
        public String getDstCidr() {
            return this.dstCidr;
        }

        /**
         * @return dstPortRange
         */
        public java.util.List < Integer > getDstPortRange() {
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
        public java.util.List < Integer > getSrcPortRange() {
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
            private String dstCidr; 
            private java.util.List < Integer > dstPortRange; 
            private Integer matchDscp; 
            private String protocol; 
            private String srcCidr; 
            private java.util.List < Integer > srcPortRange; 
            private String trafficMatchRuleDescription; 
            private String trafficMatchRuleName; 

            /**
             * The destination CIDR block that is used to match packets.
             */
            public Builder dstCidr(String dstCidr) {
                this.dstCidr = dstCidr;
                return this;
            }

            /**
             * The destination port range that is used to match packets.
             */
            public Builder dstPortRange(java.util.List < Integer > dstPortRange) {
                this.dstPortRange = dstPortRange;
                return this;
            }

            /**
             * The DSCP value that is used to match packets.
             */
            public Builder matchDscp(Integer matchDscp) {
                this.matchDscp = matchDscp;
                return this;
            }

            /**
             * The protocol that is used to match packets.
             * <p>
             * 
             * You can call the [ListTrafficMarkingPolicies](~~468322~~) operation to query the details about a traffic classification rule.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * The source CIDR block that is used to match packets.
             */
            public Builder srcCidr(String srcCidr) {
                this.srcCidr = srcCidr;
                return this;
            }

            /**
             * The source port range that is used to match packets.
             */
            public Builder srcPortRange(java.util.List < Integer > srcPortRange) {
                this.srcPortRange = srcPortRange;
                return this;
            }

            /**
             * The description of the traffic classification rule.
             * <p>
             * 
             * This parameter is optional. If you enter a description, it must be 1 to 256 characters in length, and cannot start with http:// or https://.
             */
            public Builder trafficMatchRuleDescription(String trafficMatchRuleDescription) {
                this.trafficMatchRuleDescription = trafficMatchRuleDescription;
                return this;
            }

            /**
             * The name of the traffic classification rule.
             * <p>
             * 
             * The name can be empty or 1 to 128 characters in length, and cannot start with http:// or https://.
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
