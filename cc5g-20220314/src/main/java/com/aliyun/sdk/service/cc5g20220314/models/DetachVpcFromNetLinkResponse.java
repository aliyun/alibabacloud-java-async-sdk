// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachVpcFromNetLinkResponse} extends {@link TeaModel}
 *
 * <p>DetachVpcFromNetLinkResponse</p>
 */
public class DetachVpcFromNetLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachVpcFromNetLinkResponseBody body;

    private DetachVpcFromNetLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachVpcFromNetLinkResponse create() {
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
    public DetachVpcFromNetLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachVpcFromNetLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachVpcFromNetLinkResponseBody body);

        @Override
        DetachVpcFromNetLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachVpcFromNetLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachVpcFromNetLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachVpcFromNetLinkResponse response) {
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
        public Builder body(DetachVpcFromNetLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachVpcFromNetLinkResponse build() {
            return new DetachVpcFromNetLinkResponse(this);
        } 

    } 

}
