// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMediaListByURLResponse} extends {@link TeaModel}
 *
 * <p>QueryMediaListByURLResponse</p>
 */
public class QueryMediaListByURLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMediaListByURLResponseBody body;

    private QueryMediaListByURLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMediaListByURLResponse create() {
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
    public QueryMediaListByURLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMediaListByURLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMediaListByURLResponseBody body);

        @Override
        QueryMediaListByURLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMediaListByURLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMediaListByURLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMediaListByURLResponse response) {
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
        public Builder body(QueryMediaListByURLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMediaListByURLResponse build() {
            return new QueryMediaListByURLResponse(this);
        } 

    } 

}
