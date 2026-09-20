// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ShoppingAssistantRequest} extends {@link RequestModel}
 *
 * <p>ShoppingAssistantRequest</p>
 */
public class ShoppingAssistantRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Contents")
    private Contents contents;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    private String environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputMessage")
    private InputMessage inputMessage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uid")
    private String uid;

    private ShoppingAssistantRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.contents = builder.contents;
        this.conversationId = builder.conversationId;
        this.environment = builder.environment;
        this.inputMessage = builder.inputMessage;
        this.instanceId = builder.instanceId;
        this.language = builder.language;
        this.sceneId = builder.sceneId;
        this.serviceId = builder.serviceId;
        this.sessionId = builder.sessionId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ShoppingAssistantRequest create() {
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
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return contents
     */
    public Contents getContents() {
        return this.contents;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return environment
     */
    public String getEnvironment() {
        return this.environment;
    }

    /**
     * @return inputMessage
     */
    public InputMessage getInputMessage() {
        return this.inputMessage;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<ShoppingAssistantRequest, Builder> {
        private String regionId; 
        private String config; 
        private Contents contents; 
        private String conversationId; 
        private String environment; 
        private InputMessage inputMessage; 
        private String instanceId; 
        private String language; 
        private String sceneId; 
        private String serviceId; 
        private String sessionId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(ShoppingAssistantRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.contents = request.contents;
            this.conversationId = request.conversationId;
            this.environment = request.environment;
            this.inputMessage = request.inputMessage;
            this.instanceId = request.instanceId;
            this.language = request.language;
            this.sceneId = request.sceneId;
            this.serviceId = request.serviceId;
            this.sessionId = request.sessionId;
            this.uid = request.uid;
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
         * <p>The additional configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The contents.</p>
         */
        public Builder contents(Contents contents) {
            this.putBodyParameter("Contents", contents);
            this.contents = contents;
            return this;
        }

        /**
         * <p>The conversation ID. This parameter is not yet effective.</p>
         * 
         * <strong>example:</strong>
         * <p>e47cfae9-c0cc-42e1-91e2-e67cdb0e7b96</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p><strong>The environment.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>Prod: productionPre: pre-release.</p>
         */
        public Builder environment(String environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * <p>The input message.</p>
         */
        public Builder inputMessage(InputMessage inputMessage) {
            this.putBodyParameter("InputMessage", inputMessage);
            this.inputMessage = inputMessage;
            return this;
        }

        /**
         * <p><strong>The instance ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>learn-pairec-xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>zh/en</p>
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p><strong>The scene ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>ai_shopping</p>
         */
        public Builder sceneId(String sceneId) {
            this.putBodyParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p><strong>The service ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>ServiceId.</p>
         */
        public Builder serviceId(String serviceId) {
            this.putBodyParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>e47cfae9-c0cc-42e1-91e2-e67cdb0e7b96</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>user id。</p>
         * 
         * <strong>example:</strong>
         * <p>0001</p>
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public ShoppingAssistantRequest build() {
            return new ShoppingAssistantRequest(this);
        } 

    } 

    /**
     * 
     * {@link ShoppingAssistantRequest} extends {@link TeaModel}
     *
     * <p>ShoppingAssistantRequest</p>
     */
    public static class Contents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Contents(Builder builder) {
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Contents model) {
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * <p>The message content.</p>
             * 
             * <strong>example:</strong>
             * <p>Recommend some light-colored long-sleeve shirts suitable for spring, budget under 300</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The message type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ShoppingAssistantRequest} extends {@link TeaModel}
     *
     * <p>ShoppingAssistantRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Content(Builder builder) {
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * <p>The message content.</p>
             * 
             * <strong>example:</strong>
             * <p>Recommend some light-colored long-sleeve shirts suitable for spring, budget under 300</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The message type.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link ShoppingAssistantRequest} extends {@link TeaModel}
     *
     * <p>ShoppingAssistantRequest</p>
     */
    public static class InputMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List<Content> content;

        private InputMessage(Builder builder) {
            this.content = builder.content;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputMessage create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        public static final class Builder {
            private java.util.List<Content> content; 

            private Builder() {
            } 

            private Builder(InputMessage model) {
                this.content = model.content;
            } 

            /**
             * <p>The message content.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            public InputMessage build() {
                return new InputMessage(this);
            } 

        } 

    }
}
