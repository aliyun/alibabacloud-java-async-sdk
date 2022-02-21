// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceFileListResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceFileListResponse</p>
 */
public class QueryDeviceFileListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceFileListResponseBody body;

    private QueryDeviceFileListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceFileListResponse create() {
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
    public QueryDeviceFileListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceFileListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceFileListResponseBody body);

        @Override
        QueryDeviceFileListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceFileListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceFileListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceFileListResponse response) {
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
        public Builder body(QueryDeviceFileListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceFileListResponse build() {
            return new QueryDeviceFileListResponse(this);
        } 

    } 

}
