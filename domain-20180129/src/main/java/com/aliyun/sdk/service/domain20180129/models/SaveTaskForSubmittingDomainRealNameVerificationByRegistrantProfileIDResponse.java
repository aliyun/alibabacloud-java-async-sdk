// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse} extends {@link TeaModel}
 *
 * <p>SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse</p>
 */
public class SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody body;

    private SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse create() {
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
    public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody body);

        @Override
        SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse response) {
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
        public Builder body(SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse build() {
            return new SaveTaskForSubmittingDomainRealNameVerificationByRegistrantProfileIDResponse(this);
        } 

    } 

}
