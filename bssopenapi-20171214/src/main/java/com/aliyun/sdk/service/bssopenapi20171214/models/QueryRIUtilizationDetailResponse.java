// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRIUtilizationDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryRIUtilizationDetailResponse</p>
 */
public class QueryRIUtilizationDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRIUtilizationDetailResponseBody body;

    private QueryRIUtilizationDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRIUtilizationDetailResponse create() {
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
    public QueryRIUtilizationDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRIUtilizationDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRIUtilizationDetailResponseBody body);

        @Override
        QueryRIUtilizationDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRIUtilizationDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRIUtilizationDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRIUtilizationDetailResponse response) {
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
        public Builder body(QueryRIUtilizationDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRIUtilizationDetailResponse build() {
            return new QueryRIUtilizationDetailResponse(this);
        } 

    } 

}
