// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationInfoResponse} extends {@link TeaModel}
 *
 * <p>CreateApplicationInfoResponse</p>
 */
public class CreateApplicationInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateApplicationInfoResponseBody body;

    private CreateApplicationInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateApplicationInfoResponse create() {
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
    public CreateApplicationInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateApplicationInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateApplicationInfoResponseBody body);

        @Override
        CreateApplicationInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateApplicationInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateApplicationInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateApplicationInfoResponse response) {
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
        public Builder body(CreateApplicationInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateApplicationInfoResponse build() {
            return new CreateApplicationInfoResponse(this);
        } 

    } 

}
