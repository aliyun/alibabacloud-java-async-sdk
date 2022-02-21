// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExploreUrlResponse} extends {@link TeaModel}
 *
 * <p>GetExploreUrlResponse</p>
 */
public class GetExploreUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetExploreUrlResponseBody body;

    private GetExploreUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetExploreUrlResponse create() {
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
    public GetExploreUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExploreUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetExploreUrlResponseBody body);

        @Override
        GetExploreUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExploreUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetExploreUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExploreUrlResponse response) {
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
        public Builder body(GetExploreUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExploreUrlResponse build() {
            return new GetExploreUrlResponse(this);
        } 

    } 

}
