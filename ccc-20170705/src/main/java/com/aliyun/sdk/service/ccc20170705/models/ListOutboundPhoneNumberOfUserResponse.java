// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOutboundPhoneNumberOfUserResponse} extends {@link TeaModel}
 *
 * <p>ListOutboundPhoneNumberOfUserResponse</p>
 */
public class ListOutboundPhoneNumberOfUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOutboundPhoneNumberOfUserResponseBody body;

    private ListOutboundPhoneNumberOfUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOutboundPhoneNumberOfUserResponse create() {
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
    public ListOutboundPhoneNumberOfUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOutboundPhoneNumberOfUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOutboundPhoneNumberOfUserResponseBody body);

        @Override
        ListOutboundPhoneNumberOfUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOutboundPhoneNumberOfUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOutboundPhoneNumberOfUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOutboundPhoneNumberOfUserResponse response) {
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
        public Builder body(ListOutboundPhoneNumberOfUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOutboundPhoneNumberOfUserResponse build() {
            return new ListOutboundPhoneNumberOfUserResponse(this);
        } 

    } 

}
