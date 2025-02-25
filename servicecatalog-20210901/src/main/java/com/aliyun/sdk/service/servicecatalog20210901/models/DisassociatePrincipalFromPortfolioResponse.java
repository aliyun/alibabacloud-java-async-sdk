// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociatePrincipalFromPortfolioResponse} extends {@link TeaModel}
 *
 * <p>DisassociatePrincipalFromPortfolioResponse</p>
 */
public class DisassociatePrincipalFromPortfolioResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DisassociatePrincipalFromPortfolioResponseBody body;

    private DisassociatePrincipalFromPortfolioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DisassociatePrincipalFromPortfolioResponse create() {
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
    public DisassociatePrincipalFromPortfolioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisassociatePrincipalFromPortfolioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DisassociatePrincipalFromPortfolioResponseBody body);

        @Override
        DisassociatePrincipalFromPortfolioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisassociatePrincipalFromPortfolioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DisassociatePrincipalFromPortfolioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisassociatePrincipalFromPortfolioResponse response) {
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
        public Builder body(DisassociatePrincipalFromPortfolioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisassociatePrincipalFromPortfolioResponse build() {
            return new DisassociatePrincipalFromPortfolioResponse(this);
        } 

    } 

}
