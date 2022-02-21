// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckExperimentRunnableResponse} extends {@link TeaModel}
 *
 * <p>CheckExperimentRunnableResponse</p>
 */
public class CheckExperimentRunnableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CheckExperimentRunnableResponseBody body;

    private CheckExperimentRunnableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CheckExperimentRunnableResponse create() {
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
    public CheckExperimentRunnableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CheckExperimentRunnableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CheckExperimentRunnableResponseBody body);

        @Override
        CheckExperimentRunnableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CheckExperimentRunnableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CheckExperimentRunnableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CheckExperimentRunnableResponse response) {
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
        public Builder body(CheckExperimentRunnableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CheckExperimentRunnableResponse build() {
            return new CheckExperimentRunnableResponse(this);
        } 

    } 

}
