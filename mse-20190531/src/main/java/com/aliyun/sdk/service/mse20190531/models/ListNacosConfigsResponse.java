// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNacosConfigsResponse} extends {@link TeaModel}
 *
 * <p>ListNacosConfigsResponse</p>
 */
public class ListNacosConfigsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListNacosConfigsResponseBody body;

    private ListNacosConfigsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListNacosConfigsResponse create() {
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
    public ListNacosConfigsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListNacosConfigsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListNacosConfigsResponseBody body);

        @Override
        ListNacosConfigsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListNacosConfigsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListNacosConfigsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListNacosConfigsResponse response) {
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
        public Builder body(ListNacosConfigsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListNacosConfigsResponse build() {
            return new ListNacosConfigsResponse(this);
        } 

    } 

}
