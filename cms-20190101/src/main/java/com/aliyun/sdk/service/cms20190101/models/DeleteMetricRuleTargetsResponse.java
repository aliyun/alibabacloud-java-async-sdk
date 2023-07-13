// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetricRuleTargetsResponse} extends {@link TeaModel}
 *
 * <p>DeleteMetricRuleTargetsResponse</p>
 */
public class DeleteMetricRuleTargetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMetricRuleTargetsResponseBody body;

    private DeleteMetricRuleTargetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMetricRuleTargetsResponse create() {
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
    public DeleteMetricRuleTargetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMetricRuleTargetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMetricRuleTargetsResponseBody body);

        @Override
        DeleteMetricRuleTargetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMetricRuleTargetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMetricRuleTargetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMetricRuleTargetsResponse response) {
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
        public Builder body(DeleteMetricRuleTargetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMetricRuleTargetsResponse build() {
            return new DeleteMetricRuleTargetsResponse(this);
        } 

    } 

}
