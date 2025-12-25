// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateChatRequest} extends {@link RequestModel}
 *
 * <p>CreateChatRequest</p>
 */
public class CreateChatRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, ?> variables;

    private CreateChatRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.action = builder.action;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.messages = builder.messages;
        this.threadId = builder.threadId;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<CreateChatRequest, Builder> {
        private String regionId; 
        private String action; 
        private String digitalEmployeeName; 
        private java.util.List<Messages> messages; 
        private String threadId; 
        private java.util.Map<String, ?> variables; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.action = request.action;
            this.digitalEmployeeName = request.digitalEmployeeName;
            this.messages = request.messages;
            this.threadId = request.threadId;
            this.variables = request.variables;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * action.
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
        }

        /**
         * digitalEmployeeName.
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.putBodyParameter("digitalEmployeeName", digitalEmployeeName);
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.putBodyParameter("threadId", threadId);
            this.threadId = threadId;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.Map<String, ?> variables) {
            this.putBodyParameter("variables", variables);
            this.variables = variables;
            return this;
        }

        @Override
        public CreateChatRequest build() {
            return new CreateChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateChatRequest} extends {@link TeaModel}
     *
     * <p>CreateChatRequest</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Contents(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Contents model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateChatRequest} extends {@link TeaModel}
     *
     * <p>CreateChatRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contents")
        private java.util.List<Contents> contents;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<java.util.Map<String, ?>> tools;

        private Messages(Builder builder) {
            this.contents = builder.contents;
            this.messageId = builder.messageId;
            this.role = builder.role;
            this.tools = builder.tools;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public java.util.List<Contents> getContents() {
            return this.contents;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return tools
         */
        public java.util.List<java.util.Map<String, ?>> getTools() {
            return this.tools;
        }

        public static final class Builder {
            private java.util.List<Contents> contents; 
            private String messageId; 
            private String role; 
            private java.util.List<java.util.Map<String, ?>> tools; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.contents = model.contents;
                this.messageId = model.messageId;
                this.role = model.role;
                this.tools = model.tools;
            } 

            /**
             * contents.
             */
            public Builder contents(java.util.List<Contents> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * messageId.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * tools.
             */
            public Builder tools(java.util.List<java.util.Map<String, ?>> tools) {
                this.tools = tools;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
