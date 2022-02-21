// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebRuleResponse</p>
 */
public class ModifyWebRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebRuleResponseBody body;

    private ModifyWebRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebRuleResponse create() {
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
    public ModifyWebRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebRuleResponseBody body);

        @Override
        ModifyWebRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebRuleResponse response) {
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
        public Builder body(ModifyWebRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebRuleResponse build() {
            return new ModifyWebRuleResponse(this);
        } 

    } 

}
