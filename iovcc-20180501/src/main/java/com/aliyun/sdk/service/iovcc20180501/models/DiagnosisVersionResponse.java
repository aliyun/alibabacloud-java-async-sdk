// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnosisVersionResponse} extends {@link TeaModel}
 *
 * <p>DiagnosisVersionResponse</p>
 */
public class DiagnosisVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DiagnosisVersionResponseBody body;

    private DiagnosisVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DiagnosisVersionResponse create() {
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
    public DiagnosisVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DiagnosisVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DiagnosisVersionResponseBody body);

        @Override
        DiagnosisVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DiagnosisVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DiagnosisVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DiagnosisVersionResponse response) {
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
        public Builder body(DiagnosisVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DiagnosisVersionResponse build() {
            return new DiagnosisVersionResponse(this);
        } 

    } 

}
