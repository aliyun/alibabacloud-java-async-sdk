// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListABTestGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListABTestGroupsResponse</p>
 */
public class ListABTestGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListABTestGroupsResponseBody body;

    private ListABTestGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListABTestGroupsResponse create() {
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
    public ListABTestGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListABTestGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListABTestGroupsResponseBody body);

        @Override
        ListABTestGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListABTestGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListABTestGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListABTestGroupsResponse response) {
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
        public Builder body(ListABTestGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListABTestGroupsResponse build() {
            return new ListABTestGroupsResponse(this);
        } 

    } 

}
