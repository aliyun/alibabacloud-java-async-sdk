// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPrometheusGlobalViewByAliClusterIdsResponse} extends {@link TeaModel}
 *
 * <p>AddPrometheusGlobalViewByAliClusterIdsResponse</p>
 */
public class AddPrometheusGlobalViewByAliClusterIdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddPrometheusGlobalViewByAliClusterIdsResponseBody body;

    private AddPrometheusGlobalViewByAliClusterIdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddPrometheusGlobalViewByAliClusterIdsResponse create() {
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
    public AddPrometheusGlobalViewByAliClusterIdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPrometheusGlobalViewByAliClusterIdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddPrometheusGlobalViewByAliClusterIdsResponseBody body);

        @Override
        AddPrometheusGlobalViewByAliClusterIdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPrometheusGlobalViewByAliClusterIdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddPrometheusGlobalViewByAliClusterIdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPrometheusGlobalViewByAliClusterIdsResponse response) {
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
        public Builder body(AddPrometheusGlobalViewByAliClusterIdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPrometheusGlobalViewByAliClusterIdsResponse build() {
            return new AddPrometheusGlobalViewByAliClusterIdsResponse(this);
        } 

    } 

}
