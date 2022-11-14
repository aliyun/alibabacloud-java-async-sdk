// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunPreTrainServiceResponse} extends {@link TeaModel}
 *
 * <p>RunPreTrainServiceResponse</p>
 */
public class RunPreTrainServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunPreTrainServiceResponseBody body;

    private RunPreTrainServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunPreTrainServiceResponse create() {
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
    public RunPreTrainServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunPreTrainServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunPreTrainServiceResponseBody body);

        @Override
        RunPreTrainServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunPreTrainServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunPreTrainServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunPreTrainServiceResponse response) {
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
        public Builder body(RunPreTrainServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunPreTrainServiceResponse build() {
            return new RunPreTrainServiceResponse(this);
        } 

    } 

}
