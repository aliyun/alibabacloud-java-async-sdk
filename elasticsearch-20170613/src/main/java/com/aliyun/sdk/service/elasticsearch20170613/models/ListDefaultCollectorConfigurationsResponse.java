// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDefaultCollectorConfigurationsResponse} extends {@link TeaModel}
 *
 * <p>ListDefaultCollectorConfigurationsResponse</p>
 */
public class ListDefaultCollectorConfigurationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDefaultCollectorConfigurationsResponseBody body;

    private ListDefaultCollectorConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDefaultCollectorConfigurationsResponse create() {
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
    public ListDefaultCollectorConfigurationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDefaultCollectorConfigurationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDefaultCollectorConfigurationsResponseBody body);

        @Override
        ListDefaultCollectorConfigurationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDefaultCollectorConfigurationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDefaultCollectorConfigurationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDefaultCollectorConfigurationsResponse response) {
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
        public Builder body(ListDefaultCollectorConfigurationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDefaultCollectorConfigurationsResponse build() {
            return new ListDefaultCollectorConfigurationsResponse(this);
        } 

    } 

}
