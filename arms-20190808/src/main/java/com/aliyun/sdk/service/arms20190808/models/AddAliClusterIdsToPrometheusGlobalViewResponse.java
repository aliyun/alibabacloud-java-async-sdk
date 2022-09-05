// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddAliClusterIdsToPrometheusGlobalViewResponse} extends {@link TeaModel}
 *
 * <p>AddAliClusterIdsToPrometheusGlobalViewResponse</p>
 */
public class AddAliClusterIdsToPrometheusGlobalViewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddAliClusterIdsToPrometheusGlobalViewResponseBody body;

    private AddAliClusterIdsToPrometheusGlobalViewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddAliClusterIdsToPrometheusGlobalViewResponse create() {
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
    public AddAliClusterIdsToPrometheusGlobalViewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddAliClusterIdsToPrometheusGlobalViewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddAliClusterIdsToPrometheusGlobalViewResponseBody body);

        @Override
        AddAliClusterIdsToPrometheusGlobalViewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddAliClusterIdsToPrometheusGlobalViewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddAliClusterIdsToPrometheusGlobalViewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddAliClusterIdsToPrometheusGlobalViewResponse response) {
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
        public Builder body(AddAliClusterIdsToPrometheusGlobalViewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddAliClusterIdsToPrometheusGlobalViewResponse build() {
            return new AddAliClusterIdsToPrometheusGlobalViewResponse(this);
        } 

    } 

}
