// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyWebLockProcessStatusResponse} extends {@link TeaModel}
 *
 * <p>ModifyWebLockProcessStatusResponse</p>
 */
public class ModifyWebLockProcessStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyWebLockProcessStatusResponseBody body;

    private ModifyWebLockProcessStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyWebLockProcessStatusResponse create() {
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
    public ModifyWebLockProcessStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyWebLockProcessStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyWebLockProcessStatusResponseBody body);

        @Override
        ModifyWebLockProcessStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyWebLockProcessStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyWebLockProcessStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyWebLockProcessStatusResponse response) {
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
        public Builder body(ModifyWebLockProcessStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyWebLockProcessStatusResponse build() {
            return new ModifyWebLockProcessStatusResponse(this);
        } 

    } 

}
