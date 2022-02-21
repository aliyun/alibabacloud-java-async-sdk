// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListAppGroupsResponse</p>
 */
public class ListAppGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAppGroupsResponseBody body;

    private ListAppGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAppGroupsResponse create() {
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
    public ListAppGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAppGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAppGroupsResponseBody body);

        @Override
        ListAppGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAppGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAppGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAppGroupsResponse response) {
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
        public Builder body(ListAppGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAppGroupsResponse build() {
            return new ListAppGroupsResponse(this);
        } 

    } 

}
