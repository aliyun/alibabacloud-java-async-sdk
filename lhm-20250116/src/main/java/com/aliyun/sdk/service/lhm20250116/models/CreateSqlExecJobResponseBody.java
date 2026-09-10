// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link CreateSqlExecJobResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSqlExecJobResponseBody</p>
 */
public class CreateSqlExecJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateSqlExecJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSqlExecJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateSqlExecJobResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data body returned by the operation. For the field structure, see the child parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. An empty string is returned if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues with this call.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call succeeded.</li>
         * <li>false: The call failed. Check errCode and errMessage for troubleshooting.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateSqlExecJobResponseBody build() {
            return new CreateSqlExecJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSqlExecJobResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSqlExecJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("execJobId")
        private Long execJobId;

        @com.aliyun.core.annotation.NameInMap("message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("success")
        private Boolean success;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private Long taskId;

        private Data(Builder builder) {
            this.execJobId = builder.execJobId;
            this.message = builder.message;
            this.success = builder.success;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return execJobId
         */
        public Long getExecJobId() {
            return this.execJobId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long execJobId; 
            private String message; 
            private Boolean success; 
            private Long taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.execJobId = model.execJobId;
                this.message = model.message;
                this.success = model.success;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The execution job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder execJobId(Long execJobId) {
                this.execJobId = execJobId;
                return this;
            }

            /**
             * <p>The message.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>Indicates whether the submission succeeded.</p>
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
