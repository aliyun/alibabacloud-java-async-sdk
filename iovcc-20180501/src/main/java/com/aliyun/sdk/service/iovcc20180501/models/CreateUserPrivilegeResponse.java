// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserPrivilegeResponse} extends {@link TeaModel}
 *
 * <p>CreateUserPrivilegeResponse</p>
 */
public class CreateUserPrivilegeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUserPrivilegeResponseBody body;

    private CreateUserPrivilegeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUserPrivilegeResponse create() {
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
    public CreateUserPrivilegeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserPrivilegeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUserPrivilegeResponseBody body);

        @Override
        CreateUserPrivilegeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserPrivilegeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUserPrivilegeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserPrivilegeResponse response) {
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
        public Builder body(CreateUserPrivilegeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserPrivilegeResponse build() {
            return new CreateUserPrivilegeResponse(this);
        } 

    } 

}
