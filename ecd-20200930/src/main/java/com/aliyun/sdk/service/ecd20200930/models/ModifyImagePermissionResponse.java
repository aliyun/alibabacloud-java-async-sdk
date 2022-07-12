// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyImagePermissionResponse} extends {@link TeaModel}
 *
 * <p>ModifyImagePermissionResponse</p>
 */
public class ModifyImagePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyImagePermissionResponseBody body;

    private ModifyImagePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyImagePermissionResponse create() {
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
    public ModifyImagePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyImagePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyImagePermissionResponseBody body);

        @Override
        ModifyImagePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyImagePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyImagePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyImagePermissionResponse response) {
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
        public Builder body(ModifyImagePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyImagePermissionResponse build() {
            return new ModifyImagePermissionResponse(this);
        } 

    } 

}
