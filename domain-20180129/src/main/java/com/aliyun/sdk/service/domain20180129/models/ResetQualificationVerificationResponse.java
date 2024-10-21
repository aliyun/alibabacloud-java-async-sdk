// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ResetQualificationVerificationResponse} extends {@link TeaModel}
 *
 * <p>ResetQualificationVerificationResponse</p>
 */
public class ResetQualificationVerificationResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ResetQualificationVerificationResponseBody body;

    private ResetQualificationVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ResetQualificationVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetQualificationVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ResetQualificationVerificationResponseBody body);

        @Override
        ResetQualificationVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetQualificationVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ResetQualificationVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetQualificationVerificationResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
