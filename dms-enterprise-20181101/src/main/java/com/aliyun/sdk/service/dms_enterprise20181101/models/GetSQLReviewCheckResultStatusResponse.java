// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSQLReviewCheckResultStatusResponse} extends {@link TeaModel}
 *
 * <p>GetSQLReviewCheckResultStatusResponse</p>
 */
public class GetSQLReviewCheckResultStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSQLReviewCheckResultStatusResponseBody body;

    private GetSQLReviewCheckResultStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSQLReviewCheckResultStatusResponse create() {
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
    public GetSQLReviewCheckResultStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSQLReviewCheckResultStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSQLReviewCheckResultStatusResponseBody body);

        @Override
        GetSQLReviewCheckResultStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSQLReviewCheckResultStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSQLReviewCheckResultStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSQLReviewCheckResultStatusResponse response) {
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
        public Builder body(GetSQLReviewCheckResultStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSQLReviewCheckResultStatusResponse build() {
            return new GetSQLReviewCheckResultStatusResponse(this);
        } 

    } 

}
