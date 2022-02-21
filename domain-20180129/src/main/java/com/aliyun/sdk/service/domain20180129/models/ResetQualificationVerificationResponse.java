// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetQualificationVerificationResponse} extends {@link TeaModel}
 *
 * <p>ResetQualificationVerificationResponse</p>
 */
public class ResetQualificationVerificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetQualificationVerificationResponseBody body;

    private ResetQualificationVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetQualificationVerificationResponse create() {
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
    public ResetQualificationVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetQualificationVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetQualificationVerificationResponseBody body);

        @Override
        ResetQualificationVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetQualificationVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetQualificationVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetQualificationVerificationResponse response) {
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
        public Builder body(ResetQualificationVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetQualificationVerificationResponse build() {
            return new ResetQualificationVerificationResponse(this);
        } 

    } 

}
