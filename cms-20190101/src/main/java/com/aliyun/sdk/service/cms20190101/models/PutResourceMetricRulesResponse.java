// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutResourceMetricRulesResponse} extends {@link TeaModel}
 *
 * <p>PutResourceMetricRulesResponse</p>
 */
public class PutResourceMetricRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutResourceMetricRulesResponseBody body;

    private PutResourceMetricRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutResourceMetricRulesResponse create() {
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
    public PutResourceMetricRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutResourceMetricRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutResourceMetricRulesResponseBody body);

        @Override
        PutResourceMetricRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutResourceMetricRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutResourceMetricRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutResourceMetricRulesResponse response) {
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
        public Builder body(PutResourceMetricRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutResourceMetricRulesResponse build() {
            return new PutResourceMetricRulesResponse(this);
        } 

    } 

}
