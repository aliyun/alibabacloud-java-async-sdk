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
 * {@link ImportWorkflowDefinitionResponseBody} extends {@link TeaModel}
 *
 * <p>ImportWorkflowDefinitionResponseBody</p>
 */
public class ImportWorkflowDefinitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsyncJob")
    private AsyncJob asyncJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ImportWorkflowDefinitionResponseBody(Builder builder) {
        this.asyncJob = builder.asyncJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportWorkflowDefinitionResponseBody create() {
        return builder().build();
    }

    /**
     * @return asyncJob
     */
    public AsyncJob getAsyncJob() {
        return this.asyncJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AsyncJob asyncJob; 
        private String requestId; 

        /**
         * <p>The status information of the asynchronous task.</p>
         */
        public Builder asyncJob(AsyncJob asyncJob) {
            this.asyncJob = asyncJob;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7C352CB7-CD88-50CF-9D0D-E81BDF020E7F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImportWorkflowDefinitionResponseBody build() {
            return new ImportWorkflowDefinitionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ImportWorkflowDefinitionResponseBody} extends {@link TeaModel}
     *
     * <p>ImportWorkflowDefinitionResponseBody</p>
     */
    public static class AsyncJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Completed")
        private Boolean completed;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Response")
        private String response;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private AsyncJob(Builder builder) {
            this.completed = builder.completed;
            this.createTime = builder.createTime;
            this.error = builder.error;
            this.id = builder.id;
            this.progress = builder.progress;
            this.response = builder.response;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsyncJob create() {
            return builder().build();
        }

        /**
         * @return completed
         */
        public Boolean getCompleted() {
            return this.completed;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return response
         */
        public String getResponse() {
            return this.response;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean completed; 
            private Long createTime; 
            private String error; 
            private String id; 
            private Integer progress; 
            private String response; 
            private String status; 
            private String type; 

            /**
             * <p>Indicates whether the asynchronous task is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder completed(Boolean completed) {
                this.completed = completed;
                return this;
            }

            /**
             * <p>The time when the asynchronous task was created. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1706581425000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The error message returned if the asynchronous task fails.</p>
             * 
             * <strong>example:</strong>
             * <p>target folder already exists: XXXX</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The ID of the asynchronous task.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567691239009XXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The progress of the asynchronous task. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The response.</p>
             * <blockquote>
             * <p> The workflow ID is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>632647691239009XXXX</p>
             */
            public Builder response(String response) {
                this.response = response;
                return this;
            }

            /**
             * <p>The status of the asynchronous task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Running: The asynchronous task is running.</li>
             * <li>Success: The asynchronous task is complete.</li>
             * <li>Fail: The asynchronous task fails.</li>
             * <li>Cancel: The asynchronous task is canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the asynchronous task.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Create: The asynchronous task is used to create an object.</li>
             * <li>Cancel: The asynchronous task is used to cancel an operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Create</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AsyncJob build() {
                return new AsyncJob(this);
            } 

        } 

    }
}
