// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link PetHealthAnalysisRequest} extends {@link RequestModel}
 *
 * <p>PetHealthAnalysisRequest</p>
 */
public class PetHealthAnalysisRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    private String systemPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrompt")
    private String userPrompt;

    private PetHealthAnalysisRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.systemPrompt = builder.systemPrompt;
        this.userPrompt = builder.userPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PetHealthAnalysisRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrl
     */
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return systemPrompt
     */
    public String getSystemPrompt() {
        return this.systemPrompt;
    }

    /**
     * @return userPrompt
     */
    public String getUserPrompt() {
        return this.userPrompt;
    }

    public static final class Builder extends Request.Builder<PetHealthAnalysisRequest, Builder> {
        private java.util.List<String> imageUrl; 
        private String systemPrompt; 
        private String userPrompt; 

        private Builder() {
            super();
        } 

        private Builder(PetHealthAnalysisRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.systemPrompt = request.systemPrompt;
            this.userPrompt = request.userPrompt;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder imageUrl(java.util.List<String> imageUrl) {
            String imageUrlShrink = shrink(imageUrl, "ImageUrl", "json");
            this.putQueryParameter("ImageUrl", imageUrlShrink);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * SystemPrompt.
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putQueryParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * UserPrompt.
         */
        public Builder userPrompt(String userPrompt) {
            this.putQueryParameter("UserPrompt", userPrompt);
            this.userPrompt = userPrompt;
            return this;
        }

        @Override
        public PetHealthAnalysisRequest build() {
            return new PetHealthAnalysisRequest(this);
        } 

    } 

}
