// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

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
 * {@link DescribeProjectMessagesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectMessagesResponseBody</p>
 */
public class DescribeProjectMessagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeProjectMessagesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectMessagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeProjectMessagesResponseBody build() {
            return new DescribeProjectMessagesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProjectMessagesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectMessagesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private Long operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("OperatorRole")
        private String operatorRole;

        private Result(Builder builder) {
            this.content = builder.content;
            this.gmtCreate = builder.gmtCreate;
            this.operator = builder.operator;
            this.operatorName = builder.operatorName;
            this.operatorRole = builder.operatorRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return operator
         */
        public Long getOperator() {
            return this.operator;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return operatorRole
         */
        public String getOperatorRole() {
            return this.operatorRole;
        }

        public static final class Builder {
            private String content; 
            private Long gmtCreate; 
            private Long operator; 
            private String operatorName; 
            private String operatorRole; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(Long operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * OperatorRole.
             */
            public Builder operatorRole(String operatorRole) {
                this.operatorRole = operatorRole;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
