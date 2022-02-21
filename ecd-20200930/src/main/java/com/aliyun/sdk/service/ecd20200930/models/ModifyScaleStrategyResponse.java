// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScaleStrategyResponse} extends {@link TeaModel}
 *
 * <p>ModifyScaleStrategyResponse</p>
 */
public class ModifyScaleStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyScaleStrategyResponseBody body;

    private ModifyScaleStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyScaleStrategyResponse create() {
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
    public ModifyScaleStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyScaleStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyScaleStrategyResponseBody body);

        @Override
        ModifyScaleStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyScaleStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyScaleStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyScaleStrategyResponse response) {
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
        public Builder body(ModifyScaleStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyScaleStrategyResponse build() {
            return new ModifyScaleStrategyResponse(this);
        } 

    } 

}
