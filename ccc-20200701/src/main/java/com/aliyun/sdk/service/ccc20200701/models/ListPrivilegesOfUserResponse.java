// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrivilegesOfUserResponse} extends {@link TeaModel}
 *
 * <p>ListPrivilegesOfUserResponse</p>
 */
public class ListPrivilegesOfUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPrivilegesOfUserResponseBody body;

    private ListPrivilegesOfUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPrivilegesOfUserResponse create() {
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
    public ListPrivilegesOfUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPrivilegesOfUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPrivilegesOfUserResponseBody body);

        @Override
        ListPrivilegesOfUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPrivilegesOfUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPrivilegesOfUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPrivilegesOfUserResponse response) {
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
        public Builder body(ListPrivilegesOfUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPrivilegesOfUserResponse build() {
            return new ListPrivilegesOfUserResponse(this);
        } 

    } 

}
