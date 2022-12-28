// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListImageRegistryRegionResponse} extends {@link TeaModel}
 *
 * <p>ListImageRegistryRegionResponse</p>
 */
public class ListImageRegistryRegionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListImageRegistryRegionResponseBody body;

    private ListImageRegistryRegionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListImageRegistryRegionResponse create() {
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
    public ListImageRegistryRegionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListImageRegistryRegionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListImageRegistryRegionResponseBody body);

        @Override
        ListImageRegistryRegionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListImageRegistryRegionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListImageRegistryRegionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListImageRegistryRegionResponse response) {
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
        public Builder body(ListImageRegistryRegionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListImageRegistryRegionResponse build() {
            return new ListImageRegistryRegionResponse(this);
        } 

    } 

}
