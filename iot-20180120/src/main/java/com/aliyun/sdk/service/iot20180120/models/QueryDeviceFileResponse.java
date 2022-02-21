// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceFileResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceFileResponse</p>
 */
public class QueryDeviceFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceFileResponseBody body;

    private QueryDeviceFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceFileResponse create() {
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
    public QueryDeviceFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceFileResponseBody body);

        @Override
        QueryDeviceFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceFileResponse response) {
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
        public Builder body(QueryDeviceFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceFileResponse build() {
            return new QueryDeviceFileResponse(this);
        } 

    } 

}
