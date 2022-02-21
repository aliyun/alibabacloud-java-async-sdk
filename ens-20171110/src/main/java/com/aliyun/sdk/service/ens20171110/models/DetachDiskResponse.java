// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachDiskResponse} extends {@link TeaModel}
 *
 * <p>DetachDiskResponse</p>
 */
public class DetachDiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetachDiskResponseBody body;

    private DetachDiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetachDiskResponse create() {
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
    public DetachDiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetachDiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetachDiskResponseBody body);

        @Override
        DetachDiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetachDiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetachDiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetachDiskResponse response) {
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
        public Builder body(DetachDiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetachDiskResponse build() {
            return new DetachDiskResponse(this);
        } 

    } 

}
