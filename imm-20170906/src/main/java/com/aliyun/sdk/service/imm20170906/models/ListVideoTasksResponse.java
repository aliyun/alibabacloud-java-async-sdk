// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVideoTasksResponse} extends {@link TeaModel}
 *
 * <p>ListVideoTasksResponse</p>
 */
public class ListVideoTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVideoTasksResponseBody body;

    private ListVideoTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVideoTasksResponse create() {
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
    public ListVideoTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVideoTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVideoTasksResponseBody body);

        @Override
        ListVideoTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVideoTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVideoTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVideoTasksResponse response) {
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
        public Builder body(ListVideoTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVideoTasksResponse build() {
            return new ListVideoTasksResponse(this);
        } 

    } 

}
