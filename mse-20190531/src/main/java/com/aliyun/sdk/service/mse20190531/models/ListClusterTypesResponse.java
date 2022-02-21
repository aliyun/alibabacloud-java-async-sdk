// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterTypesResponse} extends {@link TeaModel}
 *
 * <p>ListClusterTypesResponse</p>
 */
public class ListClusterTypesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClusterTypesResponseBody body;

    private ListClusterTypesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClusterTypesResponse create() {
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
    public ListClusterTypesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClusterTypesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClusterTypesResponseBody body);

        @Override
        ListClusterTypesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClusterTypesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClusterTypesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClusterTypesResponse response) {
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
        public Builder body(ListClusterTypesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClusterTypesResponse build() {
            return new ListClusterTypesResponse(this);
        } 

    } 

}
