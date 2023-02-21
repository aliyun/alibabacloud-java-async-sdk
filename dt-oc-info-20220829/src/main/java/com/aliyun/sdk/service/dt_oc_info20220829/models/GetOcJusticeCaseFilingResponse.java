// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeCaseFilingResponse} extends {@link TeaModel}
 *
 * <p>GetOcJusticeCaseFilingResponse</p>
 */
public class GetOcJusticeCaseFilingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcJusticeCaseFilingResponseBody body;

    private GetOcJusticeCaseFilingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcJusticeCaseFilingResponse create() {
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
    public GetOcJusticeCaseFilingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcJusticeCaseFilingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcJusticeCaseFilingResponseBody body);

        @Override
        GetOcJusticeCaseFilingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcJusticeCaseFilingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcJusticeCaseFilingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcJusticeCaseFilingResponse response) {
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
        public Builder body(GetOcJusticeCaseFilingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcJusticeCaseFilingResponse build() {
            return new GetOcJusticeCaseFilingResponse(this);
        } 

    } 

}
