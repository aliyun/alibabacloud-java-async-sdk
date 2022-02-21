// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackendResponse} extends {@link TeaModel}
 *
 * <p>ModifyBackendResponse</p>
 */
public class ModifyBackendResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyBackendResponseBody body;

    private ModifyBackendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyBackendResponse create() {
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
    public ModifyBackendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyBackendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyBackendResponseBody body);

        @Override
        ModifyBackendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyBackendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyBackendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyBackendResponse response) {
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
        public Builder body(ModifyBackendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyBackendResponse build() {
            return new ModifyBackendResponse(this);
        } 

    } 

}
