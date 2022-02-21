// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnoseReportResponse} extends {@link TeaModel}
 *
 * <p>DescribeDiagnoseReportResponse</p>
 */
public class DescribeDiagnoseReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeDiagnoseReportResponseBody body;

    private DescribeDiagnoseReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeDiagnoseReportResponse create() {
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
    public DescribeDiagnoseReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeDiagnoseReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeDiagnoseReportResponseBody body);

        @Override
        DescribeDiagnoseReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeDiagnoseReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeDiagnoseReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeDiagnoseReportResponse response) {
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
        public Builder body(DescribeDiagnoseReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeDiagnoseReportResponse build() {
            return new DescribeDiagnoseReportResponse(this);
        } 

    } 

}
