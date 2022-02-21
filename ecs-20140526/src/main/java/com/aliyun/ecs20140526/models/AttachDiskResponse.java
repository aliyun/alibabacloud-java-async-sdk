// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDiskResponse} extends {@link TeaModel}
 *
 * <p>AttachDiskResponse</p>
 */
public class AttachDiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachDiskResponseBody body;

    private AttachDiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachDiskResponse create() {
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
    public AttachDiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachDiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachDiskResponseBody body);

        @Override
        AttachDiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachDiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachDiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachDiskResponse response) {
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
        public Builder body(AttachDiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachDiskResponse build() {
            return new AttachDiskResponse(this);
        } 

    } 

}
