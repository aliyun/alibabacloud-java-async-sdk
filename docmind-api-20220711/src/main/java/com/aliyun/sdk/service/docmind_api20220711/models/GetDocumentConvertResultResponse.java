// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocumentConvertResultResponse} extends {@link TeaModel}
 *
 * <p>GetDocumentConvertResultResponse</p>
 */
public class GetDocumentConvertResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDocumentConvertResultResponseBody body;

    private GetDocumentConvertResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDocumentConvertResultResponse create() {
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
    public GetDocumentConvertResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDocumentConvertResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDocumentConvertResultResponseBody body);

        @Override
        GetDocumentConvertResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDocumentConvertResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDocumentConvertResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDocumentConvertResultResponse response) {
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
        public Builder body(GetDocumentConvertResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDocumentConvertResultResponse build() {
            return new GetDocumentConvertResultResponse(this);
        } 

    } 

}
