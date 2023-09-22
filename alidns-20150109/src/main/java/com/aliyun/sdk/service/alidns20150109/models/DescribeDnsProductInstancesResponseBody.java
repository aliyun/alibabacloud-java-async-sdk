// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsProductInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsProductInstancesResponseBody</p>
 */
public class DescribeDnsProductInstancesResponseBody extends TeaModel {
    @NameInMap("DnsProducts")
    private DnsProducts dnsProducts;

    @NameInMap("DomainType")
    private String domainType;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * The number of domain names that have been bound to the DNS instance.
         */
        public Builder dnsProducts(DnsProducts dnsProducts) {
            this.dnsProducts = dnsProducts;
            return this;
        }

        /**
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.domainType = domainType;
            return this;
        }

        /**
         * Indicates whether the request for domain name resolution was in the black hole.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The type of the overseas line.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of monitored nodes.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The list of Alibaba Cloud DNS instances obtained by this operation.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDnsProductInstancesResponseBody build() {
            return new DescribeDnsProductInstancesResponseBody(this);
        } 

    } 

    public static class DnsProduct extends TeaModel {
        @NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @NameInMap("BindCount")
        private Long bindCount;

        @NameInMap("BindDomainCount")
        private Long bindDomainCount;

        @NameInMap("BindDomainUsedCount")
        private Long bindDomainUsedCount;

        @NameInMap("BindUsedCount")
        private Long bindUsedCount;

        @NameInMap("DDosDefendFlow")
        private Long dDosDefendFlow;

        @NameInMap("DDosDefendQuery")
        private Long dDosDefendQuery;

        @NameInMap("DnsSLBCount")
        private Long dnsSLBCount;

        @NameInMap("DnsSecurity")
        private String dnsSecurity;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("EndTimestamp")
        private Long endTimestamp;

        @NameInMap("Gslb")
        private Boolean gslb;

        @NameInMap("ISPLines")
        private String ISPLines;

        @NameInMap("ISPRegionLines")
        private String ISPRegionLines;

        @NameInMap("InBlackHole")
        private Boolean inBlackHole;

        @NameInMap("InClean")
        private Boolean inClean;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("MonitorFrequency")
        private Long monitorFrequency;

        @NameInMap("MonitorNodeCount")
        private Long monitorNodeCount;

        @NameInMap("MonitorTaskCount")
        private Long monitorTaskCount;

        @NameInMap("OverseaDDosDefendFlow")
        private Long overseaDDosDefendFlow;

        @NameInMap("OverseaLine")
        private String overseaLine;

        @NameInMap("PaymentType")
        private String paymentType;

        @NameInMap("RegionLines")
        private Boolean regionLines;

        @NameInMap("SearchEngineLines")
        private String searchEngineLines;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("StartTimestamp")
        private Long startTimestamp;

        @NameInMap("SubDomainLevel")
        private Long subDomainLevel;

        @NameInMap("TTLMinValue")
        private Long TTLMinValue;

        @NameInMap("URLForwardCount")
        private Long URLForwardCount;

        @NameInMap("VersionCode")
        private String versionCode;

        @NameInMap("VersionName")
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

            /**
             * AutoRenewal.
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

            /**
             * The time when the DNS instance was purchased.
             */
            public Builder bindCount(Long bindCount) {
                this.bindCount = bindCount;
                return this;
            }

            /**
             * Indicates whether regional lines were allowed.
             */
            public Builder bindDomainCount(Long bindDomainCount) {
                this.bindDomainCount = bindDomainCount;
                return this;
            }

            /**
             * The list of search engine lines.
             */
            public Builder bindDomainUsedCount(Long bindDomainUsedCount) {
                this.bindDomainUsedCount = bindDomainUsedCount;
                return this;
            }

            /**
             * The URL forwarding quantity.
             */
            public Builder bindUsedCount(Long bindUsedCount) {
                this.bindUsedCount = bindUsedCount;
                return this;
            }

            /**
             * The time at which the instance expired.
             */
            public Builder dDosDefendFlow(Long dDosDefendFlow) {
                this.dDosDefendFlow = dDosDefendFlow;
                return this;
            }

            /**
             * The number of subdomain name levels.
             */
            public Builder dDosDefendQuery(Long dDosDefendQuery) {
                this.dDosDefendQuery = dDosDefendQuery;
                return this;
            }

