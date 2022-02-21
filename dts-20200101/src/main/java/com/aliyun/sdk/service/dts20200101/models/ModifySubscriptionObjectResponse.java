// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySubscriptionObjectResponse} extends {@link TeaModel}
 *
 * <p>ModifySubscriptionObjectResponse</p>
 */
public class ModifySubscriptionObjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySubscriptionObjectResponseBody body;

    private ModifySubscriptionObjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySubscriptionObjectResponse create() {
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
    public ModifySubscriptionObjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySubscriptionObjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySubscriptionObjectResponseBody body);

        @Override
        ModifySubscriptionObjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySubscriptionObjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySubscriptionObjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySubscriptionObjectResponse response) {
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
        public Builder body(ModifySubscriptionObjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySubscriptionObjectResponse build() {
            return new ModifySubscriptionObjectResponse(this);
        } 

    } 

}
