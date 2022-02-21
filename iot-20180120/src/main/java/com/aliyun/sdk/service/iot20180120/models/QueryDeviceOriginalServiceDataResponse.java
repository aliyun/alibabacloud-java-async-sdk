// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceOriginalServiceDataResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceOriginalServiceDataResponse</p>
 */
public class QueryDeviceOriginalServiceDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceOriginalServiceDataResponseBody body;

    private QueryDeviceOriginalServiceDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceOriginalServiceDataResponse create() {
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
    public QueryDeviceOriginalServiceDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceOriginalServiceDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceOriginalServiceDataResponseBody body);

        @Override
        QueryDeviceOriginalServiceDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceOriginalServiceDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceOriginalServiceDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceOriginalServiceDataResponse response) {
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
        public Builder body(QueryDeviceOriginalServiceDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceOriginalServiceDataResponse build() {
            return new QueryDeviceOriginalServiceDataResponse(this);
        } 

    } 

}
