// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRecordPlanDeviceByPlanResponse} extends {@link TeaModel}
 *
 * <p>QueryRecordPlanDeviceByPlanResponse</p>
 */
public class QueryRecordPlanDeviceByPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRecordPlanDeviceByPlanResponseBody body;

    private QueryRecordPlanDeviceByPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRecordPlanDeviceByPlanResponse create() {
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
    public QueryRecordPlanDeviceByPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRecordPlanDeviceByPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRecordPlanDeviceByPlanResponseBody body);

        @Override
        QueryRecordPlanDeviceByPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRecordPlanDeviceByPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRecordPlanDeviceByPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRecordPlanDeviceByPlanResponse response) {
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
        public Builder body(QueryRecordPlanDeviceByPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRecordPlanDeviceByPlanResponse build() {
            return new QueryRecordPlanDeviceByPlanResponse(this);
        } 

    } 

}
