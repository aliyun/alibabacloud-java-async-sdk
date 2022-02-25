// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitImageAnalysisOutputResponse} extends {@link TeaModel}
 *
 * <p>SubmitImageAnalysisOutputResponse</p>
 */
public class SubmitImageAnalysisOutputResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitImageAnalysisOutputResponseBody body;

    private SubmitImageAnalysisOutputResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitImageAnalysisOutputResponse create() {
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
    public SubmitImageAnalysisOutputResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitImageAnalysisOutputResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitImageAnalysisOutputResponseBody body);

        @Override
        SubmitImageAnalysisOutputResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitImageAnalysisOutputResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitImageAnalysisOutputResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitImageAnalysisOutputResponse response) {
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
        public Builder body(SubmitImageAnalysisOutputResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitImageAnalysisOutputResponse build() {
            return new SubmitImageAnalysisOutputResponse(this);
        } 

    } 

}
