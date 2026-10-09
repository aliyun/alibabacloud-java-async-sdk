// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeIPSRulesRequest} extends {@link RequestModel}
 *
 * <p>DescribeIPSRulesRequest</p>
 */
public class DescribeIPSRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackApp")
    private String attackApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackAppCategory")
    private java.util.List<String> attackAppCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackApps")
    private java.util.List<String> attackApps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackType")
    private String attackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cve")
    private String cve;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultAction")
    private String defaultAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    private String firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryModify")
    private String queryModify;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleClass")
    private String ruleClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleLevel")
    private Long ruleLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcFirewallId")
    private String vpcFirewallId;

    private DescribeIPSRulesRequest(Builder builder) {
        super(builder);
        this.attackApp = builder.attackApp;
        this.attackAppCategory = builder.attackAppCategory;
        this.attackApps = builder.attackApps;
        this.attackType = builder.attackType;
        this.cve = builder.cve;
        this.defaultAction = builder.defaultAction;
        this.firewallType = builder.firewallType;
        this.lang = builder.lang;
        this.order = builder.order;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.queryModify = builder.queryModify;
        this.ruleAction = builder.ruleAction;
        this.ruleClass = builder.ruleClass;
        this.ruleId = builder.ruleId;
        this.ruleLevel = builder.ruleLevel;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.sort = builder.sort;
        this.sourceIp = builder.sourceIp;
        this.vpcFirewallId = builder.vpcFirewallId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPSRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackApp
     */
    public String getAttackApp() {
        return this.attackApp;
    }

    /**
     * @return attackAppCategory
     */
    public java.util.List<String> getAttackAppCategory() {
        return this.attackAppCategory;
    }

    /**
     * @return attackApps
     */
    public java.util.List<String> getAttackApps() {
        return this.attackApps;
    }

    /**
     * @return attackType
     */
    public String getAttackType() {
        return this.attackType;
    }

    /**
     * @return cve
     */
    public String getCve() {
        return this.cve;
    }

    /**
     * @return defaultAction
     */
    public String getDefaultAction() {
        return this.defaultAction;
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageNo
     */
    public Long getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryModify
     */
    public String getQueryModify() {
        return this.queryModify;
    }

    /**
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return ruleClass
     */
    public String getRuleClass() {
        return this.ruleClass;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleLevel
     */
    public Long getRuleLevel() {
        return this.ruleLevel;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return vpcFirewallId
     */
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public static final class Builder extends Request.Builder<DescribeIPSRulesRequest, Builder> {
        private String attackApp; 
        private java.util.List<String> attackAppCategory; 
        private java.util.List<String> attackApps; 
        private String attackType; 
        private String cve; 
        private String defaultAction; 
        private String firewallType; 
        private String lang; 
        private String order; 
        private Long pageNo; 
        private Long pageSize; 
        private String queryModify; 
        private String ruleAction; 
        private String ruleClass; 
        private String ruleId; 
        private Long ruleLevel; 
        private String ruleName; 
        private String ruleType; 
        private String sort; 
        private String sourceIp; 
        private String vpcFirewallId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeIPSRulesRequest request) {
            super(request);
            this.attackApp = request.attackApp;
            this.attackAppCategory = request.attackAppCategory;
            this.attackApps = request.attackApps;
            this.attackType = request.attackType;
            this.cve = request.cve;
            this.defaultAction = request.defaultAction;
            this.firewallType = request.firewallType;
            this.lang = request.lang;
            this.order = request.order;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.queryModify = request.queryModify;
            this.ruleAction = request.ruleAction;
            this.ruleClass = request.ruleClass;
            this.ruleId = request.ruleId;
            this.ruleLevel = request.ruleLevel;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.sort = request.sort;
            this.sourceIp = request.sourceIp;
            this.vpcFirewallId = request.vpcFirewallId;
        } 

        /**
         * <p>The application targeted by the attack.</p>
         * 
         * <strong>example:</strong>
         * <p>SMB</p>
         */
        public Builder attackApp(String attackApp) {
            this.putQueryParameter("AttackApp", attackApp);
            this.attackApp = attackApp;
            return this;
        }

        /**
         * <p>The categories of applications targeted by attacks.</p>
         */
        public Builder attackAppCategory(java.util.List<String> attackAppCategory) {
            this.putQueryParameter("AttackAppCategory", attackAppCategory);
            this.attackAppCategory = attackAppCategory;
            return this;
        }

        /**
         * <p>The applications targeted by attacks.</p>
         */
        public Builder attackApps(java.util.List<String> attackApps) {
            this.putQueryParameter("AttackApps", attackApps);
            this.attackApps = attackApps;
            return this;
        }

        /**
         * <p>The attack type.</p>
         * 
         * <strong>example:</strong>
         * <p>Web attack</p>
         */
        public Builder attackType(String attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * <p>The CVE ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2026-25253</p>
         */
        public Builder cve(String cve) {
            this.putQueryParameter("Cve", cve);
            this.cve = cve;
            return this;
        }

        /**
         * <p>The status of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder defaultAction(String defaultAction) {
            this.putQueryParameter("DefaultAction", defaultAction);
            this.defaultAction = defaultAction;
            return this;
        }

        /**
         * <p>The type of firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>VpcFirewall</p>
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * <p>The language of the request and response.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The sort order.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Long pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Indicates whether to retrieve only modified rules.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder queryModify(String queryModify) {
            this.putQueryParameter("QueryModify", queryModify);
            this.queryModify = queryModify;
            return this;
        }

        /**
         * <p>The rule action.</p>
         * 
         * <strong>example:</strong>
         * <p>alert</p>
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * <p>The inspection mode.</p>
         * 
         * <strong>example:</strong>
         * <p>dropStrict</p>
         */
        public Builder ruleClass(String ruleClass) {
            this.putQueryParameter("RuleClass", ruleClass);
            this.ruleClass = ruleClass;
            return this;
        }

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f835533b-01ef-49f4-b172-85bbfd0e****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The rule level.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleLevel(Long ruleLevel) {
            this.putQueryParameter("RuleLevel", ruleLevel);
            this.ruleLevel = ruleLevel;
            return this;
        }

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>Nmap scan detection</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The rule type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>patchRule</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The field to sort by.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdateTime</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8.139.222.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-rnbkqx4a8er21a****</p>
         */
        public Builder vpcFirewallId(String vpcFirewallId) {
            this.putQueryParameter("VpcFirewallId", vpcFirewallId);
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }

        @Override
        public DescribeIPSRulesRequest build() {
            return new DescribeIPSRulesRequest(this);
        } 

    } 

}
