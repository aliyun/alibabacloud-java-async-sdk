// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublicTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreatePublicTemplateRequest</p>
 */
public class CreatePublicTemplateRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Query
    @NameInMap("Popularity")
    private Integer popularity;

    @Query
    @NameInMap("Publisher")
    private String publisher;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    private CreatePublicTemplateRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.content = builder.content;
        this.popularity = builder.popularity;
        this.publisher = builder.publisher;
        this.regionId = builder.regionId;
        this.templateName = builder.templateName;
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

    public static final class Builder extends Request.Builder<CreatePublicTemplateRequest, Builder> {
        private String category; 
        private String content; 
        private Integer popularity; 
        private String publisher; 
        private String regionId; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(CreatePublicTemplateRequest request) {
            super(request);
            this.category = request.category;
            this.content = request.content;
            this.popularity = request.popularity;
            this.publisher = request.publisher;
            this.regionId = request.regionId;
            this.templateName = request.templateName;
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
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public CreatePublicTemplateRequest build() {
            return new CreatePublicTemplateRequest(this);
        } 

    } 

}
