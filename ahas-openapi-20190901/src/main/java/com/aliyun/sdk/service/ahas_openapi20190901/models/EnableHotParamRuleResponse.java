// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableHotParamRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableHotParamRuleResponse</p>
 */
public class EnableHotParamRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableHotParamRuleResponseBody body;

    private EnableHotParamRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableHotParamRuleResponse create() {
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
    public EnableHotParamRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableHotParamRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableHotParamRuleResponseBody body);

        @Override
        EnableHotParamRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableHotParamRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableHotParamRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableHotParamRuleResponse response) {
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
        public Builder body(EnableHotParamRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableHotParamRuleResponse build() {
            return new EnableHotParamRuleResponse(this);
        } 

    } 

}
