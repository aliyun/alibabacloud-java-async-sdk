// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceListByDeviceGroupResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceListByDeviceGroupResponse</p>
 */
public class QueryDeviceListByDeviceGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceListByDeviceGroupResponseBody body;

    private QueryDeviceListByDeviceGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceListByDeviceGroupResponse create() {
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
    public QueryDeviceListByDeviceGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceListByDeviceGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceListByDeviceGroupResponseBody body);

        @Override
        QueryDeviceListByDeviceGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceListByDeviceGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceListByDeviceGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceListByDeviceGroupResponse response) {
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
        public Builder body(QueryDeviceListByDeviceGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceListByDeviceGroupResponse build() {
            return new QueryDeviceListByDeviceGroupResponse(this);
        } 

    } 

}
