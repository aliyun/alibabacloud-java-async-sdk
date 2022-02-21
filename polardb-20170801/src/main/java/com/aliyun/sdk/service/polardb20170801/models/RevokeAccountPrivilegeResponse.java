// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeAccountPrivilegeResponse} extends {@link TeaModel}
 *
 * <p>RevokeAccountPrivilegeResponse</p>
 */
public class RevokeAccountPrivilegeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeAccountPrivilegeResponseBody body;

    private RevokeAccountPrivilegeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeAccountPrivilegeResponse create() {
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
    public RevokeAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeAccountPrivilegeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeAccountPrivilegeResponseBody body);

        @Override
        RevokeAccountPrivilegeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeAccountPrivilegeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeAccountPrivilegeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeAccountPrivilegeResponse response) {
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
        public Builder body(RevokeAccountPrivilegeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeAccountPrivilegeResponse build() {
            return new RevokeAccountPrivilegeResponse(this);
        } 

    } 

}
