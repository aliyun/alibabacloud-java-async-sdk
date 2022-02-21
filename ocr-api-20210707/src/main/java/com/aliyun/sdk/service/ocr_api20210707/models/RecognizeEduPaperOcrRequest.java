// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeEduPaperOcrRequest} extends {@link RequestModel}
 *
 * <p>RecognizeEduPaperOcrRequest</p>
 */
public class RecognizeEduPaperOcrRequest extends Request {
    @Query
    @NameInMap("ImageType")
    @Validation(required = true)
    private String imageType;

    @Query
    @NameInMap("OutputOricoord")
    private Boolean outputOricoord;

    @Query
    @NameInMap("Subject")
    private String subject;

    @Query
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeEduPaperOcrRequest(Builder builder) {
        super(builder);
        this.imageType = builder.imageType;
        this.outputOricoord = builder.outputOricoord;
        this.subject = builder.subject;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeEduPaperOcrRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageType
     */
    public String getImageType() {
        return this.imageType;
    }

    /**
     * @return outputOricoord
     */
    public Boolean getOutputOricoord() {
        return this.outputOricoord;
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

    public static final class Builder extends Request.Builder<RecognizeEduPaperOcrRequest, Builder> {
        private String imageType; 
        private Boolean outputOricoord; 
        private String subject; 
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeEduPaperOcrRequest response) {
            super(response);
            this.imageType = response.imageType;
            this.outputOricoord = response.outputOricoord;
            this.subject = response.subject;
            this.url = response.url;
            this.body = response.body;
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
         * 是否输出原图坐标信息(如果图片被做过旋转，图片校正等处理)
         */
        public Builder outputOricoord(Boolean outputOricoord) {
            this.putQueryParameter("OutputOricoord", outputOricoord);
            this.outputOricoord = outputOricoord;
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
        public RecognizeEduPaperOcrRequest build() {
            return new RecognizeEduPaperOcrRequest(this);
        } 

    } 

}
