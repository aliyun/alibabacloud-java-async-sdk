// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetContactWhiteListResponse} extends {@link TeaModel}
 *
 * <p>GetContactWhiteListResponse</p>
 */
public class GetContactWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetContactWhiteListResponseBody body;

    private GetContactWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetContactWhiteListResponse create() {
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
    public GetContactWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetContactWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetContactWhiteListResponseBody body);

        @Override
        GetContactWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetContactWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetContactWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetContactWhiteListResponse response) {
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
        public Builder body(GetContactWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetContactWhiteListResponse build() {
            return new GetContactWhiteListResponse(this);
        } 

    } 

}
