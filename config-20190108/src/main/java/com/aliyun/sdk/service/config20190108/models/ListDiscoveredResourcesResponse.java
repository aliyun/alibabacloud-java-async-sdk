// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiscoveredResourcesResponse} extends {@link TeaModel}
 *
 * <p>ListDiscoveredResourcesResponse</p>
 */
public class ListDiscoveredResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDiscoveredResourcesResponseBody body;

    private ListDiscoveredResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDiscoveredResourcesResponse create() {
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
    public ListDiscoveredResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDiscoveredResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDiscoveredResourcesResponseBody body);

        @Override
        ListDiscoveredResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDiscoveredResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDiscoveredResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDiscoveredResourcesResponse response) {
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
        public Builder body(ListDiscoveredResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDiscoveredResourcesResponse build() {
            return new ListDiscoveredResourcesResponse(this);
        } 

    } 

}
