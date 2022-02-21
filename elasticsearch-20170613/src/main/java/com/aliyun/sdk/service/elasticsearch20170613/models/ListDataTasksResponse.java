// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataTasksResponse} extends {@link TeaModel}
 *
 * <p>ListDataTasksResponse</p>
 */
public class ListDataTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDataTasksResponseBody body;

    private ListDataTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDataTasksResponse create() {
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
    public ListDataTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDataTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDataTasksResponseBody body);

        @Override
        ListDataTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDataTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDataTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDataTasksResponse response) {
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
        public Builder body(ListDataTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDataTasksResponse build() {
            return new ListDataTasksResponse(this);
        } 

    } 

}
