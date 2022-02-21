// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateScoreForApiResponse} extends {@link TeaModel}
 *
 * <p>UpdateScoreForApiResponse</p>
 */
public class UpdateScoreForApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateScoreForApiResponseBody body;

    private UpdateScoreForApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateScoreForApiResponse create() {
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
    public UpdateScoreForApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateScoreForApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateScoreForApiResponseBody body);

        @Override
        UpdateScoreForApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateScoreForApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateScoreForApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateScoreForApiResponse response) {
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
        public Builder body(UpdateScoreForApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateScoreForApiResponse build() {
            return new UpdateScoreForApiResponse(this);
        } 

    } 

}
