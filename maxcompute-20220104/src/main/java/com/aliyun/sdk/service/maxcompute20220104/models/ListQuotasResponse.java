// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotasResponse} extends {@link TeaModel}
 *
 * <p>ListQuotasResponse</p>
 */
public class ListQuotasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListQuotasResponseBody body;

    private ListQuotasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListQuotasResponse create() {
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
    public ListQuotasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListQuotasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListQuotasResponseBody body);

        @Override
        ListQuotasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListQuotasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListQuotasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListQuotasResponse response) {
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
        public Builder body(ListQuotasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListQuotasResponse build() {
            return new ListQuotasResponse(this);
        } 

    } 

}
