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
 * {@link VacancyDetectionRequest} extends {@link RequestModel}
 *
 * <p>VacancyDetectionRequest</p>
 */
public class VacancyDetectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemPrompt")
    private String systemPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserPrompt")
    private String userPrompt;

    private VacancyDetectionRequest(Builder builder) {
        super(builder);
        this.imageUrl = builder.imageUrl;
        this.systemPrompt = builder.systemPrompt;
        this.userPrompt = builder.userPrompt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VacancyDetectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
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

    public static final class Builder extends Request.Builder<VacancyDetectionRequest, Builder> {
        private String imageUrl; 
        private String systemPrompt; 
        private String userPrompt; 

        private Builder() {
            super();
        } 

        private Builder(VacancyDetectionRequest request) {
            super(request);
            this.imageUrl = request.imageUrl;
            this.systemPrompt = request.systemPrompt;
            this.userPrompt = request.userPrompt;
        } 

        /**
         * <p>The HTTPS URL of the single image to be detected. Arrays or other image encodings are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/shelf.jpg">https://example.com/shelf.jpg</a></p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putQueryParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The optional system prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>You are a helpful assistant.</p>
         */
        public Builder systemPrompt(String systemPrompt) {
            this.putQueryParameter("SystemPrompt", systemPrompt);
            this.systemPrompt = systemPrompt;
            return this;
        }

        /**
         * <p>The optional user prompt. If left empty, the full empty space detection prompt is used. Plain text and JSON that contains only text in messages/content are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Detect empty spaces and underfilled areas on the shelf</p>
         */
        public Builder userPrompt(String userPrompt) {
            this.putQueryParameter("UserPrompt", userPrompt);
            this.userPrompt = userPrompt;
            return this;
        }

        @Override
        public VacancyDetectionRequest build() {
            return new VacancyDetectionRequest(this);
        } 

    } 

}
