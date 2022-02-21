// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateCredentialReportResponse} extends {@link TeaModel}
 *
 * <p>GenerateCredentialReportResponse</p>
 */
public class GenerateCredentialReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateCredentialReportResponseBody body;

    private GenerateCredentialReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateCredentialReportResponse create() {
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
    public GenerateCredentialReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateCredentialReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateCredentialReportResponseBody body);

        @Override
        GenerateCredentialReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateCredentialReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateCredentialReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateCredentialReportResponse response) {
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
        public Builder body(GenerateCredentialReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateCredentialReportResponse build() {
            return new GenerateCredentialReportResponse(this);
        } 

    } 

}
