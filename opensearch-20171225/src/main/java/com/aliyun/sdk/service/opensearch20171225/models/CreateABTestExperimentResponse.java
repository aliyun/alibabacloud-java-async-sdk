// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateABTestExperimentResponse} extends {@link TeaModel}
 *
 * <p>CreateABTestExperimentResponse</p>
 */
public class CreateABTestExperimentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateABTestExperimentResponseBody body;

    private CreateABTestExperimentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateABTestExperimentResponse create() {
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
    public CreateABTestExperimentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateABTestExperimentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateABTestExperimentResponseBody body);

        @Override
        CreateABTestExperimentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateABTestExperimentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateABTestExperimentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateABTestExperimentResponse response) {
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
        public Builder body(CreateABTestExperimentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateABTestExperimentResponse build() {
            return new CreateABTestExperimentResponse(this);
        } 

    } 

}
