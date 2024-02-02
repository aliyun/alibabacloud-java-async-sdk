// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CompanyThreeElementsVerificationResponse} extends {@link TeaModel}
 *
 * <p>CompanyThreeElementsVerificationResponse</p>
 */
public class CompanyThreeElementsVerificationResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private CompanyThreeElementsVerificationResponseBody body;

    private CompanyThreeElementsVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static CompanyThreeElementsVerificationResponse create() {
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
    public CompanyThreeElementsVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CompanyThreeElementsVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(CompanyThreeElementsVerificationResponseBody body);

        @Override
        CompanyThreeElementsVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CompanyThreeElementsVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private CompanyThreeElementsVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CompanyThreeElementsVerificationResponse response) {
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
        public Builder body(CompanyThreeElementsVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CompanyThreeElementsVerificationResponse build() {
            return new CompanyThreeElementsVerificationResponse(this);
        } 

    } 

}
