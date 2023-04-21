// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCdsFileShareLinkResponse} extends {@link TeaModel}
 *
 * <p>ModifyCdsFileShareLinkResponse</p>
 */
public class ModifyCdsFileShareLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyCdsFileShareLinkResponseBody body;

    private ModifyCdsFileShareLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyCdsFileShareLinkResponse create() {
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
    public ModifyCdsFileShareLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyCdsFileShareLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyCdsFileShareLinkResponseBody body);

        @Override
        ModifyCdsFileShareLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyCdsFileShareLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyCdsFileShareLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyCdsFileShareLinkResponse response) {
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
        public Builder body(ModifyCdsFileShareLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyCdsFileShareLinkResponse build() {
            return new ModifyCdsFileShareLinkResponse(this);
        } 

    } 

}
