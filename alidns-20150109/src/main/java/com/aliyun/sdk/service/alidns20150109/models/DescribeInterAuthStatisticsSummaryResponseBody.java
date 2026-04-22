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
 * {@link DescribeInterAuthStatisticsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInterAuthStatisticsSummaryResponseBody</p>
 */
public class DescribeInterAuthStatisticsSummaryResponseBody extends TeaModel {
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

    private DescribeInterAuthStatisticsSummaryResponseBody(Builder builder) {
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

    public static DescribeInterAuthStatisticsSummaryResponseBody create() {
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

        private Builder(DescribeInterAuthStatisticsSummaryResponseBody model) {
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
         * <p>853805EA-3D47-47D5-9A1A-A45C24313ABD</p>
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

        public DescribeInterAuthStatisticsSummaryResponseBody build() {
            return new DescribeInterAuthStatisticsSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInterAuthStatisticsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInterAuthStatisticsSummaryResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

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

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        private PageData(Builder builder) {
            this.aggrTimestamp = builder.aggrTimestamp;
            this.count = builder.count;
            this.domainName = builder.domainName;
            this.fluctuationValue = builder.fluctuationValue;
            this.line = builder.line;
            this.previousCount = builder.previousCount;
            this.protocol = builder.protocol;
            this.qtype = builder.qtype;
            this.ratio = builder.ratio;
            this.rcode = builder.rcode;
            this.sourceIp = builder.sourceIp;
            this.sourceIsp = builder.sourceIsp;
            this.sourceRegion = builder.sourceRegion;
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
         * @return line
         */
        public String getLine() {
            return this.line;
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
            private String line; 
            private Long previousCount; 
            private String protocol; 
            private String qtype; 
            private Long ratio; 
            private String rcode; 
            private String sourceIp; 
            private String sourceIsp; 
            private String sourceRegion; 
            private String zoneName; 

            private Builder() {
            } 

            private Builder(PageData model) {
                this.aggrTimestamp = model.aggrTimestamp;
                this.count = model.count;
                this.domainName = model.domainName;
                this.fluctuationValue = model.fluctuationValue;
                this.line = model.line;
                this.previousCount = model.previousCount;
                this.protocol = model.protocol;
                this.qtype = model.qtype;
                this.ratio = model.ratio;
                this.rcode = model.rcode;
                this.sourceIp = model.sourceIp;
                this.sourceIsp = model.sourceIsp;
                this.sourceRegion = model.sourceRegion;
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
             * Line.
             */
            public Builder line(String line) {
                this.line = line;
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
