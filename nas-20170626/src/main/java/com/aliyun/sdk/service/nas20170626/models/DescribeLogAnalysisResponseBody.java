// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLogAnalysisResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLogAnalysisResponseBody</p>
 */
public class DescribeLogAnalysisResponseBody extends TeaModel {
    @NameInMap("Analyses")
    private Analyses analyses;

    @NameInMap("Code")
    private String code;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * Analyses.
         */
        public Builder analyses(Analyses analyses) {
            this.analyses = analyses;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLogAnalysisResponseBody build() {
            return new DescribeLogAnalysisResponseBody(this);
        } 

    } 

    public static class MetaValue extends TeaModel {
        @NameInMap("Logstore")
        private String logstore;

        @NameInMap("Project")
        private String project;

        @NameInMap("Region")
        private String region;

        @NameInMap("RoleArn")
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
             * Logstore.
             */
            public Builder logstore(String logstore) {
                this.logstore = logstore;
                return this;
            }

            /**
             * Project.
             */
            public Builder project(String project) {
                this.project = project;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * RoleArn.
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
    public static class Analysis extends TeaModel {
        @NameInMap("MetaKey")
        private String metaKey;

        @NameInMap("MetaValue")
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
             * MetaKey.
             */
            public Builder metaKey(String metaKey) {
                this.metaKey = metaKey;
                return this;
            }

            /**
             * MetaValue.
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
    public static class Analyses extends TeaModel {
        @NameInMap("Analysis")
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
