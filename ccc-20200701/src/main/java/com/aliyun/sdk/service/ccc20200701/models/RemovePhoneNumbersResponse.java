// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePhoneNumbersResponse} extends {@link TeaModel}
 *
 * <p>RemovePhoneNumbersResponse</p>
 */
public class RemovePhoneNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemovePhoneNumbersResponseBody body;

    private RemovePhoneNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemovePhoneNumbersResponse create() {
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
    public RemovePhoneNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemovePhoneNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemovePhoneNumbersResponseBody body);

        @Override
        RemovePhoneNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemovePhoneNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemovePhoneNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemovePhoneNumbersResponse response) {
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
        public Builder body(RemovePhoneNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemovePhoneNumbersResponse build() {
            return new RemovePhoneNumbersResponse(this);
        } 

    } 

}
