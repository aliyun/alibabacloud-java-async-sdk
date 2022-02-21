// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantMetricsResponse} extends {@link TeaModel}
 *
 * <p>DescribeTenantMetricsResponse</p>
 */
public class DescribeTenantMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeTenantMetricsResponseBody body;

    private DescribeTenantMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeTenantMetricsResponse create() {
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
    public DescribeTenantMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeTenantMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeTenantMetricsResponseBody body);

        @Override
        DescribeTenantMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeTenantMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeTenantMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeTenantMetricsResponse response) {
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
        public Builder body(DescribeTenantMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeTenantMetricsResponse build() {
            return new DescribeTenantMetricsResponse(this);
        } 

    } 

}
