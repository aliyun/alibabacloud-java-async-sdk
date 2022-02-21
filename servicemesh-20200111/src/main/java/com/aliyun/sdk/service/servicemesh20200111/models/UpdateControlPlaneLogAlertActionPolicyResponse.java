// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateControlPlaneLogAlertActionPolicyResponse} extends {@link TeaModel}
 *
 * <p>UpdateControlPlaneLogAlertActionPolicyResponse</p>
 */
public class UpdateControlPlaneLogAlertActionPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateControlPlaneLogAlertActionPolicyResponseBody body;

    private UpdateControlPlaneLogAlertActionPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateControlPlaneLogAlertActionPolicyResponse create() {
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
    public UpdateControlPlaneLogAlertActionPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateControlPlaneLogAlertActionPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateControlPlaneLogAlertActionPolicyResponseBody body);

        @Override
        UpdateControlPlaneLogAlertActionPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateControlPlaneLogAlertActionPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateControlPlaneLogAlertActionPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateControlPlaneLogAlertActionPolicyResponse response) {
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
        public Builder body(UpdateControlPlaneLogAlertActionPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateControlPlaneLogAlertActionPolicyResponse build() {
            return new UpdateControlPlaneLogAlertActionPolicyResponse(this);
        } 

    } 

}
