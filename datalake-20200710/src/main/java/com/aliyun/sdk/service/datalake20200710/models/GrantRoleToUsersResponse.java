// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantRoleToUsersResponse} extends {@link TeaModel}
 *
 * <p>GrantRoleToUsersResponse</p>
 */
public class GrantRoleToUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GrantRoleToUsersResponseBody body;

    private GrantRoleToUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GrantRoleToUsersResponse create() {
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
    public GrantRoleToUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GrantRoleToUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GrantRoleToUsersResponseBody body);

        @Override
        GrantRoleToUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GrantRoleToUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GrantRoleToUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GrantRoleToUsersResponse response) {
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
        public Builder body(GrantRoleToUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GrantRoleToUsersResponse build() {
            return new GrantRoleToUsersResponse(this);
        } 

    } 

}
