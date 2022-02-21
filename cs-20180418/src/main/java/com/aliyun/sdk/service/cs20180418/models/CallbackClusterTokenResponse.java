// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallbackClusterTokenResponse} extends {@link TeaModel}
 *
 * <p>CallbackClusterTokenResponse</p>
 */
public class CallbackClusterTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private CallbackClusterTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static CallbackClusterTokenResponse create() {
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

    public interface Builder extends Response.Builder<CallbackClusterTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        CallbackClusterTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CallbackClusterTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CallbackClusterTokenResponse response) {
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
        public CallbackClusterTokenResponse build() {
            return new CallbackClusterTokenResponse(this);
        } 

    } 

}
