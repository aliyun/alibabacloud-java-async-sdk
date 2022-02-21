// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDevopsProjectMembersResponse} extends {@link TeaModel}
 *
 * <p>DeleteDevopsProjectMembersResponse</p>
 */
public class DeleteDevopsProjectMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDevopsProjectMembersResponseBody body;

    private DeleteDevopsProjectMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDevopsProjectMembersResponse create() {
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
    public DeleteDevopsProjectMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDevopsProjectMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDevopsProjectMembersResponseBody body);

        @Override
        DeleteDevopsProjectMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDevopsProjectMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDevopsProjectMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDevopsProjectMembersResponse response) {
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
        public Builder body(DeleteDevopsProjectMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDevopsProjectMembersResponse build() {
            return new DeleteDevopsProjectMembersResponse(this);
        } 

    } 

}
