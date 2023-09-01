// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableRightsSeparationResponse} extends {@link TeaModel}
 *
 * <p>EnableRightsSeparationResponse</p>
 */
public class EnableRightsSeparationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableRightsSeparationResponseBody body;

    private EnableRightsSeparationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableRightsSeparationResponse create() {
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
    public EnableRightsSeparationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableRightsSeparationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableRightsSeparationResponseBody body);

        @Override
        EnableRightsSeparationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableRightsSeparationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableRightsSeparationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableRightsSeparationResponse response) {
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
        public Builder body(EnableRightsSeparationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableRightsSeparationResponse build() {
            return new EnableRightsSeparationResponse(this);
        } 

    } 

}
