// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterOperationHostResponse} extends {@link TeaModel}
 *
 * <p>ListClusterOperationHostResponse</p>
 */
public class ListClusterOperationHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterOperationHostResponseBody body;

    private ListClusterOperationHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterOperationHostResponse create() {
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
    public ListClusterOperationHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterOperationHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterOperationHostResponseBody body);

        @Override
        ListClusterOperationHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterOperationHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterOperationHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterOperationHostResponse response) {
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
        public Builder body(ListClusterOperationHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterOperationHostResponse build() {
            return new ListClusterOperationHostResponse(this);
        } 

    } 

}
