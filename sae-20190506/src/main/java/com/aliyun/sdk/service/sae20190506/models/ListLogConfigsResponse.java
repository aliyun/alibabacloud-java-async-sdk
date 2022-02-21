// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLogConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListLogConfigsResponse</p>
 */
public class ListLogConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListLogConfigsResponseBody body;

    private ListLogConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListLogConfigsResponse create() {
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
    public ListLogConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListLogConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListLogConfigsResponseBody body);

        @Override
        ListLogConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListLogConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListLogConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListLogConfigsResponse response) {
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
        public Builder body(ListLogConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListLogConfigsResponse build() {
            return new ListLogConfigsResponse(this);
        } 

    } 

}
