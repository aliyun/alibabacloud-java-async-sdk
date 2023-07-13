// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRulesResponse} extends {@link TeaModel}
 *
 * <p>DeleteMetricRulesResponse</p>
 */
public class DeleteMetricRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMetricRulesResponseBody body;

    private DeleteMetricRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMetricRulesResponse create() {
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
    public DeleteMetricRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMetricRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMetricRulesResponseBody body);

        @Override
        DeleteMetricRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMetricRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMetricRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMetricRulesResponse response) {
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
        public Builder body(DeleteMetricRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMetricRulesResponse build() {
            return new DeleteMetricRulesResponse(this);
        } 

    } 

}
