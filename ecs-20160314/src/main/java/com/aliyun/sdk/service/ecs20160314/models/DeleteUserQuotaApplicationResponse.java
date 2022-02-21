// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserQuotaApplicationResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserQuotaApplicationResponse</p>
 */
public class DeleteUserQuotaApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserQuotaApplicationResponseBody body;

    private DeleteUserQuotaApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserQuotaApplicationResponse create() {
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
    public DeleteUserQuotaApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserQuotaApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserQuotaApplicationResponseBody body);

        @Override
        DeleteUserQuotaApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserQuotaApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserQuotaApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserQuotaApplicationResponse response) {
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
        public Builder body(DeleteUserQuotaApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserQuotaApplicationResponse build() {
            return new DeleteUserQuotaApplicationResponse(this);
        } 

    } 

}
