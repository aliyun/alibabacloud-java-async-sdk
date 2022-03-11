// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostsResponse} extends {@link TeaModel}
 *
 * <p>ListHostsResponse</p>
 */
public class ListHostsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHostsResponseBody body;

    private ListHostsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHostsResponse create() {
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
    public ListHostsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHostsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHostsResponseBody body);

        @Override
        ListHostsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHostsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHostsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHostsResponse response) {
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
        public Builder body(ListHostsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHostsResponse build() {
            return new ListHostsResponse(this);
        } 

    } 

}
