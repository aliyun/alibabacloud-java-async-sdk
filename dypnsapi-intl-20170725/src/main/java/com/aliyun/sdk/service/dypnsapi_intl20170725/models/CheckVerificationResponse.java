// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi_intl20170725.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckVerificationResponse} extends {@link TeaModel}
 *
 * <p>CheckVerificationResponse</p>
 */
public class CheckVerificationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CheckVerificationResponseBody body;

    private CheckVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CheckVerificationResponse create() {
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
    public CheckVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CheckVerificationResponseBody body);

        @Override
        CheckVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CheckVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckVerificationResponse response) {
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
        public Builder body(CheckVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckVerificationResponse build() {
            return new CheckVerificationResponse(this);
        } 

    } 

}
