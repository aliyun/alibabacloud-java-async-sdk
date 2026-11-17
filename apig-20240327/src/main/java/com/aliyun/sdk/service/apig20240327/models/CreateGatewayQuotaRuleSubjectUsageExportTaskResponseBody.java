// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody</p>
 */
public class CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;taskId&quot;: &quot;finops-export-abcdef1234567890&quot;,
         *   &quot;status&quot;: &quot;Pending&quot;
         * }</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID of this OpenAPI call, which is used to troubleshoot call issues. This is different from the request_id of each consumption record in the exported file.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody build() {
            return new CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateGatewayQuotaRuleSubjectUsageExportTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Data(Builder builder) {
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The current status of create task.</p>
             * <ul>
             * <li>Pending: Create task is submitted and waiting to be processed.</li>
             * <li>Running: The system is querying details, generating the file, or uploading the file.</li>
             * <li>Success: The export is successful. Call the query operation to obtain the file information.</li>
             * <li>Failed: The export fails. Call the query operation to view the errorMessage.</li>
             * </ul>
             * <p>A newly created task returns Pending. When an existing task is reused through clientToken, the status of create task at that time is returned, which is not guaranteed to be Pending.</p>
             * 
             * <strong>example:</strong>
             * <p>Pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the export task. When you call GetGatewayQuotaRuleSubjectUsageExportTask, pass this value along with the gatewayId, ruleId, and subjectId from this request.</p>
             * 
             * <strong>example:</strong>
             * <p>finops-export-abcdef1234567890</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
