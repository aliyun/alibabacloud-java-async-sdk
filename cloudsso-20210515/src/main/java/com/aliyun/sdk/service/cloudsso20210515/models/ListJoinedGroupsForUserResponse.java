// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJoinedGroupsForUserResponse} extends {@link TeaModel}
 *
 * <p>ListJoinedGroupsForUserResponse</p>
 */
public class ListJoinedGroupsForUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListJoinedGroupsForUserResponseBody body;

    private ListJoinedGroupsForUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListJoinedGroupsForUserResponse create() {
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
    public ListJoinedGroupsForUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListJoinedGroupsForUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListJoinedGroupsForUserResponseBody body);

        @Override
        ListJoinedGroupsForUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListJoinedGroupsForUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListJoinedGroupsForUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListJoinedGroupsForUserResponse response) {
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
        public Builder body(ListJoinedGroupsForUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListJoinedGroupsForUserResponse build() {
            return new ListJoinedGroupsForUserResponse(this);
        } 

    } 

}
