// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyEventStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyEventStatusResponse</p>
 */
public class ModifyEventStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyEventStatusResponseBody body;

    private ModifyEventStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyEventStatusResponse create() {
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
    public ModifyEventStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyEventStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyEventStatusResponseBody body);

        @Override
        ModifyEventStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyEventStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyEventStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyEventStatusResponse response) {
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
        public Builder body(ModifyEventStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyEventStatusResponse build() {
            return new ModifyEventStatusResponse(this);
        } 

    } 

}
