// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVirtualPhysicalConnectionResponse} extends {@link TeaModel}
 *
 * <p>UpdateVirtualPhysicalConnectionResponse</p>
 */
public class UpdateVirtualPhysicalConnectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVirtualPhysicalConnectionResponseBody body;

    private UpdateVirtualPhysicalConnectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVirtualPhysicalConnectionResponse create() {
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
    public UpdateVirtualPhysicalConnectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVirtualPhysicalConnectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVirtualPhysicalConnectionResponseBody body);

        @Override
        UpdateVirtualPhysicalConnectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVirtualPhysicalConnectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVirtualPhysicalConnectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVirtualPhysicalConnectionResponse response) {
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
        public Builder body(UpdateVirtualPhysicalConnectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVirtualPhysicalConnectionResponse build() {
            return new UpdateVirtualPhysicalConnectionResponse(this);
        } 

    } 

}
