// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceGroupTagListResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceGroupTagListResponse</p>
 */
public class QueryDeviceGroupTagListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceGroupTagListResponseBody body;

    private QueryDeviceGroupTagListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceGroupTagListResponse create() {
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
    public QueryDeviceGroupTagListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceGroupTagListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceGroupTagListResponseBody body);

        @Override
        QueryDeviceGroupTagListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceGroupTagListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceGroupTagListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceGroupTagListResponse response) {
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
        public Builder body(QueryDeviceGroupTagListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceGroupTagListResponse build() {
            return new QueryDeviceGroupTagListResponse(this);
        } 

    } 

}
