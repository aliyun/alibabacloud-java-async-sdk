// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListUserGroupsResponse</p>
 */
public class ListUserGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserGroupsResponseBody body;

    private ListUserGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserGroupsResponse create() {
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
    public ListUserGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserGroupsResponseBody body);

        @Override
        ListUserGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserGroupsResponse response) {
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
        public Builder body(ListUserGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserGroupsResponse build() {
            return new ListUserGroupsResponse(this);
        } 

    } 

}
