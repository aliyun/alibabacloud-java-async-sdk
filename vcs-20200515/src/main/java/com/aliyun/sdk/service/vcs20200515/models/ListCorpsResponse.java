// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCorpsResponse} extends {@link TeaModel}
 *
 * <p>ListCorpsResponse</p>
 */
public class ListCorpsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCorpsResponseBody body;

    private ListCorpsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCorpsResponse create() {
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
    public ListCorpsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCorpsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCorpsResponseBody body);

        @Override
        ListCorpsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCorpsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCorpsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCorpsResponse response) {
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
        public Builder body(ListCorpsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCorpsResponse build() {
            return new ListCorpsResponse(this);
        } 

    } 

}
