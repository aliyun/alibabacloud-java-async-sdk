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
 * {@link ModelRouterCreateConversationRequest} extends {@link RequestModel}
 *
 * <p>ModelRouterCreateConversationRequest</p>
 */
public class ModelRouterCreateConversationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatData")
    private String chatData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelIds")
    private String modelIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private ModelRouterCreateConversationRequest(Builder builder) {
        super(builder);
        this.chatData = builder.chatData;
        this.modelIds = builder.modelIds;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelRouterCreateConversationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chatData
     */
    public String getChatData() {
        return this.chatData;
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

    public static final class Builder extends Request.Builder<ModelRouterCreateConversationRequest, Builder> {
        private String chatData; 
        private String modelIds; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(ModelRouterCreateConversationRequest request) {
            super(request);
            this.chatData = request.chatData;
            this.modelIds = request.modelIds;
            this.title = request.title;
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
        public ModelRouterCreateConversationRequest build() {
            return new ModelRouterCreateConversationRequest(this);
        } 

    } 

}
