// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMonitorResponse} extends {@link TeaModel}
 *
 * <p>QueryMonitorResponse</p>
 */
public class QueryMonitorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMonitorResponseBody body;

    private QueryMonitorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMonitorResponse create() {
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
    public QueryMonitorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMonitorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMonitorResponseBody body);

        @Override
        QueryMonitorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMonitorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMonitorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMonitorResponse response) {
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
        public Builder body(QueryMonitorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMonitorResponse build() {
            return new QueryMonitorResponse(this);
        } 

    } 

}
