// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMdsMiniConfigResponse} extends {@link TeaModel}
 *
 * <p>GetMdsMiniConfigResponse</p>
 */
public class GetMdsMiniConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMdsMiniConfigResponseBody body;

    private GetMdsMiniConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMdsMiniConfigResponse create() {
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
    public GetMdsMiniConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMdsMiniConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMdsMiniConfigResponseBody body);

        @Override
        GetMdsMiniConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMdsMiniConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMdsMiniConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMdsMiniConfigResponse response) {
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
        public Builder body(GetMdsMiniConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMdsMiniConfigResponse build() {
            return new GetMdsMiniConfigResponse(this);
        } 

    } 

}
