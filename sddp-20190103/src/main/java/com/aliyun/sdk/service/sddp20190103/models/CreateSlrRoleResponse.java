// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlrRoleResponse} extends {@link TeaModel}
 *
 * <p>CreateSlrRoleResponse</p>
 */
public class CreateSlrRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSlrRoleResponseBody body;

    private CreateSlrRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSlrRoleResponse create() {
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
    public CreateSlrRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSlrRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSlrRoleResponseBody body);

        @Override
        CreateSlrRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSlrRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSlrRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSlrRoleResponse response) {
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
        public Builder body(CreateSlrRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSlrRoleResponse build() {
            return new CreateSlrRoleResponse(this);
        } 

    } 

}
