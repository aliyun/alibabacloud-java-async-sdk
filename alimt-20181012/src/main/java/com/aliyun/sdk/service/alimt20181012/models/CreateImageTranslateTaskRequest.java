// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageTranslateTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateImageTranslateTaskRequest</p>
 */
public class CreateImageTranslateTaskRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UrlList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String urlList;

    private CreateImageTranslateTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.extra = builder.extra;
        this.sourceLanguage = builder.sourceLanguage;
        this.targetLanguage = builder.targetLanguage;
        this.urlList = builder.urlList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageTranslateTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return urlList
     */
    public String getUrlList() {
        return this.urlList;
    }

    public static final class Builder extends Request.Builder<CreateImageTranslateTaskRequest, Builder> {
        private String clientToken; 
        private String extra; 
        private String sourceLanguage; 
        private String targetLanguage; 
        private String urlList; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageTranslateTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.extra = request.extra;
            this.sourceLanguage = request.sourceLanguage;
            this.targetLanguage = request.targetLanguage;
            this.urlList = request.urlList;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * UrlList.
         */
        public Builder urlList(String urlList) {
            this.putBodyParameter("UrlList", urlList);
            this.urlList = urlList;
            return this;
        }

        @Override
        public CreateImageTranslateTaskRequest build() {
            return new CreateImageTranslateTaskRequest(this);
        } 

    } 

}
