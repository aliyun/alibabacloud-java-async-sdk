// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLogAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogAnalysisResponseBody</p>
 */
public class DescribeLogAnalysisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Analyses")
    private Analyses analyses;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLogAnalysisResponseBody(Builder builder) {
        this.analyses = builder.analyses;
        this.code = builder.code;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLogAnalysisResponseBody create() {
        return builder().build();
    }

    /**
     * @return analyses
     */
    public Analyses getAnalyses() {
        return this.analyses;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Analyses analyses; 
        private String code; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The collection of log dump information.</p>
         */
        public Builder analyses(Analyses analyses) {
            this.analyses = analyses;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of log dump entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C84F77AF-3DE5-48F1-B19B-37FCBE24****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of log dump entries in the region.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLogAnalysisResponseBody build() {
            return new DescribeLogAnalysisResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLogAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogAnalysisResponseBody</p>
     */
    public static class MetaValue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Logstore")
        private String logstore;

        @com.aliyun.core.annotation.NameInMap("Project")
        private String project;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        private MetaValue(Builder builder) {
            this.logstore = builder.logstore;
            this.project = builder.project;
            this.region = builder.region;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetaValue create() {
            return builder().build();
        }

        /**
         * @return logstore
         */
        public String getLogstore() {
            return this.logstore;
        }

        /**
         * @return project
         */
        public String getProject() {
            return this.project;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String logstore; 
            private String project; 
            private String region; 
            private String roleArn; 

            /**
             * <p>The name of the dedicated Logstore that is used to store NAS operation logs.</p>
             * 
             * <strong>example:</strong>
             * <p>nas-nfs</p>
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * <p>The name of the project where the dedicated Logstore resides.</p>
             * 
             * <strong>example:</strong>
             * <p>nas-1746495857602745-cn-hangzhou</p>
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * <p>The region where the dedicated Logstore resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The role that is used by NAS to access Simple Log Service.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::162165525211xxxx:role/aliyunnaslogarchiverole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public MetaValue build() {
                return new MetaValue(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogAnalysisResponseBody</p>
     */
    public static class Analysis extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetaKey")
        private String metaKey;

        @com.aliyun.core.annotation.NameInMap("MetaValue")
        private MetaValue metaValue;

        private Analysis(Builder builder) {
            this.metaKey = builder.metaKey;
            this.metaValue = builder.metaValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analysis create() {
            return builder().build();
        }

        /**
         * @return metaKey
         */
        public String getMetaKey() {
            return this.metaKey;
        }

        /**
         * @return metaValue
         */
        public MetaValue getMetaValue() {
            return this.metaValue;
        }

        public static final class Builder {
            private String metaKey; 
            private MetaValue metaValue; 

            /**
             * <p>The ID of the file system.</p>
             * 
             * <strong>example:</strong>
             * <p>0c7154xxxx</p>
             */
            public Builder metaKey(String metaKey) {
                this.metaKey = metaKey;
                return this;
            }

            /**
             * <p>The log dump information of the file system.</p>
             */
            public Builder metaValue(MetaValue metaValue) {
                this.metaValue = metaValue;
                return this;
            }

            public Analysis build() {
                return new Analysis(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLogAnalysisResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLogAnalysisResponseBody</p>
     */
    public static class Analyses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Analysis")
        private java.util.List < Analysis> analysis;

        private Analyses(Builder builder) {
            this.analysis = builder.analysis;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Analyses create() {
            return builder().build();
        }

        /**
         * @return analysis
         */
        public java.util.List < Analysis> getAnalysis() {
            return this.analysis;
        }

        public static final class Builder {
            private java.util.List < Analysis> analysis; 

            /**
             * Analysis.
             */
            public Builder analysis(java.util.List < Analysis> analysis) {
                this.analysis = analysis;
                return this;
            }

            public Analyses build() {
                return new Analyses(this);
            } 

        } 

    }
}
