// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBandwidthPackagesResponse} extends {@link TeaModel}
 *
 * <p>ListBandwidthPackagesResponse</p>
 */
public class ListBandwidthPackagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListBandwidthPackagesResponseBody body;

    private ListBandwidthPackagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListBandwidthPackagesResponse create() {
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
    public ListBandwidthPackagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListBandwidthPackagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListBandwidthPackagesResponseBody body);

        @Override
        ListBandwidthPackagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListBandwidthPackagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListBandwidthPackagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListBandwidthPackagesResponse response) {
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
        public Builder body(ListBandwidthPackagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListBandwidthPackagesResponse build() {
            return new ListBandwidthPackagesResponse(this);
        } 

    } 

}
