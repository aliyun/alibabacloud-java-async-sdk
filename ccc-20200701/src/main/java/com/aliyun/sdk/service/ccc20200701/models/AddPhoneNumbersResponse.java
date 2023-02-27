// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPhoneNumbersResponse} extends {@link TeaModel}
 *
 * <p>AddPhoneNumbersResponse</p>
 */
public class AddPhoneNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddPhoneNumbersResponseBody body;

    private AddPhoneNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddPhoneNumbersResponse create() {
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
    public AddPhoneNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddPhoneNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddPhoneNumbersResponseBody body);

        @Override
        AddPhoneNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddPhoneNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddPhoneNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddPhoneNumbersResponse response) {
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
        public Builder body(AddPhoneNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddPhoneNumbersResponse build() {
            return new AddPhoneNumbersResponse(this);
        } 

    } 

}
