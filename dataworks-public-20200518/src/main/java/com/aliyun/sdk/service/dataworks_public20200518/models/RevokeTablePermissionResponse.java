// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeTablePermissionResponse} extends {@link TeaModel}
 *
 * <p>RevokeTablePermissionResponse</p>
 */
public class RevokeTablePermissionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeTablePermissionResponseBody body;

    private RevokeTablePermissionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeTablePermissionResponse create() {
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
    public RevokeTablePermissionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeTablePermissionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeTablePermissionResponseBody body);

        @Override
        RevokeTablePermissionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeTablePermissionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeTablePermissionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeTablePermissionResponse response) {
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
        public Builder body(RevokeTablePermissionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeTablePermissionResponse build() {
            return new RevokeTablePermissionResponse(this);
        } 

    } 

}
