// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RecognizeSocialSecurityCardVersionIIRequest} extends {@link RequestModel}
 *
 * <p>RecognizeSocialSecurityCardVersionIIRequest</p>
 */
public class RecognizeSocialSecurityCardVersionIIRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Url")
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.io.InputStream body;

    private RecognizeSocialSecurityCardVersionIIRequest(Builder builder) {
        super(builder);
        this.url = builder.url;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecognizeSocialSecurityCardVersionIIRequest create() {
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

    public static final class Builder extends Request.Builder<RecognizeSocialSecurityCardVersionIIRequest, Builder> {
        private String url; 
        private java.io.InputStream body; 

        private Builder() {
            super();
        } 

        private Builder(RecognizeSocialSecurityCardVersionIIRequest request) {
            super(request);
            this.url = request.url;
            this.body = request.body;
        } 

        /**
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.io.InputStream body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public RecognizeSocialSecurityCardVersionIIRequest build() {
            return new RecognizeSocialSecurityCardVersionIIRequest(this);
        } 

    } 

}
