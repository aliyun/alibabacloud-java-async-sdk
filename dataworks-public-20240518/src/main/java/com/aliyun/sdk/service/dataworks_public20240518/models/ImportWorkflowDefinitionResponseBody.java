// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
         * AsyncJob.
         */
        public Builder asyncJob(AsyncJob asyncJob) {
            this.asyncJob = asyncJob;
            return this;
        }

        /**
         * RequestId.
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
             * Completed.
             */
            public Builder completed(Boolean completed) {
                this.completed = completed;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * Response.
             */
            public Builder response(String response) {
                this.response = response;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
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
