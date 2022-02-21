// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDisksResponse} extends {@link TeaModel}
 *
 * <p>ListDisksResponse</p>
 */
public class ListDisksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDisksResponseBody body;

    private ListDisksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDisksResponse create() {
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
    public ListDisksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDisksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDisksResponseBody body);

        @Override
        ListDisksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDisksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDisksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDisksResponse response) {
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
        public Builder body(ListDisksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDisksResponse build() {
            return new ListDisksResponse(this);
        } 

    } 

}
