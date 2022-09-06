// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProjectShareDeviceListResponse} extends {@link TeaModel}
 *
 * <p>QueryProjectShareDeviceListResponse</p>
 */
public class QueryProjectShareDeviceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryProjectShareDeviceListResponseBody body;

    private QueryProjectShareDeviceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryProjectShareDeviceListResponse create() {
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
    public QueryProjectShareDeviceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryProjectShareDeviceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryProjectShareDeviceListResponseBody body);

        @Override
        QueryProjectShareDeviceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryProjectShareDeviceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryProjectShareDeviceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryProjectShareDeviceListResponse response) {
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
        public Builder body(QueryProjectShareDeviceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryProjectShareDeviceListResponse build() {
            return new QueryProjectShareDeviceListResponse(this);
        } 

    } 

}
