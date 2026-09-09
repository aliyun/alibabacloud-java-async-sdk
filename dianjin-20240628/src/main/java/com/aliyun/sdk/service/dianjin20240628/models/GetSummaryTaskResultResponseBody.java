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
 * {@link GetSummaryTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetSummaryTaskResultResponseBody</p>
 */
public class GetSummaryTaskResultResponseBody extends TeaModel {
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

    private GetSummaryTaskResultResponseBody(Builder builder) {
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

    public static GetSummaryTaskResultResponseBody create() {
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

        private Builder(GetSummaryTaskResultResponseBody model) {
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
         * <p>Time spent</p>
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
         * <p>0bc13a9517168617617186457e401f</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the operation succeeded</p>
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
         * <p>2024-04-24 11:54:34</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GetSummaryTaskResultResponseBody build() {
            return new GetSummaryTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSummaryTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSummaryTaskResultResponseBody</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("toolCalls")
        private java.util.List<java.util.Map<String, ?>> toolCalls;

        private Message(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
            this.toolCalls = builder.toolCalls;
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
         * @return toolCalls
         */
        public java.util.List<java.util.Map<String, ?>> getToolCalls() {
            return this.toolCalls;
        }

        public static final class Builder {
            private String content; 
            private String role; 
            private java.util.List<java.util.Map<String, ?>> toolCalls; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.content = model.content;
                this.role = model.role;
                this.toolCalls = model.toolCalls;
            } 

            /**
             * <p>Text generated by the model.</p>
             * 
             * <strong>example:</strong>
             * <h3><strong>报告期经营业绩概述</strong>\n截至2024年3月31日止三个月的未经审核综合业绩显示强劲增长.</h3>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Role of the model. Always assistant.</p>
             * 
             * <strong>example:</strong>
             * <p>assistant</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Tool calling</p>
             */
            public Builder toolCalls(java.util.List<java.util.Map<String, ?>> toolCalls) {
                this.toolCalls = toolCalls;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSummaryTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSummaryTaskResultResponseBody</p>
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
             * <p>Sequence number of the generated result. Default is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * <p>Message output by the model.</p>
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
     * {@link GetSummaryTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSummaryTaskResultResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageCount")
        private Integer imageCount;

        @com.aliyun.core.annotation.NameInMap("imageTokens")
        private Integer imageTokens;

        @com.aliyun.core.annotation.NameInMap("inputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("outputTokens")
        private Integer outputTokens;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Integer totalTokens;

        private Usage(Builder builder) {
            this.imageCount = builder.imageCount;
            this.imageTokens = builder.imageTokens;
            this.inputTokens = builder.inputTokens;
            this.outputTokens = builder.outputTokens;
            this.totalTokens = builder.totalTokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return imageCount
         */
        public Integer getImageCount() {
            return this.imageCount;
        }

        /**
         * @return imageTokens
         */
        public Integer getImageTokens() {
            return this.imageTokens;
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
         * @return totalTokens
         */
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

        public static final class Builder {
            private Integer imageCount; 
            private Integer imageTokens; 
            private Integer inputTokens; 
            private Integer outputTokens; 
            private Integer totalTokens; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.imageCount = model.imageCount;
                this.imageTokens = model.imageTokens;
                this.inputTokens = model.inputTokens;
                this.outputTokens = model.outputTokens;
                this.totalTokens = model.totalTokens;
            } 

            /**
             * <p>Number of images, for models such as wanx</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder imageCount(Integer imageCount) {
                this.imageCount = imageCount;
                return this;
            }

            /**
             * <p>Image token count, for models such as qwen-vl</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder imageTokens(Integer imageTokens) {
                this.imageTokens = imageTokens;
                return this;
            }

            /**
             * <p>Input token count</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>Output token count</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>Total token count</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder totalTokens(Integer totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSummaryTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSummaryTaskResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("choices")
        private java.util.List<Choices> choices;

        @com.aliyun.core.annotation.NameInMap("created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("modelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("totalTokens")
        private Integer totalTokens;

        @com.aliyun.core.annotation.NameInMap("usage")
        private Usage usage;

        private Data(Builder builder) {
            this.choices = builder.choices;
            this.created = builder.created;
            this.id = builder.id;
            this.modelId = builder.modelId;
            this.requestId = builder.requestId;
            this.time = builder.time;
            this.totalTokens = builder.totalTokens;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return totalTokens
         */
        public Integer getTotalTokens() {
            return this.totalTokens;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private java.util.List<Choices> choices; 
            private Long created; 
            private String id; 
            private String modelId; 
            private String requestId; 
            private String time; 
            private Integer totalTokens; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.choices = model.choices;
                this.created = model.created;
                this.id = model.id;
                this.modelId = model.modelId;
                this.requestId = model.requestId;
                this.time = model.time;
                this.totalTokens = model.totalTokens;
                this.usage = model.usage;
            } 

            /**
             * <p>Details of the content generated by the model.</p>
             */
            public Builder choices(java.util.List<Choices> choices) {
                this.choices = choices;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>1726285125915</p>
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * <p>System-generated ID that identifies this call.</p>
             * 
             * <strong>example:</strong>
             * <p>1202</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Name of the model used in this call.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>Request ID</p>
             * 
             * <strong>example:</strong>
             * <p>0bc13a9517168617617186457e401f</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>Time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-24 11:54:34</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * <p>Token count</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder totalTokens(Integer totalTokens) {
                this.totalTokens = totalTokens;
                return this;
            }

            /**
             * <p>Token consumption</p>
             */
            public Builder usage(Usage usage) {
                this.usage = usage;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
