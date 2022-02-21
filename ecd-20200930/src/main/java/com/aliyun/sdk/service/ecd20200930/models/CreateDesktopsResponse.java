// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopsResponse} extends {@link TeaModel}
 *
 * <p>CreateDesktopsResponse</p>
 */
public class CreateDesktopsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDesktopsResponseBody body;

    private CreateDesktopsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDesktopsResponse create() {
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
    public CreateDesktopsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDesktopsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDesktopsResponseBody body);

        @Override
        CreateDesktopsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDesktopsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDesktopsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDesktopsResponse response) {
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
        public Builder body(CreateDesktopsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDesktopsResponse build() {
            return new CreateDesktopsResponse(this);
        } 

    } 

}
