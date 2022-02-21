// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePhoneNumberResponse} extends {@link TeaModel}
 *
 * <p>RemovePhoneNumberResponse</p>
 */
public class RemovePhoneNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemovePhoneNumberResponseBody body;

    private RemovePhoneNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemovePhoneNumberResponse create() {
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
    public RemovePhoneNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemovePhoneNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemovePhoneNumberResponseBody body);

        @Override
        RemovePhoneNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemovePhoneNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemovePhoneNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemovePhoneNumberResponse response) {
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
        public Builder body(RemovePhoneNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemovePhoneNumberResponse build() {
            return new RemovePhoneNumberResponse(this);
        } 

    } 

}
