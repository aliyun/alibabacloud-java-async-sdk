// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveAliClusterIdsFromPrometheusGlobalViewResponse} extends {@link TeaModel}
 *
 * <p>RemoveAliClusterIdsFromPrometheusGlobalViewResponse</p>
 */
public class RemoveAliClusterIdsFromPrometheusGlobalViewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody body;

    private RemoveAliClusterIdsFromPrometheusGlobalViewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveAliClusterIdsFromPrometheusGlobalViewResponse create() {
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
    public RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveAliClusterIdsFromPrometheusGlobalViewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody body);

        @Override
        RemoveAliClusterIdsFromPrometheusGlobalViewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveAliClusterIdsFromPrometheusGlobalViewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveAliClusterIdsFromPrometheusGlobalViewResponse response) {
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
        public Builder body(RemoveAliClusterIdsFromPrometheusGlobalViewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveAliClusterIdsFromPrometheusGlobalViewResponse build() {
            return new RemoveAliClusterIdsFromPrometheusGlobalViewResponse(this);
        } 

    } 

}
