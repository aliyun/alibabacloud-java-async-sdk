// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryHostBaseInfoByInstanceResponse} extends {@link TeaModel}
 *
 * <p>QueryHostBaseInfoByInstanceResponse</p>
 */
public class QueryHostBaseInfoByInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryHostBaseInfoByInstanceResponseBody body;

    private QueryHostBaseInfoByInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryHostBaseInfoByInstanceResponse create() {
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
    public QueryHostBaseInfoByInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryHostBaseInfoByInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryHostBaseInfoByInstanceResponseBody body);

        @Override
        QueryHostBaseInfoByInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryHostBaseInfoByInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryHostBaseInfoByInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryHostBaseInfoByInstanceResponse response) {
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
        public Builder body(QueryHostBaseInfoByInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryHostBaseInfoByInstanceResponse build() {
            return new QueryHostBaseInfoByInstanceResponse(this);
        } 

    } 

}
