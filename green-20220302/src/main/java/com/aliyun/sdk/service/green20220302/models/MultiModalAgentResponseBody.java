// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link MultiModalAgentResponseBody} extends {@link TeaModel}
 *
 * <p>MultiModalAgentResponseBody</p>
 */
public class MultiModalAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private MultiModalAgentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiModalAgentResponseBody create() {
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

        private Builder(MultiModalAgentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public MultiModalAgentResponseBody build() {
            return new MultiModalAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MultiModalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalAgentResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        private Result(Builder builder) {
            this.description = builder.description;
            this.label = builder.label;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String description; 
            private String label; 
            private String reason; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.description = model.description;
                this.label = model.label;
                this.reason = model.reason;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalAgentResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentDetail")
        private java.util.Map<String, ?> agentDetail;

        @com.aliyun.core.annotation.NameInMap("ContentLength")
        private Long contentLength;

        @com.aliyun.core.annotation.NameInMap("PromptLength")
        private Long promptLength;

        private Usage(Builder builder) {
            this.agentDetail = builder.agentDetail;
            this.contentLength = builder.contentLength;
            this.promptLength = builder.promptLength;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return agentDetail
         */
        public java.util.Map<String, ?> getAgentDetail() {
            return this.agentDetail;
        }

        /**
         * @return contentLength
         */
        public Long getContentLength() {
            return this.contentLength;
        }

        /**
         * @return promptLength
         */
        public Long getPromptLength() {
            return this.promptLength;
        }

        public static final class Builder {
            private java.util.Map<String, ?> agentDetail; 
            private Long contentLength; 
            private Long promptLength; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.agentDetail = model.agentDetail;
                this.contentLength = model.contentLength;
                this.promptLength = model.promptLength;
            } 

            /**
             * AgentDetail.
             */
            public Builder agentDetail(java.util.Map<String, ?> agentDetail) {
                this.agentDetail = agentDetail;
                return this;
            }

            /**
             * ContentLength.
             */
            public Builder contentLength(Long contentLength) {
                this.contentLength = contentLength;
                return this;
            }

            /**
             * PromptLength.
             */
            public Builder promptLength(Long promptLength) {
                this.promptLength = promptLength;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalAgentResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        private Data(Builder builder) {
            this.dataId = builder.dataId;
            this.result = builder.result;
            this.riskLevel = builder.riskLevel;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private String dataId; 
            private java.util.List<Result> result; 
            private String riskLevel; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataId = model.dataId;
                this.result = model.result;
                this.riskLevel = model.riskLevel;
                this.usage = model.usage;
            } 

            /**
             * DataId.
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * Usage.
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
