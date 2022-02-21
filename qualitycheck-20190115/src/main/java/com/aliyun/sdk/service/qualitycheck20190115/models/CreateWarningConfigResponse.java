// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWarningConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateWarningConfigResponse</p>
 */
public class CreateWarningConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateWarningConfigResponseBody body;

    private CreateWarningConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateWarningConfigResponse create() {
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
    public CreateWarningConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateWarningConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateWarningConfigResponseBody body);

        @Override
        CreateWarningConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateWarningConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateWarningConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateWarningConfigResponse response) {
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
        public Builder body(CreateWarningConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateWarningConfigResponse build() {
            return new CreateWarningConfigResponse(this);
        } 

    } 

}
