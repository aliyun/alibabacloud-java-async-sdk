// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetNodesResponse} extends {@link TeaModel}
 *
 * <p>ResetNodesResponse</p>
 */
public class ResetNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetNodesResponseBody body;

    private ResetNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetNodesResponse create() {
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
    public ResetNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetNodesResponseBody body);

        @Override
        ResetNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetNodesResponse response) {
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
        public Builder body(ResetNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetNodesResponse build() {
            return new ResetNodesResponse(this);
        } 

    } 

}
