// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceVodUrlByTimeResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceVodUrlByTimeResponse</p>
 */
public class QueryDeviceVodUrlByTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceVodUrlByTimeResponseBody body;

    private QueryDeviceVodUrlByTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceVodUrlByTimeResponse create() {
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
    public QueryDeviceVodUrlByTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceVodUrlByTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceVodUrlByTimeResponseBody body);

        @Override
        QueryDeviceVodUrlByTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceVodUrlByTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceVodUrlByTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceVodUrlByTimeResponse response) {
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
        public Builder body(QueryDeviceVodUrlByTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceVodUrlByTimeResponse build() {
            return new QueryDeviceVodUrlByTimeResponse(this);
        } 

    } 

}
