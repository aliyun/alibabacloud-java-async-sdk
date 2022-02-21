// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEslDeviceLightResponse} extends {@link TeaModel}
 *
 * <p>UpdateEslDeviceLightResponse</p>
 */
public class UpdateEslDeviceLightResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateEslDeviceLightResponseBody body;

    private UpdateEslDeviceLightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateEslDeviceLightResponse create() {
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
    public UpdateEslDeviceLightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateEslDeviceLightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateEslDeviceLightResponseBody body);

        @Override
        UpdateEslDeviceLightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateEslDeviceLightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateEslDeviceLightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateEslDeviceLightResponse response) {
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
        public Builder body(UpdateEslDeviceLightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateEslDeviceLightResponse build() {
            return new UpdateEslDeviceLightResponse(this);
        } 

    } 

}
