// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListZnodeChildrenResponse} extends {@link TeaModel}
 *
 * <p>ListZnodeChildrenResponse</p>
 */
public class ListZnodeChildrenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListZnodeChildrenResponseBody body;

    private ListZnodeChildrenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListZnodeChildrenResponse create() {
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
    public ListZnodeChildrenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListZnodeChildrenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListZnodeChildrenResponseBody body);

        @Override
        ListZnodeChildrenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListZnodeChildrenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListZnodeChildrenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListZnodeChildrenResponse response) {
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
        public Builder body(ListZnodeChildrenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListZnodeChildrenResponse build() {
            return new ListZnodeChildrenResponse(this);
        } 

    } 

}
