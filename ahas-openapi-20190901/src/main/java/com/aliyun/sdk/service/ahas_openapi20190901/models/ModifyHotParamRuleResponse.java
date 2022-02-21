// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHotParamRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyHotParamRuleResponse</p>
 */
public class ModifyHotParamRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHotParamRuleResponseBody body;

    private ModifyHotParamRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHotParamRuleResponse create() {
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
    public ModifyHotParamRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHotParamRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHotParamRuleResponseBody body);

        @Override
        ModifyHotParamRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHotParamRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHotParamRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHotParamRuleResponse response) {
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
        public Builder body(ModifyHotParamRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHotParamRuleResponse build() {
            return new ModifyHotParamRuleResponse(this);
        } 

    } 

}
