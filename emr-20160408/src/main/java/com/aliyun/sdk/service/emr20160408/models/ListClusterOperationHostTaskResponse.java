// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterOperationHostTaskResponse} extends {@link TeaModel}
 *
 * <p>ListClusterOperationHostTaskResponse</p>
 */
public class ListClusterOperationHostTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterOperationHostTaskResponseBody body;

    private ListClusterOperationHostTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterOperationHostTaskResponse create() {
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
    public ListClusterOperationHostTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterOperationHostTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterOperationHostTaskResponseBody body);

        @Override
        ListClusterOperationHostTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterOperationHostTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterOperationHostTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterOperationHostTaskResponse response) {
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
        public Builder body(ListClusterOperationHostTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterOperationHostTaskResponse build() {
            return new ListClusterOperationHostTaskResponse(this);
        } 

    } 

}
