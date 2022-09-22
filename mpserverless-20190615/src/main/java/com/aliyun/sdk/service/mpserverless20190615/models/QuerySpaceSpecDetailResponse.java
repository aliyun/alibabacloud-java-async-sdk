// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpaceSpecDetailResponse} extends {@link TeaModel}
 *
 * <p>QuerySpaceSpecDetailResponse</p>
 */
public class QuerySpaceSpecDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySpaceSpecDetailResponseBody body;

    private QuerySpaceSpecDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySpaceSpecDetailResponse create() {
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
    public QuerySpaceSpecDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySpaceSpecDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySpaceSpecDetailResponseBody body);

        @Override
        QuerySpaceSpecDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySpaceSpecDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySpaceSpecDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySpaceSpecDetailResponse response) {
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
        public Builder body(QuerySpaceSpecDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySpaceSpecDetailResponse build() {
            return new QuerySpaceSpecDetailResponse(this);
        } 

    } 

}
