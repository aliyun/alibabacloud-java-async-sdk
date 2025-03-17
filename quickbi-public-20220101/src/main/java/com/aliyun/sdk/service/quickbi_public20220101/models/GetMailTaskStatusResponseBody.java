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
 * {@link GetMailTaskStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetMailTaskStatusResponseBody</p>
 */
public class GetMailTaskStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMailTaskStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMailTaskStatusResponseBody create() {
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

        private Builder(GetMailTaskStatusResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>38C0FEC8-****-415C-A9F1-****422BDB65</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return result.</p>
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: The request was successful. </li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMailTaskStatusResponseBody build() {
            return new GetMailTaskStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMailTaskStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetMailTaskStatusResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("execTime")
        private String execTime;

        @com.aliyun.core.annotation.NameInMap("mailId")
        private String mailId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        private Result(Builder builder) {
            this.execTime = builder.execTime;
            this.mailId = builder.mailId;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return execTime
         */
        public String getExecTime() {
            return this.execTime;
        }

        /**
         * @return mailId
         */
        public String getMailId() {
            return this.mailId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String execTime; 
            private String mailId; 
            private String status; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.execTime = model.execTime;
                this.mailId = model.mailId;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>Execution time, in the format yyyy-MM-dd HH:mm:ss</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-09 17:34:11</p>
             */
            public Builder execTime(String execTime) {
                this.execTime = execTime;
                return this;
            }

            /**
             * <p>Mail ID</p>
             * 
             * <strong>example:</strong>
             * <p>c38f73f4c5*****c808c41b3f4d23b7852</p>
             */
            public Builder mailId(String mailId) {
                this.mailId = mailId;
                return this;
            }

            /**
             * <p>Mail status. Possible values:</p>
             * <ul>
             * <li>Success: SENT</li>
             * <li>Failure: FAILED </li>
             * <li>In Progress: PROCESSING</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SENT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Task ID</p>
             * 
             * <strong>example:</strong>
             * <p>1282xxx610816</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
