// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSynDbTablesResponse} extends {@link TeaModel}
 *
 * <p>DescribeSynDbTablesResponse</p>
 */
public class DescribeSynDbTablesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeSynDbTablesResponseBody body;

    private DescribeSynDbTablesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeSynDbTablesResponse create() {
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
    public DescribeSynDbTablesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeSynDbTablesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeSynDbTablesResponseBody body);

        @Override
        DescribeSynDbTablesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeSynDbTablesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeSynDbTablesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeSynDbTablesResponse response) {
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
        public Builder body(DescribeSynDbTablesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeSynDbTablesResponse build() {
            return new DescribeSynDbTablesResponse(this);
        } 

    } 

}
