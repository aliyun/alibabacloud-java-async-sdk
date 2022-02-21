// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleaseInstanceResponse} extends {@link TeaModel}
 *
 * <p>ReleaseInstanceResponse</p>
 */
public class ReleaseInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReleaseInstanceResponseBody body;

    private ReleaseInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReleaseInstanceResponse create() {
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
    public ReleaseInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReleaseInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReleaseInstanceResponseBody body);

        @Override
        ReleaseInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReleaseInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReleaseInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReleaseInstanceResponse response) {
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
        public Builder body(ReleaseInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReleaseInstanceResponse build() {
            return new ReleaseInstanceResponse(this);
        } 

    } 

}
