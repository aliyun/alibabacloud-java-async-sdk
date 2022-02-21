// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppGroupMetricsResponse} extends {@link TeaModel}
 *
 * <p>ListAppGroupMetricsResponse</p>
 */
public class ListAppGroupMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppGroupMetricsResponseBody body;

    private ListAppGroupMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppGroupMetricsResponse create() {
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
    public ListAppGroupMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppGroupMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppGroupMetricsResponseBody body);

        @Override
        ListAppGroupMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppGroupMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppGroupMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppGroupMetricsResponse response) {
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
        public Builder body(ListAppGroupMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppGroupMetricsResponse build() {
            return new ListAppGroupMetricsResponse(this);
        } 

    } 

}
