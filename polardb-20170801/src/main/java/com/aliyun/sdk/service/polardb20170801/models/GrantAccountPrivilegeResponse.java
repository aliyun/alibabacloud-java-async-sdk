// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantAccountPrivilegeResponse} extends {@link TeaModel}
 *
 * <p>GrantAccountPrivilegeResponse</p>
 */
public class GrantAccountPrivilegeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GrantAccountPrivilegeResponseBody body;

    private GrantAccountPrivilegeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GrantAccountPrivilegeResponse create() {
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
    public GrantAccountPrivilegeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantAccountPrivilegeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GrantAccountPrivilegeResponseBody body);

        @Override
        GrantAccountPrivilegeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantAccountPrivilegeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GrantAccountPrivilegeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantAccountPrivilegeResponse response) {
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
        public Builder body(GrantAccountPrivilegeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantAccountPrivilegeResponse build() {
            return new GrantAccountPrivilegeResponse(this);
        } 

    } 

}
