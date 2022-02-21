// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRecommendationTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateRecommendationTaskResponse</p>
 */
public class CreateRecommendationTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRecommendationTaskResponseBody body;

    private CreateRecommendationTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRecommendationTaskResponse create() {
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
    public CreateRecommendationTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRecommendationTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRecommendationTaskResponseBody body);

        @Override
        CreateRecommendationTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRecommendationTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRecommendationTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRecommendationTaskResponse response) {
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
        public Builder body(CreateRecommendationTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRecommendationTaskResponse build() {
            return new CreateRecommendationTaskResponse(this);
        } 

    } 

}
