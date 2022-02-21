// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableHotParamRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableHotParamRuleResponse</p>
 */
public class DisableHotParamRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableHotParamRuleResponseBody body;

    private DisableHotParamRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableHotParamRuleResponse create() {
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
    public DisableHotParamRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableHotParamRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableHotParamRuleResponseBody body);

        @Override
        DisableHotParamRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableHotParamRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableHotParamRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableHotParamRuleResponse response) {
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
        public Builder body(DisableHotParamRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableHotParamRuleResponse build() {
            return new DisableHotParamRuleResponse(this);
        } 

    } 

}
