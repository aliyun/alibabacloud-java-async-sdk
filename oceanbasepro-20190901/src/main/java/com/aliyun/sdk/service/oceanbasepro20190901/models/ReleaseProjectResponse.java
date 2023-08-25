// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseProjectResponse} extends {@link TeaModel}
 *
 * <p>ReleaseProjectResponse</p>
 */
public class ReleaseProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseProjectResponseBody body;

    private ReleaseProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseProjectResponse create() {
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
    public ReleaseProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseProjectResponseBody body);

        @Override
        ReleaseProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseProjectResponse response) {
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
        public Builder body(ReleaseProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseProjectResponse build() {
            return new ReleaseProjectResponse(this);
        } 

    } 

}
