// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkerInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListWorkerInstancesResponse</p>
 */
public class ListWorkerInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkerInstancesResponseBody body;

    private ListWorkerInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkerInstancesResponse create() {
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
    public ListWorkerInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkerInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkerInstancesResponseBody body);

        @Override
        ListWorkerInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkerInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkerInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkerInstancesResponse response) {
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
        public Builder body(ListWorkerInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkerInstancesResponse build() {
            return new ListWorkerInstancesResponse(this);
        } 

    } 

}
