// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRequestDiagnosisPageResponse} extends {@link TeaModel}
 *
 * <p>GetRequestDiagnosisPageResponse</p>
 */
public class GetRequestDiagnosisPageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRequestDiagnosisPageResponseBody body;

    private GetRequestDiagnosisPageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRequestDiagnosisPageResponse create() {
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
    public GetRequestDiagnosisPageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRequestDiagnosisPageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRequestDiagnosisPageResponseBody body);

        @Override
        GetRequestDiagnosisPageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRequestDiagnosisPageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRequestDiagnosisPageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRequestDiagnosisPageResponse response) {
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
        public Builder body(GetRequestDiagnosisPageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRequestDiagnosisPageResponse build() {
            return new GetRequestDiagnosisPageResponse(this);
        } 

    } 

}
