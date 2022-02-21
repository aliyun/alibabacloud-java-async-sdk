// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductQuotasResponse} extends {@link TeaModel}
 *
 * <p>ListProductQuotasResponse</p>
 */
public class ListProductQuotasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProductQuotasResponseBody body;

    private ListProductQuotasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProductQuotasResponse create() {
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
    public ListProductQuotasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProductQuotasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProductQuotasResponseBody body);

        @Override
        ListProductQuotasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProductQuotasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProductQuotasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProductQuotasResponse response) {
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
        public Builder body(ListProductQuotasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProductQuotasResponse build() {
            return new ListProductQuotasResponse(this);
        } 

    } 

}
