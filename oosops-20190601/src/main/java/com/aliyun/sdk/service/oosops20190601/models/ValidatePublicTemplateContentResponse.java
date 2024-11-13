// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValidatePublicTemplateContentResponse} extends {@link TeaModel}
 *
 * <p>ValidatePublicTemplateContentResponse</p>
 */
public class ValidatePublicTemplateContentResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ValidatePublicTemplateContentResponseBody body;

    private ValidatePublicTemplateContentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static ValidatePublicTemplateContentResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ValidatePublicTemplateContentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidatePublicTemplateContentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ValidatePublicTemplateContentResponseBody body);

        @Override
        ValidatePublicTemplateContentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidatePublicTemplateContentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ValidatePublicTemplateContentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidatePublicTemplateContentResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(ValidatePublicTemplateContentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidatePublicTemplateContentResponse build() {
            return new ValidatePublicTemplateContentResponse(this);
        } 

    } 

}
