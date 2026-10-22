// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link GetIdentityProviderSyncJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderSyncJobResponseBody</p>
 */
public class GetIdentityProviderSyncJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetIdentityProviderSyncJobResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderSyncJobResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderSyncJobResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code of the API request. SUCCESS indicates that the request is successful, but does not indicate that the asynchronous synchronization task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned by the request.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;taskId&quot;:&quot;12345678-1234-4234-8234-123456789abc&quot;,&quot;status&quot;:&quot;SUCCESS&quot;,&quot;currentStep&quot;:&quot;SYNC&quot;,&quot;synchronizationJobId&quot;:&quot;syncjob_0123456789abcdef0123456789abcdef&quot;,&quot;syncedUserCount&quot;:12}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the API request. It does not indicate the execution result of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message of the API request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. Provide this value when you troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. To determine whether the asynchronous task is completed, query the task status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetIdentityProviderSyncJobResponseBody build() {
            return new GetIdentityProviderSyncJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderSyncJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderSyncJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("currentStep")
        private String currentStep;

        @com.aliyun.core.annotation.NameInMap("failureReason")
        private String failureReason;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("syncedUserCount")
        private Integer syncedUserCount;

        @com.aliyun.core.annotation.NameInMap("synchronizationJobId")
        private String synchronizationJobId;

        @com.aliyun.core.annotation.NameInMap("taskId")
        private String taskId;

        private Data(Builder builder) {
            this.currentStep = builder.currentStep;
            this.failureReason = builder.failureReason;
            this.status = builder.status;
            this.syncedUserCount = builder.syncedUserCount;
            this.synchronizationJobId = builder.synchronizationJobId;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentStep
         */
        public String getCurrentStep() {
            return this.currentStep;
        }

        /**
         * @return failureReason
         */
        public String getFailureReason() {
            return this.failureReason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return syncedUserCount
         */
        public Integer getSyncedUserCount() {
            return this.syncedUserCount;
        }

        /**
         * @return synchronizationJobId
         */
        public String getSynchronizationJobId() {
            return this.synchronizationJobId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String currentStep; 
            private String failureReason; 
            private String status; 
            private Integer syncedUserCount; 
            private String synchronizationJobId; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentStep = model.currentStep;
                this.failureReason = model.failureReason;
                this.status = model.status;
                this.syncedUserCount = model.syncedUserCount;
                this.synchronizationJobId = model.synchronizationJobId;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The current execution step of the AgentCore asynchronous task. This field may not be returned if the task has not started.</p>
             * 
             * <strong>example:</strong>
             * <p>SYNC</p>
             */
            public Builder currentStep(String currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * <p>The failure summary of the asynchronous task. This field is not returned if there is no failure information. You can use the taskId and requestId for troubleshooting.</p>
             * 
             * <strong>example:</strong>
             * <p>The identity provider synchronization job failed.</p>
             */
            public Builder failureReason(String failureReason) {
                this.failureReason = failureReason;
                return this;
            }

            /**
             * <p>The status of the synchronization task. Valid values:</p>
             * <ul>
             * <li>PENDING: The task is pending execution.</li>
             * <li>RUNNING: The task is running.</li>
             * <li>PAUSED: The task is paused.</li>
             * <li>SUCCESS: The task is successful.</li>
             * <li>FAILED: The task failed.</li>
             * <li>CANCELED: The task is canceled.
             * The first three values are non-terminal states, and the last three values are terminal states. Query the task until it reaches a terminal state to determine the result.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The number of user entries that have been locally read and written or updated, including existing users. This value does not represent the number of newly added users or the synchronization percentage. This field is not returned when no statistics are available.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder syncedUserCount(Integer syncedUserCount) {
                this.syncedUserCount = syncedUserCount;
                return this;
            }

            /**
             * <p>The downstream synchronization task ID of AgentIdentity. This field is not returned if the task has not been created. It cannot replace the taskId to call GetIdentityProviderSyncJob.</p>
             * 
             * <strong>example:</strong>
             * <p>syncjob_0123456789abcdef0123456789abcdef</p>
             */
            public Builder synchronizationJobId(String synchronizationJobId) {
                this.synchronizationJobId = synchronizationJobId;
                return this;
            }

            /**
             * <p>The local task ID of AgentCore returned by CreateIdentityProviderSyncJob. It is not the synchronizationJobId of AgentIdentity. The same workspace and identity provider must be used for the query.</p>
             * 
             * <strong>example:</strong>
             * <p>12345678-1234-4234-8234-123456789abc</p>
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
