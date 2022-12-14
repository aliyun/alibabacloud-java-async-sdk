// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edsofficeservice20221125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopPoolResponse} extends {@link TeaModel}
 *
 * <p>CreateDesktopPoolResponse</p>
 */
public class CreateDesktopPoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDesktopPoolResponseBody body;

    private CreateDesktopPoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDesktopPoolResponse create() {
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
    public CreateDesktopPoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDesktopPoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDesktopPoolResponseBody body);

        @Override
        CreateDesktopPoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDesktopPoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDesktopPoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDesktopPoolResponse response) {
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
        public Builder body(CreateDesktopPoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDesktopPoolResponse build() {
            return new CreateDesktopPoolResponse(this);
        } 

    } 

}
