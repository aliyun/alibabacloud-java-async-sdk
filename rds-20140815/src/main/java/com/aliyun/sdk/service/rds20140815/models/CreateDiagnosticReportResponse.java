// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiagnosticReportResponse} extends {@link TeaModel}
 *
 * <p>CreateDiagnosticReportResponse</p>
 */
public class CreateDiagnosticReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDiagnosticReportResponseBody body;

    private CreateDiagnosticReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDiagnosticReportResponse create() {
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
    public CreateDiagnosticReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDiagnosticReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDiagnosticReportResponseBody body);

        @Override
        CreateDiagnosticReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDiagnosticReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDiagnosticReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDiagnosticReportResponse response) {
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
        public Builder body(CreateDiagnosticReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDiagnosticReportResponse build() {
            return new CreateDiagnosticReportResponse(this);
        } 

    } 

}
