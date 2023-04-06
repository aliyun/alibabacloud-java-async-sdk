// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveUserFromOrganizationalUnitsResponse} extends {@link TeaModel}
 *
 * <p>RemoveUserFromOrganizationalUnitsResponse</p>
 */
public class RemoveUserFromOrganizationalUnitsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveUserFromOrganizationalUnitsResponseBody body;

    private RemoveUserFromOrganizationalUnitsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveUserFromOrganizationalUnitsResponse create() {
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
    public RemoveUserFromOrganizationalUnitsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveUserFromOrganizationalUnitsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveUserFromOrganizationalUnitsResponseBody body);

        @Override
        RemoveUserFromOrganizationalUnitsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveUserFromOrganizationalUnitsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveUserFromOrganizationalUnitsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveUserFromOrganizationalUnitsResponse response) {
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
        public Builder body(RemoveUserFromOrganizationalUnitsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveUserFromOrganizationalUnitsResponse build() {
            return new RemoveUserFromOrganizationalUnitsResponse(this);
        } 

    } 

}
