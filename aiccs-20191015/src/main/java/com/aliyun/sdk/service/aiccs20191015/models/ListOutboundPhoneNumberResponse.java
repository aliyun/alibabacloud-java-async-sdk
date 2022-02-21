// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOutboundPhoneNumberResponse} extends {@link TeaModel}
 *
 * <p>ListOutboundPhoneNumberResponse</p>
 */
public class ListOutboundPhoneNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOutboundPhoneNumberResponseBody body;

    private ListOutboundPhoneNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOutboundPhoneNumberResponse create() {
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
    public ListOutboundPhoneNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOutboundPhoneNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOutboundPhoneNumberResponseBody body);

        @Override
        ListOutboundPhoneNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOutboundPhoneNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOutboundPhoneNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOutboundPhoneNumberResponse response) {
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
        public Builder body(ListOutboundPhoneNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOutboundPhoneNumberResponse build() {
            return new ListOutboundPhoneNumberResponse(this);
        } 

    } 

}
