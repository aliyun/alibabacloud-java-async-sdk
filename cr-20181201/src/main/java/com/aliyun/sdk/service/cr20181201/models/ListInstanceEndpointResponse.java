// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceEndpointResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceEndpointResponse</p>
 */
public class ListInstanceEndpointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceEndpointResponseBody body;

    private ListInstanceEndpointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceEndpointResponse create() {
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
    public ListInstanceEndpointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceEndpointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceEndpointResponseBody body);

        @Override
        ListInstanceEndpointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceEndpointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceEndpointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceEndpointResponse response) {
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
        public Builder body(ListInstanceEndpointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceEndpointResponse build() {
            return new ListInstanceEndpointResponse(this);
        } 

    } 

}
