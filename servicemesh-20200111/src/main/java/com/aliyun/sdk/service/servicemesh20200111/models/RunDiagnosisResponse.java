// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunDiagnosisResponse} extends {@link TeaModel}
 *
 * <p>RunDiagnosisResponse</p>
 */
public class RunDiagnosisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RunDiagnosisResponseBody body;

    private RunDiagnosisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RunDiagnosisResponse create() {
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
    public RunDiagnosisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RunDiagnosisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RunDiagnosisResponseBody body);

        @Override
        RunDiagnosisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RunDiagnosisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RunDiagnosisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RunDiagnosisResponse response) {
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
        public Builder body(RunDiagnosisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RunDiagnosisResponse build() {
            return new RunDiagnosisResponse(this);
        } 

    } 

}
