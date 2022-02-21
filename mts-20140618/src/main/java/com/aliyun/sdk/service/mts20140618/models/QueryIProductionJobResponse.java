// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIProductionJobResponse} extends {@link TeaModel}
 *
 * <p>QueryIProductionJobResponse</p>
 */
public class QueryIProductionJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryIProductionJobResponseBody body;

    private QueryIProductionJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryIProductionJobResponse create() {
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
    public QueryIProductionJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryIProductionJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryIProductionJobResponseBody body);

        @Override
        QueryIProductionJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryIProductionJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryIProductionJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryIProductionJobResponse response) {
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
        public Builder body(QueryIProductionJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryIProductionJobResponse build() {
            return new QueryIProductionJobResponse(this);
        } 

    } 

}
