// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigResponse} extends {@link TeaModel}
 *
 * <p>CreateConfigResponse</p>
 */
public class CreateConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateConfigResponseBody body;

    private CreateConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateConfigResponse create() {
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
    public CreateConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateConfigResponseBody body);

        @Override
        CreateConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateConfigResponse response) {
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
        public Builder body(CreateConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateConfigResponse build() {
            return new CreateConfigResponse(this);
        } 

    } 

}
