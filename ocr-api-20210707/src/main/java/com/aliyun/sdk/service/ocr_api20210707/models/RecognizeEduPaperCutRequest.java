// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeEduPaperCutRequest} extends {@link RequestModel}
 *
 * <p>RecognizeEduPaperCutRequest</p>
 */
public class RecognizeEduPaperCutRequest extends Request {
    @Query
    @NameInMap("CutType")
    @Validation(required = true)
    private String cutType;

    @Query
    @NameInMap("ImageType")
    @Validation(required = true)
    private String imageType;

    @Query
    @NameInMap("Subject")
    private String subject;

    @Query
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeEduPaperCutRequest(Builder builder) {
        super(builder);
        this.cutType = builder.cutType;
        this.imageType = builder.imageType;
        this.subject = builder.subject;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeEduPaperCutRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cutType
     */
    public String getCutType() {
        return this.cutType;
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return body
     */
    public java.io.InputStream getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<RecognizeEduPaperCutRequest, Builder> {
        private String cutType; 
        private String imageType; 
        private String subject; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeEduPaperCutRequest response) {
            super(response);
            this.cutType = response.cutType;
            this.imageType = response.imageType;
            this.subject = response.subject;
            this.url = response.url;
            this.body = response.body;
        } 

        /**
         * 切题类型
         */
        public Builder cutType(String cutType) {
            this.putQueryParameter("CutType", cutType);
            this.cutType = cutType;
            return this;
        }

        /**
         * 图片类型
         */
        public Builder imageType(String imageType) {
            this.putQueryParameter("ImageType", imageType);
            this.imageType = imageType;
            return this;
        }

        /**
         * 年级学科
         */
        public Builder subject(String subject) {
            this.putQueryParameter("Subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * 图片链接（长度不超 2048，不支持 base64）
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * 图片二进制字节流，最大10MB
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RecognizeEduPaperCutRequest build() {
            return new RecognizeEduPaperCutRequest(this);
        } 

    } 

}
