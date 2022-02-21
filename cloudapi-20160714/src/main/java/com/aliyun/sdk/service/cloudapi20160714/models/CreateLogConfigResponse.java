// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLogConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateLogConfigResponse</p>
 */
public class CreateLogConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateLogConfigResponseBody body;

    private CreateLogConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLogConfigResponse create() {
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
    public CreateLogConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLogConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateLogConfigResponseBody body);

        @Override
        CreateLogConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLogConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateLogConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLogConfigResponse response) {
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
        public Builder body(CreateLogConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLogConfigResponse build() {
            return new CreateLogConfigResponse(this);
        } 

    } 

}
