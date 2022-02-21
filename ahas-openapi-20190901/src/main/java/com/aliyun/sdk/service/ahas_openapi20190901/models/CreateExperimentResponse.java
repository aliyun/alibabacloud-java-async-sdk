// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateExperimentResponse} extends {@link TeaModel}
 *
 * <p>CreateExperimentResponse</p>
 */
public class CreateExperimentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateExperimentResponseBody body;

    private CreateExperimentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateExperimentResponse create() {
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
    public CreateExperimentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateExperimentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateExperimentResponseBody body);

        @Override
        CreateExperimentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateExperimentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateExperimentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateExperimentResponse response) {
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
        public Builder body(CreateExperimentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateExperimentResponse build() {
            return new CreateExperimentResponse(this);
        } 

    } 

}
