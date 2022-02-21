// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionTasksResponse} extends {@link TeaModel}
 *
 * <p>ListFunctionTasksResponse</p>
 */
public class ListFunctionTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFunctionTasksResponseBody body;

    private ListFunctionTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFunctionTasksResponse create() {
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
    public ListFunctionTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFunctionTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFunctionTasksResponseBody body);

        @Override
        ListFunctionTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFunctionTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFunctionTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFunctionTasksResponse response) {
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
        public Builder body(ListFunctionTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFunctionTasksResponse build() {
            return new ListFunctionTasksResponse(this);
        } 

    } 

}
