// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMobilesCardSupportResponse} extends {@link TeaModel}
 *
 * <p>QueryMobilesCardSupportResponse</p>
 */
public class QueryMobilesCardSupportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMobilesCardSupportResponseBody body;

    private QueryMobilesCardSupportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMobilesCardSupportResponse create() {
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
    public QueryMobilesCardSupportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMobilesCardSupportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMobilesCardSupportResponseBody body);

        @Override
        QueryMobilesCardSupportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMobilesCardSupportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMobilesCardSupportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMobilesCardSupportResponse response) {
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
        public Builder body(QueryMobilesCardSupportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMobilesCardSupportResponse build() {
            return new QueryMobilesCardSupportResponse(this);
        } 

    } 

}
