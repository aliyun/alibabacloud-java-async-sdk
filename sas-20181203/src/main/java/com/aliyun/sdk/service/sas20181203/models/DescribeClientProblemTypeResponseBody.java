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
    private java.util.List<ProblemTypes> problemTypes;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ProblemTypes> getProblemTypes() {
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
        private java.util.List<ProblemTypes> problemTypes; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeClientProblemTypeResponseBody model) {
            this.count = model.count;
            this.currentPage = model.currentPage;
            this.pageSize = model.pageSize;
            this.problemTypes = model.problemTypes;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The issue types.</p>
         */
        public Builder problemTypes(java.util.List<ProblemTypes> problemTypes) {
            this.problemTypes = problemTypes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D65AADFC-1D20-5A6A-8F6A-9FA53CXXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeClientProblemTypeResponseBody build() {
            return new DescribeClientProblemTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClientProblemTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClientProblemTypeResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ProblemTypes model) {
                this.problemDetail = model.problemDetail;
                this.problemId = model.problemId;
                this.problemType = model.problemType;
            } 

            /**
             * <p>The description of the issue type.</p>
             * 
             * <strong>example:</strong>
             * <p>other</p>
             */
            public Builder problemDetail(String problemDetail) {
                this.problemDetail = problemDetail;
                return this;
            }

            /**
             * <p>The ID of the issue type.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder problemId(String problemId) {
                this.problemId = problemId;
                return this;
            }

            /**
             * <p>The name of the issue type.</p>
             * 
             * <strong>example:</strong>
             * <p>high_cpu</p>
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
