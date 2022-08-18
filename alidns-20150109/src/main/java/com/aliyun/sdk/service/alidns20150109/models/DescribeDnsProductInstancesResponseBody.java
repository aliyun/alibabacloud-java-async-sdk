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
         * DnsProducts.
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
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
             * BindCount.
             */
            public Builder bindCount(Long bindCount) {
                this.bindCount = bindCount;
                return this;
            }

            /**
             * BindDomainCount.
             */
            public Builder bindDomainCount(Long bindDomainCount) {
                this.bindDomainCount = bindDomainCount;
                return this;
            }

            /**
             * BindDomainUsedCount.
             */
            public Builder bindDomainUsedCount(Long bindDomainUsedCount) {
                this.bindDomainUsedCount = bindDomainUsedCount;
                return this;
            }

            /**
             * BindUsedCount.
             */
            public Builder bindUsedCount(Long bindUsedCount) {
                this.bindUsedCount = bindUsedCount;
                return this;
            }

            /**
             * DDosDefendFlow.
             */
            public Builder dDosDefendFlow(Long dDosDefendFlow) {
                this.dDosDefendFlow = dDosDefendFlow;
                return this;
            }

            /**
             * DDosDefendQuery.
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
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EndTimestamp.
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
             * ISPLines.
             */
            public Builder ISPLines(String ISPLines) {
                this.ISPLines = ISPLines;
                return this;
            }

            /**
             * ISPRegionLines.
             */
            public Builder ISPRegionLines(String ISPRegionLines) {
                this.ISPRegionLines = ISPRegionLines;
                return this;
            }

            /**
             * InBlackHole.
             */
            public Builder inBlackHole(Boolean inBlackHole) {
                this.inBlackHole = inBlackHole;
                return this;
            }

            /**
             * InClean.
             */
            public Builder inClean(Boolean inClean) {
                this.inClean = inClean;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MonitorFrequency.
             */
            public Builder monitorFrequency(Long monitorFrequency) {
                this.monitorFrequency = monitorFrequency;
                return this;
            }

            /**
             * MonitorNodeCount.
             */
            public Builder monitorNodeCount(Long monitorNodeCount) {
                this.monitorNodeCount = monitorNodeCount;
                return this;
            }

            /**
             * MonitorTaskCount.
             */
            public Builder monitorTaskCount(Long monitorTaskCount) {
                this.monitorTaskCount = monitorTaskCount;
                return this;
            }

            /**
             * OverseaDDosDefendFlow.
             */
            public Builder overseaDDosDefendFlow(Long overseaDDosDefendFlow) {
                this.overseaDDosDefendFlow = overseaDDosDefendFlow;
                return this;
            }

            /**
             * OverseaLine.
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
             * SearchEngineLines.
             */
            public Builder searchEngineLines(String searchEngineLines) {
                this.searchEngineLines = searchEngineLines;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StartTimestamp.
             */
            public Builder startTimestamp(Long startTimestamp) {
                this.startTimestamp = startTimestamp;
                return this;
            }

            /**
             * SubDomainLevel.
             */
            public Builder subDomainLevel(Long subDomainLevel) {
                this.subDomainLevel = subDomainLevel;
                return this;
            }

            /**
             * TTLMinValue.
             */
            public Builder TTLMinValue(Long TTLMinValue) {
                this.TTLMinValue = TTLMinValue;
                return this;
            }

            /**
             * URLForwardCount.
             */
            public Builder URLForwardCount(Long URLForwardCount) {
                this.URLForwardCount = URLForwardCount;
                return this;
            }

            /**
             * VersionCode.
             */
            public Builder versionCode(String versionCode) {
                this.versionCode = versionCode;
                return this;
            }

            /**
             * VersionName.
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
