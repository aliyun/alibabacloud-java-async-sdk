// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProductCertInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryProductCertInfoResponse</p>
 */
public class QueryProductCertInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryProductCertInfoResponseBody body;

    private QueryProductCertInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryProductCertInfoResponse create() {
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
    public QueryProductCertInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryProductCertInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryProductCertInfoResponseBody body);

        @Override
        QueryProductCertInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryProductCertInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryProductCertInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryProductCertInfoResponse response) {
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
        public Builder body(QueryProductCertInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryProductCertInfoResponse build() {
            return new QueryProductCertInfoResponse(this);
        } 

    } 

}
