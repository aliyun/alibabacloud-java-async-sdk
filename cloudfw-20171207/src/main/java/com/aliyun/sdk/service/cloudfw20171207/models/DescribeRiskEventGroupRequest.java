// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
    private java.util.List < String > attackApp;

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
    public java.util.List < String > getAttackApp() {
        return this.attackApp;
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
        private java.util.List < String > attackApp; 
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
         * <p>The names of attacked applications. Set the value in the <code>[&quot;AttackApp1&quot;,&quot;AttackApp2&quot;]</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;MySql&quot;,&quot;DNS&quot;]</p>
         */
        public Builder attackApp(java.util.List < String > attackApp) {
            this.putQueryParameter("AttackApp", attackApp);
            this.attackApp = attackApp;
            return this;
        }

        /**
         * <p>The attack type of the intrusion events. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: suspicious connection</li>
         * <li><strong>2</strong>: command execution</li>
         * <li><strong>3</strong>: brute-force attack</li>
         * <li><strong>4</strong>: scanning</li>
         * <li><strong>5</strong>: others</li>
         * <li><strong>6</strong>: information leak</li>
         * <li><strong>7</strong>: DoS attack</li>
         * <li><strong>8</strong>: buffer overflow attack</li>
         * <li><strong>9</strong>: web attack</li>
         * <li><strong>10</strong>: trojan backdoor</li>
         * <li><strong>11</strong>: computer worm</li>
         * <li><strong>12</strong>: mining</li>
         * <li><strong>13</strong>: reverse shell</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the intrusion events of all attack types are queried.</p>
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
         * <p>The edition of Cloud Firewall that you purchase. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Premium Edition</li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>4</strong>: Ultimate Edition</li>
         * <li><strong>10</strong>: Cloud Firewall that uses the pay-as-you-go billing method</li>
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
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>The type of the risk events.<br>Set the value to <strong>session</strong>, which indicates intrusion events.</p>
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
         * <p>The direction of the traffic for the intrusion events. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: inbound</li>
         * <li><strong>out</strong>: outbound</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the intrusion events that are recorded for both inbound and outbound traffic are queried.</p>
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
         * <p>The destination IP address to query. If you specify this parameter, all intrusion events with the specified destination IP address are queried.</p>
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
         * <p>The ID of the destination VPC.</p>
         * <blockquote>
         * <p>If the FirewallType parameter is set to VpcFirewall, you must specify this parameter.</p>
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
         * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The name of the intrusion event.</p>
         * 
         * <strong>example:</strong>
         * <p>Webshell communication</p>
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * <p>The type of the firewall. Valid values:</p>
         * <ul>
         * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewall</li>
         * <li><strong>InternetFirewall</strong>: Internet firewall (default)</li>
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
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
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
         * <p>Specifies whether to query the information about the geographical locations of IP addresses.</p>
         * <ul>
         * <li><strong>true</strong>: does not query the information about the geographical locations of IP addresses.</li>
         * <li><strong>false</strong>: queries the information about the geographical locations of IP addresses. This is the default value.</li>
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
         * <p>The order in which you want to sort the results. Valid values:</p>
         * <ul>
         * <li><strong>asc</strong>: the ascending order.</li>
         * <li><strong>desc</strong>: the descending order. This is the default value.</li>
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
         * <p>The number of entries to return on each page.</p>
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
         * <p>The status of the firewall. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: alerting</li>
         * <li><strong>2</strong>: blocking</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, all intrusion events that are detected by the firewall are queried, regardless of the firewall status.</p>
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
         * <p>The module of the rule that is used to detect the intrusion events. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: basic protection</li>
         * <li><strong>2</strong>: virtual patching</li>
         * <li><strong>4</strong>: threat intelligence</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the intrusion events that are detected by all rules are queried.</p>
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
         * <p>The field based on which you want to sort the results. Valid values:</p>
         * <ul>
         * <li><strong>VulLevel</strong>: The results are sorted based on the risk level field. This is the default value.</li>
         * <li><strong>LastTime</strong>: The results are sorted based on the most recent occurrence time.</li>
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
         * <p>The source IP address to query. If you specify this parameter, all intrusion events with the specified source IP address are queried.</p>
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
         * <p>The ID of the source VPC.</p>
         * <blockquote>
         * <p>If the FirewallType parameter is set to VpcFirewall, you must specify this parameter.</p>
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
         * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
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
         * <p>The risk level of the intrusion events. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: low</li>
         * <li><strong>2</strong>: medium</li>
         * <li><strong>3</strong>: high</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the intrusion events that are at all risk levels are queried.</p>
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
