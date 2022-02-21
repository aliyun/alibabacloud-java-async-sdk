// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEngineNamespacesResponse} extends {@link TeaModel}
 *
 * <p>ListEngineNamespacesResponse</p>
 */
public class ListEngineNamespacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEngineNamespacesResponseBody body;

    private ListEngineNamespacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEngineNamespacesResponse create() {
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
    public ListEngineNamespacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEngineNamespacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEngineNamespacesResponseBody body);

        @Override
        ListEngineNamespacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEngineNamespacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEngineNamespacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEngineNamespacesResponse response) {
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
        public Builder body(ListEngineNamespacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEngineNamespacesResponse build() {
            return new ListEngineNamespacesResponse(this);
        } 

    } 

}
