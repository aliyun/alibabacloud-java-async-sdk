// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSubnetsResponse} extends {@link TeaModel}
 *
 * <p>ListSubnetsResponse</p>
 */
public class ListSubnetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSubnetsResponseBody body;

    private ListSubnetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSubnetsResponse create() {
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
    public ListSubnetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSubnetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSubnetsResponseBody body);

        @Override
        ListSubnetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSubnetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSubnetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSubnetsResponse response) {
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
        public Builder body(ListSubnetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSubnetsResponse build() {
            return new ListSubnetsResponse(this);
        } 

    } 

}
