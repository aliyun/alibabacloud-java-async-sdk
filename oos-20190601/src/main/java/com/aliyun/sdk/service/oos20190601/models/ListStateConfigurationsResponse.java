// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStateConfigurationsResponse} extends {@link TeaModel}
 *
 * <p>ListStateConfigurationsResponse</p>
 */
public class ListStateConfigurationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStateConfigurationsResponseBody body;

    private ListStateConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStateConfigurationsResponse create() {
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
    public ListStateConfigurationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStateConfigurationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStateConfigurationsResponseBody body);

        @Override
        ListStateConfigurationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStateConfigurationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStateConfigurationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStateConfigurationsResponse response) {
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
        public Builder body(ListStateConfigurationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStateConfigurationsResponse build() {
            return new ListStateConfigurationsResponse(this);
        } 

    } 

}
