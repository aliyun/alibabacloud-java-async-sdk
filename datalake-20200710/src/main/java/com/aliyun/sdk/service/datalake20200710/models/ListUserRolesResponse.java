// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserRolesResponse} extends {@link TeaModel}
 *
 * <p>ListUserRolesResponse</p>
 */
public class ListUserRolesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserRolesResponseBody body;

    private ListUserRolesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserRolesResponse create() {
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
    public ListUserRolesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserRolesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserRolesResponseBody body);

        @Override
        ListUserRolesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserRolesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserRolesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserRolesResponse response) {
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
        public Builder body(ListUserRolesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserRolesResponse build() {
            return new ListUserRolesResponse(this);
        } 

    } 

}
