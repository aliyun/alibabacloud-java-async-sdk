// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserVpcAuthorizationResponse} extends {@link TeaModel}
 *
 * <p>AddUserVpcAuthorizationResponse</p>
 */
public class AddUserVpcAuthorizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUserVpcAuthorizationResponseBody body;

    private AddUserVpcAuthorizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUserVpcAuthorizationResponse create() {
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
    public AddUserVpcAuthorizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUserVpcAuthorizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUserVpcAuthorizationResponseBody body);

        @Override
        AddUserVpcAuthorizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUserVpcAuthorizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUserVpcAuthorizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUserVpcAuthorizationResponse response) {
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
        public Builder body(AddUserVpcAuthorizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUserVpcAuthorizationResponse build() {
            return new AddUserVpcAuthorizationResponse(this);
        } 

    } 

}
