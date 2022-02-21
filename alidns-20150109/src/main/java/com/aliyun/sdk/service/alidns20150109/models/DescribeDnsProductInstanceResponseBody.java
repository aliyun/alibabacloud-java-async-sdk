// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsProductInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsProductInstanceResponseBody</p>
 */
public class DescribeDnsProductInstanceResponseBody extends TeaModel {
    @NameInMap("BindCount")
    private Long bindCount;

    @NameInMap("BindDomainCount")
    private Long bindDomainCount;

    @NameInMap("BindDomainUsedCount")
    private Long bindDomainUsedCount;

    @NameInMap("BindUsedCount")
    private Long bindUsedCount;

    @NameInMap("DDosDefendFlow")
    private Long DDosDefendFlow;

    @NameInMap("DDosDefendQuery")
    private Long DDosDefendQuery;

    @NameInMap("DnsSLBCount")
    private Long dnsSLBCount;

    @NameInMap("DnsSecurity")
    private String dnsSecurity;

    @NameInMap("DnsServers")
    private DnsServers dnsServers;

    @NameInMap("Domain")
    private String domain;

    @NameInMap("DomainType")
    private String domainType;

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

    @NameInMap("RequestId")
    private String requestId;

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

    private DescribeDnsProductInstanceResponseBody(Builder builder) {
        this.bindCount = builder.bindCount;
        this.bindDomainCount = builder.bindDomainCount;
        this.bindDomainUsedCount = builder.bindDomainUsedCount;
        this.bindUsedCount = builder.bindUsedCount;
        this.DDosDefendFlow = builder.DDosDefendFlow;
        this.DDosDefendQuery = builder.DDosDefendQuery;
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
     * @return DDosDefendFlow
     */
    public Long getDDosDefendFlow() {
        return this.DDosDefendFlow;
    }

    /**
     * @return DDosDefendQuery
     */
    public Long getDDosDefendQuery() {
        return this.DDosDefendQuery;
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
        private Long bindCount; 
        private Long bindDomainCount; 
        private Long bindDomainUsedCount; 
        private Long bindUsedCount; 
        private Long DDosDefendFlow; 
        private Long DDosDefendQuery; 
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
        public Builder DDosDefendFlow(Long DDosDefendFlow) {
            this.DDosDefendFlow = DDosDefendFlow;
            return this;
        }

        /**
         * DDosDefendQuery.
         */
        public Builder DDosDefendQuery(Long DDosDefendQuery) {
            this.DDosDefendQuery = DDosDefendQuery;
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
         * DnsServers.
         */
        public Builder dnsServers(DnsServers dnsServers) {
            this.dnsServers = dnsServers;
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
         * DomainType.
         */
        public Builder domainType(String domainType) {
            this.domainType = domainType;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeDnsProductInstanceResponseBody build() {
            return new DescribeDnsProductInstanceResponseBody(this);
        } 

    } 

    public static class DnsServers extends TeaModel {
        @NameInMap("DnsServer")
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
