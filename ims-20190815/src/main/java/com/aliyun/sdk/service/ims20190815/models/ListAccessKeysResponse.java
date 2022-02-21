// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessKeysResponse} extends {@link TeaModel}
 *
 * <p>ListAccessKeysResponse</p>
 */
public class ListAccessKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAccessKeysResponseBody body;

    private ListAccessKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAccessKeysResponse create() {
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
    public ListAccessKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAccessKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAccessKeysResponseBody body);

        @Override
        ListAccessKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAccessKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAccessKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAccessKeysResponse response) {
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
        public Builder body(ListAccessKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAccessKeysResponse build() {
            return new ListAccessKeysResponse(this);
        } 

    } 

}
