// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeCoordinatePrivilegeResponse} extends {@link TeaModel}
 *
 * <p>RevokeCoordinatePrivilegeResponse</p>
 */
public class RevokeCoordinatePrivilegeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeCoordinatePrivilegeResponseBody body;

    private RevokeCoordinatePrivilegeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeCoordinatePrivilegeResponse create() {
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
    public RevokeCoordinatePrivilegeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeCoordinatePrivilegeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeCoordinatePrivilegeResponseBody body);

        @Override
        RevokeCoordinatePrivilegeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeCoordinatePrivilegeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeCoordinatePrivilegeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeCoordinatePrivilegeResponse response) {
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
        public Builder body(RevokeCoordinatePrivilegeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeCoordinatePrivilegeResponse build() {
            return new RevokeCoordinatePrivilegeResponse(this);
        } 

    } 

}
