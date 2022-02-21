// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushInterventionResponse} extends {@link TeaModel}
 *
 * <p>PushInterventionResponse</p>
 */
public class PushInterventionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushInterventionResponseBody body;

    private PushInterventionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushInterventionResponse create() {
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
    public PushInterventionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushInterventionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushInterventionResponseBody body);

        @Override
        PushInterventionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushInterventionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushInterventionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushInterventionResponse response) {
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
        public Builder body(PushInterventionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushInterventionResponse build() {
            return new PushInterventionResponse(this);
        } 

    } 

}
