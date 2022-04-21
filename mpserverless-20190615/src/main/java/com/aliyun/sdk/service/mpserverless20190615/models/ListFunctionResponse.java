// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionResponse} extends {@link TeaModel}
 *
 * <p>ListFunctionResponse</p>
 */
public class ListFunctionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFunctionResponseBody body;

    private ListFunctionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFunctionResponse create() {
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
    public ListFunctionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFunctionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFunctionResponseBody body);

        @Override
        ListFunctionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFunctionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFunctionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFunctionResponse response) {
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
        public Builder body(ListFunctionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFunctionResponse build() {
            return new ListFunctionResponse(this);
        } 

    } 

}
