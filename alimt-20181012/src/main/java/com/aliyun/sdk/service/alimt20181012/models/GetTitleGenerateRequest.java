// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTitleGenerateRequest} extends {@link RequestModel}
 *
 * <p>GetTitleGenerateRequest</p>
 */
public class GetTitleGenerateRequest extends Request {
    @Body
    @NameInMap("Attributes")
    private String attributes;

    @Body
    @NameInMap("CategoryId")
    @Validation(required = true)
    private String categoryId;

    @Body
    @NameInMap("Extra")
    private String extra;

    @Body
    @NameInMap("HotWords")
    private String hotWords;

    @Body
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Body
    @NameInMap("Platform")
    @Validation(required = true)
    private String platform;

    @Body
    @NameInMap("Title")
    @Validation(required = true)
    private String title;

    private GetTitleGenerateRequest(Builder builder) {
        super(builder);
        this.attributes = builder.attributes;
        this.categoryId = builder.categoryId;
        this.extra = builder.extra;
        this.hotWords = builder.hotWords;
        this.language = builder.language;
        this.platform = builder.platform;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTitleGenerateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attributes
     */
    public String getAttributes() {
        return this.attributes;
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return hotWords
     */
    public String getHotWords() {
        return this.hotWords;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<GetTitleGenerateRequest, Builder> {
        private String attributes; 
        private String categoryId; 
        private String extra; 
        private String hotWords; 
        private String language; 
        private String platform; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(GetTitleGenerateRequest request) {
            super(request);
            this.attributes = request.attributes;
            this.categoryId = request.categoryId;
            this.extra = request.extra;
            this.hotWords = request.hotWords;
            this.language = request.language;
            this.platform = request.platform;
            this.title = request.title;
        } 

        /**
         * Attributes.
         */
        public Builder attributes(String attributes) {
            this.putBodyParameter("Attributes", attributes);
            this.attributes = attributes;
            return this;
        }

        /**
         * CategoryId.
         */
        public Builder categoryId(String categoryId) {
            this.putBodyParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Extra.
         */
        public Builder extra(String extra) {
            this.putBodyParameter("Extra", extra);
            this.extra = extra;
            return this;
        }

        /**
         * HotWords.
         */
        public Builder hotWords(String hotWords) {
            this.putBodyParameter("HotWords", hotWords);
            this.hotWords = hotWords;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Platform.
         */
        public Builder platform(String platform) {
            this.putBodyParameter("Platform", platform);
            this.platform = platform;
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
        public GetTitleGenerateRequest build() {
            return new GetTitleGenerateRequest(this);
        } 

    } 

}
