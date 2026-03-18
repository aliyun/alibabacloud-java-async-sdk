// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ModelRouterUpdateConversationRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterUpdateConversationRequest</p>
 */
public class ModelRouterUpdateConversationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatData")
    private String chatData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messageCount")
    private Integer messageCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelIds")
    private String modelIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private ModelRouterUpdateConversationRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.chatData = builder.chatData;
        this.messageCount = builder.messageCount;
        this.modelIds = builder.modelIds;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterUpdateConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return chatData
     */
    public String getChatData() {
        return this.chatData;
    }

    /**
     * @return messageCount
     */
    public Integer getMessageCount() {
        return this.messageCount;
    }

    /**
     * @return modelIds
     */
    public String getModelIds() {
        return this.modelIds;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<ModelRouterUpdateConversationRequest, Builder> {
        private Long id; 
        private String chatData; 
        private Integer messageCount; 
        private String modelIds; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterUpdateConversationRequest request) {
            super(request);
            this.id = request.id;
            this.chatData = request.chatData;
            this.messageCount = request.messageCount;
            this.modelIds = request.modelIds;
            this.title = request.title;
        } 

        /**
         * id.
         */
        public Builder id(Long id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * chatData.
         */
        public Builder chatData(String chatData) {
            this.putBodyParameter("chatData", chatData);
            this.chatData = chatData;
            return this;
        }

        /**
         * messageCount.
         */
        public Builder messageCount(Integer messageCount) {
            this.putBodyParameter("messageCount", messageCount);
            this.messageCount = messageCount;
            return this;
        }

        /**
         * modelIds.
         */
        public Builder modelIds(String modelIds) {
            this.putBodyParameter("modelIds", modelIds);
            this.modelIds = modelIds;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        @Override
        public ModelRouterUpdateConversationRequest build() {
            return new ModelRouterUpdateConversationRequest(this);
        } 

    } 

}
