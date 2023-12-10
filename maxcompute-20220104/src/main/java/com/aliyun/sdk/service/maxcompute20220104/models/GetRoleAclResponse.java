// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleAclResponse} extends {@link TeaModel}
 *
 * <p>GetRoleAclResponse</p>
 */
public class GetRoleAclResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRoleAclResponseBody body;

    private GetRoleAclResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRoleAclResponse create() {
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
    public GetRoleAclResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRoleAclResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRoleAclResponseBody body);

        @Override
        GetRoleAclResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRoleAclResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRoleAclResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRoleAclResponse response) {
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
        public Builder body(GetRoleAclResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRoleAclResponse build() {
            return new GetRoleAclResponse(this);
        } 

    } 

}
