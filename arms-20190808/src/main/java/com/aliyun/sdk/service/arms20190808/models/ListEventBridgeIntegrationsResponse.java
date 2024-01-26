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
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private ListEventBridgeIntegrationsResponseBody body;

    private ListEventBridgeIntegrationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ListEventBridgeIntegrationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListEventBridgeIntegrationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ListEventBridgeIntegrationsResponseBody body);

        @Override
        ListEventBridgeIntegrationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListEventBridgeIntegrationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ListEventBridgeIntegrationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListEventBridgeIntegrationsResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
