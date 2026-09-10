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
 * {@link MultiModalAgentSSEResponseBody} extends {@link TeaModel}
 *
 * <p>MultiModalAgentSSEResponseBody</p>
 */
public class MultiModalAgentSSEResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private MultiModalAgentSSEResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultiModalAgentSSEResponseBody create() {
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

        private Builder(MultiModalAgentSSEResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The error code.</p>
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
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
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

        public MultiModalAgentSSEResponseBody build() {
            return new MultiModalAgentSSEResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link MultiModalAgentSSEResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalAgentSSEResponseBody</p>
     */
    public static class Usage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Credits")
        private Double credits;

        private Usage(Builder builder) {
            this.credits = builder.credits;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Usage create() {
            return builder().build();
        }

        /**
         * @return credits
         */
        public Double getCredits() {
            return this.credits;
        }

        public static final class Builder {
            private Double credits; 

            private Builder() {
            } 

            private Builder(Usage model) {
                this.credits = model.credits;
            } 

            /**
             * <p>The number of credits consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>1.23</p>
             */
            public Builder credits(Double credits) {
                this.credits = credits;
                return this;
            }

            public Usage build() {
                return new Usage(this);
            } 

        } 

    }
    /**
     * 
     * {@link MultiModalAgentSSEResponseBody} extends {@link TeaModel}
     *
     * <p>MultiModalAgentSSEResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Created")
        private Long created;

        @com.aliyun.core.annotation.NameInMap("DataId")
        private String dataId;

        @com.aliyun.core.annotation.NameInMap("FinishReason")
        private String finishReason;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Usage usage;

        private Data(Builder builder) {
            this.created = builder.created;
            this.dataId = builder.dataId;
            this.finishReason = builder.finishReason;
            this.output = builder.output;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return created
         */
        public Long getCreated() {
            return this.created;
        }

        /**
         * @return dataId
         */
        public String getDataId() {
            return this.dataId;
        }

        /**
         * @return finishReason
         */
        public String getFinishReason() {
            return this.finishReason;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return usage
         */
        public Usage getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Long created; 
            private String dataId; 
            private String finishReason; 
            private String output; 
            private Usage usage; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.created = model.created;
                this.dataId = model.dataId;
                this.finishReason = model.finishReason;
                this.output = model.output;
                this.usage = model.usage;
            } 

            /**
             * <p>The timestamp when the session was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1783328536</p>
             */
            public Builder created(Long created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The value of DataId passed in the API request. This field is not returned if DataId is not specified in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>dataId-XXX</p>
             */
            public Builder dataId(String dataId) {
                this.dataId = dataId;
                return this;
            }

            /**
             * <p>For streaming output, this value is null during generation. When generation ends, the value is stop if the generation stopped due to a stop token.</p>
             * 
             * <strong>example:</strong>
             * <p>stop</p>
             */
            public Builder finishReason(String finishReason) {
                this.finishReason = finishReason;
                return this;
            }

            /**
             * <p>The output result.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;Violation, reason XX&quot;</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The credits usage information.</p>
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
