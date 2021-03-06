// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachClusterToHubResponse} extends {@link TeaModel}
 *
 * <p>AttachClusterToHubResponse</p>
 */
public class AttachClusterToHubResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachClusterToHubResponseBody body;

    private AttachClusterToHubResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachClusterToHubResponse create() {
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
    public AttachClusterToHubResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachClusterToHubResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachClusterToHubResponseBody body);

        @Override
        AttachClusterToHubResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachClusterToHubResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachClusterToHubResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachClusterToHubResponse response) {
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
        public Builder body(AttachClusterToHubResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachClusterToHubResponse build() {
            return new AttachClusterToHubResponse(this);
        } 

    } 

}
