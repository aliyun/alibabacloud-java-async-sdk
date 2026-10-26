// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link UpdateAgentConversationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAgentConversationResponseBody</p>
 */
public class UpdateAgentConversationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("shareScope")
    private String shareScope;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private UpdateAgentConversationResponseBody(Builder builder) {
        this.conversationId = builder.conversationId;
        this.id = builder.id;
        this.shareScope = builder.shareScope;
        this.title = builder.title;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAgentConversationResponseBody create() {
        return builder().build();
    }

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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return shareScope
     */
    public String getShareScope() {
        return this.shareScope;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String conversationId; 
        private String id; 
        private String shareScope; 
        private String title; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(UpdateAgentConversationResponseBody model) {
            this.conversationId = model.conversationId;
            this.id = model.id;
            this.shareScope = model.shareScope;
            this.title = model.title;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * conversationId.
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * shareScope.
         */
        public Builder shareScope(String shareScope) {
            this.shareScope = shareScope;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public UpdateAgentConversationResponseBody build() {
            return new UpdateAgentConversationResponseBody(this);
        } 

    } 

}
