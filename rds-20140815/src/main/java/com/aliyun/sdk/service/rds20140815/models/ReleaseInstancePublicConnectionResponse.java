// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstancePublicConnectionResponse} extends {@link TeaModel}
 *
 * <p>ReleaseInstancePublicConnectionResponse</p>
 */
public class ReleaseInstancePublicConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseInstancePublicConnectionResponseBody body;

    private ReleaseInstancePublicConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseInstancePublicConnectionResponse create() {
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
    public ReleaseInstancePublicConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseInstancePublicConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseInstancePublicConnectionResponseBody body);

        @Override
        ReleaseInstancePublicConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseInstancePublicConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseInstancePublicConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseInstancePublicConnectionResponse response) {
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
        public Builder body(ReleaseInstancePublicConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseInstancePublicConnectionResponse build() {
            return new ReleaseInstancePublicConnectionResponse(this);
        } 

    } 

}
