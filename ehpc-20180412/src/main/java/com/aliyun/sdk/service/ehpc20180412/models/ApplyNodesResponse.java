// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyNodesResponse} extends {@link TeaModel}
 *
 * <p>ApplyNodesResponse</p>
 */
public class ApplyNodesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyNodesResponseBody body;

    private ApplyNodesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyNodesResponse create() {
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
    public ApplyNodesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyNodesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyNodesResponseBody body);

        @Override
        ApplyNodesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyNodesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyNodesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyNodesResponse response) {
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
        public Builder body(ApplyNodesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyNodesResponse build() {
            return new ApplyNodesResponse(this);
        } 

    } 

}