            /**
             * DnsSLBCount.
             */
            public Builder dnsSLBCount(Long dnsSLBCount) {
                this.dnsSLBCount = dnsSLBCount;
                return this;
            }

            /**
             * DnsSecurity.
             */
            public Builder dnsSecurity(String dnsSecurity) {
                this.dnsSecurity = dnsSecurity;
                return this;
            }

            /**
             * The UNIX timestamp representing when the DNS instance was purchased.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Indicates whether global server load balancing (GSLB) was allowed.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The number of times you have changed domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.
             */
            public Builder endTimestamp(Long endTimestamp) {
                this.endTimestamp = endTimestamp;
                return this;
            }

            /**
             * Gslb.
             */
            public Builder gslb(Boolean gslb) {
                this.gslb = gslb;
                return this;
            }

            /**
             * The version code of the Alibaba Cloud DNS instance.
             */
            public Builder ISPLines(String ISPLines) {
                this.ISPLines = ISPLines;
                return this;
            }

            /**
             * The UNIX timestamp representing the expiration time of the instance.
             */
            public Builder ISPRegionLines(String ISPRegionLines) {
                this.ISPRegionLines = ISPRegionLines;
                return this;
            }

            /**
             * The list of ISP lines.
             */
            public Builder inBlackHole(Boolean inBlackHole) {
                this.inBlackHole = inBlackHole;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud DNS instance.
             */
            public Builder inClean(Boolean inClean) {
                this.inClean = inClean;
                return this;
            }

            /**
             * The number of domain names that can be bound to the DNS instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The DDoS protection frequency. Unit: 10,000 QPS.
             */
            public Builder monitorFrequency(Long monitorFrequency) {
                this.monitorFrequency = monitorFrequency;
                return this;
            }

            /**
             * The minimum TTL. Unit: seconds.
             */
            public Builder monitorNodeCount(Long monitorNodeCount) {
                this.monitorNodeCount = monitorNodeCount;
                return this;
            }

            /**
             * Indicates whether the request for domain name resolution was being cleared.
             */
            public Builder monitorTaskCount(Long monitorTaskCount) {
                this.monitorTaskCount = monitorTaskCount;
                return this;
            }

            /**
             * The number of IP addresses supported by a domain name or line.
             */
            public Builder overseaDDosDefendFlow(Long overseaDDosDefendFlow) {
                this.overseaDDosDefendFlow = overseaDDosDefendFlow;
                return this;
            }

            /**
             * The list of ISP line subdivisions.
             */
            public Builder overseaLine(String overseaLine) {
                this.overseaLine = overseaLine;
                return this;
            }

            /**
             * PaymentType.
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * RegionLines.
             */
            public Builder regionLines(Boolean regionLines) {
                this.regionLines = regionLines;
                return this;
            }

            /**
             * The number of monitoring tasks.
             */
            public Builder searchEngineLines(String searchEngineLines) {
                this.searchEngineLines = searchEngineLines;
                return this;
            }

            /**
             * The DNS security policy. Valid values:
             * <p>
             * 
             * *   **no**: not required.
             * *   **basic**: anti-DDoS basic.
             * *   **advanced**: anti-DDoS advanced.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The number of times you can change domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * DDoS protection traffic outside China. Unit: GB.
             */
            public Builder subDomainLevel(Long subDomainLevel) {
                this.subDomainLevel = subDomainLevel;
                return this;
            }

            /**
             * The version name of the Alibaba Cloud DNS instance.
             */
            public Builder TTLMinValue(Long TTLMinValue) {
                this.TTLMinValue = TTLMinValue;
                return this;
            }

            /**
             * The DDoS protection traffic. Unit: GB.
             */
            public Builder URLForwardCount(Long URLForwardCount) {
                this.URLForwardCount = URLForwardCount;
                return this;
            }

            /**
             * The monitoring frequency. Unit: minutes.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * The bound domain name.
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
    public static class DnsProducts extends TeaModel {
        @NameInMap("DnsProduct")
        private java.util.List < DnsProduct> dnsProduct;

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
        public java.util.List < DnsProduct> getDnsProduct() {
            return this.dnsProduct;
        }

        public static final class Builder {
            private java.util.List < DnsProduct> dnsProduct; 

            /**
             * DnsProduct.
             */
            public Builder dnsProduct(java.util.List < DnsProduct> dnsProduct) {
                this.dnsProduct = dnsProduct;
                return this;
            }

            public DnsProducts build() {
                return new DnsProducts(this);
            } 

        } 

    }
}
