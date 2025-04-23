// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeDnsProductInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsProductInstancesResponseBody</p>
 */
public class DescribeDnsProductInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DnsProducts")
    private DnsProducts dnsProducts;

    @com.aliyun.core.annotation.NameInMap("DomainType")
    private String domainType;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDnsProductInstancesResponseBody(Builder builder) {
        this.dnsProducts = builder.dnsProducts;
        this.domainType = builder.domainType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsProductInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dnsProducts
     */
    public DnsProducts getDnsProducts() {
        return this.dnsProducts;
    }

    /**
     * @return domainType
     */
    public String getDomainType() {
        return this.domainType;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private DnsProducts dnsProducts; 
        private String domainType; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDnsProductInstancesResponseBody model) {
            this.dnsProducts = model.dnsProducts;
            this.domainType = model.domainType;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The paid Alibaba Cloud DNS instances.</p>
         */
        public Builder dnsProducts(DnsProducts dnsProducts) {
            this.dnsProducts = dnsProducts;
            return this;
        }

        /**
         * <p>The type of the domain name. Valid values:</p>
         * <ul>
         * <li>PUBLIC (default): hosted public domain name</li>
         * <li>CACHE: cached public domain name</li>
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
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * <p>The total number of domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDnsProductInstancesResponseBody build() {
            return new DescribeDnsProductInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsProductInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsProductInstancesResponseBody</p>
     */
    public static class DnsProduct extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

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

        private DnsProduct(Builder builder) {
            this.autoRenewal = builder.autoRenewal;
            this.bindCount = builder.bindCount;
            this.bindDomainCount = builder.bindDomainCount;
            this.bindDomainUsedCount = builder.bindDomainUsedCount;
            this.bindUsedCount = builder.bindUsedCount;
            this.dDosDefendFlow = builder.dDosDefendFlow;
            this.dDosDefendQuery = builder.dDosDefendQuery;
            this.dnsSLBCount = builder.dnsSLBCount;
            this.dnsSecurity = builder.dnsSecurity;
            this.domain = builder.domain;
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

        public static DnsProduct create() {
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
         * @return domain
         */
        public String getDomain() {
            return this.domain;
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
            private String domain; 
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
            private String searchEngineLines; 
            private String startTime; 
            private Long startTimestamp; 
            private Long subDomainLevel; 
            private Long TTLMinValue; 
            private Long URLForwardCount; 
            private String versionCode; 
            private String versionName; 

            private Builder() {
            } 

            private Builder(DnsProduct model) {
                this.autoRenewal = model.autoRenewal;
                this.bindCount = model.bindCount;
                this.bindDomainCount = model.bindDomainCount;
                this.bindDomainUsedCount = model.bindDomainUsedCount;
                this.bindUsedCount = model.bindUsedCount;
                this.dDosDefendFlow = model.dDosDefendFlow;
                this.dDosDefendQuery = model.dDosDefendQuery;
                this.dnsSLBCount = model.dnsSLBCount;
                this.dnsSecurity = model.dnsSecurity;
                this.domain = model.domain;
                this.endTime = model.endTime;
                this.endTimestamp = model.endTimestamp;
                this.gslb = model.gslb;
                this.ISPLines = model.ISPLines;
                this.ISPRegionLines = model.ISPRegionLines;
                this.inBlackHole = model.inBlackHole;
                this.inClean = model.inClean;
                this.instanceId = model.instanceId;
                this.monitorFrequency = model.monitorFrequency;
                this.monitorNodeCount = model.monitorNodeCount;
                this.monitorTaskCount = model.monitorTaskCount;
                this.overseaDDosDefendFlow = model.overseaDDosDefendFlow;
                this.overseaLine = model.overseaLine;
                this.paymentType = model.paymentType;
                this.regionLines = model.regionLines;
                this.searchEngineLines = model.searchEngineLines;
                this.startTime = model.startTime;
                this.startTimestamp = model.startTimestamp;
                this.subDomainLevel = model.subDomainLevel;
                this.TTLMinValue = model.TTLMinValue;
                this.URLForwardCount = model.URLForwardCount;
                this.versionCode = model.versionCode;
                this.versionName = model.versionName;
            } 

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
             * <p>The number of times you can change domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bindCount(Long bindCount) {
                this.bindCount = bindCount;
                return this;
            }

            /**
             * <p>The number of domain names that can be bound to the DNS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder bindDomainCount(Long bindDomainCount) {
                this.bindDomainCount = bindDomainCount;
                return this;
            }

            /**
             * <p>The number of domain names that have been bound to the DNS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder bindDomainUsedCount(Long bindDomainUsedCount) {
                this.bindDomainUsedCount = bindDomainUsedCount;
                return this;
            }

            /**
             * <p>The number of times you have changed domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.</p>
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
             * <p>The DDoS protection frequency. Unit: 10,000 QPS.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder dDosDefendQuery(Long dDosDefendQuery) {
                this.dDosDefendQuery = dDosDefendQuery;
                return this;
            }

            /**
             * <p>The number of IP addresses supported by a domain name or line.</p>
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
             * <p>no</p>
             */
            public Builder dnsSecurity(String dnsSecurity) {
                this.dnsSecurity = dnsSecurity;
                return this;
            }

            /**
             * <p>The bound domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The time at which the instance expired.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-12-12T00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The UNIX timestamp representing the expiration time of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1474335170000</p>
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * <p>Indicates whether global server load balancing (GSLB) is supported.</p>
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
             * <p>The ISP resolution lines.</p>
             * <ul>
             * <li>China Telecom</li>
             * <li>China Mobile</li>
             * <li>China Unicom</li>
             * <li>CERNET</li>
             * <li>China Broadcasting Network (CBN)</li>
             * <li>Dr Peng Telecom &amp; Media Group</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>China Mobile,China Unicom,China Telecom,China Edu</p>
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
             * <li>China Education and Research Network (CERNET) (province)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Telecom (Province), Mobile (Province), Unicom (Province), Education Network (Province)</p>
             */
            public Builder ISPRegionLines(String ISPRegionLines) {
                this.ISPRegionLines = ISPRegionLines;
                return this;
            }

            /**
             * <p>Indicates whether the Domain Name System (DNS) servers stopped responding to all requests. Valid values:</p>
             * <ul>
             * <li>true: The DNS servers stopped responding to all requests.</li>
             * <li>false: The DNS servers did not stop responding to all requests.</li>
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
             * <p>Indicates whether the request for domain name resolution was being cleared.</p>
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
             * <p>i-8fj</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The monitoring frequency. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder monitorFrequency(Long monitorFrequency) {
                this.monitorFrequency = monitorFrequency;
                return this;
            }

            /**
             * <p>The number of monitored nodes.</p>
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
             * <p>DDoS protection traffic outside China. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder overseaDDosDefendFlow(Long overseaDDosDefendFlow) {
                this.overseaDDosDefendFlow = overseaDDosDefendFlow;
                return this;
            }

            /**
             * <p>The type of the overseas line.</p>
             * 
             * <strong>example:</strong>
             * <p>Countries</p>
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
             * <p>Indicates whether the DNS request lines are regional lines.</p>
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
             * <p>The search engine resolution lines. Valid values:</p>
             * <ul>
             * <li>Google</li>
             * <li>Baidu</li>
             * <li>Bing</li>
             * <li>Youdao</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Search Engine Robots,Google Robots,Baidu Robots,Bing Robots</p>
             */
            public Builder searchEngineLines(String searchEngineLines) {
                this.searchEngineLines = searchEngineLines;
                return this;
            }

            /**
             * <p>The time when the DNS instance was purchased.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-11-12T09:23Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The UNIX timestamp representing when the DNS instance was purchased.</p>
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
             * <p>The minimum TTL. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder TTLMinValue(Long TTLMinValue) {
                this.TTLMinValue = TTLMinValue;
                return this;
            }

            /**
             * <p>The URL forwarding quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder URLForwardCount(Long URLForwardCount) {
                this.URLForwardCount = URLForwardCount;
                return this;
            }

            /**
             * <p>The version code of the Alibaba Cloud DNS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>version1</p>
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * <p>The version name of the Alibaba Cloud DNS instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud DNS</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public DnsProduct build() {
                return new DnsProduct(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsProductInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsProductInstancesResponseBody</p>
     */
    public static class DnsProducts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsProduct")
        private java.util.List<DnsProduct> dnsProduct;

        private DnsProducts(Builder builder) {
            this.dnsProduct = builder.dnsProduct;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DnsProducts create() {
            return builder().build();
        }

        /**
         * @return dnsProduct
         */
        public java.util.List<DnsProduct> getDnsProduct() {
            return this.dnsProduct;
        }

        public static final class Builder {
            private java.util.List<DnsProduct> dnsProduct; 

            private Builder() {
            } 

            private Builder(DnsProducts model) {
                this.dnsProduct = model.dnsProduct;
            } 

            /**
             * DnsProduct.
             */
            public Builder dnsProduct(java.util.List<DnsProduct> dnsProduct) {
                this.dnsProduct = dnsProduct;
                return this;
            }

            public DnsProducts build() {
                return new DnsProducts(this);
            } 

        } 

    }
}
