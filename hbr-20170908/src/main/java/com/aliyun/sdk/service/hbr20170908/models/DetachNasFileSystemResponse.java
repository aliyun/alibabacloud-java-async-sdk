// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachNasFileSystemResponse} extends {@link TeaModel}
 *
 * <p>DetachNasFileSystemResponse</p>
 */
public class DetachNasFileSystemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachNasFileSystemResponseBody body;

    private DetachNasFileSystemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachNasFileSystemResponse create() {
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
    public DetachNasFileSystemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachNasFileSystemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachNasFileSystemResponseBody body);

        @Override
        DetachNasFileSystemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachNasFileSystemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachNasFileSystemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachNasFileSystemResponse response) {
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
        public Builder body(DetachNasFileSystemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachNasFileSystemResponse build() {
            return new DetachNasFileSystemResponse(this);
        } 

    } 

}
