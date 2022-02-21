// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceDesiredPropertyResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceDesiredPropertyResponse</p>
 */
public class QueryDeviceDesiredPropertyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceDesiredPropertyResponseBody body;

    private QueryDeviceDesiredPropertyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceDesiredPropertyResponse create() {
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
    public QueryDeviceDesiredPropertyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceDesiredPropertyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceDesiredPropertyResponseBody body);

        @Override
        QueryDeviceDesiredPropertyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceDesiredPropertyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceDesiredPropertyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceDesiredPropertyResponse response) {
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
        public Builder body(QueryDeviceDesiredPropertyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceDesiredPropertyResponse build() {
            return new QueryDeviceDesiredPropertyResponse(this);
        } 

    } 

}
