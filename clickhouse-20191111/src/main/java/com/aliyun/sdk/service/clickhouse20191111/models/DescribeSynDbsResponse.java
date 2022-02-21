// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynDbsResponse} extends {@link TeaModel}
 *
 * <p>DescribeSynDbsResponse</p>
 */
public class DescribeSynDbsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSynDbsResponseBody body;

    private DescribeSynDbsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSynDbsResponse create() {
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
    public DescribeSynDbsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSynDbsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSynDbsResponseBody body);

        @Override
        DescribeSynDbsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSynDbsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSynDbsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSynDbsResponse response) {
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
        public Builder body(DescribeSynDbsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSynDbsResponse build() {
            return new DescribeSynDbsResponse(this);
        } 

    } 

}
