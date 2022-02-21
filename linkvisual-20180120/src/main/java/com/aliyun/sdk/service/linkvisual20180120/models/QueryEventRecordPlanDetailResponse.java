// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEventRecordPlanDetailResponse} extends {@link TeaModel}
 *
 * <p>QueryEventRecordPlanDetailResponse</p>
 */
public class QueryEventRecordPlanDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEventRecordPlanDetailResponseBody body;

    private QueryEventRecordPlanDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEventRecordPlanDetailResponse create() {
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
    public QueryEventRecordPlanDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEventRecordPlanDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEventRecordPlanDetailResponseBody body);

        @Override
        QueryEventRecordPlanDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEventRecordPlanDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEventRecordPlanDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEventRecordPlanDetailResponse response) {
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
        public Builder body(QueryEventRecordPlanDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEventRecordPlanDetailResponse build() {
            return new QueryEventRecordPlanDetailResponse(this);
        } 

    } 

}
