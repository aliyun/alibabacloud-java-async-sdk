// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody body;

    private SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
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
     * @return body
     */
    public SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody body);

        @Override
        SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveTaskForSubmittingDomainRealNameVerificationByIdentityCredentialResponse response) {
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
