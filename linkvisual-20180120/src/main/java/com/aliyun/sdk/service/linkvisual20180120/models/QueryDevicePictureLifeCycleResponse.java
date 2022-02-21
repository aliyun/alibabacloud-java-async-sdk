// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePictureLifeCycleResponse} extends {@link TeaModel}
 *
 * <p>QueryDevicePictureLifeCycleResponse</p>
 */
public class QueryDevicePictureLifeCycleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDevicePictureLifeCycleResponseBody body;

    private QueryDevicePictureLifeCycleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDevicePictureLifeCycleResponse create() {
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
    public QueryDevicePictureLifeCycleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDevicePictureLifeCycleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDevicePictureLifeCycleResponseBody body);

        @Override
        QueryDevicePictureLifeCycleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDevicePictureLifeCycleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDevicePictureLifeCycleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDevicePictureLifeCycleResponse response) {
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
        public Builder body(QueryDevicePictureLifeCycleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDevicePictureLifeCycleResponse build() {
            return new QueryDevicePictureLifeCycleResponse(this);
        } 

    } 

}
