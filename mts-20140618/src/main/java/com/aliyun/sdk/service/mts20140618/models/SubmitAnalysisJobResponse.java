// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAnalysisJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitAnalysisJobResponse</p>
 */
public class SubmitAnalysisJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitAnalysisJobResponseBody body;

    private SubmitAnalysisJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitAnalysisJobResponse create() {
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
    public SubmitAnalysisJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitAnalysisJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitAnalysisJobResponseBody body);

        @Override
        SubmitAnalysisJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitAnalysisJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitAnalysisJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitAnalysisJobResponse response) {
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
        public Builder body(SubmitAnalysisJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitAnalysisJobResponse build() {
            return new SubmitAnalysisJobResponse(this);
        } 

    } 

}
