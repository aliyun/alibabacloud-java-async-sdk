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
         * <p>The conversation data in JSON format, containing message records for each model. This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;stream&quot;:true,&quot;messages&quot;:[{&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;1+1&quot;}],&quot;model&quot;:&quot;qwen/qwen-max/r0&quot;,&quot;stream_options&quot;:{&quot;include_usage&quot;:true}}</p>
         */
        public Builder chatData(String chatData) {
            this.putBodyParameter("chatData", chatData);
            this.chatData = chatData;
            return this;
        }

        /**
         * <p>The list of model IDs, specified as a JSON array string.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder modelIds(String modelIds) {
            this.putBodyParameter("modelIds", modelIds);
            this.modelIds = modelIds;
            return this;
        }

        /**
         * <p>The conversation title. If not specified, the title is automatically extracted from the first user message.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
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
