// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocumentCompareResultResponse} extends {@link TeaModel}
 *
 * <p>GetDocumentCompareResultResponse</p>
 */
public class GetDocumentCompareResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDocumentCompareResultResponseBody body;

    private GetDocumentCompareResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDocumentCompareResultResponse create() {
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
    public GetDocumentCompareResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDocumentCompareResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDocumentCompareResultResponseBody body);

        @Override
        GetDocumentCompareResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDocumentCompareResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDocumentCompareResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDocumentCompareResultResponse response) {
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
        public Builder body(GetDocumentCompareResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDocumentCompareResultResponse build() {
            return new GetDocumentCompareResultResponse(this);
        } 

    } 

}
