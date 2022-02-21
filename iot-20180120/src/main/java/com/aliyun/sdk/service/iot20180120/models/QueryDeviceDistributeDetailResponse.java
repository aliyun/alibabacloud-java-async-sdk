// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceDistributeDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceDistributeDetailResponse</p>
 */
public class QueryDeviceDistributeDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceDistributeDetailResponseBody body;

    private QueryDeviceDistributeDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceDistributeDetailResponse create() {
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
    public QueryDeviceDistributeDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceDistributeDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceDistributeDetailResponseBody body);

        @Override
        QueryDeviceDistributeDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceDistributeDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceDistributeDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceDistributeDetailResponse response) {
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
        public Builder body(QueryDeviceDistributeDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceDistributeDetailResponse build() {
            return new QueryDeviceDistributeDetailResponse(this);
        } 

    } 

}
