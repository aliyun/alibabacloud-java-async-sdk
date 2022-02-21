// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceEventRecordResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceEventRecordResponse</p>
 */
public class QueryDeviceEventRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceEventRecordResponseBody body;

    private QueryDeviceEventRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceEventRecordResponse create() {
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
    public QueryDeviceEventRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceEventRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceEventRecordResponseBody body);

        @Override
        QueryDeviceEventRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceEventRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceEventRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceEventRecordResponse response) {
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
        public Builder body(QueryDeviceEventRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceEventRecordResponse build() {
            return new QueryDeviceEventRecordResponse(this);
        } 

    } 

}
