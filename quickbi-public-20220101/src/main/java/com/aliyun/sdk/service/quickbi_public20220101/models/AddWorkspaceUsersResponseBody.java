// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
        public Builder result(Result result) {
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
        private java.util.Map < String, ? > failureDetail;

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
        public java.util.Map < String, ? > getFailureDetail() {
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
            private java.util.Map < String, ? > failureDetail; 
            private Integer success; 
            private Integer total; 

            /**
             * Failure.
             */
            public Builder failure(Integer failure) {
                this.failure = failure;
                return this;
            }

            /**
             * FailureDetail.
             */
            public Builder failureDetail(java.util.Map < String, ? > failureDetail) {
                this.failureDetail = failureDetail;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Integer success) {
                this.success = success;
                return this;
            }

            /**
             * Total.
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
