// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpv4GatewaysResponse} extends {@link TeaModel}
 *
 * <p>ListIpv4GatewaysResponse</p>
 */
public class ListIpv4GatewaysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIpv4GatewaysResponseBody body;

    private ListIpv4GatewaysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIpv4GatewaysResponse create() {
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
    public ListIpv4GatewaysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIpv4GatewaysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIpv4GatewaysResponseBody body);

        @Override
        ListIpv4GatewaysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIpv4GatewaysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIpv4GatewaysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIpv4GatewaysResponse response) {
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
        public Builder body(ListIpv4GatewaysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIpv4GatewaysResponse build() {
            return new ListIpv4GatewaysResponse(this);
        } 

    } 

}
