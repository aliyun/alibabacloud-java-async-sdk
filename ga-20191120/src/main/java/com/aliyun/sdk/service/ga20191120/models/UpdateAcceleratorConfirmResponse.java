// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAcceleratorConfirmResponse} extends {@link TeaModel}
 *
 * <p>UpdateAcceleratorConfirmResponse</p>
 */
public class UpdateAcceleratorConfirmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAcceleratorConfirmResponseBody body;

    private UpdateAcceleratorConfirmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAcceleratorConfirmResponse create() {
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
    public UpdateAcceleratorConfirmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAcceleratorConfirmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAcceleratorConfirmResponseBody body);

        @Override
        UpdateAcceleratorConfirmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAcceleratorConfirmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAcceleratorConfirmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAcceleratorConfirmResponse response) {
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
        public Builder body(UpdateAcceleratorConfirmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAcceleratorConfirmResponse build() {
            return new UpdateAcceleratorConfirmResponse(this);
        } 

    } 

}
