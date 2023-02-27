// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCaseFileUploadUrlResponse} extends {@link TeaModel}
 *
 * <p>GetCaseFileUploadUrlResponse</p>
 */
public class GetCaseFileUploadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCaseFileUploadUrlResponseBody body;

    private GetCaseFileUploadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCaseFileUploadUrlResponse create() {
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
    public GetCaseFileUploadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCaseFileUploadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCaseFileUploadUrlResponseBody body);

        @Override
        GetCaseFileUploadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCaseFileUploadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCaseFileUploadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCaseFileUploadUrlResponse response) {
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
        public Builder body(GetCaseFileUploadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCaseFileUploadUrlResponse build() {
            return new GetCaseFileUploadUrlResponse(this);
        } 

    } 

}
