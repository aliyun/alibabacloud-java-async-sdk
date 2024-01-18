// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGeneratedContentRequest} extends {@link RequestModel}
 *
 * <p>UpdateGeneratedContentRequest</p>
 */
public class UpdateGeneratedContentRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("ContentText")
    private String contentText;

    @Body
    @NameInMap("Id")
    @Validation(required = true, minLength = 1)
    private Long id;

    @Body
    @NameInMap("Keywords")
    private java.util.List < String > keywords;

    @Body
    @NameInMap("Prompt")
    private String prompt;

    @Body
    @NameInMap("Title")
    @Validation(maxLength = 200, minLength = 2)
    private String title;

    private UpdateGeneratedContentRequest(Builder builder) {
        super(builder);
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
    public java.util.List < String > getKeywords() {
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
        private String agentKey; 
        private String content; 
        private String contentText; 
        private Long id; 
        private java.util.List < String > keywords; 
        private String prompt; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGeneratedContentRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.content = request.content;
            this.contentText = request.contentText;
            this.id = request.id;
            this.keywords = request.keywords;
            this.prompt = request.prompt;
            this.title = request.title;
        } 

        /**
         * AgentKey.
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
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(java.util.List < String > keywords) {
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
