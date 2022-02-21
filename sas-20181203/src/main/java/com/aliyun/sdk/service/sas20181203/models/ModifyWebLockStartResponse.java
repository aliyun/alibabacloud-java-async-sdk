// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebLockStartResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebLockStartResponse</p>
 */
public class ModifyWebLockStartResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebLockStartResponseBody body;

    private ModifyWebLockStartResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebLockStartResponse create() {
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
    public ModifyWebLockStartResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebLockStartResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebLockStartResponseBody body);

        @Override
        ModifyWebLockStartResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebLockStartResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebLockStartResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebLockStartResponse response) {
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
        public Builder body(ModifyWebLockStartResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebLockStartResponse build() {
            return new ModifyWebLockStartResponse(this);
        } 

    } 

}
