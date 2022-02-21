// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiscoveredResourceCountsResponse} extends {@link TeaModel}
 *
 * <p>GetDiscoveredResourceCountsResponse</p>
 */
public class GetDiscoveredResourceCountsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDiscoveredResourceCountsResponseBody body;

    private GetDiscoveredResourceCountsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDiscoveredResourceCountsResponse create() {
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
    public GetDiscoveredResourceCountsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDiscoveredResourceCountsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDiscoveredResourceCountsResponseBody body);

        @Override
        GetDiscoveredResourceCountsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDiscoveredResourceCountsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDiscoveredResourceCountsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDiscoveredResourceCountsResponse response) {
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
        public Builder body(GetDiscoveredResourceCountsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDiscoveredResourceCountsResponse build() {
            return new GetDiscoveredResourceCountsResponse(this);
        } 

    } 

}
