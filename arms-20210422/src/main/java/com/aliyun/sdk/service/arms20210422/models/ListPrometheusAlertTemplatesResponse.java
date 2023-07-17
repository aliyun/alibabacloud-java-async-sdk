// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusAlertTemplatesResponse} extends {@link TeaModel}
 *
 * <p>ListPrometheusAlertTemplatesResponse</p>
 */
public class ListPrometheusAlertTemplatesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrometheusAlertTemplatesResponseBody body;

    private ListPrometheusAlertTemplatesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrometheusAlertTemplatesResponse create() {
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
    public ListPrometheusAlertTemplatesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrometheusAlertTemplatesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrometheusAlertTemplatesResponseBody body);

        @Override
        ListPrometheusAlertTemplatesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrometheusAlertTemplatesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrometheusAlertTemplatesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrometheusAlertTemplatesResponse response) {
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
        public Builder body(ListPrometheusAlertTemplatesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrometheusAlertTemplatesResponse build() {
            return new ListPrometheusAlertTemplatesResponse(this);
        } 

    } 

}
