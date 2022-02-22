// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListGroupsResponse</p>
 */
public class ListGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListGroupsResponseBody body;

    private ListGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListGroupsResponse create() {
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
    public ListGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListGroupsResponseBody body);

        @Override
        ListGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListGroupsResponse response) {
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
        public Builder body(ListGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListGroupsResponse build() {
            return new ListGroupsResponse(this);
        } 

    } 

}
