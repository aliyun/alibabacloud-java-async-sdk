// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterHealthCheckTaskResponse} extends {@link TeaModel}
 *
 * <p>ListClusterHealthCheckTaskResponse</p>
 */
public class ListClusterHealthCheckTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterHealthCheckTaskResponseBody body;

    private ListClusterHealthCheckTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterHealthCheckTaskResponse create() {
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
    public ListClusterHealthCheckTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterHealthCheckTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterHealthCheckTaskResponseBody body);

        @Override
        ListClusterHealthCheckTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterHealthCheckTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterHealthCheckTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterHealthCheckTaskResponse response) {
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
        public Builder body(ListClusterHealthCheckTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterHealthCheckTaskResponse build() {
            return new ListClusterHealthCheckTaskResponse(this);
        } 

    } 

}
