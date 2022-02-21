// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNacosHistoryConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListNacosHistoryConfigsResponse</p>
 */
public class ListNacosHistoryConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNacosHistoryConfigsResponseBody body;

    private ListNacosHistoryConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNacosHistoryConfigsResponse create() {
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
    public ListNacosHistoryConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNacosHistoryConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNacosHistoryConfigsResponseBody body);

        @Override
        ListNacosHistoryConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNacosHistoryConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNacosHistoryConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNacosHistoryConfigsResponse response) {
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
        public Builder body(ListNacosHistoryConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNacosHistoryConfigsResponse build() {
            return new ListNacosHistoryConfigsResponse(this);
        } 

    } 

}
