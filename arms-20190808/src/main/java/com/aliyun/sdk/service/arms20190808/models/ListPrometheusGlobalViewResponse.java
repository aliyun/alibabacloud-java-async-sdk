// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusGlobalViewResponse} extends {@link TeaModel}
 *
 * <p>ListPrometheusGlobalViewResponse</p>
 */
public class ListPrometheusGlobalViewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrometheusGlobalViewResponseBody body;

    private ListPrometheusGlobalViewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrometheusGlobalViewResponse create() {
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
    public ListPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrometheusGlobalViewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrometheusGlobalViewResponseBody body);

        @Override
        ListPrometheusGlobalViewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrometheusGlobalViewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrometheusGlobalViewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrometheusGlobalViewResponse response) {
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
        public Builder body(ListPrometheusGlobalViewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrometheusGlobalViewResponse build() {
            return new ListPrometheusGlobalViewResponse(this);
        } 

    } 

}
