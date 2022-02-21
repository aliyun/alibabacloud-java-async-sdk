// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicePurifyPlansResponse} extends {@link TeaModel}
 *
 * <p>QueryDevicePurifyPlansResponse</p>
 */
public class QueryDevicePurifyPlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDevicePurifyPlansResponseBody body;

    private QueryDevicePurifyPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDevicePurifyPlansResponse create() {
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
    public QueryDevicePurifyPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDevicePurifyPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDevicePurifyPlansResponseBody body);

        @Override
        QueryDevicePurifyPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDevicePurifyPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDevicePurifyPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDevicePurifyPlansResponse response) {
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
        public Builder body(QueryDevicePurifyPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDevicePurifyPlansResponse build() {
            return new QueryDevicePurifyPlansResponse(this);
        } 

    } 

}
