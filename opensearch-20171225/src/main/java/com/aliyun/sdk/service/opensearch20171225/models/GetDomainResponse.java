// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainResponse} extends {@link TeaModel}
 *
 * <p>GetDomainResponse</p>
 */
public class GetDomainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDomainResponseBody body;

    private GetDomainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDomainResponse create() {
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
    public GetDomainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDomainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDomainResponseBody body);

        @Override
        GetDomainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDomainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDomainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDomainResponse response) {
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
        public Builder body(GetDomainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDomainResponse build() {
            return new GetDomainResponse(this);
        } 

    } 

}
