// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20220930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileTransResponse} extends {@link TeaModel}
 *
 * <p>GetFileTransResponse</p>
 */
public class GetFileTransResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFileTransResponseBody body;

    private GetFileTransResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFileTransResponse create() {
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
    public GetFileTransResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFileTransResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFileTransResponseBody body);

        @Override
        GetFileTransResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFileTransResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFileTransResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFileTransResponse response) {
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
        public Builder body(GetFileTransResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFileTransResponse build() {
            return new GetFileTransResponse(this);
        } 

    } 

}
