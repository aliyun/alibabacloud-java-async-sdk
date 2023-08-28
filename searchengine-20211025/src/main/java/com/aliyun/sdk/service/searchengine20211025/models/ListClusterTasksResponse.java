// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterTasksResponse} extends {@link TeaModel}
 *
 * <p>ListClusterTasksResponse</p>
 */
public class ListClusterTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterTasksResponseBody body;

    private ListClusterTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterTasksResponse create() {
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
    public ListClusterTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterTasksResponseBody body);

        @Override
        ListClusterTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterTasksResponse response) {
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
        public Builder body(ListClusterTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterTasksResponse build() {
            return new ListClusterTasksResponse(this);
        } 

    } 

}
