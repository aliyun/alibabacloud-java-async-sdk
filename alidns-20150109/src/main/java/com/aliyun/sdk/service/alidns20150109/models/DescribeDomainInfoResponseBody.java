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
 * {@link DescribeDomainInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainInfoResponseBody</p>
 */
public class DescribeDomainInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliDomain")
    private Boolean aliDomain;

    @com.aliyun.core.annotation.NameInMap("AvailableTtls")
    private AvailableTtls availableTtls;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DnsServers")
    private DnsServers dnsServers;

    @com.aliyun.core.annotation.NameInMap("DomainId")
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("DomainLoggingSwitchStatus")
    private String domainLoggingSwitchStatus;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("InBlackHole")
    private Boolean inBlackHole;

    @com.aliyun.core.annotation.NameInMap("InClean")
    private Boolean inClean;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("LineType")
    private String lineType;

    @com.aliyun.core.annotation.NameInMap("MinTtl")
    private Long minTtl;

    @com.aliyun.core.annotation.NameInMap("PunyCode")
    private String punyCode;

    @com.aliyun.core.annotation.NameInMap("RecordLineTreeJson")
    private String recordLineTreeJson;

    @com.aliyun.core.annotation.NameInMap("RecordLines")
    private RecordLines recordLines;

    @com.aliyun.core.annotation.NameInMap("RegionLines")
    private Boolean regionLines;

    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SlaveDns")
    private Boolean slaveDns;

    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private Boolean subDomain;

    @com.aliyun.core.annotation.NameInMap("VersionCode")
    private String versionCode;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private DescribeDomainInfoResponseBody(Builder builder) {
        this.aliDomain = builder.aliDomain;
        this.availableTtls = builder.availableTtls;
        this.createTime = builder.createTime;
        this.dnsServers = builder.dnsServers;
        this.domainId = builder.domainId;
        this.domainLoggingSwitchStatus = builder.domainLoggingSwitchStatus;
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
        this.subDomain = builder.subDomain;
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
     * @return domainLoggingSwitchStatus
     */
    public String getDomainLoggingSwitchStatus() {
        return this.domainLoggingSwitchStatus;
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
     * @return subDomain
     */
    public Boolean getSubDomain() {
        return this.subDomain;
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
        private String domainLoggingSwitchStatus; 
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
        private Boolean subDomain; 
        private String versionCode; 
        private String versionName; 

        /**
         * <p>Indicates whether the domain name was registered in Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder aliDomain(Boolean aliDomain) {
            this.aliDomain = aliDomain;
            return this;
        }

        /**
         * <p>The available time to live (TTL) values that can be configured for the domain name. Available TTL values are not returned by default. If you want to query such information, set NeedDetailAttributes to true.</p>
         */
        public Builder availableTtls(AvailableTtls availableTtls) {
            this.availableTtls = availableTtls;
            return this;
        }

        /**
         * <p>The time when the domain name was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-12T09:23Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The DNS servers that are used to resolve the domain name.</p>
         */
        public Builder dnsServers(DnsServers dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }

        /**
         * <p>The ID of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>00efd71a-770e-4255-b54e-6fe5659baffe</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>Indicates whether the DNS traffic analysis feature is enabled. Valid values:</p>
         */
        public Builder domainLoggingSwitchStatus(String domainLoggingSwitchStatus) {
            this.domainLoggingSwitchStatus = domainLoggingSwitchStatus;
            return this;
        }

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The ID of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>2223</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the domain name group.</p>
         * 
         * <strong>example:</strong>
         * <p>mygroup</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>Indicates whether blackhole filtering was triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder inBlackHole(Boolean inBlackHole) {
            this.inBlackHole = inBlackHole;
            return this;
        }

        /**
         * <p>Indicates whether traffic scrubbing was in progress.</p>
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
         * <p>i-7bg</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the DNS request line.</p>
         * 
         * <strong>example:</strong>
         * <p>region_province</p>
         */
        public Builder lineType(String lineType) {
            this.lineType = lineType;
            return this;
        }

        /**
         * <p>The minimum TTL value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minTtl(Long minTtl) {
            this.minTtl = minTtl;
            return this;
        }

        /**
         * <p>The Punycode for the domain name. This parameter is returned only for Chinese domain names.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder punyCode(String punyCode) {
            this.punyCode = punyCode;
            return this;
        }

        /**
         * <p>The tree-structure DNS request lines.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;default&quot;:{},&quot;unicom&quot;:{},&quot;telecom&quot;:{},&quot;mobile&quot;:{},&quot;edu&quot;:{},&quot;oversea&quot;:{},&quot;baidu&quot;:{},&quot;biying&quot;:{},&quot;google&quot;:{}}</p>
         */
        public Builder recordLineTreeJson(String recordLineTreeJson) {
            this.recordLineTreeJson = recordLineTreeJson;
            return this;
        }

        /**
         * <p>The DNS request lines.</p>
         */
        public Builder recordLines(RecordLines recordLines) {
            this.recordLines = recordLines;
            return this;
        }

        /**
         * <p>Indicates whether the DNS request lines are regional lines.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder regionLines(Boolean regionLines) {
            this.regionLines = regionLines;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        public Builder remark(String remark) {
            this.remark = remark;
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek3dj3wvclgcxo</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Indicates whether secondary DNS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder slaveDns(Boolean slaveDns) {
            this.slaveDns = slaveDns;
            return this;
        }

        /**
         * <p>Indicates whether the queried domain name is a hosted subdomain name. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder subDomain(Boolean subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        /**
         * <p>The version ID of Alibaba Cloud DNS.</p>
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

        public DescribeDomainInfoResponseBody build() {
            return new DescribeDomainInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainInfoResponseBody</p>
     */
    public static class AvailableTtls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableTtl")
        private java.util.List<String> availableTtl;

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
        public java.util.List<String> getAvailableTtl() {
            return this.availableTtl;
        }

        public static final class Builder {
            private java.util.List<String> availableTtl; 

            /**
             * AvailableTtl.
             */
            public Builder availableTtl(java.util.List<String> availableTtl) {
                this.availableTtl = availableTtl;
                return this;
            }

            public AvailableTtls build() {
                return new AvailableTtls(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainInfoResponseBody</p>
     */
    public static class DnsServers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServer")
        private java.util.List<String> dnsServer;

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
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

        public static final class Builder {
            private java.util.List<String> dnsServer; 

            /**
             * DnsServer.
             */
            public Builder dnsServer(java.util.List<String> dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            public DnsServers build() {
                return new DnsServers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDomainInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainInfoResponseBody</p>
     */
    public static class RecordLine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FatherCode")
        private String fatherCode;

        @com.aliyun.core.annotation.NameInMap("LineCode")
        private String lineCode;

        @com.aliyun.core.annotation.NameInMap("LineDisplayName")
        private String lineDisplayName;

        @com.aliyun.core.annotation.NameInMap("LineName")
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
             * <p>The code of the parent line. This parameter is not returned if the line has no parent line.</p>
             * 
             * <strong>example:</strong>
             * <p>internal</p>
             */
            public Builder fatherCode(String fatherCode) {
                this.fatherCode = fatherCode;
                return this;
            }

            /**
             * <p>The code of the line.</p>
             * 
             * <strong>example:</strong>
             * <p>cn_region_xibei</p>
             */
            public Builder lineCode(String lineCode) {
                this.lineCode = lineCode;
                return this;
            }

            /**
             * <p>The name of the parent line.</p>
             */
            public Builder lineDisplayName(String lineDisplayName) {
                this.lineDisplayName = lineDisplayName;
                return this;
            }

            /**
             * <p>The name of the line.</p>
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
    /**
     * 
     * {@link DescribeDomainInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainInfoResponseBody</p>
     */
    public static class RecordLines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RecordLine")
        private java.util.List<RecordLine> recordLine;

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
        public java.util.List<RecordLine> getRecordLine() {
            return this.recordLine;
        }

        public static final class Builder {
            private java.util.List<RecordLine> recordLine; 

            /**
             * RecordLine.
             */
            public Builder recordLine(java.util.List<RecordLine> recordLine) {
                this.recordLine = recordLine;
                return this;
            }

            public RecordLines build() {
                return new RecordLines(this);
            } 

        } 

    }
}
