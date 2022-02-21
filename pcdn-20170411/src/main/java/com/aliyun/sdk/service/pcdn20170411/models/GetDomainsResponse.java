// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDomainsResponse} extends {@link TeaModel}
 *
 * <p>GetDomainsResponse</p>
 */
public class GetDomainsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDomainsResponseBody body;

    private GetDomainsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDomainsResponse create() {
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
    public GetDomainsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDomainsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDomainsResponseBody body);

        @Override
        GetDomainsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDomainsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDomainsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDomainsResponse response) {
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
        public Builder body(GetDomainsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDomainsResponse build() {
            return new GetDomainsResponse(this);
        } 

    } 

}
