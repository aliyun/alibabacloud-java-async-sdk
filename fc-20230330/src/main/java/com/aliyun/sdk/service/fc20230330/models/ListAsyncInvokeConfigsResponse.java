// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAsyncInvokeConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListAsyncInvokeConfigsResponse</p>
 */
public class ListAsyncInvokeConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAsyncInvokeConfigOutput body;

    private ListAsyncInvokeConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAsyncInvokeConfigsResponse create() {
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
    public ListAsyncInvokeConfigOutput getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAsyncInvokeConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAsyncInvokeConfigOutput body);

        @Override
        ListAsyncInvokeConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAsyncInvokeConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAsyncInvokeConfigOutput body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAsyncInvokeConfigsResponse response) {
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
        public Builder body(ListAsyncInvokeConfigOutput body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAsyncInvokeConfigsResponse build() {
            return new ListAsyncInvokeConfigsResponse(this);
        } 

    } 

}
