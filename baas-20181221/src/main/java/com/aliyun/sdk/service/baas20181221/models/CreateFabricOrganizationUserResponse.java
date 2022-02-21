// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricOrganizationUserResponse} extends {@link TeaModel}
 *
 * <p>CreateFabricOrganizationUserResponse</p>
 */
public class CreateFabricOrganizationUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFabricOrganizationUserResponseBody body;

    private CreateFabricOrganizationUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFabricOrganizationUserResponse create() {
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
    public CreateFabricOrganizationUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFabricOrganizationUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFabricOrganizationUserResponseBody body);

        @Override
        CreateFabricOrganizationUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFabricOrganizationUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFabricOrganizationUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFabricOrganizationUserResponse response) {
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
        public Builder body(CreateFabricOrganizationUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFabricOrganizationUserResponse build() {
            return new CreateFabricOrganizationUserResponse(this);
        } 

    } 

}
