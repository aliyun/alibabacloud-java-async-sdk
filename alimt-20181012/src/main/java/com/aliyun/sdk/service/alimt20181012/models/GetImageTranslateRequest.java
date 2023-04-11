// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetImageTranslateRequest} extends {@link RequestModel}
 *
 * <p>GetImageTranslateRequest</p>
 */
public class GetImageTranslateRequest extends Request {
    @Body
    @NameInMap("Extra")
    private String extra;

    @Body
    @NameInMap("SourceLanguage")
    @Validation(required = true)
    private String sourceLanguage;

    @Body
    @NameInMap("TargetLanguage")
    @Validation(required = true)
    private String targetLanguage;

    @Body
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private GetImageTranslateRequest(Builder builder) {
        super(builder);
        this.extra = builder.extra;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetImageTranslateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extra
     */
    public String getExtra() {
        return this.extra;
    }

    /**
     * @return sourceLanguage
     */
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    /**
     * @return targetLanguage
     */
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<GetImageTranslateRequest, Builder> {
        private String extra; 
        private String sourceLanguage; 
        private String targetLanguage; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(GetImageTranslateRequest request) {
            super(request);
            this.extra = request.extra;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
            this.url = request.url;
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
         * SourceLanguage.
         */
        public Builder sourceLanguage(String sourceLanguage) {
            this.putBodyParameter("SourceLanguage", sourceLanguage);
            this.sourceLanguage = sourceLanguage;
            return this;
        }

        /**
         * TargetLanguage.
         */
        public Builder targetLanguage(String targetLanguage) {
            this.putBodyParameter("TargetLanguage", targetLanguage);
            this.targetLanguage = targetLanguage;
            return this;
        }

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public GetImageTranslateRequest build() {
            return new GetImageTranslateRequest(this);
        } 

    } 

}
