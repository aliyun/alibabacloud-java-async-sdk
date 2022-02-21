// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOpenAccountLinksResponse} extends {@link TeaModel}
 *
 * <p>ListOpenAccountLinksResponse</p>
 */
public class ListOpenAccountLinksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOpenAccountLinksResponseBody body;

    private ListOpenAccountLinksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOpenAccountLinksResponse create() {
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
    public ListOpenAccountLinksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOpenAccountLinksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOpenAccountLinksResponseBody body);

        @Override
        ListOpenAccountLinksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOpenAccountLinksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOpenAccountLinksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOpenAccountLinksResponse response) {
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
        public Builder body(ListOpenAccountLinksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOpenAccountLinksResponse build() {
            return new ListOpenAccountLinksResponse(this);
        } 

    } 

}
