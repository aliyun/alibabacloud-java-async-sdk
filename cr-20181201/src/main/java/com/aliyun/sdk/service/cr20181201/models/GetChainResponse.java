// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChainResponse} extends {@link TeaModel}
 *
 * <p>GetChainResponse</p>
 */
public class GetChainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetChainResponseBody body;

    private GetChainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetChainResponse create() {
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
    public GetChainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetChainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetChainResponseBody body);

        @Override
        GetChainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetChainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetChainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetChainResponse response) {
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
        public Builder body(GetChainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetChainResponse build() {
            return new GetChainResponse(this);
        } 

    } 

}
