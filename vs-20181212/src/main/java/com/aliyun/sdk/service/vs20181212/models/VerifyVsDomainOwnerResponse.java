// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyVsDomainOwnerResponse} extends {@link TeaModel}
 *
 * <p>VerifyVsDomainOwnerResponse</p>
 */
public class VerifyVsDomainOwnerResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private VerifyVsDomainOwnerResponseBody body;

    private VerifyVsDomainOwnerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static VerifyVsDomainOwnerResponse create() {
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
    public VerifyVsDomainOwnerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyVsDomainOwnerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(VerifyVsDomainOwnerResponseBody body);

        @Override
        VerifyVsDomainOwnerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyVsDomainOwnerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private VerifyVsDomainOwnerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyVsDomainOwnerResponse response) {
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
        public Builder body(VerifyVsDomainOwnerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyVsDomainOwnerResponse build() {
            return new VerifyVsDomainOwnerResponse(this);
        } 

    } 

}
