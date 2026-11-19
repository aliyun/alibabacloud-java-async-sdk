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
 * {@link ListMemoryTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListMemoryTasksResponseBody</p>
 */
public class ListMemoryTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListMemoryTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMemoryTasksResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListMemoryTasksResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>code</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>httpStatusCode</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>items</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>maxResults</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>message</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>nextToken</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjIwMH0=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>01A00000-0000-0000-0000-000000000001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>success</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>totalCount</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMemoryTasksResponseBody build() {
            return new ListMemoryTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMemoryTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemoryTasksResponseBody</p>
     */
    public static class Changes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memoryId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memoryId;

        @com.aliyun.core.annotation.NameInMap("operation")
        @com.aliyun.core.annotation.Validation(required = true)
        private String operation;

        private Changes(Builder builder) {
            this.memoryId = builder.memoryId;
            this.operation = builder.operation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Changes create() {
            return builder().build();
        }

        /**
         * @return memoryId
         */
        public String getMemoryId() {
            return this.memoryId;
        }

        /**
         * @return operation
         */
        public String getOperation() {
            return this.operation;
        }

        public static final class Builder {
            private String memoryId; 
            private String operation; 

            private Builder() {
            } 

            private Builder(Changes model) {
                this.memoryId = model.memoryId;
                this.operation = model.operation;
            } 

            /**
             * <p>memoryId</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mem-2f5f9c5a8d0e4c3b</p>
             */
            public Builder memoryId(String memoryId) {
                this.memoryId = memoryId;
                return this;
            }

            /**
             * <p>operation</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ADD</p>
             */
            public Builder operation(String operation) {
                this.operation = operation;
                return this;
            }

            public Changes build() {
                return new Changes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMemoryTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemoryTasksResponseBody</p>
     */
    public static class Error extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("message")
        @com.aliyun.core.annotation.Validation(required = true)
        private String message;

        private Error(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Error create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(Error model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * <p>code</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>message</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>The event content format is incorrect</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Error build() {
                return new Error(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMemoryTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemoryTasksResponseBody</p>
     */
    public static class Memories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("memoryId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memoryId;

        private Memories(Builder builder) {
            this.memoryId = builder.memoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memories create() {
            return builder().build();
        }

        /**
         * @return memoryId
         */
        public String getMemoryId() {
            return this.memoryId;
        }

        public static final class Builder {
            private String memoryId; 

            private Builder() {
            } 

            private Builder(Memories model) {
                this.memoryId = model.memoryId;
            } 

            /**
             * <p>memoryId</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mem-2f5f9c5a8d0e4c3b</p>
             */
            public Builder memoryId(String memoryId) {
                this.memoryId = memoryId;
                return this;
            }

            public Memories build() {
                return new Memories(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMemoryTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemoryTasksResponseBody</p>
     */
    public static class StrategyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instruction")
        private String instruction;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private StrategyConfig(Builder builder) {
            this.instruction = builder.instruction;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StrategyConfig create() {
            return builder().build();
        }

        /**
         * @return instruction
         */
        public String getInstruction() {
            return this.instruction;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String instruction; 
            private String type; 

            private Builder() {
            } 

            private Builder(StrategyConfig model) {
                this.instruction = model.instruction;
                this.type = model.type;
            } 

            /**
             * <p>The strategy-level instruction. It takes effect together with the store-level instruction. If a conflict occurs, this field takes precedence.</p>
             * 
             * <strong>example:</strong>
             * <p>Retain only long-term preferences explicitly expressed by the user</p>
             */
            public Builder instruction(String instruction) {
                this.instruction = instruction;
                return this;
            }

            /**
             * <p>type</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StrategyConfig build() {
                return new StrategyConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListMemoryTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListMemoryTasksResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("changes")
        private java.util.List<Changes> changes;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        @com.aliyun.core.annotation.Validation(required = true)
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("error")
        private Error error;

        @com.aliyun.core.annotation.NameInMap("finishedAt")
        private String finishedAt;

        @com.aliyun.core.annotation.NameInMap("inputMessageCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long inputMessageCount;

        @com.aliyun.core.annotation.NameInMap("inputTokenCount")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long inputTokenCount;

        @com.aliyun.core.annotation.NameInMap("memories")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Memories> memories;

        @com.aliyun.core.annotation.NameInMap("startedAt")
        private String startedAt;

        @com.aliyun.core.annotation.NameInMap("status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        @com.aliyun.core.annotation.NameInMap("strategyConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private StrategyConfig strategyConfig;

        @com.aliyun.core.annotation.NameInMap("taskId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("triggerType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String triggerType;

        private Items(Builder builder) {
            this.changes = builder.changes;
            this.createdAt = builder.createdAt;
            this.error = builder.error;
            this.finishedAt = builder.finishedAt;
            this.inputMessageCount = builder.inputMessageCount;
            this.inputTokenCount = builder.inputTokenCount;
            this.memories = builder.memories;
            this.startedAt = builder.startedAt;
            this.status = builder.status;
            this.strategyConfig = builder.strategyConfig;
            this.taskId = builder.taskId;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return changes
         */
        public java.util.List<Changes> getChanges() {
            return this.changes;
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return error
         */
        public Error getError() {
            return this.error;
        }

        /**
         * @return finishedAt
         */
        public String getFinishedAt() {
            return this.finishedAt;
        }

        /**
         * @return inputMessageCount
         */
        public Long getInputMessageCount() {
            return this.inputMessageCount;
        }

        /**
         * @return inputTokenCount
         */
        public Long getInputTokenCount() {
            return this.inputTokenCount;
        }

        /**
         * @return memories
         */
        public java.util.List<Memories> getMemories() {
            return this.memories;
        }

        /**
         * @return startedAt
         */
        public String getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyConfig
         */
        public StrategyConfig getStrategyConfig() {
            return this.strategyConfig;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private java.util.List<Changes> changes; 
            private String createdAt; 
            private Error error; 
            private String finishedAt; 
            private Long inputMessageCount; 
            private Long inputTokenCount; 
            private java.util.List<Memories> memories; 
            private String startedAt; 
            private String status; 
            private StrategyConfig strategyConfig; 
            private String taskId; 
            private String triggerType; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.changes = model.changes;
                this.createdAt = model.createdAt;
                this.error = model.error;
                this.finishedAt = model.finishedAt;
                this.inputMessageCount = model.inputMessageCount;
                this.inputTokenCount = model.inputTokenCount;
                this.memories = model.memories;
                this.startedAt = model.startedAt;
                this.status = model.status;
                this.strategyConfig = model.strategyConfig;
                this.taskId = model.taskId;
                this.triggerType = model.triggerType;
            } 

            /**
             * <p>changes</p>
             */
            public Builder changes(java.util.List<Changes> changes) {
                this.changes = changes;
                return this;
            }

            /**
             * <p>createdAt</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * <p>error</p>
             */
            public Builder error(Error error) {
                this.error = error;
                return this;
            }

            /**
             * <p>finishedAt</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:01Z</p>
             */
            public Builder finishedAt(String finishedAt) {
                this.finishedAt = finishedAt;
                return this;
            }

            /**
             * <p>inputMessageCount</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder inputMessageCount(Long inputMessageCount) {
                this.inputMessageCount = inputMessageCount;
                return this;
            }

            /**
             * <p>inputTokenCount</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder inputTokenCount(Long inputTokenCount) {
                this.inputTokenCount = inputTokenCount;
                return this;
            }

            /**
             * <p>memories</p>
             * <p>This parameter is required.</p>
             */
            public Builder memories(java.util.List<Memories> memories) {
                this.memories = memories;
                return this;
            }

            /**
             * <p>startedAt</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-23T10:00:00Z</p>
             */
            public Builder startedAt(String startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * <p>status</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>strategyConfig</p>
             * <p>This parameter is required.</p>
             */
            public Builder strategyConfig(StrategyConfig strategyConfig) {
                this.strategyConfig = strategyConfig;
                return this;
            }

            /**
             * <p>taskId</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>task-2f5f9c5a8d0e4c3b</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>triggerType</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>AUTO</p>
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
