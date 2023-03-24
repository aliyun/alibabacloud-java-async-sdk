// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPolicesForUserGroupResponse} extends {@link TeaModel}
 *
 * <p>ListPolicesForUserGroupResponse</p>
 */
public class ListPolicesForUserGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPolicesForUserGroupResponseBody body;

    private ListPolicesForUserGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPolicesForUserGroupResponse create() {
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
    public ListPolicesForUserGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPolicesForUserGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPolicesForUserGroupResponseBody body);

        @Override
        ListPolicesForUserGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPolicesForUserGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPolicesForUserGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPolicesForUserGroupResponse response) {
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
        public Builder body(ListPolicesForUserGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPolicesForUserGroupResponse build() {
            return new ListPolicesForUserGroupResponse(this);
        } 

    } 

}
