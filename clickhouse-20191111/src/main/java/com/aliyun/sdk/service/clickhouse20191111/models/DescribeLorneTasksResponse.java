// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLorneTasksResponse} extends {@link TeaModel}
 *
 * <p>DescribeLorneTasksResponse</p>
 */
public class DescribeLorneTasksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeLorneTasksResponseBody body;

    private DescribeLorneTasksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeLorneTasksResponse create() {
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
    public DescribeLorneTasksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeLorneTasksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeLorneTasksResponseBody body);

        @Override
        DescribeLorneTasksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeLorneTasksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeLorneTasksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeLorneTasksResponse response) {
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
        public Builder body(DescribeLorneTasksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeLorneTasksResponse build() {
            return new DescribeLorneTasksResponse(this);
        } 

    } 

}
