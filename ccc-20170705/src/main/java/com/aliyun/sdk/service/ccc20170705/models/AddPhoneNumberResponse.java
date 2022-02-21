// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPhoneNumberResponse} extends {@link TeaModel}
 *
 * <p>AddPhoneNumberResponse</p>
 */
public class AddPhoneNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddPhoneNumberResponseBody body;

    private AddPhoneNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddPhoneNumberResponse create() {
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
    public AddPhoneNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPhoneNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddPhoneNumberResponseBody body);

        @Override
        AddPhoneNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPhoneNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddPhoneNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPhoneNumberResponse response) {
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
        public Builder body(AddPhoneNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPhoneNumberResponse build() {
            return new AddPhoneNumberResponse(this);
        } 

    } 

}
