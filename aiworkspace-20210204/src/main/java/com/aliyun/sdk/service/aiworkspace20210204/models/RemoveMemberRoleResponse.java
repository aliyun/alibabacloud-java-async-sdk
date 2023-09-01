// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveMemberRoleResponse} extends {@link TeaModel}
 *
 * <p>RemoveMemberRoleResponse</p>
 */
public class RemoveMemberRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveMemberRoleResponseBody body;

    private RemoveMemberRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveMemberRoleResponse create() {
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
    public RemoveMemberRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveMemberRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveMemberRoleResponseBody body);

        @Override
        RemoveMemberRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveMemberRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveMemberRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveMemberRoleResponse response) {
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
        public Builder body(RemoveMemberRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveMemberRoleResponse build() {
            return new RemoveMemberRoleResponse(this);
        } 

    } 

}
