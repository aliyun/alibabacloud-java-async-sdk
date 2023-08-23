// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRoomControlDevicesResponse} extends {@link TeaModel}
 *
 * <p>QueryRoomControlDevicesResponse</p>
 */
public class QueryRoomControlDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRoomControlDevicesResponseBody body;

    private QueryRoomControlDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRoomControlDevicesResponse create() {
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
    public QueryRoomControlDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRoomControlDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRoomControlDevicesResponseBody body);

        @Override
        QueryRoomControlDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRoomControlDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRoomControlDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRoomControlDevicesResponse response) {
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
        public Builder body(QueryRoomControlDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRoomControlDevicesResponse build() {
            return new QueryRoomControlDevicesResponse(this);
        } 

    } 

}
