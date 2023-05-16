// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link AddUserToOrganizationalUnitsResponse} extends {@link TeaModel}
 *
 * <p>AddUserToOrganizationalUnitsResponse</p>
 */
public class AddUserToOrganizationalUnitsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private AddUserToOrganizationalUnitsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static AddUserToOrganizationalUnitsResponse create() {
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

    public interface Builder extends Response.Builder<AddUserToOrganizationalUnitsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        AddUserToOrganizationalUnitsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUserToOrganizationalUnitsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUserToOrganizationalUnitsResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public AddUserToOrganizationalUnitsResponse build() {
            return new AddUserToOrganizationalUnitsResponse(this);
        } 

    } 

}
