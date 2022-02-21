// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryQualificationDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryQualificationDetailResponse</p>
 */
public class QueryQualificationDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryQualificationDetailResponseBody body;

    private QueryQualificationDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryQualificationDetailResponse create() {
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
    public QueryQualificationDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryQualificationDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryQualificationDetailResponseBody body);

        @Override
        QueryQualificationDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryQualificationDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryQualificationDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryQualificationDetailResponse response) {
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
        public Builder body(QueryQualificationDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryQualificationDetailResponse build() {
            return new QueryQualificationDetailResponse(this);
        } 

    } 

}
