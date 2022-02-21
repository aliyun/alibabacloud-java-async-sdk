// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLorneTasksMetricsResponse} extends {@link TeaModel}
 *
 * <p>DescribeLorneTasksMetricsResponse</p>
 */
public class DescribeLorneTasksMetricsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLorneTasksMetricsResponseBody body;

    private DescribeLorneTasksMetricsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLorneTasksMetricsResponse create() {
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
    public DescribeLorneTasksMetricsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLorneTasksMetricsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLorneTasksMetricsResponseBody body);

        @Override
        DescribeLorneTasksMetricsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLorneTasksMetricsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLorneTasksMetricsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLorneTasksMetricsResponse response) {
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
        public Builder body(DescribeLorneTasksMetricsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLorneTasksMetricsResponse build() {
            return new DescribeLorneTasksMetricsResponse(this);
        } 

    } 

}
