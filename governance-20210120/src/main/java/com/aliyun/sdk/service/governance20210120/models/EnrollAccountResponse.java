// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnrollAccountResponse} extends {@link TeaModel}
 *
 * <p>EnrollAccountResponse</p>
 */
public class EnrollAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnrollAccountResponseBody body;

    private EnrollAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnrollAccountResponse create() {
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
    public EnrollAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnrollAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnrollAccountResponseBody body);

        @Override
        EnrollAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnrollAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnrollAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnrollAccountResponse response) {
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
        public Builder body(EnrollAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnrollAccountResponse build() {
            return new EnrollAccountResponse(this);
        } 

    } 

}
