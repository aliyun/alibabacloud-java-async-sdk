// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryLoRaJoinPermissionsResponse} extends {@link TeaModel}
 *
 * <p>QueryLoRaJoinPermissionsResponse</p>
 */
public class QueryLoRaJoinPermissionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryLoRaJoinPermissionsResponseBody body;

    private QueryLoRaJoinPermissionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryLoRaJoinPermissionsResponse create() {
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
    public QueryLoRaJoinPermissionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryLoRaJoinPermissionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryLoRaJoinPermissionsResponseBody body);

        @Override
        QueryLoRaJoinPermissionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryLoRaJoinPermissionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryLoRaJoinPermissionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryLoRaJoinPermissionsResponse response) {
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
        public Builder body(QueryLoRaJoinPermissionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryLoRaJoinPermissionsResponse build() {
            return new QueryLoRaJoinPermissionsResponse(this);
        } 

    } 

}
