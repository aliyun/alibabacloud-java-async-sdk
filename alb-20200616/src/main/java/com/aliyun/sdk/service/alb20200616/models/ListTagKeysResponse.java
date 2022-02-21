// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTagKeysResponse} extends {@link TeaModel}
 *
 * <p>ListTagKeysResponse</p>
 */
public class ListTagKeysResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTagKeysResponseBody body;

    private ListTagKeysResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTagKeysResponse create() {
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
    public ListTagKeysResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTagKeysResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTagKeysResponseBody body);

        @Override
        ListTagKeysResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTagKeysResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTagKeysResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTagKeysResponse response) {
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
        public Builder body(ListTagKeysResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTagKeysResponse build() {
            return new ListTagKeysResponse(this);
        } 

    } 

}
