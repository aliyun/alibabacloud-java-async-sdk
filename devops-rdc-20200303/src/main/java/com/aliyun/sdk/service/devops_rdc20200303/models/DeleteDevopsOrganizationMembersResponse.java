// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevopsOrganizationMembersResponse} extends {@link TeaModel}
 *
 * <p>DeleteDevopsOrganizationMembersResponse</p>
 */
public class DeleteDevopsOrganizationMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDevopsOrganizationMembersResponseBody body;

    private DeleteDevopsOrganizationMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDevopsOrganizationMembersResponse create() {
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
    public DeleteDevopsOrganizationMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDevopsOrganizationMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDevopsOrganizationMembersResponseBody body);

        @Override
        DeleteDevopsOrganizationMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDevopsOrganizationMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDevopsOrganizationMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDevopsOrganizationMembersResponse response) {
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
        public Builder body(DeleteDevopsOrganizationMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDevopsOrganizationMembersResponse build() {
            return new DeleteDevopsOrganizationMembersResponse(this);
        } 

    } 

}
