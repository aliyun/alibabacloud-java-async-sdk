// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RebootNodesResponse} extends {@link TeaModel}
 *
 * <p>RebootNodesResponse</p>
 */
public class RebootNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RebootNodesResponseBody body;

    private RebootNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RebootNodesResponse create() {
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
    public RebootNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RebootNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RebootNodesResponseBody body);

        @Override
        RebootNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RebootNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RebootNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RebootNodesResponse response) {
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
        public Builder body(RebootNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RebootNodesResponse build() {
            return new RebootNodesResponse(this);
        } 

    } 

}
