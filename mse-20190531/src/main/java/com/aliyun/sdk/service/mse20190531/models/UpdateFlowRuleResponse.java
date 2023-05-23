// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFlowRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateFlowRuleResponse</p>
 */
public class UpdateFlowRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateFlowRuleResponseBody body;

    private UpdateFlowRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateFlowRuleResponse create() {
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
    public UpdateFlowRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateFlowRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateFlowRuleResponseBody body);

        @Override
        UpdateFlowRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateFlowRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateFlowRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateFlowRuleResponse response) {
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
        public Builder body(UpdateFlowRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateFlowRuleResponse build() {
            return new UpdateFlowRuleResponse(this);
        } 

    } 

}
