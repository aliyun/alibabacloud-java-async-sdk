// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySmbAclResponse} extends {@link TeaModel}
 *
 * <p>ModifySmbAclResponse</p>
 */
public class ModifySmbAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySmbAclResponseBody body;

    private ModifySmbAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySmbAclResponse create() {
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
    public ModifySmbAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySmbAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySmbAclResponseBody body);

        @Override
        ModifySmbAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySmbAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySmbAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySmbAclResponse response) {
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
        public Builder body(ModifySmbAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySmbAclResponse build() {
            return new ModifySmbAclResponse(this);
        } 

    } 

}
