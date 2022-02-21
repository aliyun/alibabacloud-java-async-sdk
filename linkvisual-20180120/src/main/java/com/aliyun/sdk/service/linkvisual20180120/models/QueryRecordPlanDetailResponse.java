// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordPlanDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryRecordPlanDetailResponse</p>
 */
public class QueryRecordPlanDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRecordPlanDetailResponseBody body;

    private QueryRecordPlanDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRecordPlanDetailResponse create() {
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
    public QueryRecordPlanDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRecordPlanDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRecordPlanDetailResponseBody body);

        @Override
        QueryRecordPlanDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRecordPlanDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRecordPlanDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRecordPlanDetailResponse response) {
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
        public Builder body(QueryRecordPlanDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRecordPlanDetailResponse build() {
            return new QueryRecordPlanDetailResponse(this);
        } 

    } 

}
