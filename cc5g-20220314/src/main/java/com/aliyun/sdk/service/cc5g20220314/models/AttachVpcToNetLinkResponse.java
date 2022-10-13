// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachVpcToNetLinkResponse} extends {@link TeaModel}
 *
 * <p>AttachVpcToNetLinkResponse</p>
 */
public class AttachVpcToNetLinkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachVpcToNetLinkResponseBody body;

    private AttachVpcToNetLinkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachVpcToNetLinkResponse create() {
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
    public AttachVpcToNetLinkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachVpcToNetLinkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachVpcToNetLinkResponseBody body);

        @Override
        AttachVpcToNetLinkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachVpcToNetLinkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachVpcToNetLinkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachVpcToNetLinkResponse response) {
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
        public Builder body(AttachVpcToNetLinkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachVpcToNetLinkResponse build() {
            return new AttachVpcToNetLinkResponse(this);
        } 

    } 

}
