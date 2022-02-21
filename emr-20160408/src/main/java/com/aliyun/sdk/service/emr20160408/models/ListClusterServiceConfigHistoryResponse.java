// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceConfigHistoryResponse} extends {@link TeaModel}
 *
 * <p>ListClusterServiceConfigHistoryResponse</p>
 */
public class ListClusterServiceConfigHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterServiceConfigHistoryResponseBody body;

    private ListClusterServiceConfigHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterServiceConfigHistoryResponse create() {
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
    public ListClusterServiceConfigHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterServiceConfigHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterServiceConfigHistoryResponseBody body);

        @Override
        ListClusterServiceConfigHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterServiceConfigHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterServiceConfigHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterServiceConfigHistoryResponse response) {
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
        public Builder body(ListClusterServiceConfigHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterServiceConfigHistoryResponse build() {
            return new ListClusterServiceConfigHistoryResponse(this);
        } 

    } 

}
