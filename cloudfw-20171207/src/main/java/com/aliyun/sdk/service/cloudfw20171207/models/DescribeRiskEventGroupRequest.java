// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskEventGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeRiskEventGroupRequest</p>
 */
public class DescribeRiskEventGroupRequest extends Request {
    @Query
    @NameInMap("AttackApp")
    private java.util.List < String > attackApp;

    @Query
    @NameInMap("AttackType")
    private String attackType;

    @Query
    @NameInMap("BuyVersion")
    private Long buyVersion;

    @Query
    @NameInMap("CurrentPage")
    private String currentPage;

    @Query
    @NameInMap("DataType")
    @Validation(required = true)
    private String dataType;

    @Query
    @NameInMap("Direction")
    private String direction;

    @Query
    @NameInMap("DstIP")
    private String dstIP;

    @Query
    @NameInMap("DstNetworkInstanceId")
    private String dstNetworkInstanceId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("EventName")
    private String eventName;

    @Query
    @NameInMap("FirewallType")
    private String firewallType;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NoLocation")
    private String noLocation;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RuleResult")
    private String ruleResult;

    @Query
    @NameInMap("RuleSource")
    private String ruleSource;

    @Query
    @NameInMap("Sort")
    private String sort;

    @Query
    @NameInMap("SrcIP")
    private String srcIP;

    @Query
    @NameInMap("SrcNetworkInstanceId")
    private String srcNetworkInstanceId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("VulLevel")
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
         * The names of attacked applications. Set the value in the `["AttackApp1","AttackApp2"]` format.
         */
        public Builder attackApp(java.util.List < String > attackApp) {
            this.putQueryParameter("AttackApp", attackApp);
            this.attackApp = attackApp;
            return this;
        }

        /**
         * The attack type of the intrusion events. Valid values:
         * <p>
         * 
         * *   **1**: suspicious connection
         * *   **2**: command execution
         * *   **3**: brute-force attack
         * *   **4**: scanning
         * *   **5**: others
         * *   **6**: information leak
         * *   **7**: DoS attack
         * *   **8**: buffer overflow attack
         * *   **9**: web attack
         * *   **10**: trojan backdoor
         * *   **11**: computer worm
         * *   **12**: mining
         * *   **13**: reverse shell
         * 
         * > If you do not specify this parameter, the intrusion events of all attack types are queried.
         */
        public Builder attackType(String attackType) {
            this.putQueryParameter("AttackType", attackType);
            this.attackType = attackType;
            return this;
        }

        /**
         * The edition of Cloud Firewall that you purchase. Valid values:
         * <p>
         * 
         * *   **2**: Premium Edition
         * *   **3**: Enterprise Edition
         * *   **4**: Ultimate Edition
         * *   **10**: Cloud Firewall that uses the pay-as-you-go billing method
         */
        public Builder buyVersion(Long buyVersion) {
            this.putQueryParameter("BuyVersion", buyVersion);
            this.buyVersion = buyVersion;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The type of the risk events.\
         * <p>
         * Set the value to **session**, which indicates intrusion events.
         */
        public Builder dataType(String dataType) {
            this.putQueryParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * The direction of the traffic for the intrusion events. Valid values:
         * <p>
         * 
         * *   **in**: inbound
         * *   **out**: outbound
         * 
         * > If you do not specify this parameter, the intrusion events that are recorded for both inbound and outbound traffic are queried.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * The destination IP address to query. If you specify this parameter, all intrusion events with the specified destination IP address are queried.
         */
        public Builder dstIP(String dstIP) {
            this.putQueryParameter("DstIP", dstIP);
            this.dstIP = dstIP;
            return this;
        }

        /**
         * The ID of the destination VPC.
         * <p>
         * 
         * > If the FirewallType parameter is set to VpcFirewall, you must specify this parameter.
         */
        public Builder dstNetworkInstanceId(String dstNetworkInstanceId) {
            this.putQueryParameter("DstNetworkInstanceId", dstNetworkInstanceId);
            this.dstNetworkInstanceId = dstNetworkInstanceId;
            return this;
        }

        /**
         * The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The name of the intrusion event.
         */
        public Builder eventName(String eventName) {
            this.putQueryParameter("EventName", eventName);
            this.eventName = eventName;
            return this;
        }

        /**
         * The type of the firewall. Valid values:
         * <p>
         * 
         * *   **VpcFirewall**: virtual private cloud (VPC) firewall
         * *   **InternetFirewall**: Internet firewall (default)
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * The language of the content within the request and response. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese (default)
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether to query the information about the geographical locations of IP addresses.
         * <p>
         * 
         * *   **true**: does not query the information about the geographical locations of IP addresses.
         * *   **false**: queries the information about the geographical locations of IP addresses. This is the default value.
         */
        public Builder noLocation(String noLocation) {
            this.putQueryParameter("NoLocation", noLocation);
            this.noLocation = noLocation;
            return this;
        }

        /**
         * The order in which you want to sort the results. Valid values:
         * <p>
         * 
         * *   **asc**: the ascending order.
         * *   **desc**: the descending order. This is the default value.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Default value: **6**. Maximum value: **10**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The status of the firewall. Valid values:
         * <p>
         * 
         * *   **1**: alerting
         * *   **2**: blocking
         * 
         * > If you do not specify this parameter, all intrusion events that are detected by the firewall are queried, regardless of the firewall status.
         */
        public Builder ruleResult(String ruleResult) {
            this.putQueryParameter("RuleResult", ruleResult);
            this.ruleResult = ruleResult;
            return this;
        }

        /**
         * The module of the rule that is used to detect the intrusion events. Valid values:
         * <p>
         * 
         * *   **1**: basic protection
         * *   **2**: virtual patching
         * *   **4**: threat intelligence
         * 
         * > If you do not specify this parameter, the intrusion events that are detected by all rules are queried.
         */
        public Builder ruleSource(String ruleSource) {
            this.putQueryParameter("RuleSource", ruleSource);
            this.ruleSource = ruleSource;
            return this;
        }

        /**
         * The field based on which you want to sort the results. Valid values:
         * <p>
         * 
         * *   **VulLevel**: The results are sorted based on the risk level field. This is the default value.
         * *   **LastTime**: The results are sorted based on the most recent occurrence time.
         */
        public Builder sort(String sort) {
            this.putQueryParameter("Sort", sort);
            this.sort = sort;
            return this;
        }

        /**
         * The source IP address to query. If you specify this parameter, all intrusion events with the specified source IP address are queried.
         */
        public Builder srcIP(String srcIP) {
            this.putQueryParameter("SrcIP", srcIP);
            this.srcIP = srcIP;
            return this;
        }

        /**
         * The ID of the source VPC.
         * <p>
         * 
         * > If the FirewallType parameter is set to VpcFirewall, you must specify this parameter.
         */
        public Builder srcNetworkInstanceId(String srcNetworkInstanceId) {
            this.putQueryParameter("SrcNetworkInstanceId", srcNetworkInstanceId);
            this.srcNetworkInstanceId = srcNetworkInstanceId;
            return this;
        }

        /**
         * The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The risk level of the intrusion events. Valid values:
         * <p>
         * 
         * *   **1**: low
         * *   **2**: medium
         * *   **3**: high
         * 
         * > If you do not specify this parameter, the intrusion events that are at all risk levels are queried.
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
