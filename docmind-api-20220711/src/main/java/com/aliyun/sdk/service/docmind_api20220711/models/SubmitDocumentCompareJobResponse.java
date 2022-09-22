// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDocumentCompareJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitDocumentCompareJobResponse</p>
 */
public class SubmitDocumentCompareJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitDocumentCompareJobResponseBody body;

    private SubmitDocumentCompareJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitDocumentCompareJobResponse create() {
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
    public SubmitDocumentCompareJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitDocumentCompareJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitDocumentCompareJobResponseBody body);

        @Override
        SubmitDocumentCompareJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitDocumentCompareJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitDocumentCompareJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitDocumentCompareJobResponse response) {
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
        public Builder body(SubmitDocumentCompareJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitDocumentCompareJobResponse build() {
            return new SubmitDocumentCompareJobResponse(this);
        } 

    } 

}
