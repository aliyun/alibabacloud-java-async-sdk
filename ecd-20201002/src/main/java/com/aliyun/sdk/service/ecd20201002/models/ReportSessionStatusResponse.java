// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportSessionStatusResponse} extends {@link TeaModel}
 *
 * <p>ReportSessionStatusResponse</p>
 */
public class ReportSessionStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReportSessionStatusResponseBody body;

    private ReportSessionStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReportSessionStatusResponse create() {
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
    public ReportSessionStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReportSessionStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReportSessionStatusResponseBody body);

        @Override
        ReportSessionStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReportSessionStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReportSessionStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReportSessionStatusResponse response) {
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
        public Builder body(ReportSessionStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReportSessionStatusResponse build() {
            return new ReportSessionStatusResponse(this);
        } 

    } 

}
