// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCenBandwidthPackageResponse} extends {@link TeaModel}
 *
 * <p>DeleteCenBandwidthPackageResponse</p>
 */
public class DeleteCenBandwidthPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCenBandwidthPackageResponseBody body;

    private DeleteCenBandwidthPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCenBandwidthPackageResponse create() {
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
    public DeleteCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCenBandwidthPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCenBandwidthPackageResponseBody body);

        @Override
        DeleteCenBandwidthPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCenBandwidthPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCenBandwidthPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCenBandwidthPackageResponse response) {
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
        public Builder body(DeleteCenBandwidthPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCenBandwidthPackageResponse build() {
            return new DeleteCenBandwidthPackageResponse(this);
        } 

    } 

}
