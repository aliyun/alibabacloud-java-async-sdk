// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableUnderstandingResultResponse} extends {@link TeaModel}
 *
 * <p>GetTableUnderstandingResultResponse</p>
 */
public class GetTableUnderstandingResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTableUnderstandingResultResponseBody body;

    private GetTableUnderstandingResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTableUnderstandingResultResponse create() {
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
    public GetTableUnderstandingResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTableUnderstandingResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTableUnderstandingResultResponseBody body);

        @Override
        GetTableUnderstandingResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTableUnderstandingResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTableUnderstandingResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTableUnderstandingResultResponse response) {
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
        public Builder body(GetTableUnderstandingResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTableUnderstandingResultResponse build() {
            return new GetTableUnderstandingResultResponse(this);
        } 

    } 

}
