// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStoreSearchTopResponse} extends {@link TeaModel}
 *
 * <p>GetStoreSearchTopResponse</p>
 */
public class GetStoreSearchTopResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStoreSearchTopResponseBody body;

    private GetStoreSearchTopResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStoreSearchTopResponse create() {
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
    public GetStoreSearchTopResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStoreSearchTopResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStoreSearchTopResponseBody body);

        @Override
        GetStoreSearchTopResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStoreSearchTopResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStoreSearchTopResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStoreSearchTopResponse response) {
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
        public Builder body(GetStoreSearchTopResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStoreSearchTopResponse build() {
            return new GetStoreSearchTopResponse(this);
        } 

    } 

}
