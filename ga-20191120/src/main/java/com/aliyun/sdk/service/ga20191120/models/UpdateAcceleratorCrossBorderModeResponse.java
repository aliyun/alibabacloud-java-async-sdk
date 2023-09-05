// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorCrossBorderModeResponse} extends {@link TeaModel}
 *
 * <p>UpdateAcceleratorCrossBorderModeResponse</p>
 */
public class UpdateAcceleratorCrossBorderModeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAcceleratorCrossBorderModeResponseBody body;

    private UpdateAcceleratorCrossBorderModeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAcceleratorCrossBorderModeResponse create() {
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
    public UpdateAcceleratorCrossBorderModeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAcceleratorCrossBorderModeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAcceleratorCrossBorderModeResponseBody body);

        @Override
        UpdateAcceleratorCrossBorderModeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAcceleratorCrossBorderModeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAcceleratorCrossBorderModeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAcceleratorCrossBorderModeResponse response) {
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
        public Builder body(UpdateAcceleratorCrossBorderModeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAcceleratorCrossBorderModeResponse build() {
            return new UpdateAcceleratorCrossBorderModeResponse(this);
        } 

    } 

}
