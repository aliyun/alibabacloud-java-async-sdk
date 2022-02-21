// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWaitingOrderResponse} extends {@link TeaModel}
 *
 * <p>ModifyWaitingOrderResponse</p>
 */
public class ModifyWaitingOrderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWaitingOrderResponseBody body;

    private ModifyWaitingOrderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWaitingOrderResponse create() {
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
    public ModifyWaitingOrderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWaitingOrderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWaitingOrderResponseBody body);

        @Override
        ModifyWaitingOrderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWaitingOrderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWaitingOrderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWaitingOrderResponse response) {
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
        public Builder body(ModifyWaitingOrderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWaitingOrderResponse build() {
            return new ModifyWaitingOrderResponse(this);
        } 

    } 

}
