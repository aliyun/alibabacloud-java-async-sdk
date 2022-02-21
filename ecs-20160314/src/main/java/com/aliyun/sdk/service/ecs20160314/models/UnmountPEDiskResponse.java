// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnmountPEDiskResponse} extends {@link TeaModel}
 *
 * <p>UnmountPEDiskResponse</p>
 */
public class UnmountPEDiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnmountPEDiskResponseBody body;

    private UnmountPEDiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnmountPEDiskResponse create() {
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
    public UnmountPEDiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnmountPEDiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnmountPEDiskResponseBody body);

        @Override
        UnmountPEDiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnmountPEDiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnmountPEDiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnmountPEDiskResponse response) {
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
        public Builder body(UnmountPEDiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnmountPEDiskResponse build() {
            return new UnmountPEDiskResponse(this);
        } 

    } 

}
