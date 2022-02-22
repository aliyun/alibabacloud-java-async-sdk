// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupMembersResponse} extends {@link TeaModel}
 *
 * <p>ListGroupMembersResponse</p>
 */
public class ListGroupMembersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGroupMembersResponseBody body;

    private ListGroupMembersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGroupMembersResponse create() {
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
    public ListGroupMembersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGroupMembersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGroupMembersResponseBody body);

        @Override
        ListGroupMembersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGroupMembersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGroupMembersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGroupMembersResponse response) {
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
        public Builder body(ListGroupMembersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGroupMembersResponse build() {
            return new ListGroupMembersResponse(this);
        } 

    } 

}
