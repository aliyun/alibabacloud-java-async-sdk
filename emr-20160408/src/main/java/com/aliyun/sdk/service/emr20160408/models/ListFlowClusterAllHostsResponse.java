// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowClusterAllHostsResponse} extends {@link TeaModel}
 *
 * <p>ListFlowClusterAllHostsResponse</p>
 */
public class ListFlowClusterAllHostsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFlowClusterAllHostsResponseBody body;

    private ListFlowClusterAllHostsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFlowClusterAllHostsResponse create() {
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
    public ListFlowClusterAllHostsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFlowClusterAllHostsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFlowClusterAllHostsResponseBody body);

        @Override
        ListFlowClusterAllHostsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFlowClusterAllHostsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFlowClusterAllHostsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFlowClusterAllHostsResponse response) {
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
        public Builder body(ListFlowClusterAllHostsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFlowClusterAllHostsResponse build() {
            return new ListFlowClusterAllHostsResponse(this);
        } 

    } 

}
