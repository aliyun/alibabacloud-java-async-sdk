// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClientConfStrategyResponse} extends {@link TeaModel}
 *
 * <p>ModifyClientConfStrategyResponse</p>
 */
public class ModifyClientConfStrategyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClientConfStrategyResponseBody body;

    private ModifyClientConfStrategyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClientConfStrategyResponse create() {
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
    public ModifyClientConfStrategyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClientConfStrategyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClientConfStrategyResponseBody body);

        @Override
        ModifyClientConfStrategyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClientConfStrategyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClientConfStrategyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClientConfStrategyResponse response) {
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
        public Builder body(ModifyClientConfStrategyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClientConfStrategyResponse build() {
            return new ModifyClientConfStrategyResponse(this);
        } 

    } 

}
