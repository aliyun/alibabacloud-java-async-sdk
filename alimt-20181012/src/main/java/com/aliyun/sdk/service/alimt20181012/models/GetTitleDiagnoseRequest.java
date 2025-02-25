// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTitleDiagnoseRequest} extends {@link RequestModel}
 *
 * <p>GetTitleDiagnoseRequest</p>
 */
public class GetTitleDiagnoseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String categoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extra")
    private String extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Platform")
    @com.aliyun.core.annotation.Validation(required = true)
    private String platform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    private GetTitleDiagnoseRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
        this.extra = builder.extra;
        this.language = builder.language;
        this.platform = builder.platform;
        this.title = builder.title;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTitleDiagnoseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<GetTitleDiagnoseRequest, Builder> {
        private String categoryId; 
        private String extra; 
        private String language; 
        private String platform; 
        private String title; 

        private Builder() {
            super();
        } 

        private Builder(GetTitleDiagnoseRequest request) {
            super(request);
            this.categoryId = request.categoryId;
            this.extra = request.extra;
            this.language = request.language;
            this.platform = request.platform;
            this.title = request.title;
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
        public GetTitleDiagnoseRequest build() {
            return new GetTitleDiagnoseRequest(this);
        } 

    } 

}
