// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateConfigResponse</p>
 */
public class UpdateConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateConfigResponseBody body;

    private UpdateConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateConfigResponse create() {
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
    public UpdateConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateConfigResponseBody body);

        @Override
        UpdateConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateConfigResponse response) {
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
        public Builder body(UpdateConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateConfigResponse build() {
            return new UpdateConfigResponse(this);
        } 

    } 

}
