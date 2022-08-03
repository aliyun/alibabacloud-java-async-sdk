// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveCloudAccountResponse} extends {@link TeaModel}
 *
 * <p>RemoveCloudAccountResponse</p>
 */
public class RemoveCloudAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveCloudAccountResponseBody body;

    private RemoveCloudAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveCloudAccountResponse create() {
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
    public RemoveCloudAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveCloudAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveCloudAccountResponseBody body);

        @Override
        RemoveCloudAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveCloudAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveCloudAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveCloudAccountResponse response) {
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
        public Builder body(RemoveCloudAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveCloudAccountResponse build() {
            return new RemoveCloudAccountResponse(this);
        } 

    } 

}
