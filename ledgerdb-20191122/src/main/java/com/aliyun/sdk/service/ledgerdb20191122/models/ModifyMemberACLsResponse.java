// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMemberACLsResponse} extends {@link TeaModel}
 *
 * <p>ModifyMemberACLsResponse</p>
 */
public class ModifyMemberACLsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMemberACLsResponseBody body;

    private ModifyMemberACLsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMemberACLsResponse create() {
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
    public ModifyMemberACLsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMemberACLsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMemberACLsResponseBody body);

        @Override
        ModifyMemberACLsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMemberACLsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMemberACLsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMemberACLsResponse response) {
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
        public Builder body(ModifyMemberACLsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMemberACLsResponse build() {
            return new ModifyMemberACLsResponse(this);
        } 

    } 

}
