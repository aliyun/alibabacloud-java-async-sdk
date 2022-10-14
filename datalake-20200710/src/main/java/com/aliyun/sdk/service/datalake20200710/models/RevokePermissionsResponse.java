// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokePermissionsResponse} extends {@link TeaModel}
 *
 * <p>RevokePermissionsResponse</p>
 */
public class RevokePermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokePermissionsResponseBody body;

    private RevokePermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokePermissionsResponse create() {
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
    public RevokePermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokePermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokePermissionsResponseBody body);

        @Override
        RevokePermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokePermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokePermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokePermissionsResponse response) {
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
        public Builder body(RevokePermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokePermissionsResponse build() {
            return new RevokePermissionsResponse(this);
        } 

    } 

}
