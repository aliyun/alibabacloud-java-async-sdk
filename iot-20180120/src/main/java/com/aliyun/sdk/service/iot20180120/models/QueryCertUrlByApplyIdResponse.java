// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCertUrlByApplyIdResponse} extends {@link TeaModel}
 *
 * <p>QueryCertUrlByApplyIdResponse</p>
 */
public class QueryCertUrlByApplyIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCertUrlByApplyIdResponseBody body;

    private QueryCertUrlByApplyIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCertUrlByApplyIdResponse create() {
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
    public QueryCertUrlByApplyIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCertUrlByApplyIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCertUrlByApplyIdResponseBody body);

        @Override
        QueryCertUrlByApplyIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCertUrlByApplyIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCertUrlByApplyIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCertUrlByApplyIdResponse response) {
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
        public Builder body(QueryCertUrlByApplyIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCertUrlByApplyIdResponse build() {
            return new QueryCertUrlByApplyIdResponse(this);
        } 

    } 

}
