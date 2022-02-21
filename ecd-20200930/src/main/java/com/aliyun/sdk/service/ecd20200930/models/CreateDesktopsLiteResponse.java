// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDesktopsLiteResponse} extends {@link TeaModel}
 *
 * <p>CreateDesktopsLiteResponse</p>
 */
public class CreateDesktopsLiteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDesktopsLiteResponseBody body;

    private CreateDesktopsLiteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDesktopsLiteResponse create() {
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
    public CreateDesktopsLiteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDesktopsLiteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDesktopsLiteResponseBody body);

        @Override
        CreateDesktopsLiteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDesktopsLiteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDesktopsLiteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDesktopsLiteResponse response) {
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
        public Builder body(CreateDesktopsLiteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDesktopsLiteResponse build() {
            return new CreateDesktopsLiteResponse(this);
        } 

    } 

}
