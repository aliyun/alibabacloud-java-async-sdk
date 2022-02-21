// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPrepublishPassedDeviceCountResponse} extends {@link TeaModel}
 *
 * <p>QueryPrepublishPassedDeviceCountResponse</p>
 */
public class QueryPrepublishPassedDeviceCountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPrepublishPassedDeviceCountResponseBody body;

    private QueryPrepublishPassedDeviceCountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPrepublishPassedDeviceCountResponse create() {
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
    public QueryPrepublishPassedDeviceCountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPrepublishPassedDeviceCountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPrepublishPassedDeviceCountResponseBody body);

        @Override
        QueryPrepublishPassedDeviceCountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPrepublishPassedDeviceCountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPrepublishPassedDeviceCountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPrepublishPassedDeviceCountResponse response) {
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
        public Builder body(QueryPrepublishPassedDeviceCountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPrepublishPassedDeviceCountResponse build() {
            return new QueryPrepublishPassedDeviceCountResponse(this);
        } 

    } 

}
