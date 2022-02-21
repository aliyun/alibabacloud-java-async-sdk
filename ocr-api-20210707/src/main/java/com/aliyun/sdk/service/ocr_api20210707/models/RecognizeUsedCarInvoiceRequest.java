// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeUsedCarInvoiceRequest} extends {@link RequestModel}
 *
 * <p>RecognizeUsedCarInvoiceRequest</p>
 */
public class RecognizeUsedCarInvoiceRequest extends Request {
    @Query
    @NameInMap("Url")
    private String url;

    @Body
    @NameInMap("body")
    private java.io.InputStream body;

    private RecognizeUsedCarInvoiceRequest(Builder builder) {
        super(builder);
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeUsedCarInvoiceRequest create() {
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

    public static final class Builder extends Request.Builder<RecognizeUsedCarInvoiceRequest, Builder> {
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeUsedCarInvoiceRequest response) {
            super(response);
            this.url = response.url;
            this.body = response.body;
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
        public RecognizeUsedCarInvoiceRequest build() {
            return new RecognizeUsedCarInvoiceRequest(this);
        } 

    } 

}
