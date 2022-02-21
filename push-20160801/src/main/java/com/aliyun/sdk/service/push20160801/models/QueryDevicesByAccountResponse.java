// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesByAccountResponse} extends {@link TeaModel}
 *
 * <p>QueryDevicesByAccountResponse</p>
 */
public class QueryDevicesByAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDevicesByAccountResponseBody body;

    private QueryDevicesByAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDevicesByAccountResponse create() {
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
    public QueryDevicesByAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDevicesByAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDevicesByAccountResponseBody body);

        @Override
        QueryDevicesByAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDevicesByAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDevicesByAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDevicesByAccountResponse response) {
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
        public Builder body(QueryDevicesByAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDevicesByAccountResponse build() {
            return new QueryDevicesByAccountResponse(this);
        } 

    } 

}
