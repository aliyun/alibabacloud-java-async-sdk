// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceServicesResponse} extends {@link TeaModel}
 *
 * <p>ListResourceServicesResponse</p>
 */
public class ListResourceServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceServicesResponseBody body;

    private ListResourceServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceServicesResponse create() {
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
    public ListResourceServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceServicesResponseBody body);

        @Override
        ListResourceServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceServicesResponse response) {
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
        public Builder body(ListResourceServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceServicesResponse build() {
            return new ListResourceServicesResponse(this);
        } 

    } 

}
