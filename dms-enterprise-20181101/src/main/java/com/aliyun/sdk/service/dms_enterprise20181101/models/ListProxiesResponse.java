// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProxiesResponse} extends {@link TeaModel}
 *
 * <p>ListProxiesResponse</p>
 */
public class ListProxiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProxiesResponseBody body;

    private ListProxiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProxiesResponse create() {
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
    public ListProxiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProxiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProxiesResponseBody body);

        @Override
        ListProxiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProxiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProxiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProxiesResponse response) {
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
        public Builder body(ListProxiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProxiesResponse build() {
            return new ListProxiesResponse(this);
        } 

    } 

}
