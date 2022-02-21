// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeFaceQualityResponse} extends {@link TeaModel}
 *
 * <p>RecognizeFaceQualityResponse</p>
 */
public class RecognizeFaceQualityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeFaceQualityResponseBody body;

    private RecognizeFaceQualityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeFaceQualityResponse create() {
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
    public RecognizeFaceQualityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeFaceQualityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeFaceQualityResponseBody body);

        @Override
        RecognizeFaceQualityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeFaceQualityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeFaceQualityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeFaceQualityResponse response) {
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
        public Builder body(RecognizeFaceQualityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeFaceQualityResponse build() {
            return new RecognizeFaceQualityResponse(this);
        } 

    } 

}
