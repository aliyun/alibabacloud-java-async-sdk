// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTemplateContentRequest} extends {@link RequestModel}
 *
 * <p>ValidateTemplateContentRequest</p>
 */
public class ValidateTemplateContentRequest extends Request {
    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    private ValidateTemplateContentRequest(Builder builder) {
        super(builder);
        this.content = builder.content;
        this.regionId = builder.regionId;
        this.templateURL = builder.templateURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateTemplateContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    public static final class Builder extends Request.Builder<ValidateTemplateContentRequest, Builder> {
        private String content; 
        private String regionId; 
        private String templateURL; 

        private Builder() {
            super();
        } 

        private Builder(ValidateTemplateContentRequest request) {
            super(request);
            this.content = request.content;
            this.regionId = request.regionId;
            this.templateURL = request.templateURL;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TemplateURL.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        @Override
        public ValidateTemplateContentRequest build() {
            return new ValidateTemplateContentRequest(this);
        } 

    } 

}
