// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ForceActivationResponse} extends {@link TeaModel}
 *
 * <p>ForceActivationResponse</p>
 */
public class ForceActivationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ForceActivationResponseBody body;

    private ForceActivationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ForceActivationResponse create() {
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
    public ForceActivationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ForceActivationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ForceActivationResponseBody body);

        @Override
        ForceActivationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ForceActivationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ForceActivationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ForceActivationResponse response) {
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
        public Builder body(ForceActivationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ForceActivationResponse build() {
            return new ForceActivationResponse(this);
        } 

    } 

}
