// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableControlPlaneLogAlertResponse} extends {@link TeaModel}
 *
 * <p>DisableControlPlaneLogAlertResponse</p>
 */
public class DisableControlPlaneLogAlertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableControlPlaneLogAlertResponseBody body;

    private DisableControlPlaneLogAlertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableControlPlaneLogAlertResponse create() {
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
    public DisableControlPlaneLogAlertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableControlPlaneLogAlertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableControlPlaneLogAlertResponseBody body);

        @Override
        DisableControlPlaneLogAlertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableControlPlaneLogAlertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableControlPlaneLogAlertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableControlPlaneLogAlertResponse response) {
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
        public Builder body(DisableControlPlaneLogAlertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableControlPlaneLogAlertResponse build() {
            return new DisableControlPlaneLogAlertResponse(this);
        } 

    } 

}
