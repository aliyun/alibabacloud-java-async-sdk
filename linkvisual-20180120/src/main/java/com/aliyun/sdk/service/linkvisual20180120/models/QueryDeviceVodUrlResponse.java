// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceVodUrlResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceVodUrlResponse</p>
 */
public class QueryDeviceVodUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceVodUrlResponseBody body;

    private QueryDeviceVodUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceVodUrlResponse create() {
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
    public QueryDeviceVodUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceVodUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceVodUrlResponseBody body);

        @Override
        QueryDeviceVodUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceVodUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceVodUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceVodUrlResponse response) {
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
        public Builder body(QueryDeviceVodUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceVodUrlResponse build() {
            return new QueryDeviceVodUrlResponse(this);
        } 

    } 

}
