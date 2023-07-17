// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportPrometheusRulesResponse} extends {@link TeaModel}
 *
 * <p>ExportPrometheusRulesResponse</p>
 */
public class ExportPrometheusRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportPrometheusRulesResponseBody body;

    private ExportPrometheusRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportPrometheusRulesResponse create() {
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
    public ExportPrometheusRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportPrometheusRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportPrometheusRulesResponseBody body);

        @Override
        ExportPrometheusRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportPrometheusRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportPrometheusRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportPrometheusRulesResponse response) {
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
        public Builder body(ExportPrometheusRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportPrometheusRulesResponse build() {
            return new ExportPrometheusRulesResponse(this);
        } 

    } 

}
