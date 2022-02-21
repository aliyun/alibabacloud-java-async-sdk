// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWarningConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateWarningConfigResponse</p>
 */
public class UpdateWarningConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateWarningConfigResponseBody body;

    private UpdateWarningConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateWarningConfigResponse create() {
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
    public UpdateWarningConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateWarningConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateWarningConfigResponseBody body);

        @Override
        UpdateWarningConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateWarningConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateWarningConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateWarningConfigResponse response) {
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
        public Builder body(UpdateWarningConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateWarningConfigResponse build() {
            return new UpdateWarningConfigResponse(this);
        } 

    } 

}
