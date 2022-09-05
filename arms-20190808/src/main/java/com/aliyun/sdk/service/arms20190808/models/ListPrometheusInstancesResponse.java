// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListPrometheusInstancesResponse</p>
 */
public class ListPrometheusInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrometheusInstancesResponseBody body;

    private ListPrometheusInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrometheusInstancesResponse create() {
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
    public ListPrometheusInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrometheusInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrometheusInstancesResponseBody body);

        @Override
        ListPrometheusInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrometheusInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrometheusInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrometheusInstancesResponse response) {
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
        public Builder body(ListPrometheusInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrometheusInstancesResponse build() {
            return new ListPrometheusInstancesResponse(this);
        } 

    } 

}
