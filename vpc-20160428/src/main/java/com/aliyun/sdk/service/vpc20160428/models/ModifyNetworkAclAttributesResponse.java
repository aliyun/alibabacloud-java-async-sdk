// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkAclAttributesResponse} extends {@link TeaModel}
 *
 * <p>ModifyNetworkAclAttributesResponse</p>
 */
public class ModifyNetworkAclAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNetworkAclAttributesResponseBody body;

    private ModifyNetworkAclAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNetworkAclAttributesResponse create() {
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
    public ModifyNetworkAclAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNetworkAclAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNetworkAclAttributesResponseBody body);

        @Override
        ModifyNetworkAclAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNetworkAclAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNetworkAclAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNetworkAclAttributesResponse response) {
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
        public Builder body(ModifyNetworkAclAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNetworkAclAttributesResponse build() {
            return new ModifyNetworkAclAttributesResponse(this);
        } 

    } 

}
