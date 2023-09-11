// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClientKeysResponse} extends {@link TeaModel}
 *
 * <p>ListClientKeysResponse</p>
 */
public class ListClientKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListClientKeysResponseBody body;

    private ListClientKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListClientKeysResponse create() {
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
    public ListClientKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListClientKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListClientKeysResponseBody body);

        @Override
        ListClientKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListClientKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListClientKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListClientKeysResponse response) {
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
        public Builder body(ListClientKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListClientKeysResponse build() {
            return new ListClientKeysResponse(this);
        } 

    } 

}
