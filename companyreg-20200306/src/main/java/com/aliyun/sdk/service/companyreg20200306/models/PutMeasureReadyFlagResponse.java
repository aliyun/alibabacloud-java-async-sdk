// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMeasureReadyFlagResponse} extends {@link TeaModel}
 *
 * <p>PutMeasureReadyFlagResponse</p>
 */
public class PutMeasureReadyFlagResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutMeasureReadyFlagResponseBody body;

    private PutMeasureReadyFlagResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutMeasureReadyFlagResponse create() {
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
    public PutMeasureReadyFlagResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutMeasureReadyFlagResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutMeasureReadyFlagResponseBody body);

        @Override
        PutMeasureReadyFlagResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutMeasureReadyFlagResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutMeasureReadyFlagResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutMeasureReadyFlagResponse response) {
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
        public Builder body(PutMeasureReadyFlagResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutMeasureReadyFlagResponse build() {
            return new PutMeasureReadyFlagResponse(this);
        } 

    } 

}
