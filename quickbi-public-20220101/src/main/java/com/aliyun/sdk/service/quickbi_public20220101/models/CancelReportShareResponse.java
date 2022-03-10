// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelReportShareResponse} extends {@link TeaModel}
 *
 * <p>CancelReportShareResponse</p>
 */
public class CancelReportShareResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelReportShareResponseBody body;

    private CancelReportShareResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelReportShareResponse create() {
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
    public CancelReportShareResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelReportShareResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelReportShareResponseBody body);

        @Override
        CancelReportShareResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelReportShareResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelReportShareResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelReportShareResponse response) {
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
        public Builder body(CancelReportShareResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelReportShareResponse build() {
            return new CancelReportShareResponse(this);
        } 

    } 

}
