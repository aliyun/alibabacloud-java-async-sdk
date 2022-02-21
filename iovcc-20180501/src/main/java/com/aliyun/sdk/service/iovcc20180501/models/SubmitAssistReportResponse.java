// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAssistReportResponse} extends {@link TeaModel}
 *
 * <p>SubmitAssistReportResponse</p>
 */
public class SubmitAssistReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitAssistReportResponseBody body;

    private SubmitAssistReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitAssistReportResponse create() {
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
    public SubmitAssistReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitAssistReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitAssistReportResponseBody body);

        @Override
        SubmitAssistReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitAssistReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitAssistReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitAssistReportResponse response) {
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
        public Builder body(SubmitAssistReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitAssistReportResponse build() {
            return new SubmitAssistReportResponse(this);
        } 

    } 

}
