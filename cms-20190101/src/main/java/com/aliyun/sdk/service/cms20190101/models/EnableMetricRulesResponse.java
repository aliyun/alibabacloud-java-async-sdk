// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableMetricRulesResponse} extends {@link TeaModel}
 *
 * <p>EnableMetricRulesResponse</p>
 */
public class EnableMetricRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableMetricRulesResponseBody body;

    private EnableMetricRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableMetricRulesResponse create() {
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
    public EnableMetricRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableMetricRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableMetricRulesResponseBody body);

        @Override
        EnableMetricRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableMetricRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableMetricRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableMetricRulesResponse response) {
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
        public Builder body(EnableMetricRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableMetricRulesResponse build() {
            return new EnableMetricRulesResponse(this);
        } 

    } 

}
