// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOutboundNumbersOfUserResponse} extends {@link TeaModel}
 *
 * <p>ListOutboundNumbersOfUserResponse</p>
 */
public class ListOutboundNumbersOfUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOutboundNumbersOfUserResponseBody body;

    private ListOutboundNumbersOfUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOutboundNumbersOfUserResponse create() {
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
    public ListOutboundNumbersOfUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOutboundNumbersOfUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOutboundNumbersOfUserResponseBody body);

        @Override
        ListOutboundNumbersOfUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOutboundNumbersOfUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOutboundNumbersOfUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOutboundNumbersOfUserResponse response) {
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
        public Builder body(ListOutboundNumbersOfUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOutboundNumbersOfUserResponse build() {
            return new ListOutboundNumbersOfUserResponse(this);
        } 

    } 

}
