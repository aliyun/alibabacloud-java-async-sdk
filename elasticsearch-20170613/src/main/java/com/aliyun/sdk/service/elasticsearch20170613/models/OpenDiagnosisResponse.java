// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenDiagnosisResponse} extends {@link TeaModel}
 *
 * <p>OpenDiagnosisResponse</p>
 */
public class OpenDiagnosisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenDiagnosisResponseBody body;

    private OpenDiagnosisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenDiagnosisResponse create() {
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
    public OpenDiagnosisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenDiagnosisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenDiagnosisResponseBody body);

        @Override
        OpenDiagnosisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenDiagnosisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenDiagnosisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenDiagnosisResponse response) {
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
        public Builder body(OpenDiagnosisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenDiagnosisResponse build() {
            return new OpenDiagnosisResponse(this);
        } 

    } 

}
