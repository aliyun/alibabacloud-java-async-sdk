// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateShrinkNodesResponse} extends {@link TeaModel}
 *
 * <p>ValidateShrinkNodesResponse</p>
 */
public class ValidateShrinkNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateShrinkNodesResponseBody body;

    private ValidateShrinkNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateShrinkNodesResponse create() {
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
    public ValidateShrinkNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateShrinkNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateShrinkNodesResponseBody body);

        @Override
        ValidateShrinkNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateShrinkNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateShrinkNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateShrinkNodesResponse response) {
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
        public Builder body(ValidateShrinkNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateShrinkNodesResponse build() {
            return new ValidateShrinkNodesResponse(this);
        } 

    } 

}
