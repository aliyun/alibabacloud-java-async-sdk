// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachDdosToAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>AttachDdosToAcceleratorResponse</p>
 */
public class AttachDdosToAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AttachDdosToAcceleratorResponseBody body;

    private AttachDdosToAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AttachDdosToAcceleratorResponse create() {
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
    public AttachDdosToAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AttachDdosToAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AttachDdosToAcceleratorResponseBody body);

        @Override
        AttachDdosToAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AttachDdosToAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AttachDdosToAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AttachDdosToAcceleratorResponse response) {
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
        public Builder body(AttachDdosToAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AttachDdosToAcceleratorResponse build() {
            return new AttachDdosToAcceleratorResponse(this);
        } 

    } 

}
