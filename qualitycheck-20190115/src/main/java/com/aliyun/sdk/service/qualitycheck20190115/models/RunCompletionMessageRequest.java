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
 * {@link RunCompletionMessageRequest} extends {@link RequestModel}
 *
 * <p>RunCompletionMessageRequest</p>
 */
public class RunCompletionMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelCode")
    private String modelCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Stream")
    private Boolean stream;

    private RunCompletionMessageRequest(Builder builder) {
        super(builder);
        this.messages = builder.messages;
        this.modelCode = builder.modelCode;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunCompletionMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return modelCode
     */
    public String getModelCode() {
        return this.modelCode;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<RunCompletionMessageRequest, Builder> {
        private java.util.List<Messages> messages; 
        private String modelCode; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(RunCompletionMessageRequest request) {
            super(request);
            this.messages = request.messages;
            this.modelCode = request.modelCode;
            this.stream = request.stream;
        } 

        /**
         * Messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            String messagesShrink = shrink(messages, "Messages", "json");
            this.putBodyParameter("Messages", messagesShrink);
            this.messages = messages;
            return this;
        }

        /**
         * ModelCode.
         */
        public Builder modelCode(String modelCode) {
            this.putBodyParameter("ModelCode", modelCode);
            this.modelCode = modelCode;
            return this;
        }

        /**
         * Stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public RunCompletionMessageRequest build() {
            return new RunCompletionMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunCompletionMessageRequest} extends {@link TeaModel}
     *
     * <p>RunCompletionMessageRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
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

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
