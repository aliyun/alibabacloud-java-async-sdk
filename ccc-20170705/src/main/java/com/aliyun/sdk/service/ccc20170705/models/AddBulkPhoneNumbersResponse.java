// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddBulkPhoneNumbersResponse} extends {@link TeaModel}
 *
 * <p>AddBulkPhoneNumbersResponse</p>
 */
public class AddBulkPhoneNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddBulkPhoneNumbersResponseBody body;

    private AddBulkPhoneNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddBulkPhoneNumbersResponse create() {
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
    public AddBulkPhoneNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddBulkPhoneNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddBulkPhoneNumbersResponseBody body);

        @Override
        AddBulkPhoneNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddBulkPhoneNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddBulkPhoneNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddBulkPhoneNumbersResponse response) {
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
        public Builder body(AddBulkPhoneNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddBulkPhoneNumbersResponse build() {
            return new AddBulkPhoneNumbersResponse(this);
        } 

    } 

}
