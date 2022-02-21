// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceResponse</p>
 */
public class QueryDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceResponseBody body;

    private QueryDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceResponse create() {
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
    public QueryDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceResponseBody body);

        @Override
        QueryDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceResponse response) {
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
        public Builder body(QueryDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceResponse build() {
            return new QueryDeviceResponse(this);
        } 

    } 

}
