// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebLockUpdateConfigResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebLockUpdateConfigResponse</p>
 */
public class ModifyWebLockUpdateConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebLockUpdateConfigResponseBody body;

    private ModifyWebLockUpdateConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebLockUpdateConfigResponse create() {
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
    public ModifyWebLockUpdateConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebLockUpdateConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebLockUpdateConfigResponseBody body);

        @Override
        ModifyWebLockUpdateConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebLockUpdateConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebLockUpdateConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebLockUpdateConfigResponse response) {
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
        public Builder body(ModifyWebLockUpdateConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebLockUpdateConfigResponse build() {
            return new ModifyWebLockUpdateConfigResponse(this);
        } 

    } 

}
