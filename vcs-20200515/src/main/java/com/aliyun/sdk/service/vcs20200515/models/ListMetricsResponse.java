// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMetricsResponse} extends {@link TeaModel}
 *
 * <p>ListMetricsResponse</p>
 */
public class ListMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMetricsResponseBody body;

    private ListMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMetricsResponse create() {
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
    public ListMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMetricsResponseBody body);

        @Override
        ListMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMetricsResponse response) {
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
        public Builder body(ListMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMetricsResponse build() {
            return new ListMetricsResponse(this);
        } 

    } 

}
