// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecurityEventMarkMissListResponse} extends {@link TeaModel}
 *
 * <p>DeleteSecurityEventMarkMissListResponse</p>
 */
public class DeleteSecurityEventMarkMissListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSecurityEventMarkMissListResponseBody body;

    private DeleteSecurityEventMarkMissListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSecurityEventMarkMissListResponse create() {
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
    public DeleteSecurityEventMarkMissListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSecurityEventMarkMissListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSecurityEventMarkMissListResponseBody body);

        @Override
        DeleteSecurityEventMarkMissListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSecurityEventMarkMissListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSecurityEventMarkMissListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSecurityEventMarkMissListResponse response) {
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
        public Builder body(DeleteSecurityEventMarkMissListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSecurityEventMarkMissListResponse build() {
            return new DeleteSecurityEventMarkMissListResponse(this);
        } 

    } 

}
