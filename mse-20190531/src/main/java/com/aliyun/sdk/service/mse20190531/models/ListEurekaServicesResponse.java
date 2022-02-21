// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEurekaServicesResponse} extends {@link TeaModel}
 *
 * <p>ListEurekaServicesResponse</p>
 */
public class ListEurekaServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEurekaServicesResponseBody body;

    private ListEurekaServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEurekaServicesResponse create() {
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
    public ListEurekaServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEurekaServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEurekaServicesResponseBody body);

        @Override
        ListEurekaServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEurekaServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEurekaServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEurekaServicesResponse response) {
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
        public Builder body(ListEurekaServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEurekaServicesResponse build() {
            return new ListEurekaServicesResponse(this);
        } 

    } 

}
