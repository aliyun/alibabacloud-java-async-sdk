// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeOperatorPermissionResponse} extends {@link TeaModel}
 *
 * <p>RevokeOperatorPermissionResponse</p>
 */
public class RevokeOperatorPermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeOperatorPermissionResponseBody body;

    private RevokeOperatorPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeOperatorPermissionResponse create() {
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
    public RevokeOperatorPermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeOperatorPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeOperatorPermissionResponseBody body);

        @Override
        RevokeOperatorPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeOperatorPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeOperatorPermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeOperatorPermissionResponse response) {
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
        public Builder body(RevokeOperatorPermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeOperatorPermissionResponse build() {
            return new RevokeOperatorPermissionResponse(this);
        } 

    } 

}
