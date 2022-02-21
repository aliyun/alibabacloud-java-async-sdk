// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckDomainSunriseClaimResponse} extends {@link TeaModel}
 *
 * <p>CheckDomainSunriseClaimResponse</p>
 */
public class CheckDomainSunriseClaimResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckDomainSunriseClaimResponseBody body;

    private CheckDomainSunriseClaimResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckDomainSunriseClaimResponse create() {
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
     * @return body
     */
    public CheckDomainSunriseClaimResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckDomainSunriseClaimResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckDomainSunriseClaimResponseBody body);

        @Override
        CheckDomainSunriseClaimResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckDomainSunriseClaimResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckDomainSunriseClaimResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckDomainSunriseClaimResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(CheckDomainSunriseClaimResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckDomainSunriseClaimResponse build() {
            return new CheckDomainSunriseClaimResponse(this);
        } 

    } 

}
