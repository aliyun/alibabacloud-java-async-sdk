// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainInfoResponseBody</p>
 */
public class DescribeDomainInfoResponseBody extends TeaModel {
    @NameInMap("AliDomain")
    private Boolean aliDomain;

    @NameInMap("AvailableTtls")
    private AvailableTtls availableTtls;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DnsServers")
    private DnsServers dnsServers;

    @NameInMap("DomainId")
    private String domainId;

    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("InBlackHole")
    private Boolean inBlackHole;

    @NameInMap("InClean")
    private Boolean inClean;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("LineType")
    private String lineType;

    @NameInMap("MinTtl")
    private Long minTtl;

    @NameInMap("PunyCode")
    private String punyCode;

    @NameInMap("RecordLineTreeJson")
    private String recordLineTreeJson;

    @NameInMap("RecordLines")
    private RecordLines recordLines;

    @NameInMap("RegionLines")
    private Boolean regionLines;

    @NameInMap("Remark")
    private String remark;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SlaveDns")
    private Boolean slaveDns;

    @NameInMap("VersionCode")
    private String versionCode;

    @NameInMap("VersionName")
    private String versionName;

    private DescribeDomainInfoResponseBody(Builder builder) {
        this.aliDomain = builder.aliDomain;
        this.availableTtls = builder.availableTtls;
        this.createTime = builder.createTime;
        this.dnsServers = builder.dnsServers;
        this.domainId = builder.domainId;
        this.domainName = builder.domainName;
        this.groupId = builder.groupId;
        this.groupName = builder.groupName;
        this.inBlackHole = builder.inBlackHole;
        this.inClean = builder.inClean;
        this.instanceId = builder.instanceId;
        this.lineType = builder.lineType;
        this.minTtl = builder.minTtl;
        this.punyCode = builder.punyCode;
        this.recordLineTreeJson = builder.recordLineTreeJson;
        this.recordLines = builder.recordLines;
        this.regionLines = builder.regionLines;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.slaveDns = builder.slaveDns;
        this.versionCode = builder.versionCode;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliDomain
     */
    public Boolean getAliDomain() {
        return this.aliDomain;
    }

    /**
     * @return availableTtls
     */
    public AvailableTtls getAvailableTtls() {
        return this.availableTtls;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return dnsServers
     */
    public DnsServers getDnsServers() {
        return this.dnsServers;
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
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
     * @return lineType
     */
    public String getLineType() {
        return this.lineType;
    }

    /**
     * @return minTtl
     */
    public Long getMinTtl() {
        return this.minTtl;
    }

    /**
     * @return punyCode
     */
    public String getPunyCode() {
        return this.punyCode;
    }

    /**
     * @return recordLineTreeJson
     */
    public String getRecordLineTreeJson() {
        return this.recordLineTreeJson;
    }

    /**
     * @return recordLines
     */
    public RecordLines getRecordLines() {
        return this.recordLines;
    }

    /**
     * @return regionLines
     */
    public Boolean getRegionLines() {
        return this.regionLines;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return slaveDns
     */
    public Boolean getSlaveDns() {
        return this.slaveDns;
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
        private Boolean aliDomain; 
        private AvailableTtls availableTtls; 
        private String createTime; 
        private DnsServers dnsServers; 
        private String domainId; 
        private String domainName; 
        private String groupId; 
        private String groupName; 
        private Boolean inBlackHole; 
        private Boolean inClean; 
        private String instanceId; 
        private String lineType; 
        private Long minTtl; 
        private String punyCode; 
        private String recordLineTreeJson; 
        private RecordLines recordLines; 
        private Boolean regionLines; 
        private String remark; 
        private String requestId; 
        private String resourceGroupId; 
        private Boolean slaveDns; 
        private String versionCode; 
        private String versionName; 

        /**
         * AliDomain.
         */
        public Builder aliDomain(Boolean aliDomain) {
            this.aliDomain = aliDomain;
            return this;
        }

        /**
         * AvailableTtls.
         */
        public Builder availableTtls(AvailableTtls availableTtls) {
            this.availableTtls = availableTtls;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
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
         * LineType.
         */
        public Builder lineType(String lineType) {
            this.lineType = lineType;
            return this;
        }

        /**
         * MinTtl.
         */
        public Builder minTtl(Long minTtl) {
            this.minTtl = minTtl;
            return this;
        }

        /**
         * PunyCode.
         */
        public Builder punyCode(String punyCode) {
            this.punyCode = punyCode;
            return this;
        }

        /**
         * RecordLineTreeJson.
         */
        public Builder recordLineTreeJson(String recordLineTreeJson) {
            this.recordLineTreeJson = recordLineTreeJson;
            return this;
        }

        /**
         * RecordLines.
         */
        public Builder recordLines(RecordLines recordLines) {
            this.recordLines = recordLines;
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
         * Remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SlaveDns.
         */
        public Builder slaveDns(Boolean slaveDns) {
            this.slaveDns = slaveDns;
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

        public DescribeDomainInfoResponseBody build() {
            return new DescribeDomainInfoResponseBody(this);
        } 

    } 

    public static class AvailableTtls extends TeaModel {
        @NameInMap("AvailableTtl")
        private java.util.List < String > availableTtl;

        private AvailableTtls(Builder builder) {
            this.availableTtl = builder.availableTtl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvailableTtls create() {
            return builder().build();
        }

        /**
         * @return availableTtl
         */
        public java.util.List < String > getAvailableTtl() {
            return this.availableTtl;
        }

        public static final class Builder {
            private java.util.List < String > availableTtl; 

            /**
             * AvailableTtl.
             */
            public Builder availableTtl(java.util.List < String > availableTtl) {
                this.availableTtl = availableTtl;
                return this;
            }

            public AvailableTtls build() {
                return new AvailableTtls(this);
            } 

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
    public static class RecordLine extends TeaModel {
        @NameInMap("FatherCode")
        private String fatherCode;

        @NameInMap("LineCode")
        private String lineCode;

        @NameInMap("LineDisplayName")
        private String lineDisplayName;

        @NameInMap("LineName")
        private String lineName;

        private RecordLine(Builder builder) {
            this.fatherCode = builder.fatherCode;
            this.lineCode = builder.lineCode;
            this.lineDisplayName = builder.lineDisplayName;
            this.lineName = builder.lineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordLine create() {
            return builder().build();
        }

        /**
         * @return fatherCode
         */
        public String getFatherCode() {
            return this.fatherCode;
        }

        /**
         * @return lineCode
         */
        public String getLineCode() {
            return this.lineCode;
        }

        /**
         * @return lineDisplayName
         */
        public String getLineDisplayName() {
            return this.lineDisplayName;
        }

        /**
         * @return lineName
         */
        public String getLineName() {
            return this.lineName;
        }

        public static final class Builder {
            private String fatherCode; 
            private String lineCode; 
            private String lineDisplayName; 
            private String lineName; 

            /**
             * FatherCode.
             */
            public Builder fatherCode(String fatherCode) {
                this.fatherCode = fatherCode;
                return this;
            }

            /**
             * LineCode.
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * LineDisplayName.
             */
            public Builder lineDisplayName(String lineDisplayName) {
                this.lineDisplayName = lineDisplayName;
                return this;
            }

            /**
             * LineName.
             */
            public Builder lineName(String lineName) {
                this.lineName = lineName;
                return this;
            }

            public RecordLine build() {
                return new RecordLine(this);
            } 

        } 

    }
    public static class RecordLines extends TeaModel {
        @NameInMap("RecordLine")
        private java.util.List < RecordLine> recordLine;

        private RecordLines(Builder builder) {
            this.recordLine = builder.recordLine;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordLines create() {
            return builder().build();
        }

        /**
         * @return recordLine
         */
        public java.util.List < RecordLine> getRecordLine() {
            return this.recordLine;
        }

        public static final class Builder {
            private java.util.List < RecordLine> recordLine; 

            /**
             * RecordLine.
             */
            public Builder recordLine(java.util.List < RecordLine> recordLine) {
                this.recordLine = recordLine;
                return this;
            }

            public RecordLines build() {
                return new RecordLines(this);
            } 

        } 

    }
}
