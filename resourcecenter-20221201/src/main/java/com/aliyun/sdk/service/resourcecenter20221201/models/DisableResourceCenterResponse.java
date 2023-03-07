// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableResourceCenterResponse} extends {@link TeaModel}
 *
 * <p>DisableResourceCenterResponse</p>
 */
public class DisableResourceCenterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableResourceCenterResponseBody body;

    private DisableResourceCenterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableResourceCenterResponse create() {
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
    public DisableResourceCenterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableResourceCenterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableResourceCenterResponseBody body);

        @Override
        DisableResourceCenterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableResourceCenterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableResourceCenterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableResourceCenterResponse response) {
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
        public Builder body(DisableResourceCenterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableResourceCenterResponse build() {
            return new DisableResourceCenterResponse(this);
        } 

    } 

}
