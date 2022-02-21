// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSQLReviewOptimizeDetailResponse} extends {@link TeaModel}
 *
 * <p>GetSQLReviewOptimizeDetailResponse</p>
 */
public class GetSQLReviewOptimizeDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSQLReviewOptimizeDetailResponseBody body;

    private GetSQLReviewOptimizeDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSQLReviewOptimizeDetailResponse create() {
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
    public GetSQLReviewOptimizeDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSQLReviewOptimizeDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSQLReviewOptimizeDetailResponseBody body);

        @Override
        GetSQLReviewOptimizeDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSQLReviewOptimizeDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSQLReviewOptimizeDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSQLReviewOptimizeDetailResponse response) {
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
        public Builder body(GetSQLReviewOptimizeDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSQLReviewOptimizeDetailResponse build() {
            return new GetSQLReviewOptimizeDetailResponse(this);
        } 

    } 

}
