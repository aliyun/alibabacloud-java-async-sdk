// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReportFpShotJobResultResponse} extends {@link TeaModel}
 *
 * <p>ReportFpShotJobResultResponse</p>
 */
public class ReportFpShotJobResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReportFpShotJobResultResponseBody body;

    private ReportFpShotJobResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReportFpShotJobResultResponse create() {
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
    public ReportFpShotJobResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReportFpShotJobResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReportFpShotJobResultResponseBody body);

        @Override
        ReportFpShotJobResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReportFpShotJobResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReportFpShotJobResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReportFpShotJobResultResponse response) {
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
        public Builder body(ReportFpShotJobResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReportFpShotJobResultResponse build() {
            return new ReportFpShotJobResultResponse(this);
        } 

    } 

}
