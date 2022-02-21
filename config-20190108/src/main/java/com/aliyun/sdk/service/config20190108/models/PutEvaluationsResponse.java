// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutEvaluationsResponse} extends {@link TeaModel}
 *
 * <p>PutEvaluationsResponse</p>
 */
public class PutEvaluationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutEvaluationsResponseBody body;

    private PutEvaluationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutEvaluationsResponse create() {
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
    public PutEvaluationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutEvaluationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutEvaluationsResponseBody body);

        @Override
        PutEvaluationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutEvaluationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutEvaluationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutEvaluationsResponse response) {
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
        public Builder body(PutEvaluationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutEvaluationsResponse build() {
            return new PutEvaluationsResponse(this);
        } 

    } 

}
