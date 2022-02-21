// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEventRecordPlanDeviceByDeviceResponse} extends {@link TeaModel}
 *
 * <p>QueryEventRecordPlanDeviceByDeviceResponse</p>
 */
public class QueryEventRecordPlanDeviceByDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEventRecordPlanDeviceByDeviceResponseBody body;

    private QueryEventRecordPlanDeviceByDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEventRecordPlanDeviceByDeviceResponse create() {
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
    public QueryEventRecordPlanDeviceByDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEventRecordPlanDeviceByDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEventRecordPlanDeviceByDeviceResponseBody body);

        @Override
        QueryEventRecordPlanDeviceByDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEventRecordPlanDeviceByDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEventRecordPlanDeviceByDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEventRecordPlanDeviceByDeviceResponse response) {
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
        public Builder body(QueryEventRecordPlanDeviceByDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEventRecordPlanDeviceByDeviceResponse build() {
            return new QueryEventRecordPlanDeviceByDeviceResponse(this);
        } 

    } 

}
