// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBasicAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>UpdateBasicAcceleratorResponse</p>
 */
public class UpdateBasicAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateBasicAcceleratorResponseBody body;

    private UpdateBasicAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateBasicAcceleratorResponse create() {
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
    public UpdateBasicAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateBasicAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateBasicAcceleratorResponseBody body);

        @Override
        UpdateBasicAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateBasicAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateBasicAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateBasicAcceleratorResponse response) {
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
        public Builder body(UpdateBasicAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateBasicAcceleratorResponse build() {
            return new UpdateBasicAcceleratorResponse(this);
        } 

    } 

}
