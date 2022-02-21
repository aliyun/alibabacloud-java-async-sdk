// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AllocateClusterPublicConnectionResponse} extends {@link TeaModel}
 *
 * <p>AllocateClusterPublicConnectionResponse</p>
 */
public class AllocateClusterPublicConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AllocateClusterPublicConnectionResponseBody body;

    private AllocateClusterPublicConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AllocateClusterPublicConnectionResponse create() {
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
    public AllocateClusterPublicConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AllocateClusterPublicConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AllocateClusterPublicConnectionResponseBody body);

        @Override
        AllocateClusterPublicConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AllocateClusterPublicConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AllocateClusterPublicConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AllocateClusterPublicConnectionResponse response) {
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
        public Builder body(AllocateClusterPublicConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AllocateClusterPublicConnectionResponse build() {
            return new AllocateClusterPublicConnectionResponse(this);
        } 

    } 

}
