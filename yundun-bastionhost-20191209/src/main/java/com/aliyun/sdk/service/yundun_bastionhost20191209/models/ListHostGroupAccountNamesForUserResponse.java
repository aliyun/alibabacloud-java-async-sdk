// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostGroupAccountNamesForUserResponse} extends {@link TeaModel}
 *
 * <p>ListHostGroupAccountNamesForUserResponse</p>
 */
public class ListHostGroupAccountNamesForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostGroupAccountNamesForUserResponseBody body;

    private ListHostGroupAccountNamesForUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHostGroupAccountNamesForUserResponse create() {
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
    public ListHostGroupAccountNamesForUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHostGroupAccountNamesForUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHostGroupAccountNamesForUserResponseBody body);

        @Override
        ListHostGroupAccountNamesForUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHostGroupAccountNamesForUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHostGroupAccountNamesForUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHostGroupAccountNamesForUserResponse response) {
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
        public Builder body(ListHostGroupAccountNamesForUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHostGroupAccountNamesForUserResponse build() {
            return new ListHostGroupAccountNamesForUserResponse(this);
        } 

    } 

}
