// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStrategyTargetResponse} extends {@link TeaModel}
 *
 * <p>ModifyStrategyTargetResponse</p>
 */
public class ModifyStrategyTargetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyStrategyTargetResponseBody body;

    private ModifyStrategyTargetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyStrategyTargetResponse create() {
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
    public ModifyStrategyTargetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyStrategyTargetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyStrategyTargetResponseBody body);

        @Override
        ModifyStrategyTargetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyStrategyTargetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyStrategyTargetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyStrategyTargetResponse response) {
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
        public Builder body(ModifyStrategyTargetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyStrategyTargetResponse build() {
            return new ModifyStrategyTargetResponse(this);
        } 

    } 

}
