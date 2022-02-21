// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableControlPlaneLogAlertResponse} extends {@link TeaModel}
 *
 * <p>EnableControlPlaneLogAlertResponse</p>
 */
public class EnableControlPlaneLogAlertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableControlPlaneLogAlertResponseBody body;

    private EnableControlPlaneLogAlertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableControlPlaneLogAlertResponse create() {
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
    public EnableControlPlaneLogAlertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableControlPlaneLogAlertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableControlPlaneLogAlertResponseBody body);

        @Override
        EnableControlPlaneLogAlertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableControlPlaneLogAlertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableControlPlaneLogAlertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableControlPlaneLogAlertResponse response) {
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
        public Builder body(EnableControlPlaneLogAlertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableControlPlaneLogAlertResponse build() {
            return new EnableControlPlaneLogAlertResponse(this);
        } 

    } 

}
