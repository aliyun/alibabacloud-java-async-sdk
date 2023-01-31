// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOutboundCallNumbersResponse} extends {@link TeaModel}
 *
 * <p>ListOutboundCallNumbersResponse</p>
 */
public class ListOutboundCallNumbersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOutboundCallNumbersResponseBody body;

    private ListOutboundCallNumbersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOutboundCallNumbersResponse create() {
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
    public ListOutboundCallNumbersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOutboundCallNumbersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOutboundCallNumbersResponseBody body);

        @Override
        ListOutboundCallNumbersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOutboundCallNumbersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOutboundCallNumbersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOutboundCallNumbersResponse response) {
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
        public Builder body(ListOutboundCallNumbersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOutboundCallNumbersResponse build() {
            return new ListOutboundCallNumbersResponse(this);
        } 

    } 

}
