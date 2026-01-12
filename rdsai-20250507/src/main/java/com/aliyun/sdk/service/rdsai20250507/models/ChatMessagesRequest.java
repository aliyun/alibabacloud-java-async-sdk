// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link ChatMessagesRequest} extends {@link RequestModel}
 *
 * <p>ChatMessagesRequest</p>
 */
public class ChatMessagesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Inputs")
    private Inputs inputs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParentMessageId")
    private String parentMessageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 65536)
    private String query;

    private ChatMessagesRequest(Builder builder) {
        super(builder);
        this.conversationId = builder.conversationId;
        this.inputs = builder.inputs;
        this.parentMessageId = builder.parentMessageId;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatMessagesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return inputs
     */
    public Inputs getInputs() {
        return this.inputs;
    }

    /**
     * @return parentMessageId
     */
    public String getParentMessageId() {
        return this.parentMessageId;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<ChatMessagesRequest, Builder> {
        private String conversationId; 
        private Inputs inputs; 
        private String parentMessageId; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(ChatMessagesRequest request) {
            super(request);
            this.conversationId = request.conversationId;
            this.inputs = request.inputs;
            this.parentMessageId = request.parentMessageId;
            this.query = request.query;
        } 

        /**
         * <p>The query content.</p>
         * 
         * <strong>example:</strong>
         * <p>fea7bdca-e848-44dd-b1ae-852472b8****</p>
         */
        public Builder conversationId(String conversationId) {
            this.putQueryParameter("ConversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The ID of the parent message.</p>
         */
        public Builder inputs(Inputs inputs) {
            String inputsShrink = shrink(inputs, "Inputs", "json");
            this.putQueryParameter("Inputs", inputsShrink);
            this.inputs = inputs;
            return this;
        }

        /**
         * <p>The ID of the conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>84dc9f9b-424a-404d-9c36-35e9d000****</p>
         */
        public Builder parentMessageId(String parentMessageId) {
            this.putQueryParameter("ParentMessageId", parentMessageId);
            this.parentMessageId = parentMessageId;
            return this;
        }

        /**
         * <p>The operation that you want to perform. Set the value to <strong>ChatMessages</strong>.</p>
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public ChatMessagesRequest build() {
            return new ChatMessagesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ChatMessagesRequest} extends {@link TeaModel}
     *
     * <p>ChatMessagesRequest</p>
     */
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomAgentId")
        private String customAgentId;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        private Inputs(Builder builder) {
            this.customAgentId = builder.customAgentId;
            this.language = builder.language;
            this.regionId = builder.regionId;
            this.timezone = builder.timezone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return customAgentId
         */
        public String getCustomAgentId() {
            return this.customAgentId;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        public static final class Builder {
            private String customAgentId; 
            private String language; 
            private String regionId; 
            private String timezone; 

            private Builder() {
            } 

            private Builder(Inputs model) {
                this.customAgentId = model.customAgentId;
                this.language = model.language;
                this.regionId = model.regionId;
                this.timezone = model.timezone;
            } 

            /**
             * CustomAgentId.
             */
            public Builder customAgentId(String customAgentId) {
                this.customAgentId = customAgentId;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Timezone.
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
}
