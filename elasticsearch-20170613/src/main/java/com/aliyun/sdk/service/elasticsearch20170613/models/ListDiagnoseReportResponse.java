// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiagnoseReportResponse} extends {@link TeaModel}
 *
 * <p>ListDiagnoseReportResponse</p>
 */
public class ListDiagnoseReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDiagnoseReportResponseBody body;

    private ListDiagnoseReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDiagnoseReportResponse create() {
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
    public ListDiagnoseReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDiagnoseReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDiagnoseReportResponseBody body);

        @Override
        ListDiagnoseReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDiagnoseReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDiagnoseReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDiagnoseReportResponse response) {
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
        public Builder body(ListDiagnoseReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDiagnoseReportResponse build() {
            return new ListDiagnoseReportResponse(this);
        } 

    } 

}
