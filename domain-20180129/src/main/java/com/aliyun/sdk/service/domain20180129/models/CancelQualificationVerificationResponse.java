// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelQualificationVerificationResponse} extends {@link TeaModel}
 *
 * <p>CancelQualificationVerificationResponse</p>
 */
public class CancelQualificationVerificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelQualificationVerificationResponseBody body;

    private CancelQualificationVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelQualificationVerificationResponse create() {
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
    public CancelQualificationVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelQualificationVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelQualificationVerificationResponseBody body);

        @Override
        CancelQualificationVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelQualificationVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelQualificationVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelQualificationVerificationResponse response) {
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
        public Builder body(CancelQualificationVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelQualificationVerificationResponse build() {
            return new CancelQualificationVerificationResponse(this);
        } 

    } 

}
