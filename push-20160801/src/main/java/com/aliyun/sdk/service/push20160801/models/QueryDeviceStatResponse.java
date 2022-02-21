// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceStatResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceStatResponse</p>
 */
public class QueryDeviceStatResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceStatResponseBody body;

    private QueryDeviceStatResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceStatResponse create() {
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
    public QueryDeviceStatResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceStatResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceStatResponseBody body);

        @Override
        QueryDeviceStatResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceStatResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceStatResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceStatResponse response) {
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
        public Builder body(QueryDeviceStatResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceStatResponse build() {
            return new QueryDeviceStatResponse(this);
        } 

    } 

}
