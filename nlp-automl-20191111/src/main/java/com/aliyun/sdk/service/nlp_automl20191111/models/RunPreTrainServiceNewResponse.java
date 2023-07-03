// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunPreTrainServiceNewResponse} extends {@link TeaModel}
 *
 * <p>RunPreTrainServiceNewResponse</p>
 */
public class RunPreTrainServiceNewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunPreTrainServiceNewResponseBody body;

    private RunPreTrainServiceNewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunPreTrainServiceNewResponse create() {
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
    public RunPreTrainServiceNewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunPreTrainServiceNewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunPreTrainServiceNewResponseBody body);

        @Override
        RunPreTrainServiceNewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunPreTrainServiceNewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunPreTrainServiceNewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunPreTrainServiceNewResponse response) {
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
        public Builder body(RunPreTrainServiceNewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunPreTrainServiceNewResponse build() {
            return new RunPreTrainServiceNewResponse(this);
        } 

    } 

}
