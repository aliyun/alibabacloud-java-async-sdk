// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSimilarityChMedicalResponse} extends {@link TeaModel}
 *
 * <p>GetSimilarityChMedicalResponse</p>
 */
public class GetSimilarityChMedicalResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSimilarityChMedicalResponseBody body;

    private GetSimilarityChMedicalResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSimilarityChMedicalResponse create() {
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
    public GetSimilarityChMedicalResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSimilarityChMedicalResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSimilarityChMedicalResponseBody body);

        @Override
        GetSimilarityChMedicalResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSimilarityChMedicalResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSimilarityChMedicalResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSimilarityChMedicalResponse response) {
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
        public Builder body(GetSimilarityChMedicalResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSimilarityChMedicalResponse build() {
            return new GetSimilarityChMedicalResponse(this);
        } 

    } 

}
