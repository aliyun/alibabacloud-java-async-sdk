// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetrieveDomainResponse} extends {@link TeaModel}
 *
 * <p>RetrieveDomainResponse</p>
 */
public class RetrieveDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RetrieveDomainResponseBody body;

    private RetrieveDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RetrieveDomainResponse create() {
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
    public RetrieveDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RetrieveDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RetrieveDomainResponseBody body);

        @Override
        RetrieveDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RetrieveDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RetrieveDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RetrieveDomainResponse response) {
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
        public Builder body(RetrieveDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RetrieveDomainResponse build() {
            return new RetrieveDomainResponse(this);
        } 

    } 

}
