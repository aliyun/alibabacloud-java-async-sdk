// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link CreateSliderCaptchaPageResponse} extends {@link TeaModel}
 *
 * <p>CreateSliderCaptchaPageResponse</p>
 */
public class CreateSliderCaptchaPageResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private CreateSliderCaptchaPageResponseBody body;

    private CreateSliderCaptchaPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CreateSliderCaptchaPageResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
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
    public CreateSliderCaptchaPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSliderCaptchaPageResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(CreateSliderCaptchaPageResponseBody body);

        @Override
        CreateSliderCaptchaPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSliderCaptchaPageResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private CreateSliderCaptchaPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSliderCaptchaPageResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
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
        public Builder body(CreateSliderCaptchaPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSliderCaptchaPageResponse build() {
            return new CreateSliderCaptchaPageResponse(this);
        } 

    } 

}
