// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAggregateDiscoveredResourcesResponse} extends {@link TeaModel}
 *
 * <p>ListAggregateDiscoveredResourcesResponse</p>
 */
public class ListAggregateDiscoveredResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAggregateDiscoveredResourcesResponseBody body;

    private ListAggregateDiscoveredResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAggregateDiscoveredResourcesResponse create() {
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
    public ListAggregateDiscoveredResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAggregateDiscoveredResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAggregateDiscoveredResourcesResponseBody body);

        @Override
        ListAggregateDiscoveredResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAggregateDiscoveredResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAggregateDiscoveredResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAggregateDiscoveredResourcesResponse response) {
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
        public Builder body(ListAggregateDiscoveredResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAggregateDiscoveredResourcesResponse build() {
            return new ListAggregateDiscoveredResourcesResponse(this);
        } 

    } 

}
