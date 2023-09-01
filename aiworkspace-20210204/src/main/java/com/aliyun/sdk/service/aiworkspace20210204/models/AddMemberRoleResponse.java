// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMemberRoleResponse} extends {@link TeaModel}
 *
 * <p>AddMemberRoleResponse</p>
 */
public class AddMemberRoleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMemberRoleResponseBody body;

    private AddMemberRoleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMemberRoleResponse create() {
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
    public AddMemberRoleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMemberRoleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMemberRoleResponseBody body);

        @Override
        AddMemberRoleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMemberRoleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMemberRoleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMemberRoleResponse response) {
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
        public Builder body(AddMemberRoleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMemberRoleResponse build() {
            return new AddMemberRoleResponse(this);
        } 

    } 

}
