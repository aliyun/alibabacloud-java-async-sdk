// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListStackGroupsResponse</p>
 */
public class ListStackGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStackGroupsResponseBody body;

    private ListStackGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStackGroupsResponse create() {
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
    public ListStackGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStackGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStackGroupsResponseBody body);

        @Override
        ListStackGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStackGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStackGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStackGroupsResponse response) {
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
        public Builder body(ListStackGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStackGroupsResponse build() {
            return new ListStackGroupsResponse(this);
        } 

    } 

}
