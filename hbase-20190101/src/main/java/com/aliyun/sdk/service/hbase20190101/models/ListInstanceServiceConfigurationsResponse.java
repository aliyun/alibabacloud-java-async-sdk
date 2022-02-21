// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceServiceConfigurationsResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceServiceConfigurationsResponse</p>
 */
public class ListInstanceServiceConfigurationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceServiceConfigurationsResponseBody body;

    private ListInstanceServiceConfigurationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceServiceConfigurationsResponse create() {
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
    public ListInstanceServiceConfigurationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceServiceConfigurationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceServiceConfigurationsResponseBody body);

        @Override
        ListInstanceServiceConfigurationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceServiceConfigurationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceServiceConfigurationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceServiceConfigurationsResponse response) {
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
        public Builder body(ListInstanceServiceConfigurationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceServiceConfigurationsResponse build() {
            return new ListInstanceServiceConfigurationsResponse(this);
        } 

    } 

}
