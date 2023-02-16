// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagResourcesResponse} extends {@link TeaModel}
 *
 * <p>ListTagResourcesResponse</p>
 */
public class ListTagResourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTagResourcesResponseBody body;

    private ListTagResourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTagResourcesResponse create() {
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
    public ListTagResourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTagResourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTagResourcesResponseBody body);

        @Override
        ListTagResourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTagResourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTagResourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTagResourcesResponse response) {
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
        public Builder body(ListTagResourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTagResourcesResponse build() {
            return new ListTagResourcesResponse(this);
        } 

    } 

}
