// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRequestDiagnosisResultResponse} extends {@link TeaModel}
 *
 * <p>GetRequestDiagnosisResultResponse</p>
 */
public class GetRequestDiagnosisResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRequestDiagnosisResultResponseBody body;

    private GetRequestDiagnosisResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRequestDiagnosisResultResponse create() {
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
    public GetRequestDiagnosisResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRequestDiagnosisResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRequestDiagnosisResultResponseBody body);

        @Override
        GetRequestDiagnosisResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRequestDiagnosisResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRequestDiagnosisResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRequestDiagnosisResultResponse response) {
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
        public Builder body(GetRequestDiagnosisResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRequestDiagnosisResultResponse build() {
            return new GetRequestDiagnosisResultResponse(this);
        } 

    } 

}
