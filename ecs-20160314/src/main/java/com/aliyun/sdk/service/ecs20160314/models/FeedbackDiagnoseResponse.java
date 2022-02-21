// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FeedbackDiagnoseResponse} extends {@link TeaModel}
 *
 * <p>FeedbackDiagnoseResponse</p>
 */
public class FeedbackDiagnoseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private FeedbackDiagnoseResponseBody body;

    private FeedbackDiagnoseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static FeedbackDiagnoseResponse create() {
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
    public FeedbackDiagnoseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<FeedbackDiagnoseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(FeedbackDiagnoseResponseBody body);

        @Override
        FeedbackDiagnoseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<FeedbackDiagnoseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private FeedbackDiagnoseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(FeedbackDiagnoseResponse response) {
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
        public Builder body(FeedbackDiagnoseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public FeedbackDiagnoseResponse build() {
            return new FeedbackDiagnoseResponse(this);
        } 

    } 

}
