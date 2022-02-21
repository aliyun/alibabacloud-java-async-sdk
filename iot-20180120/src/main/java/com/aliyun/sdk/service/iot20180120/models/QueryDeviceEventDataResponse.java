// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceEventDataResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceEventDataResponse</p>
 */
public class QueryDeviceEventDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceEventDataResponseBody body;

    private QueryDeviceEventDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceEventDataResponse create() {
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
    public QueryDeviceEventDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceEventDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceEventDataResponseBody body);

        @Override
        QueryDeviceEventDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceEventDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceEventDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceEventDataResponse response) {
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
        public Builder body(QueryDeviceEventDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceEventDataResponse build() {
            return new QueryDeviceEventDataResponse(this);
        } 

    } 

}
