// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySubscriptionResponse} extends {@link TeaModel}
 *
 * <p>ModifySubscriptionResponse</p>
 */
public class ModifySubscriptionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySubscriptionResponseBody body;

    private ModifySubscriptionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySubscriptionResponse create() {
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
    public ModifySubscriptionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySubscriptionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySubscriptionResponseBody body);

        @Override
        ModifySubscriptionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySubscriptionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySubscriptionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySubscriptionResponse response) {
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
        public Builder body(ModifySubscriptionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySubscriptionResponse build() {
            return new ModifySubscriptionResponse(this);
        } 

    } 

}
