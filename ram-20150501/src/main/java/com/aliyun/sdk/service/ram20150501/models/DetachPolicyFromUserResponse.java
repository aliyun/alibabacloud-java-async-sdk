// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachPolicyFromUserResponse} extends {@link TeaModel}
 *
 * <p>DetachPolicyFromUserResponse</p>
 */
public class DetachPolicyFromUserResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachPolicyFromUserResponseBody body;

    private DetachPolicyFromUserResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachPolicyFromUserResponse create() {
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
    public DetachPolicyFromUserResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachPolicyFromUserResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachPolicyFromUserResponseBody body);

        @Override
        DetachPolicyFromUserResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachPolicyFromUserResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachPolicyFromUserResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachPolicyFromUserResponse response) {
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
        public Builder body(DetachPolicyFromUserResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachPolicyFromUserResponse build() {
            return new DetachPolicyFromUserResponse(this);
        } 

    } 

}
