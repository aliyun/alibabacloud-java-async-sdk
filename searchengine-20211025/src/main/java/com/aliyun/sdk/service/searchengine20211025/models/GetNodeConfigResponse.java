// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeConfigResponse} extends {@link TeaModel}
 *
 * <p>GetNodeConfigResponse</p>
 */
public class GetNodeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNodeConfigResponseBody body;

    private GetNodeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNodeConfigResponse create() {
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
    public GetNodeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNodeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNodeConfigResponseBody body);

        @Override
        GetNodeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNodeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNodeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNodeConfigResponse response) {
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
        public Builder body(GetNodeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNodeConfigResponse build() {
            return new GetNodeConfigResponse(this);
        } 

    } 

}
