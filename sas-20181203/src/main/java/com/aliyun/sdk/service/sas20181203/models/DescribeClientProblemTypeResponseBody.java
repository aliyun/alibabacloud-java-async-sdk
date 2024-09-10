// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClientProblemTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClientProblemTypeResponseBody</p>
 */
public class DescribeClientProblemTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("ProblemTypes")
    private java.util.List < ProblemTypes> problemTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeClientProblemTypeResponseBody(Builder builder) {
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.problemTypes = builder.problemTypes;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClientProblemTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
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
     * @return problemTypes
     */
    public java.util.List < ProblemTypes> getProblemTypes() {
        return this.problemTypes;
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
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private java.util.List < ProblemTypes> problemTypes; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * ProblemTypes.
         */
        public Builder problemTypes(java.util.List < ProblemTypes> problemTypes) {
            this.problemTypes = problemTypes;
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

        public DescribeClientProblemTypeResponseBody build() {
            return new DescribeClientProblemTypeResponseBody(this);
        } 

    } 

    public static class ProblemTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("problemDetail")
        private String problemDetail;

        @com.aliyun.core.annotation.NameInMap("problemId")
        private String problemId;

        @com.aliyun.core.annotation.NameInMap("problemType")
        private String problemType;

        private ProblemTypes(Builder builder) {
            this.problemDetail = builder.problemDetail;
            this.problemId = builder.problemId;
            this.problemType = builder.problemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProblemTypes create() {
            return builder().build();
        }

        /**
         * @return problemDetail
         */
        public String getProblemDetail() {
            return this.problemDetail;
        }

        /**
         * @return problemId
         */
        public String getProblemId() {
            return this.problemId;
        }

        /**
         * @return problemType
         */
        public String getProblemType() {
            return this.problemType;
        }

        public static final class Builder {
            private String problemDetail; 
            private String problemId; 
            private String problemType; 

            /**
             * problemDetail.
             */
            public Builder problemDetail(String problemDetail) {
                this.problemDetail = problemDetail;
                return this;
            }

            /**
             * problemId.
             */
            public Builder problemId(String problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * problemType.
             */
            public Builder problemType(String problemType) {
                this.problemType = problemType;
                return this;
            }

            public ProblemTypes build() {
                return new ProblemTypes(this);
            } 

        } 

    }
}
