// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEventRecordPlansResponse} extends {@link TeaModel}
 *
 * <p>QueryEventRecordPlansResponse</p>
 */
public class QueryEventRecordPlansResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEventRecordPlansResponseBody body;

    private QueryEventRecordPlansResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEventRecordPlansResponse create() {
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
    public QueryEventRecordPlansResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEventRecordPlansResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEventRecordPlansResponseBody body);

        @Override
        QueryEventRecordPlansResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEventRecordPlansResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEventRecordPlansResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEventRecordPlansResponse response) {
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
        public Builder body(QueryEventRecordPlansResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEventRecordPlansResponse build() {
            return new QueryEventRecordPlansResponse(this);
        } 

    } 

}
