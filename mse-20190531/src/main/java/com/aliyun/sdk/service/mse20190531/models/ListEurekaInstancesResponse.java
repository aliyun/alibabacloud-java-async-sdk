// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEurekaInstancesResponse} extends {@link TeaModel}
 *
 * <p>ListEurekaInstancesResponse</p>
 */
public class ListEurekaInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEurekaInstancesResponseBody body;

    private ListEurekaInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEurekaInstancesResponse create() {
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
    public ListEurekaInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEurekaInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEurekaInstancesResponseBody body);

        @Override
        ListEurekaInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEurekaInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEurekaInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEurekaInstancesResponse response) {
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
        public Builder body(ListEurekaInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEurekaInstancesResponse build() {
            return new ListEurekaInstancesResponse(this);
        } 

    } 

}
