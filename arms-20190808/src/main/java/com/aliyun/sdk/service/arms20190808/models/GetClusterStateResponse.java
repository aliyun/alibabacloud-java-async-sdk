// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterStateResponse} extends {@link TeaModel}
 *
 * <p>GetClusterStateResponse</p>
 */
public class GetClusterStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClusterStateResponseBody body;

    private GetClusterStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClusterStateResponse create() {
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
    public GetClusterStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClusterStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClusterStateResponseBody body);

        @Override
        GetClusterStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClusterStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClusterStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClusterStateResponse response) {
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
        public Builder body(GetClusterStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClusterStateResponse build() {
            return new GetClusterStateResponse(this);
        } 

    } 

}
