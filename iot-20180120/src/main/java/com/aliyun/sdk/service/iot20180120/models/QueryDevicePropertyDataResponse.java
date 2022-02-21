// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePropertyDataResponse} extends {@link TeaModel}
 *
 * <p>QueryDevicePropertyDataResponse</p>
 */
public class QueryDevicePropertyDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDevicePropertyDataResponseBody body;

    private QueryDevicePropertyDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDevicePropertyDataResponse create() {
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
    public QueryDevicePropertyDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDevicePropertyDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDevicePropertyDataResponseBody body);

        @Override
        QueryDevicePropertyDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDevicePropertyDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDevicePropertyDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDevicePropertyDataResponse response) {
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
        public Builder body(QueryDevicePropertyDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDevicePropertyDataResponse build() {
            return new QueryDevicePropertyDataResponse(this);
        } 

    } 

}
