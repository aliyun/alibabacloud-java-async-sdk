// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadAnalyzerRuntimeLogResponse} extends {@link TeaModel}
 *
 * <p>UploadAnalyzerRuntimeLogResponse</p>
 */
public class UploadAnalyzerRuntimeLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UploadAnalyzerRuntimeLogResponseBody body;

    private UploadAnalyzerRuntimeLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UploadAnalyzerRuntimeLogResponse create() {
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
    public UploadAnalyzerRuntimeLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UploadAnalyzerRuntimeLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UploadAnalyzerRuntimeLogResponseBody body);

        @Override
        UploadAnalyzerRuntimeLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UploadAnalyzerRuntimeLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UploadAnalyzerRuntimeLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UploadAnalyzerRuntimeLogResponse response) {
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
        public Builder body(UploadAnalyzerRuntimeLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UploadAnalyzerRuntimeLogResponse build() {
            return new UploadAnalyzerRuntimeLogResponse(this);
        } 

    } 

}
