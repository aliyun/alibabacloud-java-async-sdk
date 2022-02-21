// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABTestMetricsResponse} extends {@link TeaModel}
 *
 * <p>ListABTestMetricsResponse</p>
 */
public class ListABTestMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListABTestMetricsResponseBody body;

    private ListABTestMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListABTestMetricsResponse create() {
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
    public ListABTestMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListABTestMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListABTestMetricsResponseBody body);

        @Override
        ListABTestMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListABTestMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListABTestMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListABTestMetricsResponse response) {
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
        public Builder body(ListABTestMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListABTestMetricsResponse build() {
            return new ListABTestMetricsResponse(this);
        } 

    } 

}
