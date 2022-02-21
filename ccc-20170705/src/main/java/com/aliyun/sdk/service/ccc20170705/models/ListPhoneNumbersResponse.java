// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPhoneNumbersResponse} extends {@link TeaModel}
 *
 * <p>ListPhoneNumbersResponse</p>
 */
public class ListPhoneNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListPhoneNumbersResponseBody body;

    private ListPhoneNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListPhoneNumbersResponse create() {
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
    public ListPhoneNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListPhoneNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListPhoneNumbersResponseBody body);

        @Override
        ListPhoneNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListPhoneNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListPhoneNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListPhoneNumbersResponse response) {
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
        public Builder body(ListPhoneNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListPhoneNumbersResponse build() {
            return new ListPhoneNumbersResponse(this);
        } 

    } 

}
