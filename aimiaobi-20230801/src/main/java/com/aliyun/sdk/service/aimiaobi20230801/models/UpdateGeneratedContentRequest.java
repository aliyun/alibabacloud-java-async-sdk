// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link UpdateGeneratedContentRequest} extends {@link RequestModel}
 *
 * <p>UpdateGeneratedContentRequest</p>
 */
public class UpdateGeneratedContentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentText")
    private String contentText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keywords")
    private java.util.List<String> keywords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(maxLength = 200, minLength = 2)
    private String title;

    private UpdateGeneratedContentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.agentKey = builder.agentKey;
        this.content = builder.content;
        this.contentText = builder.contentText;
        this.id = builder.id;
        this.keywords = builder.keywords;
        this.prompt = builder.prompt;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGeneratedContentRequest create() {
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
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return contentText
     */
    public String getContentText() {
        return this.contentText;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return keywords
     */
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<UpdateGeneratedContentRequest, Builder> {
        private String regionId; 
        private String agentKey; 
        private String content; 
        private String contentText; 
        private Long id; 
        private java.util.List<String> keywords; 
        private String prompt; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGeneratedContentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.contentText = request.contentText;
            this.id = request.id;
            this.keywords = request.keywords;
            this.prompt = request.prompt;
            this.title = request.title;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx_p_efm</p>
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * ContentText.
         */
        public Builder contentText(String contentText) {
            this.putBodyParameter("ContentText", contentText);
            this.contentText = contentText;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>36</p>
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(java.util.List<String> keywords) {
            String keywordsShrink = shrink(keywords, "Keywords", "json");
            this.putBodyParameter("Keywords", keywordsShrink);
            this.keywords = keywords;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putBodyParameter("Title", title);
            this.title = title;
            return this;
        }

        @Override
        public UpdateGeneratedContentRequest build() {
            return new UpdateGeneratedContentRequest(this);
        } 

    } 

}
