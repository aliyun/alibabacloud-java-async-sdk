// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceOriginalPropertyStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceOriginalPropertyStatusResponse</p>
 */
public class QueryDeviceOriginalPropertyStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceOriginalPropertyStatusResponseBody body;

    private QueryDeviceOriginalPropertyStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceOriginalPropertyStatusResponse create() {
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
    public QueryDeviceOriginalPropertyStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceOriginalPropertyStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceOriginalPropertyStatusResponseBody body);

        @Override
        QueryDeviceOriginalPropertyStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceOriginalPropertyStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceOriginalPropertyStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceOriginalPropertyStatusResponse response) {
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
        public Builder body(QueryDeviceOriginalPropertyStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceOriginalPropertyStatusResponse build() {
            return new QueryDeviceOriginalPropertyStatusResponse(this);
        } 

    } 

}
