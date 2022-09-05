// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterAllUrlResponse} extends {@link TeaModel}
 *
 * <p>GetClusterAllUrlResponse</p>
 */
public class GetClusterAllUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClusterAllUrlResponseBody body;

    private GetClusterAllUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClusterAllUrlResponse create() {
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
    public GetClusterAllUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClusterAllUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClusterAllUrlResponseBody body);

        @Override
        GetClusterAllUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClusterAllUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClusterAllUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClusterAllUrlResponse response) {
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
        public Builder body(GetClusterAllUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClusterAllUrlResponse build() {
            return new GetClusterAllUrlResponse(this);
        } 

    } 

}
