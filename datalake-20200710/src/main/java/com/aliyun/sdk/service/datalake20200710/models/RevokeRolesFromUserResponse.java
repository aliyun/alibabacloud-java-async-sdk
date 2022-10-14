// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeRolesFromUserResponse} extends {@link TeaModel}
 *
 * <p>RevokeRolesFromUserResponse</p>
 */
public class RevokeRolesFromUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeRolesFromUserResponseBody body;

    private RevokeRolesFromUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeRolesFromUserResponse create() {
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
    public RevokeRolesFromUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeRolesFromUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeRolesFromUserResponseBody body);

        @Override
        RevokeRolesFromUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeRolesFromUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeRolesFromUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeRolesFromUserResponse response) {
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
        public Builder body(RevokeRolesFromUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeRolesFromUserResponse build() {
            return new RevokeRolesFromUserResponse(this);
        } 

    } 

}
