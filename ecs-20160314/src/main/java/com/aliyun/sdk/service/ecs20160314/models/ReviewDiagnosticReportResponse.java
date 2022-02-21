// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReviewDiagnosticReportResponse} extends {@link TeaModel}
 *
 * <p>ReviewDiagnosticReportResponse</p>
 */
public class ReviewDiagnosticReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReviewDiagnosticReportResponseBody body;

    private ReviewDiagnosticReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReviewDiagnosticReportResponse create() {
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
    public ReviewDiagnosticReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReviewDiagnosticReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReviewDiagnosticReportResponseBody body);

        @Override
        ReviewDiagnosticReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReviewDiagnosticReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReviewDiagnosticReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReviewDiagnosticReportResponse response) {
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
        public Builder body(ReviewDiagnosticReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReviewDiagnosticReportResponse build() {
            return new ReviewDiagnosticReportResponse(this);
        } 

    } 

}
