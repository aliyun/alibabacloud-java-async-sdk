// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypeRegistrationsResponse} extends {@link TeaModel}
 *
 * <p>ListResourceTypeRegistrationsResponse</p>
 */
public class ListResourceTypeRegistrationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceTypeRegistrationsResponseBody body;

    private ListResourceTypeRegistrationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceTypeRegistrationsResponse create() {
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
    public ListResourceTypeRegistrationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceTypeRegistrationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceTypeRegistrationsResponseBody body);

        @Override
        ListResourceTypeRegistrationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceTypeRegistrationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceTypeRegistrationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceTypeRegistrationsResponse response) {
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
        public Builder body(ListResourceTypeRegistrationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceTypeRegistrationsResponse build() {
            return new ListResourceTypeRegistrationsResponse(this);
        } 

    } 

}
