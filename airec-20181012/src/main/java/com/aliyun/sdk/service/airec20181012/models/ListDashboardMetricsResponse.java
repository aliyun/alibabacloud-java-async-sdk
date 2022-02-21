// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDashboardMetricsResponse} extends {@link TeaModel}
 *
 * <p>ListDashboardMetricsResponse</p>
 */
public class ListDashboardMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDashboardMetricsResponseBody body;

    private ListDashboardMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDashboardMetricsResponse create() {
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
    public ListDashboardMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDashboardMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDashboardMetricsResponseBody body);

        @Override
        ListDashboardMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDashboardMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDashboardMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDashboardMetricsResponse response) {
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
        public Builder body(ListDashboardMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDashboardMetricsResponse build() {
            return new ListDashboardMetricsResponse(this);
        } 

    } 

}
