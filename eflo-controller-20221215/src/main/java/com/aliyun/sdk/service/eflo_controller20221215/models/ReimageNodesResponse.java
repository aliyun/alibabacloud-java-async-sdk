// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReimageNodesResponse} extends {@link TeaModel}
 *
 * <p>ReimageNodesResponse</p>
 */
public class ReimageNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReimageNodesResponseBody body;

    private ReimageNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReimageNodesResponse create() {
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
    public ReimageNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReimageNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReimageNodesResponseBody body);

        @Override
        ReimageNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReimageNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReimageNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReimageNodesResponse response) {
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
        public Builder body(ReimageNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReimageNodesResponse build() {
            return new ReimageNodesResponse(this);
        } 

    } 

}
