// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserKeysResponse} extends {@link TeaModel}
 *
 * <p>ListUserKeysResponse</p>
 */
public class ListUserKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListUserKeysResponseBody body;

    private ListUserKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListUserKeysResponse create() {
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
    public ListUserKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListUserKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListUserKeysResponseBody body);

        @Override
        ListUserKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListUserKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListUserKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListUserKeysResponse response) {
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
        public Builder body(ListUserKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListUserKeysResponse build() {
            return new ListUserKeysResponse(this);
        } 

    } 

}
