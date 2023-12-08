// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateDBClusterResponse</p>
 */
public class CreateDBClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDBClusterResponseBody body;

    private CreateDBClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDBClusterResponse create() {
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
    public CreateDBClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDBClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDBClusterResponseBody body);

        @Override
        CreateDBClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDBClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDBClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDBClusterResponse response) {
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
        public Builder body(CreateDBClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDBClusterResponse build() {
            return new CreateDBClusterResponse(this);
        } 

    } 

}
