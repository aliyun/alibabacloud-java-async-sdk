// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCallInPoolTransferConfigResponse} extends {@link TeaModel}
 *
 * <p>QueryCallInPoolTransferConfigResponse</p>
 */
public class QueryCallInPoolTransferConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCallInPoolTransferConfigResponseBody body;

    private QueryCallInPoolTransferConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCallInPoolTransferConfigResponse create() {
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
    public QueryCallInPoolTransferConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCallInPoolTransferConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCallInPoolTransferConfigResponseBody body);

        @Override
        QueryCallInPoolTransferConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCallInPoolTransferConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCallInPoolTransferConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCallInPoolTransferConfigResponse response) {
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
        public Builder body(QueryCallInPoolTransferConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCallInPoolTransferConfigResponse build() {
            return new QueryCallInPoolTransferConfigResponse(this);
        } 

    } 

}
