// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushReportResponse} extends {@link TeaModel}
 *
 * <p>PushReportResponse</p>
 */
public class PushReportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushReportResponseBody body;

    private PushReportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushReportResponse create() {
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
    public PushReportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushReportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushReportResponseBody body);

        @Override
        PushReportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushReportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushReportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushReportResponse response) {
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
        public Builder body(PushReportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushReportResponse build() {
            return new PushReportResponse(this);
        } 

    } 

}
