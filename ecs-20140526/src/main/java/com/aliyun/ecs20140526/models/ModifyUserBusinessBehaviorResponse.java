// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUserBusinessBehaviorResponse} extends {@link TeaModel}
 *
 * <p>ModifyUserBusinessBehaviorResponse</p>
 */
public class ModifyUserBusinessBehaviorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyUserBusinessBehaviorResponseBody body;

    private ModifyUserBusinessBehaviorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyUserBusinessBehaviorResponse create() {
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
    public ModifyUserBusinessBehaviorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyUserBusinessBehaviorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyUserBusinessBehaviorResponseBody body);

        @Override
        ModifyUserBusinessBehaviorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyUserBusinessBehaviorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyUserBusinessBehaviorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyUserBusinessBehaviorResponse response) {
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
        public Builder body(ModifyUserBusinessBehaviorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyUserBusinessBehaviorResponse build() {
            return new ModifyUserBusinessBehaviorResponse(this);
        } 

    } 

}
