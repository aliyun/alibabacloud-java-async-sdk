// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterInfoResponse} extends {@link TeaModel}
 *
 * <p>GetClusterInfoResponse</p>
 */
public class GetClusterInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClusterInfoResponseBody body;

    private GetClusterInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClusterInfoResponse create() {
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
    public GetClusterInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClusterInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClusterInfoResponseBody body);

        @Override
        GetClusterInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClusterInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClusterInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClusterInfoResponse response) {
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
        public Builder body(GetClusterInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClusterInfoResponse build() {
            return new GetClusterInfoResponse(this);
        } 

    } 

}
