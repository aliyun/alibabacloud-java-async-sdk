// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAckClustersResponse} extends {@link TeaModel}
 *
 * <p>ListAckClustersResponse</p>
 */
public class ListAckClustersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAckClustersResponseBody body;

    private ListAckClustersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAckClustersResponse create() {
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
    public ListAckClustersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAckClustersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAckClustersResponseBody body);

        @Override
        ListAckClustersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAckClustersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAckClustersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAckClustersResponse response) {
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
        public Builder body(ListAckClustersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAckClustersResponse build() {
            return new ListAckClustersResponse(this);
        } 

    } 

}
