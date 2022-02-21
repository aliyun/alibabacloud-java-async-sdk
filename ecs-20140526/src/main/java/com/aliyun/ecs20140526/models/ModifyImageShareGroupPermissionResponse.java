// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImageShareGroupPermissionResponse} extends {@link TeaModel}
 *
 * <p>ModifyImageShareGroupPermissionResponse</p>
 */
public class ModifyImageShareGroupPermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyImageShareGroupPermissionResponseBody body;

    private ModifyImageShareGroupPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyImageShareGroupPermissionResponse create() {
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
    public ModifyImageShareGroupPermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyImageShareGroupPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyImageShareGroupPermissionResponseBody body);

        @Override
        ModifyImageShareGroupPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyImageShareGroupPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyImageShareGroupPermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyImageShareGroupPermissionResponse response) {
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
        public Builder body(ModifyImageShareGroupPermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyImageShareGroupPermissionResponse build() {
            return new ModifyImageShareGroupPermissionResponse(this);
        } 

    } 

}
