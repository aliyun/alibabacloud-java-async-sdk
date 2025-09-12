// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link GetGraphRAGJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetGraphRAGJobResponseBody</p>
 */
public class GetGraphRAGJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Usage")
    private Usage usage;

    private GetGraphRAGJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGraphRAGJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return usage
     */
    public Usage getUsage() {
        return this.usage;
    }

    public static final class Builder {
        private Job job; 
        private String message; 
        private String requestId; 
        private String status; 
        private Usage usage; 

        private Builder() {
        } 

        private Builder(GetGraphRAGJobResponseBody model) {
            this.job = model.job;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.usage = model.usage;
        } 

        /**
         * Job.
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * Usage.
         */
        public Builder usage(Usage usage) {
            this.usage = usage;
            return this;
        }

        public GetGraphRAGJobResponseBody build() {
            return new GetGraphRAGJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGraphRAGJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetGraphRAGJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Completed")
        private Boolean completed;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Job(Builder builder) {
            this.completed = builder.completed;
            this.createTime = builder.createTime;
            this.error = builder.error;
            this.id = builder.id;
            this.progress = builder.progress;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
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
        public String getCreateTime() {
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Boolean completed; 
            private String createTime; 
            private String error; 
            private String id; 
            private Integer progress; 
            private String status; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.completed = model.completed;
                this.createTime = model.createTime;
                this.error = model.error;
                this.id = model.id;
                this.progress = model.progress;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

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
            public Builder createTime(String createTime) {
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGraphRAGJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetGraphRAGJobResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EmbeddingTokens")
        private Integer embeddingTokens;

        @com.aliyun.core.annotation.NameInMap("LLMInputTokens")
        private Integer LLMInputTokens;

        @com.aliyun.core.annotation.NameInMap("LLMOutputTokens")
        private Integer LLMOutputTokens;

        private Usage(Builder builder) {
            this.embeddingTokens = builder.embeddingTokens;
            this.LLMInputTokens = builder.LLMInputTokens;
            this.LLMOutputTokens = builder.LLMOutputTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return embeddingTokens
         */
        public Integer getEmbeddingTokens() {
            return this.embeddingTokens;
        }

        /**
         * @return LLMInputTokens
         */
        public Integer getLLMInputTokens() {
            return this.LLMInputTokens;
        }

        /**
         * @return LLMOutputTokens
         */
        public Integer getLLMOutputTokens() {
            return this.LLMOutputTokens;
        }

        public static final class Builder {
            private Integer embeddingTokens; 
            private Integer LLMInputTokens; 
            private Integer LLMOutputTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.embeddingTokens = model.embeddingTokens;
                this.LLMInputTokens = model.LLMInputTokens;
                this.LLMOutputTokens = model.LLMOutputTokens;
            } 

            /**
             * EmbeddingTokens.
             */
            public Builder embeddingTokens(Integer embeddingTokens) {
                this.embeddingTokens = embeddingTokens;
                return this;
            }

            /**
             * LLMInputTokens.
             */
            public Builder LLMInputTokens(Integer LLMInputTokens) {
                this.LLMInputTokens = LLMInputTokens;
                return this;
            }

            /**
             * LLMOutputTokens.
             */
            public Builder LLMOutputTokens(Integer LLMOutputTokens) {
                this.LLMOutputTokens = LLMOutputTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
}
