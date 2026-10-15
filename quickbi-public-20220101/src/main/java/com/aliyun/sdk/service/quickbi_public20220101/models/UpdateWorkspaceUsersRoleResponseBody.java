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
 * {@link UpdateWorkspaceUsersRoleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWorkspaceUsersRoleResponseBody</p>
 */
public class UpdateWorkspaceUsersRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UpdateWorkspaceUsersRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceUsersRoleResponseBody create() {
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

        private Builder(UpdateWorkspaceUsersRoleResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7AAB95D7-2E11-4FE2-94BC-858E4FC0C976</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The execution result of the operation.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request is successful. Some members may be updated successfully while others fail. For the failure reasons, refer to FailureDetail in the response.</li>
         * <li>false: The request fails and no data is persisted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateWorkspaceUsersRoleResponseBody build() {
            return new UpdateWorkspaceUsersRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkspaceUsersRoleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceUsersRoleResponseBody</p>
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
             * <p>The number of users whose roles failed to be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failure(Integer failure) {
                this.failure = failure;
                return this;
            }

            /**
             * <p>The reasons for the update failures.</p>
             */
            public Builder failureDetail(java.util.Map<String, ?> failureDetail) {
                this.failureDetail = failureDetail;
                return this;
            }

            /**
             * <p>The number of users whose roles were successfully updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder success(Integer success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The total number of users to be updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
