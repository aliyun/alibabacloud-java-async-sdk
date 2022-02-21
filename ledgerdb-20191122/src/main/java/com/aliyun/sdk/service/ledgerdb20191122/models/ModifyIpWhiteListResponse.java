// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpWhiteListResponse} extends {@link TeaModel}
 *
 * <p>ModifyIpWhiteListResponse</p>
 */
public class ModifyIpWhiteListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIpWhiteListResponseBody body;

    private ModifyIpWhiteListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIpWhiteListResponse create() {
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
    public ModifyIpWhiteListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIpWhiteListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIpWhiteListResponseBody body);

        @Override
        ModifyIpWhiteListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIpWhiteListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIpWhiteListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIpWhiteListResponse response) {
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
        public Builder body(ModifyIpWhiteListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIpWhiteListResponse build() {
            return new ModifyIpWhiteListResponse(this);
        } 

    } 

}
