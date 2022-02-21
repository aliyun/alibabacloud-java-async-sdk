// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterOperationResponse} extends {@link TeaModel}
 *
 * <p>ListClusterOperationResponse</p>
 */
public class ListClusterOperationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterOperationResponseBody body;

    private ListClusterOperationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterOperationResponse create() {
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
    public ListClusterOperationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterOperationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterOperationResponseBody body);

        @Override
        ListClusterOperationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterOperationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterOperationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterOperationResponse response) {
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
        public Builder body(ListClusterOperationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterOperationResponse build() {
            return new ListClusterOperationResponse(this);
        } 

    } 

}
