// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNatIpsResponse} extends {@link TeaModel}
 *
 * <p>ListNatIpsResponse</p>
 */
public class ListNatIpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNatIpsResponseBody body;

    private ListNatIpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNatIpsResponse create() {
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
    public ListNatIpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNatIpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNatIpsResponseBody body);

        @Override
        ListNatIpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNatIpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNatIpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNatIpsResponse response) {
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
        public Builder body(ListNatIpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNatIpsResponse build() {
            return new ListNatIpsResponse(this);
        } 

    } 

}
