// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeUserPermissionResponse} extends {@link TeaModel}
 *
 * <p>RevokeUserPermissionResponse</p>
 */
public class RevokeUserPermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeUserPermissionResponseBody body;

    private RevokeUserPermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeUserPermissionResponse create() {
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
    public RevokeUserPermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeUserPermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeUserPermissionResponseBody body);

        @Override
        RevokeUserPermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeUserPermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeUserPermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeUserPermissionResponse response) {
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
        public Builder body(RevokeUserPermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeUserPermissionResponse build() {
            return new RevokeUserPermissionResponse(this);
        } 

    } 

}
