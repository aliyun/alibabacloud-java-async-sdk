// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrometheusAlertRulesResponse} extends {@link TeaModel}
 *
 * <p>ListPrometheusAlertRulesResponse</p>
 */
public class ListPrometheusAlertRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrometheusAlertRulesResponseBody body;

    private ListPrometheusAlertRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrometheusAlertRulesResponse create() {
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
    public ListPrometheusAlertRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrometheusAlertRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrometheusAlertRulesResponseBody body);

        @Override
        ListPrometheusAlertRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrometheusAlertRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrometheusAlertRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrometheusAlertRulesResponse response) {
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
        public Builder body(ListPrometheusAlertRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrometheusAlertRulesResponse build() {
            return new ListPrometheusAlertRulesResponse(this);
        } 

    } 

}
