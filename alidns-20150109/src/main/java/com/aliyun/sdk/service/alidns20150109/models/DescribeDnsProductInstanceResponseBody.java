// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDnsProductInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsProductInstanceResponseBody</p>
 */
public class DescribeDnsProductInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @com.aliyun.core.annotation.NameInMap("BindCount")
    private Long bindCount;

    @com.aliyun.core.annotation.NameInMap("BindDomainCount")
    private Long bindDomainCount;

    @com.aliyun.core.annotation.NameInMap("BindDomainUsedCount")
    private Long bindDomainUsedCount;

    @com.aliyun.core.annotation.NameInMap("BindUsedCount")
    private Long bindUsedCount;

    @com.aliyun.core.annotation.NameInMap("DDosDefendFlow")
    private Long dDosDefendFlow;

    @com.aliyun.core.annotation.NameInMap("DDosDefendQuery")
    private Long dDosDefendQuery;

    @com.aliyun.core.annotation.NameInMap("DnsSLBCount")
    private Long dnsSLBCount;

    @com.aliyun.core.annotation.NameInMap("DnsSecurity")
    private String dnsSecurity;

    @com.aliyun.core.annotation.NameInMap("DnsServers")
    private DnsServers dnsServers;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EndTimestamp")
    private Long endTimestamp;

    @com.aliyun.core.annotation.NameInMap("Gslb")
    private Boolean gslb;

    @com.aliyun.core.annotation.NameInMap("ISPLines")
    private String ISPLines;

    @com.aliyun.core.annotation.NameInMap("ISPRegionLines")
    private String ISPRegionLines;

    @com.aliyun.core.annotation.NameInMap("InBlackHole")
    private Boolean inBlackHole;

    @com.aliyun.core.annotation.NameInMap("InClean")
    private Boolean inClean;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("MonitorFrequency")
    private Long monitorFrequency;

    @com.aliyun.core.annotation.NameInMap("MonitorNodeCount")
    private Long monitorNodeCount;

    @com.aliyun.core.annotation.NameInMap("MonitorTaskCount")
    private Long monitorTaskCount;

    @com.aliyun.core.annotation.NameInMap("OverseaDDosDefendFlow")
    private Long overseaDDosDefendFlow;

    @com.aliyun.core.annotation.NameInMap("OverseaLine")
    private String overseaLine;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("RegionLines")
    private Boolean regionLines;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchEngineLines")
    private String searchEngineLines;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("StartTimestamp")
    private Long startTimestamp;

    @com.aliyun.core.annotation.NameInMap("SubDomainLevel")
    private Long subDomainLevel;

    @com.aliyun.core.annotation.NameInMap("TTLMinValue")
    private Long TTLMinValue;

    @com.aliyun.core.annotation.NameInMap("URLForwardCount")
    private Long URLForwardCount;

    @com.aliyun.core.annotation.NameInMap("VersionCode")
    private String versionCode;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private DescribeDnsProductInstanceResponseBody(Builder builder) {
        this.autoRenewal = builder.autoRenewal;
        this.bindCount = builder.bindCount;
        this.bindDomainCount = builder.bindDomainCount;
        this.bindDomainUsedCount = builder.bindDomainUsedCount;
        this.bindUsedCount = builder.bindUsedCount;
        this.dDosDefendFlow = builder.dDosDefendFlow;
        this.dDosDefendQuery = builder.dDosDefendQuery;
        this.dnsSLBCount = builder.dnsSLBCount;
        this.dnsSecurity = builder.dnsSecurity;
        this.dnsServers = builder.dnsServers;
        this.domain = builder.domain;
        this.domainType = builder.domainType;
        this.endTime = builder.endTime;
        this.endTimestamp = builder.endTimestamp;
        this.gslb = builder.gslb;
        this.ISPLines = builder.ISPLines;
        this.ISPRegionLines = builder.ISPRegionLines;
        this.inBlackHole = builder.inBlackHole;
        this.inClean = builder.inClean;
        this.instanceId = builder.instanceId;
        this.monitorFrequency = builder.monitorFrequency;
        this.monitorNodeCount = builder.monitorNodeCount;
        this.monitorTaskCount = builder.monitorTaskCount;
        this.overseaDDosDefendFlow = builder.overseaDDosDefendFlow;
        this.overseaLine = builder.overseaLine;
        this.paymentType = builder.paymentType;
        this.regionLines = builder.regionLines;
        this.requestId = builder.requestId;
        this.searchEngineLines = builder.searchEngineLines;
        this.startTime = builder.startTime;
        this.startTimestamp = builder.startTimestamp;
        this.subDomainLevel = builder.subDomainLevel;
        this.TTLMinValue = builder.TTLMinValue;
        this.URLForwardCount = builder.URLForwardCount;
        this.versionCode = builder.versionCode;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsProductInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return bindCount
     */
    public Long getBindCount() {
        return this.bindCount;
    }

    /**
     * @return bindDomainCount
     */
    public Long getBindDomainCount() {
        return this.bindDomainCount;
    }

    /**
     * @return bindDomainUsedCount
     */
    public Long getBindDomainUsedCount() {
        return this.bindDomainUsedCount;
    }

    /**
     * @return bindUsedCount
     */
    public Long getBindUsedCount() {
        return this.bindUsedCount;
    }

    /**
     * @return dDosDefendFlow
     */
    public Long getDDosDefendFlow() {
        return this.dDosDefendFlow;
    }

    /**
     * @return dDosDefendQuery
     */
    public Long getDDosDefendQuery() {
        return this.dDosDefendQuery;
    }

    /**
     * @return dnsSLBCount
     */
    public Long getDnsSLBCount() {
        return this.dnsSLBCount;
    }

    /**
     * @return dnsSecurity
     */
    public String getDnsSecurity() {
        return this.dnsSecurity;
    }

    /**
     * @return dnsServers
     */
    public DnsServers getDnsServers() {
        return this.dnsServers;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return endTimestamp
     */
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * @return gslb
     */
    public Boolean getGslb() {
        return this.gslb;
    }

    /**
     * @return ISPLines
     */
    public String getISPLines() {
        return this.ISPLines;
    }

    /**
     * @return ISPRegionLines
     */
    public String getISPRegionLines() {
        return this.ISPRegionLines;
    }

    /**
     * @return inBlackHole
     */
    public Boolean getInBlackHole() {
        return this.inBlackHole;
    }

    /**
     * @return inClean
     */
    public Boolean getInClean() {
        return this.inClean;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return monitorFrequency
     */
    public Long getMonitorFrequency() {
        return this.monitorFrequency;
    }

    /**
     * @return monitorNodeCount
     */
    public Long getMonitorNodeCount() {
        return this.monitorNodeCount;
    }

    /**
     * @return monitorTaskCount
     */
    public Long getMonitorTaskCount() {
        return this.monitorTaskCount;
    }

    /**
     * @return overseaDDosDefendFlow
     */
    public Long getOverseaDDosDefendFlow() {
        return this.overseaDDosDefendFlow;
    }

    /**
     * @return overseaLine
     */
    public String getOverseaLine() {
        return this.overseaLine;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return regionLines
     */
    public Boolean getRegionLines() {
        return this.regionLines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchEngineLines
     */
    public String getSearchEngineLines() {
        return this.searchEngineLines;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return startTimestamp
     */
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    /**
     * @return subDomainLevel
     */
    public Long getSubDomainLevel() {
        return this.subDomainLevel;
    }

    /**
     * @return TTLMinValue
     */
    public Long getTTLMinValue() {
        return this.TTLMinValue;
    }

    /**
     * @return URLForwardCount
     */
    public Long getURLForwardCount() {
        return this.URLForwardCount;
    }

    /**
     * @return versionCode
     */
    public String getVersionCode() {
        return this.versionCode;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder {
        private Boolean autoRenewal; 
        private Long bindCount; 
        private Long bindDomainCount; 
        private Long bindDomainUsedCount; 
        private Long bindUsedCount; 
        private Long dDosDefendFlow; 
        private Long dDosDefendQuery; 
        private Long dnsSLBCount; 
        private String dnsSecurity; 
        private DnsServers dnsServers; 
        private String domain; 
        private String domainType; 
        private String endTime; 
        private Long endTimestamp; 
        private Boolean gslb; 
        private String ISPLines; 
        private String ISPRegionLines; 
        private Boolean inBlackHole; 
        private Boolean inClean; 
        private String instanceId; 
        private Long monitorFrequency; 
        private Long monitorNodeCount; 
        private Long monitorTaskCount; 
        private Long overseaDDosDefendFlow; 
        private String overseaLine; 
        private String paymentType; 
        private Boolean regionLines; 
        private String requestId; 
        private String searchEngineLines; 
        private String startTime; 
        private Long startTimestamp; 
        private Long subDomainLevel; 
        private Long TTLMinValue; 
        private Long URLForwardCount; 
        private String versionCode; 
        private String versionName; 

        /**
         * <p>Indicates whether auto-renewal was enabled. Valid values:</p>
         * <ul>
         * <li>true: Auto-renewal was enabled.</li>
         * <li>false: Auto-renewal was not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * <p>The number of times that you can change the domain names that are bound to the paid Alibaba Cloud DNS instance. This parameter applies to Alibaba Cloud DNS instances of the custom edition.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder bindCount(Long bindCount) {
            this.bindCount = bindCount;
            return this;
        }

        /**
         * <p>The number of domain names that can be bound to the paid Alibaba Cloud DNS instance. This parameter applies to Alibaba Cloud DNS instances of Personal Edition, Enterprise Standard Edition, and Enterprise Ultimate Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder bindDomainCount(Long bindDomainCount) {
            this.bindDomainCount = bindDomainCount;
            return this;
        }

        /**
         * <p>The number of domain names that are bound to the paid Alibaba Cloud DNS instance. This parameter applies to Alibaba Cloud DNS instances of Personal Edition, Enterprise Standard Edition, and Enterprise Ultimate Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder bindDomainUsedCount(Long bindDomainUsedCount) {
            this.bindDomainUsedCount = bindDomainUsedCount;
            return this;
        }

        /**
         * <p>The number of times that you have changed the domain names that are bound to the paid Alibaba Cloud DNS instance. This parameter applies to Alibaba Cloud DNS instances of the custom edition.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder bindUsedCount(Long bindUsedCount) {
            this.bindUsedCount = bindUsedCount;
            return this;
        }

        /**
         * <p>The DDoS protection traffic. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder dDosDefendFlow(Long dDosDefendFlow) {
            this.dDosDefendFlow = dDosDefendFlow;
            return this;
        }

        /**
         * <p>The DDoS protection frequency. Unit: 10,000 QPS. This parameter applies to Alibaba Cloud DNS instances of the custom edition.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder dDosDefendQuery(Long dDosDefendQuery) {
            this.dDosDefendQuery = dDosDefendQuery;
            return this;
        }

        /**
         * <p>The maximum number of IP addresses that are used for load balancing in a single line of a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder dnsSLBCount(Long dnsSLBCount) {
            this.dnsSLBCount = dnsSLBCount;
            return this;
        }

        /**
         * <p>The level of DNS protection. Valid values:</p>
         * <ul>
         * <li>no: No DNS protection is provided.</li>
         * <li>basic: Basic DNS protection is provided.</li>
         * <li>advanced: Advanced DNS protection is provided.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder dnsSecurity(String dnsSecurity) {
            this.dnsSecurity = dnsSecurity;
            return this;
        }

        /**
         * <p>The DNS servers configured for the domain names.</p>
         */
        public Builder dnsServers(DnsServers dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        /**
         * <p>The domain name that is bound to the paid instance.</p>
         * <p>If no value is returned for this parameter, no domain name is bound to the paid instance.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li>PUBLIC: authoritative domain name</li>
         * <li>CACHE: cache-accelerated domain name</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder domainType(String domainType) {
            this.domainType = domainType;
            return this;
        }

        /**
         * <p>The time when the instance expired. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-12T09:23Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The time when the instance expired. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1474335170000</p>
         */
        public Builder endTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }

        /**
         * <p>Indicates whether global server load balancing (GSLB) is supported. Valid values:</p>
         * <ul>
         * <li>true: GSLB is supported.</li>
         * <li>false: GSLB is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder gslb(Boolean gslb) {
            this.gslb = gslb;
            return this;
        }

        /**
         * <p>The ISP resolution lines. Valid values:</p>
         * <ul>
         * <li>China Telecom</li>
         * <li>China Mobile</li>
         * <li>China Unicom</li>
         * <li>China Education and Research Network (CERNET)</li>
         * <li>China Broadcasting Network (CBN)</li>
         * <li>Dr Peng Telecom &amp; Media Group</li>
         * </ul>
         */
        public Builder ISPLines(String ISPLines) {
            this.ISPLines = ISPLines;
            return this;
        }

        /**
         * <p>The regional ISP resolution lines. Valid values:</p>
         * <ul>
         * <li>China Telecom (province)</li>
         * <li>China Mobile (province)</li>
         * <li>China Unicom (province)</li>
         * <li>CERNET (province)</li>
         * </ul>
         */
        public Builder ISPRegionLines(String ISPRegionLines) {
            this.ISPRegionLines = ISPRegionLines;
            return this;
        }

        /**
         * <p>Indicates whether the Domain Name System (DNS) servers stopped responding to all DNS requests. Valid values:</p>
         * <ul>
         * <li>true: The DNS servers stopped responding to all DNS requests.</li>
         * <li>false: The DNS servers did not stop responding to all DNS requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder inBlackHole(Boolean inBlackHole) {
            this.inBlackHole = inBlackHole;
            return this;
        }

        /**
         * <p>Indicates whether the DNS servers stopped responding to abnormal requests sent to the domain names.</p>
         * <ul>
         * <li>true: The DNS servers stopped responding to abnormal requests sent to the domain names.</li>
         * <li>false: The DNS servers did not stop responding to abnormal requests sent to the domain names.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder inClean(Boolean inClean) {
            this.inClean = inClean;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud DNS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8fxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The interval at which the instance is monitored. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder monitorFrequency(Long monitorFrequency) {
            this.monitorFrequency = monitorFrequency;
            return this;
        }

        /**
         * <p>The number of monitoring nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder monitorNodeCount(Long monitorNodeCount) {
            this.monitorNodeCount = monitorNodeCount;
            return this;
        }

        /**
         * <p>The number of monitoring tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder monitorTaskCount(Long monitorTaskCount) {
            this.monitorTaskCount = monitorTaskCount;
            return this;
        }

        /**
         * <p>The DDoS protection traffic outside the Chinese mainland. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder overseaDDosDefendFlow(Long overseaDDosDefendFlow) {
            this.overseaDDosDefendFlow = overseaDDosDefendFlow;
            return this;
        }

        /**
         * <p>The line outside the Chinese mainland.</p>
         */
        public Builder overseaLine(String overseaLine) {
            this.overseaLine = overseaLine;
            return this;
        }

        /**
         * <p>The billing method.</p>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>Indicates whether the DNS request lines are regional lines. Valid values:</p>
         * <ul>
         * <li>true: The DNS request lines are regional lines.</li>
         * <li>false: The DNS request lines are not regional lines.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder regionLines(Boolean regionLines) {
            this.regionLines = regionLines;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The search engine resolution lines. Valid values:</p>
         * <ul>
         * <li>Google</li>
         * <li>Baidu</li>
         * <li>Bing</li>
         * <li>Youdao</li>
         * </ul>
         */
        public Builder searchEngineLines(String searchEngineLines) {
            this.searchEngineLines = searchEngineLines;
            return this;
        }

        /**
         * <p>The time when the instance was purchased. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-12T09:23Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time when the instance was purchased. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1474335170000</p>
         */
        public Builder startTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }

        /**
         * <p>The number of subdomain name levels.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder subDomainLevel(Long subDomainLevel) {
            this.subDomainLevel = subDomainLevel;
            return this;
        }

        /**
         * <p>The minimum time-to-live (TTL) period. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder TTLMinValue(Long TTLMinValue) {
            this.TTLMinValue = TTLMinValue;
            return this;
        }

        /**
         * <p>The number of the forwarded URLs.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder URLForwardCount(Long URLForwardCount) {
            this.URLForwardCount = URLForwardCount;
            return this;
        }

        /**
         * <p>The version code of Alibaba Cloud DNS.</p>
         * 
         * <strong>example:</strong>
         * <p>version1</p>
         */
        public Builder versionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }

        /**
         * <p>The edition of Alibaba Cloud DNS.</p>
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public DescribeDnsProductInstanceResponseBody build() {
            return new DescribeDnsProductInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsProductInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsProductInstanceResponseBody</p>
     */
    public static class DnsServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServer")
        private java.util.List < String > dnsServer;

        private DnsServers(Builder builder) {
            this.dnsServer = builder.dnsServer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsServers create() {
            return builder().build();
        }

        /**
         * @return dnsServer
         */
        public java.util.List < String > getDnsServer() {
            return this.dnsServer;
        }

        public static final class Builder {
            private java.util.List < String > dnsServer; 

            /**
             * DnsServer.
             */
            public Builder dnsServer(java.util.List < String > dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            public DnsServers build() {
                return new DnsServers(this);
            } 

        } 

    }
}
