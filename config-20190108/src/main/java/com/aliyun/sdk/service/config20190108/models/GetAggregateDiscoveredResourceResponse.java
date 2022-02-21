// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateDiscoveredResourceResponse} extends {@link TeaModel}
 *
 * <p>GetAggregateDiscoveredResourceResponse</p>
 */
public class GetAggregateDiscoveredResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAggregateDiscoveredResourceResponseBody body;

    private GetAggregateDiscoveredResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAggregateDiscoveredResourceResponse create() {
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
    public GetAggregateDiscoveredResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAggregateDiscoveredResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAggregateDiscoveredResourceResponseBody body);

        @Override
        GetAggregateDiscoveredResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAggregateDiscoveredResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAggregateDiscoveredResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAggregateDiscoveredResourceResponse response) {
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
        public Builder body(GetAggregateDiscoveredResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAggregateDiscoveredResourceResponse build() {
            return new GetAggregateDiscoveredResourceResponse(this);
        } 

    } 

}
