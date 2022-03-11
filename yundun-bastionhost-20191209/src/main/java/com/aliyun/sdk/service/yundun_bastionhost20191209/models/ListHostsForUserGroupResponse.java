// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostsForUserGroupResponse} extends {@link TeaModel}
 *
 * <p>ListHostsForUserGroupResponse</p>
 */
public class ListHostsForUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostsForUserGroupResponseBody body;

    private ListHostsForUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHostsForUserGroupResponse create() {
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
    public ListHostsForUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHostsForUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHostsForUserGroupResponseBody body);

        @Override
        ListHostsForUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHostsForUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHostsForUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHostsForUserGroupResponse response) {
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
        public Builder body(ListHostsForUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHostsForUserGroupResponse build() {
            return new ListHostsForUserGroupResponse(this);
        } 

    } 

}
