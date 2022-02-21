// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyContactFieldResponse} extends {@link TeaModel}
 *
 * <p>VerifyContactFieldResponse</p>
 */
public class VerifyContactFieldResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyContactFieldResponseBody body;

    private VerifyContactFieldResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyContactFieldResponse create() {
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
    public VerifyContactFieldResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyContactFieldResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyContactFieldResponseBody body);

        @Override
        VerifyContactFieldResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyContactFieldResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyContactFieldResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyContactFieldResponse response) {
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
        public Builder body(VerifyContactFieldResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyContactFieldResponse build() {
            return new VerifyContactFieldResponse(this);
        } 

    } 

}
