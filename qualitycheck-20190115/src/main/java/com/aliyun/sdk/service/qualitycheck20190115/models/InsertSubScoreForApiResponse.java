// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertSubScoreForApiResponse} extends {@link TeaModel}
 *
 * <p>InsertSubScoreForApiResponse</p>
 */
public class InsertSubScoreForApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InsertSubScoreForApiResponseBody body;

    private InsertSubScoreForApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InsertSubScoreForApiResponse create() {
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
    public InsertSubScoreForApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InsertSubScoreForApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InsertSubScoreForApiResponseBody body);

        @Override
        InsertSubScoreForApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InsertSubScoreForApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InsertSubScoreForApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InsertSubScoreForApiResponse response) {
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
        public Builder body(InsertSubScoreForApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InsertSubScoreForApiResponse build() {
            return new InsertSubScoreForApiResponse(this);
        } 

    } 

}
