// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceFileVodResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceFileVodResponse</p>
 */
public class QueryDeviceFileVodResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceFileVodResponseBody body;

    private QueryDeviceFileVodResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceFileVodResponse create() {
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
    public QueryDeviceFileVodResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceFileVodResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceFileVodResponseBody body);

        @Override
        QueryDeviceFileVodResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceFileVodResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceFileVodResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceFileVodResponse response) {
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
        public Builder body(QueryDeviceFileVodResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceFileVodResponse build() {
            return new QueryDeviceFileVodResponse(this);
        } 

    } 

}
