// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpaClusterNamespaceListResponse} extends {@link TeaModel}
 *
 * <p>GetOpaClusterNamespaceListResponse</p>
 */
public class GetOpaClusterNamespaceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOpaClusterNamespaceListResponseBody body;

    private GetOpaClusterNamespaceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOpaClusterNamespaceListResponse create() {
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
    public GetOpaClusterNamespaceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOpaClusterNamespaceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOpaClusterNamespaceListResponseBody body);

        @Override
        GetOpaClusterNamespaceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOpaClusterNamespaceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOpaClusterNamespaceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOpaClusterNamespaceListResponse response) {
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
        public Builder body(GetOpaClusterNamespaceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOpaClusterNamespaceListResponse build() {
            return new GetOpaClusterNamespaceListResponse(this);
        } 

    } 

}
