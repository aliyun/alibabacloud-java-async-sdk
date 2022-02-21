// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListZonesResponse} extends {@link TeaModel}
 *
 * <p>ListZonesResponse</p>
 */
public class ListZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListZonesResponseBody body;

    private ListZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListZonesResponse create() {
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
    public ListZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListZonesResponseBody body);

        @Override
        ListZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListZonesResponse response) {
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
        public Builder body(ListZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListZonesResponse build() {
            return new ListZonesResponse(this);
        } 

    } 

}
