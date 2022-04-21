// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStrategyResponse} extends {@link TeaModel}
 *
 * <p>ModifyStrategyResponse</p>
 */
public class ModifyStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyStrategyResponseBody body;

    private ModifyStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyStrategyResponse create() {
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
    public ModifyStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyStrategyResponseBody body);

        @Override
        ModifyStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyStrategyResponse response) {
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
        public Builder body(ModifyStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyStrategyResponse build() {
            return new ModifyStrategyResponse(this);
        } 

    } 

}
