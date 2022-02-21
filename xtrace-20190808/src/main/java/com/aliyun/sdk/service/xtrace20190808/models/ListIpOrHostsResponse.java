// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtrace20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIpOrHostsResponse} extends {@link TeaModel}
 *
 * <p>ListIpOrHostsResponse</p>
 */
public class ListIpOrHostsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIpOrHostsResponseBody body;

    private ListIpOrHostsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIpOrHostsResponse create() {
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
    public ListIpOrHostsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIpOrHostsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIpOrHostsResponseBody body);

        @Override
        ListIpOrHostsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIpOrHostsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIpOrHostsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIpOrHostsResponse response) {
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
        public Builder body(ListIpOrHostsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIpOrHostsResponse build() {
            return new ListIpOrHostsResponse(this);
        } 

    } 

}
