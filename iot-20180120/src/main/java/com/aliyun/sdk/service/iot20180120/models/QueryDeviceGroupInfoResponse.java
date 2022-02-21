// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceGroupInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceGroupInfoResponse</p>
 */
public class QueryDeviceGroupInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceGroupInfoResponseBody body;

    private QueryDeviceGroupInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceGroupInfoResponse create() {
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
    public QueryDeviceGroupInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceGroupInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceGroupInfoResponseBody body);

        @Override
        QueryDeviceGroupInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceGroupInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceGroupInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceGroupInfoResponse response) {
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
        public Builder body(QueryDeviceGroupInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceGroupInfoResponse build() {
            return new QueryDeviceGroupInfoResponse(this);
        } 

    } 

}
