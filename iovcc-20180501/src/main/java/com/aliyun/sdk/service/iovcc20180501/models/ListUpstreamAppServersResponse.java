// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUpstreamAppServersResponse} extends {@link TeaModel}
 *
 * <p>ListUpstreamAppServersResponse</p>
 */
public class ListUpstreamAppServersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUpstreamAppServersResponseBody body;

    private ListUpstreamAppServersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUpstreamAppServersResponse create() {
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
    public ListUpstreamAppServersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUpstreamAppServersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUpstreamAppServersResponseBody body);

        @Override
        ListUpstreamAppServersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUpstreamAppServersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUpstreamAppServersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUpstreamAppServersResponse response) {
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
        public Builder body(ListUpstreamAppServersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUpstreamAppServersResponse build() {
            return new ListUpstreamAppServersResponse(this);
        } 

    } 

}
