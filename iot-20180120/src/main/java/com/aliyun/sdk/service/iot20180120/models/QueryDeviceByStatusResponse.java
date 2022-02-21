// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceByStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceByStatusResponse</p>
 */
public class QueryDeviceByStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceByStatusResponseBody body;

    private QueryDeviceByStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceByStatusResponse create() {
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
    public QueryDeviceByStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceByStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceByStatusResponseBody body);

        @Override
        QueryDeviceByStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceByStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceByStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceByStatusResponse response) {
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
        public Builder body(QueryDeviceByStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceByStatusResponse build() {
            return new QueryDeviceByStatusResponse(this);
        } 

    } 

}
