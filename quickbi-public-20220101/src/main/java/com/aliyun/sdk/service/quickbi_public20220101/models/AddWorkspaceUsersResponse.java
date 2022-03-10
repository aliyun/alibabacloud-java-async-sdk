// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWorkspaceUsersResponse} extends {@link TeaModel}
 *
 * <p>AddWorkspaceUsersResponse</p>
 */
public class AddWorkspaceUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddWorkspaceUsersResponseBody body;

    private AddWorkspaceUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddWorkspaceUsersResponse create() {
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
    public AddWorkspaceUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddWorkspaceUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddWorkspaceUsersResponseBody body);

        @Override
        AddWorkspaceUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddWorkspaceUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddWorkspaceUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddWorkspaceUsersResponse response) {
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
        public Builder body(AddWorkspaceUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddWorkspaceUsersResponse build() {
            return new AddWorkspaceUsersResponse(this);
        } 

    } 

}
