// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link AddWorkspaceUsersResponseBody} extends {@link TeaModel}
 *
 * <p>AddWorkspaceUsersResponseBody</p>
 */
public class AddWorkspaceUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddWorkspaceUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWorkspaceUsersResponseBody create() {
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
    public Result getResult() {
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
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AddWorkspaceUsersResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7AAB95D7-2E11-4FE2-94BC-858E4FC0C976</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the result of the API execution.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Value range:</p>
         * <ul>
         * <li>true: The request was successful. There may be cases where some members are added successfully and others fail. For the reasons of failure, refer to the FailureDetail in the response.</li>
         * <li>false: The request failed, and no data will be persisted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddWorkspaceUsersResponseBody build() {
            return new AddWorkspaceUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddWorkspaceUsersResponseBody} extends {@link TeaModel}
     *
     * <p>AddWorkspaceUsersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Failure")
        private Integer failure;

        @com.aliyun.core.annotation.NameInMap("FailureDetail")
        private java.util.Map<String, ?> failureDetail;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Integer success;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Result(Builder builder) {
            this.failure = builder.failure;
            this.failureDetail = builder.failureDetail;
            this.success = builder.success;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return failure
         */
        public Integer getFailure() {
            return this.failure;
        }

        /**
         * @return failureDetail
         */
        public java.util.Map<String, ?> getFailureDetail() {
            return this.failureDetail;
        }

        /**
         * @return success
         */
        public Integer getSuccess() {
            return this.success;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer failure; 
            private java.util.Map<String, ?> failureDetail; 
            private Integer success; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.failure = model.failure;
                this.failureDetail = model.failureDetail;
                this.success = model.success;
                this.total = model.total;
            } 

            /**
             * <p>Number of users that failed to be added.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder failure(Integer failure) {
                this.failure = failure;
                return this;
            }

            /**
             * <p>Reasons for the failures.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;2046274934845893&quot; : &quot;AE0150010001: This user already exists.&quot;, &quot;1213444447906552&quot; : &quot;AE0150010001: This user already exists.&quot;}</p>
             */
            public Builder failureDetail(java.util.Map<String, ?> failureDetail) {
                this.failureDetail = failureDetail;
                return this;
            }

            /**
             * <p>Number of users that were added successfully.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder success(Integer success) {
                this.success = success;
                return this;
            }

            /**
             * <p>Total number of users being added.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
