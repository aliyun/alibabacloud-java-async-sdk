// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetUpdateTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetUpdateTaskResultResponseBody</p>
 */
public class GetUpdateTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private GetUpdateTaskResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUpdateTaskResultResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetUpdateTaskResultResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>7C352CB7-CD88-50CF-9D0D-E81BDF020E7F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The node update result.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetUpdateTaskResultResponseBody build() {
            return new GetUpdateTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUpdateTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetUpdateTaskResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailureMessage")
        private String failureMessage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Result(Builder builder) {
            this.failureMessage = builder.failureMessage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return failureMessage
         */
        public String getFailureMessage() {
            return this.failureMessage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String failureMessage; 
            private String status; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.failureMessage = model.failureMessage;
                this.status = model.status;
            } 

            /**
             * <p>The failure message. This field is returned if the update fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Invalid Param xxx</p>
             */
            public Builder failureMessage(String failureMessage) {
                this.failureMessage = failureMessage;
                return this;
            }

            /**
             * <p>The update status. Valid values:</p>
             * <ul>
             * <li>Updating: The node is being updated.</li>
             * <li>Updated: The node is updated.</li>
             * <li>UpdateFailed: The node failed to be updated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Updated</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
