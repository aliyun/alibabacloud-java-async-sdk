// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitDiagnoseTaskForSingleCardResponse} extends {@link TeaModel}
 *
 * <p>SubmitDiagnoseTaskForSingleCardResponse</p>
 */
public class SubmitDiagnoseTaskForSingleCardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitDiagnoseTaskForSingleCardResponseBody body;

    private SubmitDiagnoseTaskForSingleCardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitDiagnoseTaskForSingleCardResponse create() {
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
    public SubmitDiagnoseTaskForSingleCardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitDiagnoseTaskForSingleCardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitDiagnoseTaskForSingleCardResponseBody body);

        @Override
        SubmitDiagnoseTaskForSingleCardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitDiagnoseTaskForSingleCardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitDiagnoseTaskForSingleCardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitDiagnoseTaskForSingleCardResponse response) {
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
        public Builder body(SubmitDiagnoseTaskForSingleCardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitDiagnoseTaskForSingleCardResponse build() {
            return new SubmitDiagnoseTaskForSingleCardResponse(this);
        } 

    } 

}
