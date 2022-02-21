// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTokenListResponse} extends {@link TeaModel}
 *
 * <p>GetTokenListResponse</p>
 */
public class GetTokenListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTokenListResponseBody body;

    private GetTokenListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTokenListResponse create() {
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
    public GetTokenListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTokenListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTokenListResponseBody body);

        @Override
        GetTokenListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTokenListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTokenListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTokenListResponse response) {
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
        public Builder body(GetTokenListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTokenListResponse build() {
            return new GetTokenListResponse(this);
        } 

    } 

}
