// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetLabelGeneratedResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetLabelGeneratedResultResponseBody</p>
 */
public class GetLabelGeneratedResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetLabelGeneratedResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLabelGeneratedResultResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetLabelGeneratedResultResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The result code. A value of <strong>200</strong> indicates success. Other values indicate failure. You can use this field to determine the cause of failure.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the request fails.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>106C6CA0-282D-4AF7-85F0-D2D24***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. true: The call was successful. false: The call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLabelGeneratedResultResponseBody build() {
            return new GetLabelGeneratedResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLabelGeneratedResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetLabelGeneratedResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputTokens")
        private Integer inputTokens;

        @com.aliyun.core.annotation.NameInMap("LlmCallNum")
        private Integer llmCallNum;

        @com.aliyun.core.annotation.NameInMap("OutputTokens")
        private Integer outputTokens;

        @com.aliyun.core.annotation.NameInMap("ResultFileUrl")
        private String resultFileUrl;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.inputTokens = builder.inputTokens;
            this.llmCallNum = builder.llmCallNum;
            this.outputTokens = builder.outputTokens;
            this.resultFileUrl = builder.resultFileUrl;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inputTokens
         */
        public Integer getInputTokens() {
            return this.inputTokens;
        }

        /**
         * @return llmCallNum
         */
        public Integer getLlmCallNum() {
            return this.llmCallNum;
        }

        /**
         * @return outputTokens
         */
        public Integer getOutputTokens() {
            return this.outputTokens;
        }

        /**
         * @return resultFileUrl
         */
        public String getResultFileUrl() {
            return this.resultFileUrl;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Integer inputTokens; 
            private Integer llmCallNum; 
            private Integer outputTokens; 
            private String resultFileUrl; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.inputTokens = model.inputTokens;
                this.llmCallNum = model.llmCallNum;
                this.outputTokens = model.outputTokens;
                this.resultFileUrl = model.resultFileUrl;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The number of input tokens for the LLM.</p>
             * 
             * <strong>example:</strong>
             * <p>7371</p>
             */
            public Builder inputTokens(Integer inputTokens) {
                this.inputTokens = inputTokens;
                return this;
            }

            /**
             * <p>The number of LLM calls.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder llmCallNum(Integer llmCallNum) {
                this.llmCallNum = llmCallNum;
                return this;
            }

            /**
             * <p>The number of output tokens for the LLM.</p>
             * 
             * <strong>example:</strong>
             * <p>355</p>
             */
            public Builder outputTokens(Integer outputTokens) {
                this.outputTokens = outputTokens;
                return this;
            }

            /**
             * <p>The pre-signed download URL of the result file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://sca-eas-mining.oss-cn-beijing.aliyuncs.com/xxx.xlsx?Expires=">https://sca-eas-mining.oss-cn-beijing.aliyuncs.com/xxx.xlsx?Expires=</a>...</p>
             */
            public Builder resultFileUrl(String resultFileUrl) {
                this.resultFileUrl = resultFileUrl;
                return this;
            }

            /**
             * <p>The ID of the generation task.</p>
             * 
             * <strong>example:</strong>
             * <p>20260616-4955F615-A74E-171E-86ED-080F60C72EC9</p>
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
