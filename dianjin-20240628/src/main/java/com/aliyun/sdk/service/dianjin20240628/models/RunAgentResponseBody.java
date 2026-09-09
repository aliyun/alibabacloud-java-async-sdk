// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link RunAgentResponseBody} extends {@link TeaModel}
 *
 * <p>RunAgentResponseBody</p>
 */
public class RunAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private RunAgentResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunAgentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(RunAgentResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * <p>Duration in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>Response data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Data type</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>EF4B5C9B-3BC8-5171-A47B-4C5CF3DC3258</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates success</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public RunAgentResponseBody build() {
            return new RunAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RunAgentResponseBody} extends {@link TeaModel}
     *
     * <p>RunAgentResponseBody</p>
     */
    public static class FunctionCallResponses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("functionArgs")
        private String functionArgs;

        @com.aliyun.core.annotation.NameInMap("functionName")
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private FunctionCallResponses(Builder builder) {
            this.displayName = builder.displayName;
            this.endTime = builder.endTime;
            this.functionArgs = builder.functionArgs;
            this.functionName = builder.functionName;
            this.result = builder.result;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FunctionCallResponses create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return functionArgs
         */
        public String getFunctionArgs() {
            return this.functionArgs;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String displayName; 
            private String endTime; 
            private String functionArgs; 
            private String functionName; 
            private String result; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(FunctionCallResponses model) {
                this.displayName = model.displayName;
                this.endTime = model.endTime;
                this.functionArgs = model.functionArgs;
                this.functionName = model.functionName;
                this.result = model.result;
                this.startTime = model.startTime;
            } 

            /**
             * <p>Tool function display name</p>
             * 
             * <strong>example:</strong>
             * <p>搜索引擎</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>End time</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-21 16:37:14</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Tool function arguments</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;query\&quot;:\&quot;2025年1月28日到2月3日天气预报\&quot;}</p>
             */
            public Builder functionArgs(String functionArgs) {
                this.functionArgs = functionArgs;
                return this;
            }

            /**
             * <p>Tool function name</p>
             * 
             * <strong>example:</strong>
             * <p>web_search</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * <p>Tool call result</p>
             * 
             * <strong>example:</strong>
             * <p>下周天气晴朗</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>Start time</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-21 16:37:14</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public FunctionCallResponses build() {
                return new FunctionCallResponses(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunAgentResponseBody} extends {@link TeaModel}
     *
     * <p>RunAgentResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("roleDisplayName")
        private String roleDisplayName;

        private Message(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
            this.roleDisplayName = builder.roleDisplayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return roleDisplayName
         */
        public String getRoleDisplayName() {
            return this.roleDisplayName;
        }

        public static final class Builder {
            private String content; 
            private String role; 
            private String roleDisplayName; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.content = model.content;
                this.role = model.role;
                this.roleDisplayName = model.roleDisplayName;
            } 

            /**
             * <p>Text generated by the model.</p>
             * 
             * <strong>example:</strong>
             * <p>下周天气都不错</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Role of the model. Fixed value: assistant.</p>
             * 
             * <strong>example:</strong>
             * <p>assistant</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Display name of the model\&quot;s role.</p>
             * 
             * <strong>example:</strong>
             * <p>assistant</p>
             */
            public Builder roleDisplayName(String roleDisplayName) {
                this.roleDisplayName = roleDisplayName;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunAgentResponseBody} extends {@link TeaModel}
     *
     * <p>RunAgentResponseBody</p>
     */
    public static class Choices extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("finishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("index")
        private Integer index;

        @com.aliyun.core.annotation.NameInMap("message")
        private Message message;

        private Choices(Builder builder) {
            this.finishReason = builder.finishReason;
            this.index = builder.index;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Choices create() {
            return builder().build();
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return message
         */
        public Message getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String finishReason; 
            private Integer index; 
            private Message message; 

            private Builder() {
            } 

            private Builder(Choices model) {
                this.finishReason = model.finishReason;
                this.index = model.index;
                this.message = model.message;
            } 

            /**
             * <p>Reason why the model stopped generating content.</p>
             * 
             * <strong>example:</strong>
             * <p>stop</p>
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * <p>Index number of the generated result. Default is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>Message from the model.</p>
             */
            public Builder message(Message message) {
                this.message = message;
                return this;
            }

            public Choices build() {
                return new Choices(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunAgentResponseBody} extends {@link TeaModel}
     *
     * <p>RunAgentResponseBody</p>
     */
    public static class DataResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("choices")
        private java.util.List<Choices> choices;

        @com.aliyun.core.annotation.NameInMap("created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        private DataResponse(Builder builder) {
            this.choices = builder.choices;
            this.created = builder.created;
            this.id = builder.id;
            this.modelId = builder.modelId;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataResponse create() {
            return builder().build();
        }

        /**
         * @return choices
         */
        public java.util.List<Choices> getChoices() {
            return this.choices;
        }

        /**
         * @return created
         */
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private java.util.List<Choices> choices; 
            private Long created; 
            private String id; 
            private String modelId; 
            private String time; 

            private Builder() {
            } 

            private Builder(DataResponse model) {
                this.choices = model.choices;
                this.created = model.created;
                this.id = model.id;
                this.modelId = model.modelId;
                this.time = model.time;
            } 

            /**
             * <p>Details of the model-generated content.</p>
             */
            public Builder choices(java.util.List<Choices> choices) {
                this.choices = choices;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>1737448637</p>
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * <p>ID generated by the system for this call.</p>
             * 
             * <strong>example:</strong>
             * <p>d91d9afa-7cfc-4235-b012-a6f8e6ffa443</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Name of the model used for this call.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>Time</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-21T16:37:17.497206762</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public DataResponse build() {
                return new DataResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunAgentResponseBody} extends {@link TeaModel}
     *
     * <p>RunAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("functionCallResponses")
        private java.util.List<FunctionCallResponses> functionCallResponses;

        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Integer outputTokens;

        @com.aliyun.core.annotation.NameInMap("response")
        private DataResponse response;

        @com.aliyun.core.annotation.NameInMap("threadId")
        private String threadId;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("versionId")
        private String versionId;

        private Data(Builder builder) {
            this.functionCallResponses = builder.functionCallResponses;
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.response = builder.response;
            this.threadId = builder.threadId;
            this.traceId = builder.traceId;
            this.versionId = builder.versionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return functionCallResponses
         */
        public java.util.List<FunctionCallResponses> getFunctionCallResponses() {
            return this.functionCallResponses;
        }

        /**
         * @return inputTokens
         */
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return outputTokens
         */
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return response
         */
        public DataResponse getResponse() {
            return this.response;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return versionId
         */
        public String getVersionId() {
            return this.versionId;
        }

        public static final class Builder {
            private java.util.List<FunctionCallResponses> functionCallResponses; 
            private Integer inputTokens; 
            private Integer outputTokens; 
            private DataResponse response; 
            private String threadId; 
            private String traceId; 
            private String versionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.functionCallResponses = model.functionCallResponses;
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.response = model.response;
                this.threadId = model.threadId;
                this.traceId = model.traceId;
                this.versionId = model.versionId;
            } 

            /**
             * <p>Tool call responses</p>
             */
            public Builder functionCallResponses(java.util.List<FunctionCallResponses> functionCallResponses) {
                this.functionCallResponses = functionCallResponses;
                return this;
            }

            /**
             * <p>Input tokens</p>
             * 
             * <strong>example:</strong>
             * <p>766</p>
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>Output tokens</p>
             * 
             * <strong>example:</strong>
             * <p>988</p>
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>Model response</p>
             */
            public Builder response(DataResponse response) {
                this.response = response;
                return this;
            }

            /**
             * <p>Thread ID</p>
             * 
             * <strong>example:</strong>
             * <p>4vlag5ken3</p>
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            /**
             * <p>Trace ID</p>
             * 
             * <strong>example:</strong>
             * <p>5bdb9809856c58acb92001f8ae65773c</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * <p>Agent version ID</p>
             * 
             * <strong>example:</strong>
             * <p>w4paqoezm2</p>
             */
            public Builder versionId(String versionId) {
                this.versionId = versionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
