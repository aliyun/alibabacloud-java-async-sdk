// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceGroupListResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceGroupListResponse</p>
 */
public class QueryDeviceGroupListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceGroupListResponseBody body;

    private QueryDeviceGroupListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceGroupListResponse create() {
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
    public QueryDeviceGroupListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceGroupListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceGroupListResponseBody body);

        @Override
        QueryDeviceGroupListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceGroupListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceGroupListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceGroupListResponse response) {
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
        public Builder body(QueryDeviceGroupListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceGroupListResponse build() {
            return new QueryDeviceGroupListResponse(this);
        } 

    } 

}
