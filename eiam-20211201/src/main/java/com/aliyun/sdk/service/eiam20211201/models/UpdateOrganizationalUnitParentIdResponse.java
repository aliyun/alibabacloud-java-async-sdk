// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateOrganizationalUnitParentIdResponse} extends {@link TeaModel}
 *
 * <p>UpdateOrganizationalUnitParentIdResponse</p>
 */
public class UpdateOrganizationalUnitParentIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateOrganizationalUnitParentIdResponseBody body;

    private UpdateOrganizationalUnitParentIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateOrganizationalUnitParentIdResponse create() {
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
    public UpdateOrganizationalUnitParentIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateOrganizationalUnitParentIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateOrganizationalUnitParentIdResponseBody body);

        @Override
        UpdateOrganizationalUnitParentIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateOrganizationalUnitParentIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateOrganizationalUnitParentIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateOrganizationalUnitParentIdResponse response) {
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
        public Builder body(UpdateOrganizationalUnitParentIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateOrganizationalUnitParentIdResponse build() {
            return new UpdateOrganizationalUnitParentIdResponse(this);
        } 

    } 

}
