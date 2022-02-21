// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMemberKeyResponse} extends {@link TeaModel}
 *
 * <p>ModifyMemberKeyResponse</p>
 */
public class ModifyMemberKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMemberKeyResponseBody body;

    private ModifyMemberKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMemberKeyResponse create() {
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
    public ModifyMemberKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMemberKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMemberKeyResponseBody body);

        @Override
        ModifyMemberKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMemberKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMemberKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMemberKeyResponse response) {
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
        public Builder body(ModifyMemberKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMemberKeyResponse build() {
            return new ModifyMemberKeyResponse(this);
        } 

    } 

}
