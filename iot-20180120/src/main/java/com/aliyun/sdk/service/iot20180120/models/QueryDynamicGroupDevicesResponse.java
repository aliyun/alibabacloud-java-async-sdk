// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDynamicGroupDevicesResponse} extends {@link TeaModel}
 *
 * <p>QueryDynamicGroupDevicesResponse</p>
 */
public class QueryDynamicGroupDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDynamicGroupDevicesResponseBody body;

    private QueryDynamicGroupDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDynamicGroupDevicesResponse create() {
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
    public QueryDynamicGroupDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDynamicGroupDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDynamicGroupDevicesResponseBody body);

        @Override
        QueryDynamicGroupDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDynamicGroupDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDynamicGroupDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDynamicGroupDevicesResponse response) {
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
        public Builder body(QueryDynamicGroupDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDynamicGroupDevicesResponse build() {
            return new QueryDynamicGroupDevicesResponse(this);
        } 

    } 

}
