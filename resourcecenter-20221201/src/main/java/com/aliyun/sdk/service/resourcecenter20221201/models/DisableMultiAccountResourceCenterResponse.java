// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableMultiAccountResourceCenterResponse} extends {@link TeaModel}
 *
 * <p>DisableMultiAccountResourceCenterResponse</p>
 */
public class DisableMultiAccountResourceCenterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableMultiAccountResourceCenterResponseBody body;

    private DisableMultiAccountResourceCenterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableMultiAccountResourceCenterResponse create() {
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
    public DisableMultiAccountResourceCenterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableMultiAccountResourceCenterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableMultiAccountResourceCenterResponseBody body);

        @Override
        DisableMultiAccountResourceCenterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableMultiAccountResourceCenterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableMultiAccountResourceCenterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableMultiAccountResourceCenterResponse response) {
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
        public Builder body(DisableMultiAccountResourceCenterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableMultiAccountResourceCenterResponse build() {
            return new DisableMultiAccountResourceCenterResponse(this);
        } 

    } 

}
