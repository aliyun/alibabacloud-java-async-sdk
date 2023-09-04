// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResellerUserAlarmThresholdResponse} extends {@link TeaModel}
 *
 * <p>QueryResellerUserAlarmThresholdResponse</p>
 */
public class QueryResellerUserAlarmThresholdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryResellerUserAlarmThresholdResponseBody body;

    private QueryResellerUserAlarmThresholdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryResellerUserAlarmThresholdResponse create() {
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
    public QueryResellerUserAlarmThresholdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryResellerUserAlarmThresholdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryResellerUserAlarmThresholdResponseBody body);

        @Override
        QueryResellerUserAlarmThresholdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryResellerUserAlarmThresholdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryResellerUserAlarmThresholdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryResellerUserAlarmThresholdResponse response) {
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
        public Builder body(QueryResellerUserAlarmThresholdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryResellerUserAlarmThresholdResponse build() {
            return new QueryResellerUserAlarmThresholdResponse(this);
        } 

    } 

}
