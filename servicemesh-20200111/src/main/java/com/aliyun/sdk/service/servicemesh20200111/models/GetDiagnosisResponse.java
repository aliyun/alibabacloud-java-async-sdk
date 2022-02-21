// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagnosisResponse} extends {@link TeaModel}
 *
 * <p>GetDiagnosisResponse</p>
 */
public class GetDiagnosisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDiagnosisResponseBody body;

    private GetDiagnosisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDiagnosisResponse create() {
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
    public GetDiagnosisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDiagnosisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDiagnosisResponseBody body);

        @Override
        GetDiagnosisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDiagnosisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDiagnosisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDiagnosisResponse response) {
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
        public Builder body(GetDiagnosisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDiagnosisResponse build() {
            return new GetDiagnosisResponse(this);
        } 

    } 

}
