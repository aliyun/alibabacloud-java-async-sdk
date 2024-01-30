// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse} extends {@link TeaModel}
 *
 * <p>SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse</p>
 */
public class SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody body;

    private SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse create() {
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
    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody body);

        @Override
        SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse response) {
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
        public Builder body(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse build() {
            return new SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse(this);
        } 

    } 

}
