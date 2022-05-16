// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInferenceJobResponse} extends {@link TeaModel}
 *
 * <p>CreateInferenceJobResponse</p>
 */
public class CreateInferenceJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInferenceJobResponseBody body;

    private CreateInferenceJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInferenceJobResponse create() {
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
    public CreateInferenceJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInferenceJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInferenceJobResponseBody body);

        @Override
        CreateInferenceJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInferenceJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInferenceJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInferenceJobResponse response) {
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
        public Builder body(CreateInferenceJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInferenceJobResponse build() {
            return new CreateInferenceJobResponse(this);
        } 

    } 

}
