// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDiagnoseResultForSingleCardResponse} extends {@link TeaModel}
 *
 * <p>GetDiagnoseResultForSingleCardResponse</p>
 */
public class GetDiagnoseResultForSingleCardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDiagnoseResultForSingleCardResponseBody body;

    private GetDiagnoseResultForSingleCardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDiagnoseResultForSingleCardResponse create() {
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
    public GetDiagnoseResultForSingleCardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDiagnoseResultForSingleCardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDiagnoseResultForSingleCardResponseBody body);

        @Override
        GetDiagnoseResultForSingleCardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDiagnoseResultForSingleCardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDiagnoseResultForSingleCardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDiagnoseResultForSingleCardResponse response) {
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
        public Builder body(GetDiagnoseResultForSingleCardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDiagnoseResultForSingleCardResponse build() {
            return new GetDiagnoseResultForSingleCardResponse(this);
        } 

    } 

}
