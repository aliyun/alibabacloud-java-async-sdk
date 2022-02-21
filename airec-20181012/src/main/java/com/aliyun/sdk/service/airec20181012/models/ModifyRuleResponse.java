// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyRuleResponse</p>
 */
public class ModifyRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyRuleResponseBody body;

    private ModifyRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyRuleResponse create() {
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
    public ModifyRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyRuleResponseBody body);

        @Override
        ModifyRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyRuleResponse response) {
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
        public Builder body(ModifyRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyRuleResponse build() {
            return new ModifyRuleResponse(this);
        } 

    } 

}
