// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorCrossBorderStatusResponse} extends {@link TeaModel}
 *
 * <p>UpdateAcceleratorCrossBorderStatusResponse</p>
 */
public class UpdateAcceleratorCrossBorderStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAcceleratorCrossBorderStatusResponseBody body;

    private UpdateAcceleratorCrossBorderStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAcceleratorCrossBorderStatusResponse create() {
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
    public UpdateAcceleratorCrossBorderStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAcceleratorCrossBorderStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAcceleratorCrossBorderStatusResponseBody body);

        @Override
        UpdateAcceleratorCrossBorderStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAcceleratorCrossBorderStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAcceleratorCrossBorderStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAcceleratorCrossBorderStatusResponse response) {
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
        public Builder body(UpdateAcceleratorCrossBorderStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAcceleratorCrossBorderStatusResponse build() {
            return new UpdateAcceleratorCrossBorderStatusResponse(this);
        } 

    } 

}
