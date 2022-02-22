// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAccessConfigurationsResponse} extends {@link TeaModel}
 *
 * <p>ListAccessConfigurationsResponse</p>
 */
public class ListAccessConfigurationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAccessConfigurationsResponseBody body;

    private ListAccessConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAccessConfigurationsResponse create() {
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
    public ListAccessConfigurationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAccessConfigurationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAccessConfigurationsResponseBody body);

        @Override
        ListAccessConfigurationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAccessConfigurationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAccessConfigurationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAccessConfigurationsResponse response) {
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
        public Builder body(ListAccessConfigurationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAccessConfigurationsResponse build() {
            return new ListAccessConfigurationsResponse(this);
        } 

    } 

}
