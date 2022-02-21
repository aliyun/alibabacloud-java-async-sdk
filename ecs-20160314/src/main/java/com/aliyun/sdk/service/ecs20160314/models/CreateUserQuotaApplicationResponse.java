// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUserQuotaApplicationResponse} extends {@link TeaModel}
 *
 * <p>CreateUserQuotaApplicationResponse</p>
 */
public class CreateUserQuotaApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUserQuotaApplicationResponseBody body;

    private CreateUserQuotaApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUserQuotaApplicationResponse create() {
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
    public CreateUserQuotaApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUserQuotaApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUserQuotaApplicationResponseBody body);

        @Override
        CreateUserQuotaApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUserQuotaApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUserQuotaApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUserQuotaApplicationResponse response) {
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
        public Builder body(CreateUserQuotaApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUserQuotaApplicationResponse build() {
            return new CreateUserQuotaApplicationResponse(this);
        } 

    } 

}
