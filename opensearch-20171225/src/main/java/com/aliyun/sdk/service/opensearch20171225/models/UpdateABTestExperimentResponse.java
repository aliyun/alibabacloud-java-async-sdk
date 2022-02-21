// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABTestExperimentResponse} extends {@link TeaModel}
 *
 * <p>UpdateABTestExperimentResponse</p>
 */
public class UpdateABTestExperimentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateABTestExperimentResponseBody body;

    private UpdateABTestExperimentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateABTestExperimentResponse create() {
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
    public UpdateABTestExperimentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateABTestExperimentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateABTestExperimentResponseBody body);

        @Override
        UpdateABTestExperimentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateABTestExperimentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateABTestExperimentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateABTestExperimentResponse response) {
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
        public Builder body(UpdateABTestExperimentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateABTestExperimentResponse build() {
            return new UpdateABTestExperimentResponse(this);
        } 

    } 

}
