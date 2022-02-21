// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceCountResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceCountResponse</p>
 */
public class QueryDeviceCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceCountResponseBody body;

    private QueryDeviceCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceCountResponse create() {
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
    public QueryDeviceCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceCountResponseBody body);

        @Override
        QueryDeviceCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceCountResponse response) {
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
        public Builder body(QueryDeviceCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceCountResponse build() {
            return new QueryDeviceCountResponse(this);
        } 

    } 

}
