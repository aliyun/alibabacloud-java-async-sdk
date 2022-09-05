// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventBridgeIntegrationsResponse} extends {@link TeaModel}
 *
 * <p>ListEventBridgeIntegrationsResponse</p>
 */
public class ListEventBridgeIntegrationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListEventBridgeIntegrationsResponseBody body;

    private ListEventBridgeIntegrationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListEventBridgeIntegrationsResponse create() {
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
    public ListEventBridgeIntegrationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEventBridgeIntegrationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListEventBridgeIntegrationsResponseBody body);

        @Override
        ListEventBridgeIntegrationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEventBridgeIntegrationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListEventBridgeIntegrationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEventBridgeIntegrationsResponse response) {
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
        public Builder body(ListEventBridgeIntegrationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListEventBridgeIntegrationsResponse build() {
            return new ListEventBridgeIntegrationsResponse(this);
        } 

    } 

}
