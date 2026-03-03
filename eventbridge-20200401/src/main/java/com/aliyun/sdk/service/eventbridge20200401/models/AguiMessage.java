// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AguiMessage} extends {@link TeaModel}
 *
 * <p>AguiMessage</p>
 */
public class AguiMessage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Metadata metadata;

    @com.aliyun.core.annotation.NameInMap("Role")
    private String role;

    @com.aliyun.core.annotation.NameInMap("ToolCallId")
    private String toolCallId;

    @com.aliyun.core.annotation.NameInMap("ToolCalls")
    private java.util.List<ToolCalls> toolCalls;

    private AguiMessage(Builder builder) {
        this.content = builder.content;
        this.id = builder.id;
        this.metadata = builder.metadata;
        this.role = builder.role;
        this.toolCallId = builder.toolCallId;
        this.toolCalls = builder.toolCalls;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AguiMessage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return metadata
     */
    public Metadata getMetadata() {
        return this.metadata;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return toolCallId
     */
    public String getToolCallId() {
        return this.toolCallId;
    }

    /**
     * @return toolCalls
     */
    public java.util.List<ToolCalls> getToolCalls() {
        return this.toolCalls;
    }

    public static final class Builder {
        private String content; 
        private String id; 
        private Metadata metadata; 
        private String role; 
        private String toolCallId; 
        private java.util.List<ToolCalls> toolCalls; 

        private Builder() {
        } 

        private Builder(AguiMessage model) {
            this.content = model.content;
            this.id = model.id;
            this.metadata = model.metadata;
            this.role = model.role;
            this.toolCallId = model.toolCallId;
            this.toolCalls = model.toolCalls;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
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
         * Metadata.
         */
        public Builder metadata(Metadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * ToolCallId.
         */
        public Builder toolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }

        /**
         * ToolCalls.
         */
        public Builder toolCalls(java.util.List<ToolCalls> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }

        public AguiMessage build() {
            return new AguiMessage(this);
        } 

    } 

    /**
     * 
     * {@link AguiMessage} extends {@link TeaModel}
     *
     * <p>AguiMessage</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Attachments(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link AguiMessage} extends {@link TeaModel}
     *
     * <p>AguiMessage</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attachments")
        private Attachments attachments;

        private Metadata(Builder builder) {
            this.attachments = builder.attachments;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return attachments
         */
        public Attachments getAttachments() {
            return this.attachments;
        }

        public static final class Builder {
            private Attachments attachments; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.attachments = model.attachments;
            } 

            /**
             * Attachments.
             */
            public Builder attachments(Attachments attachments) {
                this.attachments = attachments;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link AguiMessage} extends {@link TeaModel}
     *
     * <p>AguiMessage</p>
     */
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Function(Builder builder) {
            this.arguments = builder.arguments;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String arguments; 
            private String name; 

            private Builder() {
            } 

            private Builder(Function model) {
                this.arguments = model.arguments;
                this.name = model.name;
            } 

            /**
             * Arguments.
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    /**
     * 
     * {@link AguiMessage} extends {@link TeaModel}
     *
     * <p>AguiMessage</p>
     */
    public static class ToolCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Function")
        private Function function;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ToolCalls(Builder builder) {
            this.function = builder.function;
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolCalls create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public Function getFunction() {
            return this.function;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Function function; 
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(ToolCalls model) {
                this.function = model.function;
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * Function.
             */
            public Builder function(Function function) {
                this.function = function;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ToolCalls build() {
                return new ToolCalls(this);
            } 

        } 

    }
}
