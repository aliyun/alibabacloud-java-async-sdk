// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosticReportAttributesResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosticReportAttributesResponse</p>
 */
public class DescribeDiagnosticReportAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiagnosticReportAttributesResponseBody body;

    private DescribeDiagnosticReportAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiagnosticReportAttributesResponse create() {
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
    public DescribeDiagnosticReportAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiagnosticReportAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiagnosticReportAttributesResponseBody body);

        @Override
        DescribeDiagnosticReportAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiagnosticReportAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiagnosticReportAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiagnosticReportAttributesResponse response) {
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
        public Builder body(DescribeDiagnosticReportAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiagnosticReportAttributesResponse build() {
            return new DescribeDiagnosticReportAttributesResponse(this);
        } 

    } 

}
