// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloseDiagnosisResponse} extends {@link TeaModel}
 *
 * <p>CloseDiagnosisResponse</p>
 */
public class CloseDiagnosisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CloseDiagnosisResponseBody body;

    private CloseDiagnosisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CloseDiagnosisResponse create() {
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
    public CloseDiagnosisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CloseDiagnosisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CloseDiagnosisResponseBody body);

        @Override
        CloseDiagnosisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CloseDiagnosisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CloseDiagnosisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CloseDiagnosisResponse response) {
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
        public Builder body(CloseDiagnosisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CloseDiagnosisResponse build() {
            return new CloseDiagnosisResponse(this);
        } 

    } 

}
