// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeEstateCertificationRequest} extends {@link RequestModel}
 *
 * <p>RecognizeEstateCertificationRequest</p>
 */
public class RecognizeEstateCertificationRequest extends Request {
    @Query
    @NameInMap("Url")
    @Validation(maxLength = 2048)
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeEstateCertificationRequest(Builder builder) {
        super(builder);
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeEstateCertificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<RecognizeEstateCertificationRequest, Builder> {
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeEstateCertificationRequest request) {
            super(request);
            this.url = request.url;
            this.body = request.body;
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
        public RecognizeEstateCertificationRequest build() {
            return new RecognizeEstateCertificationRequest(this);
        } 

    } 

}
