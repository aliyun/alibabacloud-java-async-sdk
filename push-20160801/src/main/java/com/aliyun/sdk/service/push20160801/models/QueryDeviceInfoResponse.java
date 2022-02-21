// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceInfoResponse</p>
 */
public class QueryDeviceInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceInfoResponseBody body;

    private QueryDeviceInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceInfoResponse create() {
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
    public QueryDeviceInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceInfoResponseBody body);

        @Override
        QueryDeviceInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceInfoResponse response) {
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
        public Builder body(QueryDeviceInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceInfoResponse build() {
            return new QueryDeviceInfoResponse(this);
        } 

    } 

}
