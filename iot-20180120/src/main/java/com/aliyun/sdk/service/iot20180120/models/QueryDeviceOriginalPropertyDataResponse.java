// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceOriginalPropertyDataResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceOriginalPropertyDataResponse</p>
 */
public class QueryDeviceOriginalPropertyDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceOriginalPropertyDataResponseBody body;

    private QueryDeviceOriginalPropertyDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceOriginalPropertyDataResponse create() {
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
    public QueryDeviceOriginalPropertyDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceOriginalPropertyDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceOriginalPropertyDataResponseBody body);

        @Override
        QueryDeviceOriginalPropertyDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceOriginalPropertyDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceOriginalPropertyDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceOriginalPropertyDataResponse response) {
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
        public Builder body(QueryDeviceOriginalPropertyDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceOriginalPropertyDataResponse build() {
            return new QueryDeviceOriginalPropertyDataResponse(this);
        } 

    } 

}
