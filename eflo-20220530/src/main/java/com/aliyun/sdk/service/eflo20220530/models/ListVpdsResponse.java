// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpdsResponse} extends {@link TeaModel}
 *
 * <p>ListVpdsResponse</p>
 */
public class ListVpdsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVpdsResponseBody body;

    private ListVpdsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVpdsResponse create() {
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
    public ListVpdsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVpdsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVpdsResponseBody body);

        @Override
        ListVpdsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVpdsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVpdsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVpdsResponse response) {
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
        public Builder body(ListVpdsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVpdsResponse build() {
            return new ListVpdsResponse(this);
        } 

    } 

}
