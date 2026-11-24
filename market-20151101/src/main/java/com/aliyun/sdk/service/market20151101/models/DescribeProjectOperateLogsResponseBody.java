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
 * {@link DescribeProjectOperateLogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProjectOperateLogsResponseBody</p>
 */
public class DescribeProjectOperateLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeProjectOperateLogsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProjectOperateLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeProjectOperateLogsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e6037e86-657f-4194-bb6a-7b26973aec8d</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeProjectOperateLogsResponseBody build() {
            return new DescribeProjectOperateLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeProjectOperateLogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeProjectOperateLogsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private Long operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("OperatorRole")
        private String operatorRole;

        private Result(Builder builder) {
            this.description = builder.description;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String description; 
            private Long gmtCreate; 
            private Long operator; 
            private String operatorName; 
            private String operatorRole; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.operator = model.operator;
                this.operatorName = model.operatorName;
                this.operatorRole = model.operatorRole;
            } 

            /**
             * <p>The description of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Entered the service provider assignment step</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The operation time (UNIX timestamp).</p>
             * 
             * <strong>example:</strong>
             * <p>1587624497000</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder operator(Long operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The name of the operator.</p>
             * 
             * <strong>example:</strong>
             * <p>System</p>
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * <p>The role of the operator. Valid values:</p>
             * <ul>
             * <li>System: system.</li>
             * <li>Custom: customer.</li>
             * <li>Provider: service provider.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>System</p>
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
