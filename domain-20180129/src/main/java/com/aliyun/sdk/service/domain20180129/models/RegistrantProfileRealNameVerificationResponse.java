// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegistrantProfileRealNameVerificationResponse} extends {@link TeaModel}
 *
 * <p>RegistrantProfileRealNameVerificationResponse</p>
 */
public class RegistrantProfileRealNameVerificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegistrantProfileRealNameVerificationResponseBody body;

    private RegistrantProfileRealNameVerificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegistrantProfileRealNameVerificationResponse create() {
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
    public RegistrantProfileRealNameVerificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegistrantProfileRealNameVerificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegistrantProfileRealNameVerificationResponseBody body);

        @Override
        RegistrantProfileRealNameVerificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegistrantProfileRealNameVerificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegistrantProfileRealNameVerificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegistrantProfileRealNameVerificationResponse response) {
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
        public Builder body(RegistrantProfileRealNameVerificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegistrantProfileRealNameVerificationResponse build() {
            return new RegistrantProfileRealNameVerificationResponse(this);
        } 

    } 

}
