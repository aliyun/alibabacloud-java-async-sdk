// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageSharePermissionResponse} extends {@link TeaModel}
 *
 * <p>ModifyImageSharePermissionResponse</p>
 */
public class ModifyImageSharePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyImageSharePermissionResponseBody body;

    private ModifyImageSharePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyImageSharePermissionResponse create() {
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
    public ModifyImageSharePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyImageSharePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyImageSharePermissionResponseBody body);

        @Override
        ModifyImageSharePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyImageSharePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyImageSharePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyImageSharePermissionResponse response) {
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
        public Builder body(ModifyImageSharePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyImageSharePermissionResponse build() {
            return new ModifyImageSharePermissionResponse(this);
        } 

    } 

}
