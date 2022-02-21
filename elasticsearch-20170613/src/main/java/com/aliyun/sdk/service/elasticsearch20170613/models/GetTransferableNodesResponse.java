// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTransferableNodesResponse} extends {@link TeaModel}
 *
 * <p>GetTransferableNodesResponse</p>
 */
public class GetTransferableNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTransferableNodesResponseBody body;

    private GetTransferableNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTransferableNodesResponse create() {
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
    public GetTransferableNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTransferableNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTransferableNodesResponseBody body);

        @Override
        GetTransferableNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTransferableNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTransferableNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTransferableNodesResponse response) {
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
        public Builder body(GetTransferableNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTransferableNodesResponse build() {
            return new GetTransferableNodesResponse(this);
        } 

    } 

}
