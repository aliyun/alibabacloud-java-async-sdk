// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostGroupsForUserGroupResponse} extends {@link TeaModel}
 *
 * <p>ListHostGroupsForUserGroupResponse</p>
 */
public class ListHostGroupsForUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostGroupsForUserGroupResponseBody body;

    private ListHostGroupsForUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHostGroupsForUserGroupResponse create() {
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
    public ListHostGroupsForUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHostGroupsForUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHostGroupsForUserGroupResponseBody body);

        @Override
        ListHostGroupsForUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHostGroupsForUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHostGroupsForUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHostGroupsForUserGroupResponse response) {
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
        public Builder body(ListHostGroupsForUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHostGroupsForUserGroupResponse build() {
            return new ListHostGroupsForUserGroupResponse(this);
        } 

    } 

}
