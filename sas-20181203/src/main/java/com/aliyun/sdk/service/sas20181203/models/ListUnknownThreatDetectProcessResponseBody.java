// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListUnknownThreatDetectProcessResponseBody} extends {@link TeaModel}
 *
 * <p>ListUnknownThreatDetectProcessResponseBody</p>
 */
public class ListUnknownThreatDetectProcessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUnknownThreatDetectProcessResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUnknownThreatDetectProcessResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUnknownThreatDetectProcessResponseBody model) {
            this.data = model.data;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An array of process details.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20456DD5-5CBF-5015-9173-12CA4246B***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUnknownThreatDetectProcessResponseBody build() {
            return new ListUnknownThreatDetectProcessResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUnknownThreatDetectProcessResponseBody} extends {@link TeaModel}
     *
     * <p>ListUnknownThreatDetectProcessResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnalyzeResult")
        private String analyzeResult;

        @com.aliyun.core.annotation.NameInMap("ExplanationEn")
        private String explanationEn;

        @com.aliyun.core.annotation.NameInMap("ExplanationZh")
        private String explanationZh;

        @com.aliyun.core.annotation.NameInMap("FirstTime")
        private Long firstTime;

        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("ProcessId")
        private String processId;

        @com.aliyun.core.annotation.NameInMap("ProcessPath")
        private String processPath;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("Sha256")
        private String sha256;

        private Data(Builder builder) {
            this.analyzeResult = builder.analyzeResult;
            this.explanationEn = builder.explanationEn;
            this.explanationZh = builder.explanationZh;
            this.firstTime = builder.firstTime;
            this.md5 = builder.md5;
            this.processId = builder.processId;
            this.processPath = builder.processPath;
            this.remark = builder.remark;
            this.sha256 = builder.sha256;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analyzeResult
         */
        public String getAnalyzeResult() {
            return this.analyzeResult;
        }

        /**
         * @return explanationEn
         */
        public String getExplanationEn() {
            return this.explanationEn;
        }

        /**
         * @return explanationZh
         */
        public String getExplanationZh() {
            return this.explanationZh;
        }

        /**
         * @return firstTime
         */
        public Long getFirstTime() {
            return this.firstTime;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return processId
         */
        public String getProcessId() {
            return this.processId;
        }

        /**
         * @return processPath
         */
        public String getProcessPath() {
            return this.processPath;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return sha256
         */
        public String getSha256() {
            return this.sha256;
        }

        public static final class Builder {
            private String analyzeResult; 
            private String explanationEn; 
            private String explanationZh; 
            private Long firstTime; 
            private String md5; 
            private String processId; 
            private String processPath; 
            private String remark; 
            private String sha256; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.analyzeResult = model.analyzeResult;
                this.explanationEn = model.explanationEn;
                this.explanationZh = model.explanationZh;
                this.firstTime = model.firstTime;
                this.md5 = model.md5;
                this.processId = model.processId;
                this.processPath = model.processPath;
                this.remark = model.remark;
                this.sha256 = model.sha256;
            } 

            /**
             * <p>The analysis result. Valid values:</p>
             * <ul>
             * <li><p><strong>black</strong>: A malicious process.</p>
             * </li>
             * <li><p><strong>white</strong>: A normal process.</p>
             * </li>
             * <li><p><strong>abnormal</strong>: An abnormal process.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>white</p>
             */
            public Builder analyzeResult(String analyzeResult) {
                this.analyzeResult = analyzeResult;
                return this;
            }

            /**
             * ExplanationEn.
             */
            public Builder explanationEn(String explanationEn) {
                this.explanationEn = explanationEn;
                return this;
            }

            /**
             * ExplanationZh.
             */
            public Builder explanationZh(String explanationZh) {
                this.explanationZh = explanationZh;
                return this;
            }

            /**
             * <p>The timestamp of the first occurrence.</p>
             * 
             * <strong>example:</strong>
             * <p>1694576692000</p>
             */
            public Builder firstTime(Long firstTime) {
                this.firstTime = firstTime;
                return this;
            }

            /**
             * <p>The MD5 hash of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>5b394b54ca632fe51c4ab4a6dbaf****</p>
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2025031506350619216822625103151158982</p>
             */
            public Builder processId(String processId) {
                this.processId = processId;
                return this;
            }

            /**
             * <p>The process path.</p>
             * 
             * <strong>example:</strong>
             * <p>/usr/bin/tar</p>
             */
            public Builder processPath(String processPath) {
                this.processPath = processPath;
                return this;
            }

            /**
             * <p>Remarks about the process.</p>
             * 
             * <strong>example:</strong>
             * <p>safe process</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The SHA-256 hash of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>3a6fed5fc11392b3ee9f81caf017b48640d7458766a8eb0382899a605b41****</p>
             */
            public Builder sha256(String sha256) {
                this.sha256 = sha256;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListUnknownThreatDetectProcessResponseBody} extends {@link TeaModel}
     *
     * <p>ListUnknownThreatDetectProcessResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries to return on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>83</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
