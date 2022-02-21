// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTransferableNodesResponse} extends {@link TeaModel}
 *
 * <p>ValidateTransferableNodesResponse</p>
 */
public class ValidateTransferableNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ValidateTransferableNodesResponseBody body;

    private ValidateTransferableNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ValidateTransferableNodesResponse create() {
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
    public ValidateTransferableNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ValidateTransferableNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ValidateTransferableNodesResponseBody body);

        @Override
        ValidateTransferableNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ValidateTransferableNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ValidateTransferableNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ValidateTransferableNodesResponse response) {
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
        public Builder body(ValidateTransferableNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ValidateTransferableNodesResponse build() {
            return new ValidateTransferableNodesResponse(this);
        } 

    } 

}
