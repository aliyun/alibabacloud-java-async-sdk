// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrdersResponse} extends {@link TeaModel}
 *
 * <p>ListOrdersResponse</p>
 */
public class ListOrdersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListOrdersResponseBody body;

    private ListOrdersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListOrdersResponse create() {
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
    public ListOrdersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListOrdersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListOrdersResponseBody body);

        @Override
        ListOrdersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListOrdersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListOrdersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListOrdersResponse response) {
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
        public Builder body(ListOrdersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListOrdersResponse build() {
            return new ListOrdersResponse(this);
        } 

    } 

}
