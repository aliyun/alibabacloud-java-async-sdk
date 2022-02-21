// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceDistributeJobResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceDistributeJobResponse</p>
 */
public class QueryDeviceDistributeJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceDistributeJobResponseBody body;

    private QueryDeviceDistributeJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceDistributeJobResponse create() {
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
    public QueryDeviceDistributeJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceDistributeJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceDistributeJobResponseBody body);

        @Override
        QueryDeviceDistributeJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceDistributeJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceDistributeJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceDistributeJobResponse response) {
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
        public Builder body(QueryDeviceDistributeJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceDistributeJobResponse build() {
            return new QueryDeviceDistributeJobResponse(this);
        } 

    } 

}
