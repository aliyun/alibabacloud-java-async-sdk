// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
 *
 * <p>TongyiChatDebugInfoResponseBody</p>
 */
public class TongyiChatDebugInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Pipeline")
    private java.util.List<Pipeline> pipeline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TongyiChatDebugInfoResponseBody(Builder builder) {
        this.messageId = builder.messageId;
        this.pipeline = builder.pipeline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TongyiChatDebugInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return pipeline
     */
    public java.util.List<Pipeline> getPipeline() {
        return this.pipeline;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String messageId; 
        private java.util.List<Pipeline> pipeline; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(TongyiChatDebugInfoResponseBody model) {
            this.messageId = model.messageId;
            this.pipeline = model.pipeline;
            this.requestId = model.requestId;
        } 

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Pipeline.
         */
        public Builder pipeline(java.util.List<Pipeline> pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E3E5C779-A630-45AC-B0F2-A4506A4212F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TongyiChatDebugInfoResponseBody build() {
            return new TongyiChatDebugInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TongyiChatDebugInfoResponseBody} extends {@link TeaModel}
     *
     * <p>TongyiChatDebugInfoResponseBody</p>
     */
    public static class Pipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private Object input;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Output")
        private Object output;

        private Pipeline(Builder builder) {
            this.input = builder.input;
            this.name = builder.name;
            this.nodeType = builder.nodeType;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipeline create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public Object getInput() {
            return this.input;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return output
         */
        public Object getOutput() {
            return this.output;
        }

        public static final class Builder {
            private Object input; 
            private String name; 
            private String nodeType; 
            private Object output; 

            private Builder() {
            } 

            private Builder(Pipeline model) {
                this.input = model.input;
                this.name = model.name;
                this.nodeType = model.nodeType;
                this.output = model.output;
            } 

            /**
             * Input.
             */
            public Builder input(Object input) {
                this.input = input;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(Object output) {
                this.output = output;
                return this;
            }

            public Pipeline build() {
                return new Pipeline(this);
            } 

        } 

    }
}
