// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartConfigRuleEvaluationResponse} extends {@link TeaModel}
 *
 * <p>StartConfigRuleEvaluationResponse</p>
 */
public class StartConfigRuleEvaluationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartConfigRuleEvaluationResponseBody body;

    private StartConfigRuleEvaluationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartConfigRuleEvaluationResponse create() {
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
    public StartConfigRuleEvaluationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartConfigRuleEvaluationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartConfigRuleEvaluationResponseBody body);

        @Override
        StartConfigRuleEvaluationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartConfigRuleEvaluationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartConfigRuleEvaluationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartConfigRuleEvaluationResponse response) {
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
        public Builder body(StartConfigRuleEvaluationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartConfigRuleEvaluationResponse build() {
            return new StartConfigRuleEvaluationResponse(this);
        } 

    } 

}
