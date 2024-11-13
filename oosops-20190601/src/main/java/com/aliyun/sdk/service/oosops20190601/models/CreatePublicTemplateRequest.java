// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreatePublicTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreatePublicTemplateRequest</p>
 */
public class CreatePublicTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsExample")
    private Boolean isExample;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Popularity")
    private Integer popularity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Publisher")
    private String publisher;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private CreatePublicTemplateRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.content = builder.content;
        this.isExample = builder.isExample;
        this.popularity = builder.popularity;
        this.publisher = builder.publisher;
        this.regionId = builder.regionId;
        this.templateName = builder.templateName;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublicTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return isExample
     */
    public Boolean getIsExample() {
        return this.isExample;
    }

    /**
     * @return popularity
     */
    public Integer getPopularity() {
        return this.popularity;
    }

    /**
     * @return publisher
     */
    public String getPublisher() {
        return this.publisher;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<CreatePublicTemplateRequest, Builder> {
        private String category; 
        private String content; 
        private Boolean isExample; 
        private Integer popularity; 
        private String publisher; 
        private String regionId; 
        private String templateName; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(CreatePublicTemplateRequest request) {
            super(request);
            this.category = request.category;
            this.content = request.content;
            this.isExample = request.isExample;
            this.popularity = request.popularity;
            this.publisher = request.publisher;
            this.regionId = request.regionId;
            this.templateName = request.templateName;
            this.versionName = request.versionName;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * IsExample.
         */
        public Builder isExample(Boolean isExample) {
            this.putQueryParameter("IsExample", isExample);
            this.isExample = isExample;
            return this;
        }

        /**
         * Popularity.
         */
        public Builder popularity(Integer popularity) {
            this.putQueryParameter("Popularity", popularity);
            this.popularity = popularity;
            return this;
        }

        /**
         * Publisher.
         */
        public Builder publisher(String publisher) {
            this.putQueryParameter("Publisher", publisher);
            this.publisher = publisher;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public CreatePublicTemplateRequest build() {
            return new CreatePublicTemplateRequest(this);
        } 

    } 

}
