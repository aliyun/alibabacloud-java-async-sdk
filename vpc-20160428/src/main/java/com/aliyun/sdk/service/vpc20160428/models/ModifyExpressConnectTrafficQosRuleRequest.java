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
 * {@link ModifyExpressConnectTrafficQosRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyExpressConnectTrafficQosRuleRequest</p>
 */
public class ModifyExpressConnectTrafficQosRuleRequest extends Request {
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
    private Integer priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
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
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

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

    private ModifyExpressConnectTrafficQosRuleRequest(Builder builder) {
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
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.srcCidr = builder.srcCidr;
        this.srcIPv6Cidr = builder.srcIPv6Cidr;
        this.srcPortRange = builder.srcPortRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyExpressConnectTrafficQosRuleRequest create() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
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

    public static final class Builder extends Request.Builder<ModifyExpressConnectTrafficQosRuleRequest, Builder> {
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
        private String ruleId; 
        private String ruleName; 
        private String srcCidr; 
        private String srcIPv6Cidr; 
        private String srcPortRange; 

        private Builder() {
            super();
        } 

        private Builder(ModifyExpressConnectTrafficQosRuleRequest request) {
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
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.srcCidr = request.srcCidr;
            this.srcIPv6Cidr = request.srcIPv6Cidr;
            this.srcPortRange = request.srcPortRange;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
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
         * <p>The destination IPv4 CIDR block that matches the QoS rule traffic.</p>
         * <blockquote>
         * <p>When this parameter is unavailable, specify <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.0/24</p>
         */
        public Builder dstCidr(String dstCidr) {
            this.putQueryParameter("DstCidr", dstCidr);
            this.dstCidr = dstCidr;
            return this;
        }

        /**
         * <p>The destination IPv6 CIDR block that matches the QoS rule traffic.</p>
         * <blockquote>
         * <p>When this parameter is unavailable, specify <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:0db8:1234:5678::/64</p>
         */
        public Builder dstIPv6Cidr(String dstIPv6Cidr) {
            this.putQueryParameter("DstIPv6Cidr", dstIPv6Cidr);
            this.dstIPv6Cidr = dstIPv6Cidr;
            return this;
        }

        /**
         * <p>The range of destination ports that match the QoS rule traffic. Valid values: <strong>0</strong> to <strong>65535</strong>. If the traffic does not match, the value is -1. You can specify only one port. The start port number must be the same as the end port number. Different protocols correspond to different ports. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong> (uneditable): -1/-1.</li>
         * <li><strong>ICMP(IPv4)</strong> (uneditable): -1/-1.</li>
         * <li><strong>ICMPv6(IPv6)</strong> (uneditable): -1/-1.</li>
         * <li><strong>TCP</strong> (editable): -1/-1.</li>
         * <li><strong>UDP</strong> (editable): -1/-1.</li>
         * <li><strong>GRE</strong> (uneditable): -1/-1.</li>
         * <li><strong>SSH</strong> (uneditable): 22/22.</li>
         * <li><strong>Telnet</strong> (uneditable): 23/23.</li>
         * <li><strong>HTTP</strong> (uneditable): 80/80.</li>
         * <li><strong>HTTPS</strong> (uneditable): 443/443.</li>
         * <li><strong>MS SQL</strong> (uneditable): 1443/1443.</li>
         * <li><strong>Oracle</strong> (uneditable): 1521/1521.</li>
         * <li><strong>MySql</strong> (uneditable): 3306/3306.</li>
         * <li><strong>RDP</strong> (uneditable): 3389/3389.</li>
         * <li><strong>PostgreSQL</strong> (uneditable): 5432/5432.</li>
         * <li><strong>Redis</strong> (uneditable): 6379/6379.</li>
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
         * <p>The DSCP value that matches the QoS rule traffic. Valid values: <strong>0</strong> to <strong>63</strong>. If no value is matched, the value is -1.</p>
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
         * <p>The priority of the QoS rule. Valid values: <strong>1</strong> to <strong>9000</strong>. A larger value indicates a higher priority. The priority of each QoS rule must be unique in the same QoS policy.</p>
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
         * <p>The protocol of the QoS rule. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong></li>
         * <li><strong>ICMP(IPv4)</strong></li>
         * <li><strong>ICMPv6(IPv6)</strong></li>
         * <li><strong>TCP</strong></li>
         * <li><strong>UDP</strong></li>
         * <li><strong>GRE</strong></li>
         * <li><strong>SSH</strong></li>
         * <li><strong>Telnet</strong></li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * <li><strong>MS SQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * <li><strong>MySql</strong></li>
         * <li><strong>RDP</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>Redis</strong></li>
         * </ul>
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
         * <p>The ID of the QoS policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-2giu0a6vd5x0mv4700</p>
         */
        public Builder qosId(String qosId) {
            this.putQueryParameter("QosId", qosId);
            this.qosId = qosId;
            return this;
        }

        /**
         * <p>The ID of the QoS queue.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-queue-9nyx2u7n71s2rcy4n5</p>
         */
        public Builder queueId(String queueId) {
            this.putQueryParameter("QueueId", queueId);
            this.queueId = queueId;
            return this;
        }

        /**
         * <p>The region ID of the QoS policy.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The new DSCP value. Valid values: <strong>0</strong> to <strong>63</strong>. If you do not change the value, set the value to -1.</p>
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
         * <p>The ID of the QoS rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-rule-iugg0l9x27f2nocouj</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
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
         * <p>The source IPv4 CIDR block that matches the QoS rule traffic.</p>
         * <blockquote>
         * <p>When this parameter is unavailable, specify <strong>SrcIPv6Cidr</strong> or <strong>DstIPv6Cidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.0/24</p>
         */
        public Builder srcCidr(String srcCidr) {
            this.putQueryParameter("SrcCidr", srcCidr);
            this.srcCidr = srcCidr;
            return this;
        }

        /**
         * <p>The source IPv6 CIDR block that matches the QoS rule traffic.</p>
         * <blockquote>
         * <p>When this parameter is unavailable, specify <strong>SrcCidr</strong> or <strong>DstCidr</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2001:0db8:1234:5678::/64</p>
         */
        public Builder srcIPv6Cidr(String srcIPv6Cidr) {
            this.putQueryParameter("SrcIPv6Cidr", srcIPv6Cidr);
            this.srcIPv6Cidr = srcIPv6Cidr;
            return this;
        }

        /**
         * <p>The range of source ports that match the QoS rule traffic. Valid values: <strong>0</strong> to <strong>65535</strong>. If the traffic does not match, the value is -1. You can specify only one port. The start port number must be the same as the end port number.</p>
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
        public ModifyExpressConnectTrafficQosRuleRequest build() {
            return new ModifyExpressConnectTrafficQosRuleRequest(this);
        } 

    } 

}
