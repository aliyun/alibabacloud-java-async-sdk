// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCommandResponse} extends {@link TeaModel}
 *
 * <p>ModifyCommandResponse</p>
 */
public class ModifyCommandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCommandResponseBody body;

    private ModifyCommandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCommandResponse create() {
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
    public ModifyCommandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCommandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCommandResponseBody body);

        @Override
        ModifyCommandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCommandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCommandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCommandResponse response) {
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
        public Builder body(ModifyCommandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCommandResponse build() {
            return new ModifyCommandResponse(this);
        } 

    } 

}
