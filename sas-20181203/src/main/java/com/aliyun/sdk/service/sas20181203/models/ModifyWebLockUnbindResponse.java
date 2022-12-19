// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebLockUnbindResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebLockUnbindResponse</p>
 */
public class ModifyWebLockUnbindResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebLockUnbindResponseBody body;

    private ModifyWebLockUnbindResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebLockUnbindResponse create() {
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
    public ModifyWebLockUnbindResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebLockUnbindResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebLockUnbindResponseBody body);

        @Override
        ModifyWebLockUnbindResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebLockUnbindResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebLockUnbindResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebLockUnbindResponse response) {
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
        public Builder body(ModifyWebLockUnbindResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebLockUnbindResponse build() {
            return new ModifyWebLockUnbindResponse(this);
        } 

    } 

}
