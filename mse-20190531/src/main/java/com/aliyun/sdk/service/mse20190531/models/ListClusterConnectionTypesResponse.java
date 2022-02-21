// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterConnectionTypesResponse} extends {@link TeaModel}
 *
 * <p>ListClusterConnectionTypesResponse</p>
 */
public class ListClusterConnectionTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterConnectionTypesResponseBody body;

    private ListClusterConnectionTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterConnectionTypesResponse create() {
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
    public ListClusterConnectionTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterConnectionTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterConnectionTypesResponseBody body);

        @Override
        ListClusterConnectionTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterConnectionTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterConnectionTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterConnectionTypesResponse response) {
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
        public Builder body(ListClusterConnectionTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterConnectionTypesResponse build() {
            return new ListClusterConnectionTypesResponse(this);
        } 

    } 

}
