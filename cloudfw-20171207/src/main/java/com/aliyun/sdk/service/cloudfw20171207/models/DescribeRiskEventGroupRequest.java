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
 * {@link DescribeRiskEventGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskEventGroupRequest</p>
 */
public class DescribeRiskEventGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackApp")
    private java.util.List<String> attackApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackAppCategory")
    private java.util.List<String> attackAppCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackType")
    private String attackType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BuyVersion")
    private Long buyVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstIP")
    private String dstIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DstNetworkInstanceId")
    private String dstNetworkInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventName")
    private String eventName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    private String firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOnlyPrivateAssoc")
    private String isOnlyPrivateAssoc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NoLocation")
    private String noLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleResult")
    private String ruleResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSource")
    private String ruleSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcIP")
    private String srcIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcNetworkInstanceId")
    private String srcNetworkInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VulLevel")
    private String vulLevel;

    private DescribeRiskEventGroupRequest(Builder builder) {
        super(builder);
        this.attackApp = builder.attackApp;
        this.attackAppCategory = builder.attackAppCategory;
        this.attackType = builder.attackType;
        this.buyVersion = builder.buyVersion;
        this.currentPage = builder.currentPage;
        this.dataType = builder.dataType;
        this.direction = builder.direction;
        this.dstIP = builder.dstIP;
        this.dstNetworkInstanceId = builder.dstNetworkInstanceId;
        this.endTime = builder.endTime;
        this.eventName = builder.eventName;
        this.firewallType = builder.firewallType;
        this.isOnlyPrivateAssoc = builder.isOnlyPrivateAssoc;
        this.lang = builder.lang;
        this.noLocation = builder.noLocation;
        this.order = builder.order;
        this.pageSize = builder.pageSize;
        this.ruleResult = builder.ruleResult;
        this.ruleSource = builder.ruleSource;
        this.sort = builder.sort;
        this.srcIP = builder.srcIP;
        this.srcNetworkInstanceId = builder.srcNetworkInstanceId;
        this.startTime = builder.startTime;
        this.vulLevel = builder.vulLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskEventGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackApp
     */
    public java.util.List<String> getAttackApp() {
        return this.attackApp;
    }

    /**
     * @return attackAppCategory
     */
    public java.util.List<String> getAttackAppCategory() {
        return this.attackAppCategory;
    }

    /**
     * @return attackType
     */
    public String getAttackType() {
        return this.attackType;
    }

    /**
     * @return buyVersion
     */
    public Long getBuyVersion() {
        return this.buyVersion;
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return dstIP
     */
    public String getDstIP() {
        return this.dstIP;
    }

    /**
     * @return dstNetworkInstanceId
     */
    public String getDstNetworkInstanceId() {
        return this.dstNetworkInstanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventName
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return isOnlyPrivateAssoc
     */
    public String getIsOnlyPrivateAssoc() {
        return this.isOnlyPrivateAssoc;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return noLocation
     */
    public String getNoLocation() {
        return this.noLocation;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleResult
     */
    public String getRuleResult() {
        return this.ruleResult;
    }

    /**
     * @return ruleSource
     */
    public String getRuleSource() {
        return this.ruleSource;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    /**
     * @return srcIP
     */
    public String getSrcIP() {
        return this.srcIP;
    }

    /**
     * @return srcNetworkInstanceId
     */
    public String getSrcNetworkInstanceId() {
        return this.srcNetworkInstanceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return vulLevel
     */
    public String getVulLevel() {
        return this.vulLevel;
    }

    public static final class Builder extends Request.Builder<DescribeRiskEventGroupRequest, Builder> {
        private java.util.List<String> attackApp; 
        private java.util.List<String> attackAppCategory; 
        private String attackType; 
        private Long buyVersion; 
        private String currentPage; 
        private String dataType; 
        private String direction; 
        private String dstIP; 
        private String dstNetworkInstanceId; 
        private String endTime; 
        private String eventName; 
        private String firewallType; 
        private String isOnlyPrivateAssoc; 
        private String lang; 
        private String noLocation; 
        private String order; 
        private String pageSize; 
        private String ruleResult; 
        private String ruleSource; 
        private String sort; 
        private String srcIP; 
        private String srcNetworkInstanceId; 
        private String startTime; 
        private String vulLevel; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRiskEventGroupRequest request) {
            super(request);
            this.attackApp = request.attackApp;
            this.attackAppCategory = request.attackAppCategory;
            this.attackType = request.attackType;
            this.buyVersion = request.buyVersion;
            this.currentPage = request.currentPage;
            this.dataType = request.dataType;
            this.direction = request.direction;
            this.dstIP = request.dstIP;
            this.dstNetworkInstanceId = request.dstNetworkInstanceId;
            this.endTime = request.endTime;
            this.eventName = request.eventName;
            this.firewallType = request.firewallType;
            this.isOnlyPrivateAssoc = request.isOnlyPrivateAssoc;
            this.lang = request.lang;
            this.noLocation = request.noLocation;
            this.order = request.order;
            this.pageSize = request.pageSize;
            this.ruleResult = request.ruleResult;
            this.ruleSource = request.ruleSource;
            this.sort = request.sort;
            this.srcIP = request.srcIP;
            this.srcNetworkInstanceId = request.srcNetworkInstanceId;
            this.startTime = request.startTime;
            this.vulLevel = request.vulLevel;
        } 

        /**
         * <p>The list of names of the attacked applications. Specify the value in the <code>[&quot;AttackApp1&quot;,&quot;AttackApp2&quot;]</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;MySql&quot;,&quot;DNS&quot;]</p>
         */
        public Builder attackApp(java.util.List<String> attackApp) {
            this.putQueryParameter("AttackApp", attackApp);
            this.attackApp = attackApp;
            return this;
        }

        /**
         * <p>The list of categories of the attacked applications. Specify the value in the <code>[&quot;AttackAppCategory1&quot;,&quot;AttackAppCategory2&quot;]</code> format.</p>
         */
        public Builder attackAppCategory(java.util.List<String> attackAppCategory) {
            this.putQueryParameter("AttackAppCategory", attackAppCategory);
            this.attackAppCategory = attackAppCategory;
            return this;
        }

        /**
         * <p>The attack type of the intrusion prevention events. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: abnormal connection.</li>
         * <li><strong>2</strong>: command execute.</li>
         * <li><strong>3</strong>: brute-force attacks.</li>
         * <li><strong>4</strong>: scan.</li>
         * <li><strong>5</strong>: other.</li>
         * <li><strong>6</strong>: information leak.</li>
         * <li><strong>7</strong>: DoS attack.</li>
         * <li><strong>8</strong>: overflow attack.</li>
         * <li><strong>9</strong>: web attack.</li>
         * <li><strong>10</strong>: trojan backdoor.</li>
         * <li><strong>11</strong>: virus worm.</li>
         * <li><strong>12</strong>: mining behavior.</li>
         * <li><strong>13</strong>: reverse shell.</li>
         * </ul>
         * <blockquote>
         * <p>If the Settings for this parameter are not specified, events of all attack types are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder attackType(String attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * <p>The purchased edition. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Premium Edition.</li>
         * <li><strong>3</strong>: Enterprise Edition.</li>
         * <li><strong>4</strong>: Ultimate Edition.</li>
         * <li><strong>10</strong>: Pay-as-you-go Edition.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder buyVersion(Long buyVersion) {
            this.putQueryParameter("BuyVersion", buyVersion);
            this.buyVersion = buyVersion;
            return this;
        }

        /**
         * <p>The paging Settings for the page number to return in a paged query.
         * Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The risk event type. Valid value:  </p>
         * <ul>
         * <li><strong>session</strong>: intrusion prevention event.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session</p>
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The traffic direction of the intrusion prevention events. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound.</li>
         * <li><strong>out</strong>: outbound.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, events in all traffic directions are queried.</p>
         * </blockquote>
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
         * <p>The destination IP address to query. If you specify this parameter, intrusion prevention events that involve the specified destination IP address are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder dstIP(String dstIP) {
            this.putQueryParameter("DstIP", dstIP);
            this.dstIP = dstIP;
            return this;
        }

        /**
         * <p>The instance ID of the destination VPC-connected instance.</p>
         * <blockquote>
         * <p>This parameter is required only when the FirewallType Settings is VpcFirewall.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6e9a9zyokj2ywuo****</p>
         */
        public Builder dstNetworkInstanceId(String dstNetworkInstanceId) {
            this.putQueryParameter("DstNetworkInstanceId", dstNetworkInstanceId);
            this.dstNetworkInstanceId = dstNetworkInstanceId;
            return this;
        }

        /**
         * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408267</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The name of the intrusion prevention event.</p>
         * 
         * <strong>example:</strong>
         * <p>wooden horse rear door communication</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The type of the cloud firewall. Valid values:</p>
         * <ul>
         * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewalls.</li>
         * <li><strong>InternetFirewall</strong> (default): the Internet Border firewall.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InternetFirewall</p>
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * <p>Specifies whether to query only the data for which private IP tracing is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isOnlyPrivateAssoc(String isOnlyPrivateAssoc) {
            this.putQueryParameter("IsOnlyPrivateAssoc", isOnlyPrivateAssoc);
            this.isOnlyPrivateAssoc = isOnlyPrivateAssoc;
            return this;
        }

        /**
         * <p>The language of the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
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
         * <p>Specifies whether to query IP geolocation information. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: IP geolocation information is not queried.</li>
         * <li><strong>false</strong> (default): IP geolocation information is queried.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder noLocation(String noLocation) {
            this.putQueryParameter("NoLocation", noLocation);
            this.noLocation = noLocation;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p><strong>asc</strong>: ascending order.</p>
         * </li>
         * <li><p><strong>desc</strong> (default): descending order.</p>
         * </li>
         * </ul>
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
         * <p>The paging Settings for the number of entries to return on each page in a paged query.</p>
         * <p>Default value: <strong>6</strong>. Maximum value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The defense status of Cloud Firewall. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: alert.</li>
         * <li><strong>2</strong>: block.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, events in all defense statuses are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleResult(String ruleResult) {
            this.putQueryParameter("RuleResult", ruleResult);
            this.ruleResult = ruleResult;
            return this;
        }

        /**
         * <p>The source of the detection rule for the intrusion prevention events. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: basic protection.</li>
         * <li><strong>2</strong>: virtual patches.</li>
         * <li><strong>4</strong>: threat intelligence.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, events detected by rules from all sources are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleSource(String ruleSource) {
            this.putQueryParameter("RuleSource", ruleSource);
            this.ruleSource = ruleSource;
            return this;
        }

        /**
         * <p>The field by which to sort the results. Valid values:</p>
         * <ul>
         * <li><p><strong>VulLevel</strong> (default): sort by severity level.</p>
         * </li>
         * <li><p><strong>LastTime</strong>: sort by the most recent occurrence time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LastTime</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * <p>The source IP address to query. If you specify this parameter, intrusion prevention events that involve the specified source IP address are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        public Builder srcIP(String srcIP) {
            this.putQueryParameter("SrcIP", srcIP);
            this.srcIP = srcIP;
            return this;
        }

        /**
         * <p>The instance ID of the source VPC-connected instance.</p>
         * <blockquote>
         * <p>This parameter is required only when the FirewallType Settings is VpcFirewall.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-uf6e9a9zyokj2ywuo****</p>
         */
        public Builder srcNetworkInstanceId(String srcNetworkInstanceId) {
            this.putQueryParameter("SrcNetworkInstanceId", srcNetworkInstanceId);
            this.srcNetworkInstanceId = srcNetworkInstanceId;
            return this;
        }

        /**
         * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1534408189</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The severity level of the intrusion prevention events. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: low.</li>
         * <li><strong>2</strong>: medium.</li>
         * <li><strong>3</strong>: high.</li>
         * </ul>
         * <blockquote>
         * <p>If this parameter is not specified, events at all severity levels are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder vulLevel(String vulLevel) {
            this.putQueryParameter("VulLevel", vulLevel);
            this.vulLevel = vulLevel;
            return this;
        }

        @Override
        public DescribeRiskEventGroupRequest build() {
            return new DescribeRiskEventGroupRequest(this);
        } 

    } 

}
