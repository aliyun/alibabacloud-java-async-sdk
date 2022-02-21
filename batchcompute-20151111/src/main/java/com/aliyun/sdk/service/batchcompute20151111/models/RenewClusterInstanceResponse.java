// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.batchcompute20151111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewClusterInstanceResponse} extends {@link TeaModel}
 *
 * <p>RenewClusterInstanceResponse</p>
 */
public class RenewClusterInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private RenewClusterInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static RenewClusterInstanceResponse create() {
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

    public interface Builder extends Response.Builder<RenewClusterInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        RenewClusterInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewClusterInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewClusterInstanceResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public RenewClusterInstanceResponse build() {
            return new RenewClusterInstanceResponse(this);
        } 

    } 

}
