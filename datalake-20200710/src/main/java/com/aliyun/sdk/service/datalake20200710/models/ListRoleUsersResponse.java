// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoleUsersResponse} extends {@link TeaModel}
 *
 * <p>ListRoleUsersResponse</p>
 */
public class ListRoleUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRoleUsersResponseBody body;

    private ListRoleUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRoleUsersResponse create() {
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
    public ListRoleUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRoleUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRoleUsersResponseBody body);

        @Override
        ListRoleUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRoleUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRoleUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRoleUsersResponse response) {
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
        public Builder body(ListRoleUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRoleUsersResponse build() {
            return new ListRoleUsersResponse(this);
        } 

    } 

}
