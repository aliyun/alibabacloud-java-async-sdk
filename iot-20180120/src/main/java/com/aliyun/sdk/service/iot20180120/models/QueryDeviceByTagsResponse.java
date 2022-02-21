// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceByTagsResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceByTagsResponse</p>
 */
public class QueryDeviceByTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceByTagsResponseBody body;

    private QueryDeviceByTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceByTagsResponse create() {
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
    public QueryDeviceByTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceByTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceByTagsResponseBody body);

        @Override
        QueryDeviceByTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceByTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceByTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceByTagsResponse response) {
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
        public Builder body(QueryDeviceByTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceByTagsResponse build() {
            return new QueryDeviceByTagsResponse(this);
        } 

    } 

}
