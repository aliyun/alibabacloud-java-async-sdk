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
 * {@link CreateExpressConnectTrafficQosRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateExpressConnectTrafficQosRuleRequest</p>
 */
public class CreateExpressConnectTrafficQosRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstCidr")
    private String dstCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstIPv6Cidr")
    private String dstIPv6Cidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstPortRange")
    private String dstPortRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MatchDscp")
    private Integer matchDscp;

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
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QosId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String qosId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String queueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemarkingDscp")
    private Integer remarkingDscp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleDescription")
    private String ruleDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcCidr")
    private String srcCidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIPv6Cidr")
    private String srcIPv6Cidr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcPortRange")
    private String srcPortRange;

    private CreateExpressConnectTrafficQosRuleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dstCidr = builder.dstCidr;
        this.dstIPv6Cidr = builder.dstIPv6Cidr;
        this.dstPortRange = builder.dstPortRange;
        this.matchDscp = builder.matchDscp;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.priority = builder.priority;
        this.protocol = builder.protocol;
        this.qosId = builder.qosId;
        this.queueId = builder.queueId;
        this.regionId = builder.regionId;
        this.remarkingDscp = builder.remarkingDscp;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.ruleDescription = builder.ruleDescription;
        this.ruleName = builder.ruleName;
        this.srcCidr = builder.srcCidr;
        this.srcIPv6Cidr = builder.srcIPv6Cidr;
        this.srcPortRange = builder.srcPortRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExpressConnectTrafficQosRuleRequest create() {
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
     * @return dstCidr
     */
    public String getDstCidr() {
        return this.dstCidr;
    }

    /**
     * @return dstIPv6Cidr
     */
    public String getDstIPv6Cidr() {
        return this.dstIPv6Cidr;
    }

    /**
     * @return dstPortRange
     */
    public String getDstPortRange() {
        return this.dstPortRange;
    }

    /**
     * @return matchDscp
     */
    public Integer getMatchDscp() {
        return this.matchDscp;
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
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return queueId
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remarkingDscp
     */
    public Integer getRemarkingDscp() {
        return this.remarkingDscp;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return ruleDescription
     */
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return srcCidr
     */
    public String getSrcCidr() {
        return this.srcCidr;
    }

    /**
     * @return srcIPv6Cidr
     */
    public String getSrcIPv6Cidr() {
        return this.srcIPv6Cidr;
    }

    /**
     * @return srcPortRange
     */
    public String getSrcPortRange() {
        return this.srcPortRange;
    }

    public static final class Builder extends Request.Builder<CreateExpressConnectTrafficQosRuleRequest, Builder> {
        private String clientToken; 
        private String dstCidr; 
        private String dstIPv6Cidr; 
        private String dstPortRange; 
        private Integer matchDscp; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer priority; 
        private String protocol; 
        private String qosId; 
        private String queueId; 
        private String regionId; 
        private Integer remarkingDscp; 
        private String resourceOwnerAccount; 
        private String ruleDescription; 
        private String ruleName; 
        private String srcCidr; 
        private String srcIPv6Cidr; 
        private String srcPortRange; 

        private Builder() {
            super();
        } 

        private Builder(CreateExpressConnectTrafficQosRuleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dstCidr = request.dstCidr;
            this.dstIPv6Cidr = request.dstIPv6Cidr;
            this.dstPortRange = request.dstPortRange;
            this.matchDscp = request.matchDscp;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.priority = request.priority;
            this.protocol = request.protocol;
            this.qosId = request.qosId;
            this.queueId = request.queueId;
            this.regionId = request.regionId;
            this.remarkingDscp = request.remarkingDscp;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.ruleDescription = request.ruleDescription;
            this.ruleName = request.ruleName;
            this.srcCidr = request.srcCidr;
            this.srcIPv6Cidr = request.srcIPv6Cidr;
            this.srcPortRange = request.srcPortRange;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The destination IP address IPv4 CIDR block for traffic matching in the QoS rule.</p>
         * <blockquote>
         * <p>You cannot specify this parameter together with <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>1.1.**.**</code>/24</p>
         */
        public Builder dstCidr(String dstCidr) {
            this.putQueryParameter("DstCidr", dstCidr);
            this.dstCidr = dstCidr;
            return this;
        }

        /**
         * <p>The destination IP address IPv6 CIDR block for traffic matching in the QoS rule.</p>
         * <blockquote>
         * <p>You cannot specify this parameter together with <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:0db8:1234:****::/64</p>
         */
        public Builder dstIPv6Cidr(String dstIPv6Cidr) {
            this.putQueryParameter("DstIPv6Cidr", dstIPv6Cidr);
            this.dstIPv6Cidr = dstIPv6Cidr;
            return this;
        }

        /**
         * <p>The destination port range for traffic matching in the QoS rule. Valid values: <strong>0</strong> to <strong>65535</strong>. Set the value to -1 if no matching is required. Currently, only a single port number can be specified. The start and end port numbers must be the same. The destination port range is fixed for each protocol type. Valid values:</p>
         * <ul>
         * <li><p><strong>ALL</strong>: -1/-1. Not editable.</p>
         * </li>
         * <li><p><strong>ICMP(IPv4)</strong>: -1/-1. Not editable.</p>
         * </li>
         * <li><p><strong>ICMPv6(IPv6)</strong>: -1/-1. Not editable.</p>
         * </li>
         * <li><p><strong>TCP</strong>: -1/-1. Editable.</p>
         * </li>
         * <li><p><strong>UDP</strong>: -1/-1. Editable.</p>
         * </li>
         * <li><p><strong>GRE</strong>: -1/-1. Not editable.</p>
         * </li>
         * <li><p><strong>SSH</strong>: 22/22. Not editable.</p>
         * </li>
         * <li><p><strong>Telnet</strong>: 23/23. Not editable.</p>
         * </li>
         * <li><p><strong>HTTP</strong>: 80/80. Not editable.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: 443/443. Not editable.</p>
         * </li>
         * <li><p><strong>MS SQL</strong>: 1443/1443. Not editable.</p>
         * </li>
         * <li><p><strong>Oracle</strong>: 1521/1521. Not editable.</p>
         * </li>
         * <li><p><strong>MySql</strong>: 3306/3306. Not editable.</p>
         * </li>
         * <li><p><strong>RDP</strong>: 3389/3389. Not editable.</p>
         * </li>
         * <li><p><strong>PostgreSQL</strong>: 5432/5432. Not editable.</p>
         * </li>
         * <li><p><strong>Redis</strong>: 6379/6379. Not editable.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        public Builder dstPortRange(String dstPortRange) {
            this.putQueryParameter("DstPortRange", dstPortRange);
            this.dstPortRange = dstPortRange;
            return this;
        }

        /**
         * <p>The DSCP value for traffic matching in the QoS rule. Valid values: <strong>0</strong> to <strong>63</strong>. Set the value to -1 if no matching is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder matchDscp(Integer matchDscp) {
            this.putQueryParameter("MatchDscp", matchDscp);
            this.matchDscp = matchDscp;
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
         * <p>The priority of the QoS rule. Valid values: <strong>1</strong> to <strong>9000</strong>. A larger value indicates a higher priority. The priority must be unique within the same QoS policy.</p>
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
         * <p>The protocol type of the QoS rule. Valid values:</p>
         * <ul>
         * <li><p><strong>ALL</strong></p>
         * </li>
         * <li><p><strong>ICMP(IPv4)</strong></p>
         * </li>
         * <li><p><strong>ICMPv6(IPv6)</strong></p>
         * </li>
         * <li><p><strong>TCP</strong></p>
         * </li>
         * <li><p><strong>UDP</strong></p>
         * </li>
         * <li><p><strong>GRE</strong></p>
         * </li>
         * <li><p><strong>SSH</strong></p>
         * </li>
         * <li><p><strong>Telnet</strong></p>
         * </li>
         * <li><p><strong>HTTP</strong></p>
         * </li>
         * <li><p><strong>HTTPS</strong></p>
         * </li>
         * <li><p><strong>MS SQL</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * <li><p><strong>MySql</strong></p>
         * </li>
         * <li><p><strong>RDP</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>Redis</strong></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The QoS policy ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-2giu0a6vd5x0mv****</p>
         */
        public Builder qosId(String qosId) {
            this.putQueryParameter("QosId", qosId);
            this.qosId = qosId;
            return this;
        }

        /**
         * <p>The QoS queue ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rc****</p>
         */
        public Builder queueId(String queueId) {
            this.putQueryParameter("QueueId", queueId);
            this.queueId = queueId;
            return this;
        }

        /**
         * <p>The region ID of the QoS policy.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The new DSCP value to remark on the traffic. Valid values: <strong>0</strong> to <strong>63</strong>. Set the value to -1 if no remarking is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder remarkingDscp(Integer remarkingDscp) {
            this.putQueryParameter("RemarkingDscp", remarkingDscp);
            this.remarkingDscp = remarkingDscp;
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
         * <p>The description of the QoS rule.</p>
         * <p>The description must be 0 to 256 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rule-test</p>
         */
        public Builder ruleDescription(String ruleDescription) {
            this.putQueryParameter("RuleDescription", ruleDescription);
            this.ruleDescription = ruleDescription;
            return this;
        }

        /**
         * <p>The name of the QoS rule.</p>
         * <p>The name must be 0 to 128 characters in length and cannot start with <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rule-test</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The source IPv4 CIDR block for traffic matching in the QoS rule.</p>
         * <blockquote>
         * <p>You cannot specify this parameter together with <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><code>1.1.**.**</code>/24</p>
         */
        public Builder srcCidr(String srcCidr) {
            this.putQueryParameter("SrcCidr", srcCidr);
            this.srcCidr = srcCidr;
            return this;
        }

        /**
         * <p>The source IPv6 CIDR block for traffic matching in the QoS rule.</p>
         * <blockquote>
         * <p>You cannot specify this parameter together with <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:0db8:1234:****::/64</p>
         */
        public Builder srcIPv6Cidr(String srcIPv6Cidr) {
            this.putQueryParameter("SrcIPv6Cidr", srcIPv6Cidr);
            this.srcIPv6Cidr = srcIPv6Cidr;
            return this;
        }

        /**
         * <p>The source port range for traffic matching in the QoS rule. Valid values: <strong>0</strong> to <strong>65535</strong>. Set the value to -1 if no matching is required. Currently, only a single port number can be specified. The start and end port numbers must be the same.</p>
         * 
         * <strong>example:</strong>
         * <p>-1/-1</p>
         */
        public Builder srcPortRange(String srcPortRange) {
            this.putQueryParameter("SrcPortRange", srcPortRange);
            this.srcPortRange = srcPortRange;
            return this;
        }

        @Override
        public CreateExpressConnectTrafficQosRuleRequest build() {
            return new CreateExpressConnectTrafficQosRuleRequest(this);
        } 

    } 

}
