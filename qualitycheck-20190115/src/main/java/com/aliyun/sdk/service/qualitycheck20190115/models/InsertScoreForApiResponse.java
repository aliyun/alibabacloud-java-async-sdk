// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertScoreForApiResponse} extends {@link TeaModel}
 *
 * <p>InsertScoreForApiResponse</p>
 */
public class InsertScoreForApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InsertScoreForApiResponseBody body;

    private InsertScoreForApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InsertScoreForApiResponse create() {
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
    public InsertScoreForApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InsertScoreForApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InsertScoreForApiResponseBody body);

        @Override
        InsertScoreForApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InsertScoreForApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InsertScoreForApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InsertScoreForApiResponse response) {
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
        public Builder body(InsertScoreForApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InsertScoreForApiResponse build() {
            return new InsertScoreForApiResponse(this);
        } 

    } 

}
