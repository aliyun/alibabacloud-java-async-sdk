// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

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
 * {@link DescribePvtzStatisticsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePvtzStatisticsSummaryResponseBody</p>
 */
public class DescribePvtzStatisticsSummaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurPage")
    private Integer curPage;

    @com.aliyun.core.annotation.NameInMap("PageData")
    private java.util.List<PageData> pageData;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    @com.aliyun.core.annotation.NameInMap("TotalSize")
    private Integer totalSize;

    private DescribePvtzStatisticsSummaryResponseBody(Builder builder) {
        this.curPage = builder.curPage;
        this.pageData = builder.pageData;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalPage = builder.totalPage;
        this.totalSize = builder.totalSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePvtzStatisticsSummaryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return curPage
     */
    public Integer getCurPage() {
        return this.curPage;
    }

    /**
     * @return pageData
     */
    public java.util.List<PageData> getPageData() {
        return this.pageData;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    /**
     * @return totalSize
     */
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static final class Builder {
        private Integer curPage; 
        private java.util.List<PageData> pageData; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalPage; 
        private Integer totalSize; 

        private Builder() {
        } 

        private Builder(DescribePvtzStatisticsSummaryResponseBody model) {
            this.curPage = model.curPage;
            this.pageData = model.pageData;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalPage = model.totalPage;
            this.totalSize = model.totalSize;
        } 

        /**
         * CurPage.
         */
        public Builder curPage(Integer curPage) {
            this.curPage = curPage;
            return this;
        }

        /**
         * PageData.
         */
        public Builder pageData(java.util.List<PageData> pageData) {
            this.pageData = pageData;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F0FCB52A-D512-41A0-8595-40234EDCFD8B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        /**
         * TotalSize.
         */
        public Builder totalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }

        public DescribePvtzStatisticsSummaryResponseBody build() {
            return new DescribePvtzStatisticsSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePvtzStatisticsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePvtzStatisticsSummaryResponseBody</p>
     */
    public static class PageData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AggrTimestamp")
        private Long aggrTimestamp;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("FluctuationValue")
        private Integer fluctuationValue;

        @com.aliyun.core.annotation.NameInMap("Latency")
        private Long latency;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("PreviousCount")
        private Long previousCount;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("Qtype")
        private String qtype;

        @com.aliyun.core.annotation.NameInMap("Ratio")
        private Long ratio;

        @com.aliyun.core.annotation.NameInMap("Rcode")
        private String rcode;

        @com.aliyun.core.annotation.NameInMap("SourceIp")
        private String sourceIp;

        @com.aliyun.core.annotation.NameInMap("SourceIsp")
        private String sourceIsp;

        @com.aliyun.core.annotation.NameInMap("SourceRegion")
        private String sourceRegion;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private PageData(Builder builder) {
            this.aggrTimestamp = builder.aggrTimestamp;
            this.count = builder.count;
            this.domainName = builder.domainName;
            this.fluctuationValue = builder.fluctuationValue;
            this.latency = builder.latency;
            this.line = builder.line;
            this.module = builder.module;
            this.previousCount = builder.previousCount;
            this.protocol = builder.protocol;
            this.qtype = builder.qtype;
            this.ratio = builder.ratio;
            this.rcode = builder.rcode;
            this.sourceIp = builder.sourceIp;
            this.sourceIsp = builder.sourceIsp;
            this.sourceRegion = builder.sourceRegion;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageData create() {
            return builder().build();
        }

        /**
         * @return aggrTimestamp
         */
        public Long getAggrTimestamp() {
            return this.aggrTimestamp;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return fluctuationValue
         */
        public Integer getFluctuationValue() {
            return this.fluctuationValue;
        }

        /**
         * @return latency
         */
        public Long getLatency() {
            return this.latency;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return previousCount
         */
        public Long getPreviousCount() {
            return this.previousCount;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return qtype
         */
        public String getQtype() {
            return this.qtype;
        }

        /**
         * @return ratio
         */
        public Long getRatio() {
            return this.ratio;
        }

        /**
         * @return rcode
         */
        public String getRcode() {
            return this.rcode;
        }

        /**
         * @return sourceIp
         */
        public String getSourceIp() {
            return this.sourceIp;
        }

        /**
         * @return sourceIsp
         */
        public String getSourceIsp() {
            return this.sourceIsp;
        }

        /**
         * @return sourceRegion
         */
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        public static final class Builder {
            private Long aggrTimestamp; 
            private Long count; 
            private String domainName; 
            private Integer fluctuationValue; 
            private Long latency; 
            private String line; 
            private String module; 
            private Long previousCount; 
            private String protocol; 
            private String qtype; 
            private Long ratio; 
            private String rcode; 
            private String sourceIp; 
            private String sourceIsp; 
            private String sourceRegion; 
            private String vpcId; 
            private String zoneId; 
            private String zoneName; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.aggrTimestamp = model.aggrTimestamp;
                this.count = model.count;
                this.domainName = model.domainName;
                this.fluctuationValue = model.fluctuationValue;
                this.latency = model.latency;
                this.line = model.line;
                this.module = model.module;
                this.previousCount = model.previousCount;
                this.protocol = model.protocol;
                this.qtype = model.qtype;
                this.ratio = model.ratio;
                this.rcode = model.rcode;
                this.sourceIp = model.sourceIp;
                this.sourceIsp = model.sourceIsp;
                this.sourceRegion = model.sourceRegion;
                this.vpcId = model.vpcId;
                this.zoneId = model.zoneId;
                this.zoneName = model.zoneName;
            } 

            /**
             * AggrTimestamp.
             */
            public Builder aggrTimestamp(Long aggrTimestamp) {
                this.aggrTimestamp = aggrTimestamp;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
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
             * FluctuationValue.
             */
            public Builder fluctuationValue(Integer fluctuationValue) {
                this.fluctuationValue = fluctuationValue;
                return this;
            }

            /**
             * Latency.
             */
            public Builder latency(Long latency) {
                this.latency = latency;
                return this;
            }

            /**
             * Line.
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            /**
             * Module.
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * PreviousCount.
             */
            public Builder previousCount(Long previousCount) {
                this.previousCount = previousCount;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Qtype.
             */
            public Builder qtype(String qtype) {
                this.qtype = qtype;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(Long ratio) {
                this.ratio = ratio;
                return this;
            }

            /**
             * Rcode.
             */
            public Builder rcode(String rcode) {
                this.rcode = rcode;
                return this;
            }

            /**
             * SourceIp.
             */
            public Builder sourceIp(String sourceIp) {
                this.sourceIp = sourceIp;
                return this;
            }

            /**
             * SourceIsp.
             */
            public Builder sourceIsp(String sourceIsp) {
                this.sourceIsp = sourceIsp;
                return this;
            }

            /**
             * SourceRegion.
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * <p>VPC ID。</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1uvv79h1t8unnzdh3nq</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneName.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            public PageData build() {
                return new PageData(this);
            } 

        } 

    }
}
