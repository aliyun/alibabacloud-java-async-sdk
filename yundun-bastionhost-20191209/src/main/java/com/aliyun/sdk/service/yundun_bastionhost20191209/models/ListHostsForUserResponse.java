// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostsForUserResponse} extends {@link TeaModel}
 *
 * <p>ListHostsForUserResponse</p>
 */
public class ListHostsForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostsForUserResponseBody body;

    private ListHostsForUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHostsForUserResponse create() {
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
    public ListHostsForUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHostsForUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHostsForUserResponseBody body);

        @Override
        ListHostsForUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHostsForUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHostsForUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHostsForUserResponse response) {
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
        public Builder body(ListHostsForUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHostsForUserResponse build() {
            return new ListHostsForUserResponse(this);
        } 

    } 

}
