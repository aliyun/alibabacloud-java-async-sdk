// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link CreateProductImageRequest} extends {@link RequestModel}
 *
 * <p>CreateProductImageRequest</p>
 */
public class CreateProductImageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("backgroundDescription")
    private String backgroundDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("backgroundPriority")
    private Integer backgroundPriority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("backgroundUrl")
    private String backgroundUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("highlightText")
    private String highlightText;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageCount")
    private Integer imageCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("imageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("subTitle")
    private String subTitle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    private CreateProductImageRequest(Builder builder) {
        super(builder);
        this.backgroundDescription = builder.backgroundDescription;
        this.backgroundPriority = builder.backgroundPriority;
        this.backgroundUrl = builder.backgroundUrl;
        this.highlightText = builder.highlightText;
        this.imageCount = builder.imageCount;
        this.imageUrl = builder.imageUrl;
        this.subTitle = builder.subTitle;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backgroundDescription
     */
    public String getBackgroundDescription() {
        return this.backgroundDescription;
    }

    /**
     * @return backgroundPriority
     */
    public Integer getBackgroundPriority() {
        return this.backgroundPriority;
    }

    /**
     * @return backgroundUrl
     */
    public String getBackgroundUrl() {
        return this.backgroundUrl;
    }

    /**
     * @return highlightText
     */
    public String getHighlightText() {
        return this.highlightText;
    }

    /**
     * @return imageCount
     */
    public Integer getImageCount() {
        return this.imageCount;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return subTitle
     */
    public String getSubTitle() {
        return this.subTitle;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    public static final class Builder extends Request.Builder<CreateProductImageRequest, Builder> {
        private String backgroundDescription; 
        private Integer backgroundPriority; 
        private String backgroundUrl; 
        private String highlightText; 
        private Integer imageCount; 
        private String imageUrl; 
        private String subTitle; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductImageRequest request) {
            super(request);
            this.backgroundDescription = request.backgroundDescription;
            this.backgroundPriority = request.backgroundPriority;
            this.backgroundUrl = request.backgroundUrl;
            this.highlightText = request.highlightText;
            this.imageCount = request.imageCount;
            this.imageUrl = request.imageUrl;
            this.subTitle = request.subTitle;
            this.title = request.title;
        } 

        /**
         * backgroundDescription.
         */
        public Builder backgroundDescription(String backgroundDescription) {
            this.putBodyParameter("backgroundDescription", backgroundDescription);
            this.backgroundDescription = backgroundDescription;
            return this;
        }

        /**
         * backgroundPriority.
         */
        public Builder backgroundPriority(Integer backgroundPriority) {
            this.putBodyParameter("backgroundPriority", backgroundPriority);
            this.backgroundPriority = backgroundPriority;
            return this;
        }

        /**
         * backgroundUrl.
         */
        public Builder backgroundUrl(String backgroundUrl) {
            this.putBodyParameter("backgroundUrl", backgroundUrl);
            this.backgroundUrl = backgroundUrl;
            return this;
        }

        /**
         * highlightText.
         */
        public Builder highlightText(String highlightText) {
            this.putBodyParameter("highlightText", highlightText);
            this.highlightText = highlightText;
            return this;
        }

        /**
         * imageCount.
         */
        public Builder imageCount(Integer imageCount) {
            this.putBodyParameter("imageCount", imageCount);
            this.imageCount = imageCount;
            return this;
        }

        /**
         * imageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("imageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * subTitle.
         */
        public Builder subTitle(String subTitle) {
            this.putBodyParameter("subTitle", subTitle);
            this.subTitle = subTitle;
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
        public CreateProductImageRequest build() {
            return new CreateProductImageRequest(this);
        } 

    } 

}
