// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFileSystemResponse} extends {@link TeaModel}
 *
 * <p>ModifyFileSystemResponse</p>
 */
public class ModifyFileSystemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFileSystemResponseBody body;

    private ModifyFileSystemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFileSystemResponse create() {
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
    public ModifyFileSystemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFileSystemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFileSystemResponseBody body);

        @Override
        ModifyFileSystemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFileSystemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFileSystemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFileSystemResponse response) {
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
        public Builder body(ModifyFileSystemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFileSystemResponse build() {
            return new ModifyFileSystemResponse(this);
        } 

    } 

}
