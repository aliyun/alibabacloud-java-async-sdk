// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserGroupMemberResponse} extends {@link TeaModel}
 *
 * <p>AddUserGroupMemberResponse</p>
 */
public class AddUserGroupMemberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddUserGroupMemberResponseBody body;

    private AddUserGroupMemberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddUserGroupMemberResponse create() {
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
    public AddUserGroupMemberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddUserGroupMemberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddUserGroupMemberResponseBody body);

        @Override
        AddUserGroupMemberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddUserGroupMemberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddUserGroupMemberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddUserGroupMemberResponse response) {
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
        public Builder body(AddUserGroupMemberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddUserGroupMemberResponse build() {
            return new AddUserGroupMemberResponse(this);
        } 

    } 

}
