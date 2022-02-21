// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachAppPolicyFromIdentityResponse} extends {@link TeaModel}
 *
 * <p>DetachAppPolicyFromIdentityResponse</p>
 */
public class DetachAppPolicyFromIdentityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachAppPolicyFromIdentityResponseBody body;

    private DetachAppPolicyFromIdentityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachAppPolicyFromIdentityResponse create() {
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
    public DetachAppPolicyFromIdentityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachAppPolicyFromIdentityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachAppPolicyFromIdentityResponseBody body);

        @Override
        DetachAppPolicyFromIdentityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachAppPolicyFromIdentityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachAppPolicyFromIdentityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachAppPolicyFromIdentityResponse response) {
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
        public Builder body(DetachAppPolicyFromIdentityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachAppPolicyFromIdentityResponse build() {
            return new DetachAppPolicyFromIdentityResponse(this);
        } 

    } 

}
