// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServerlessClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateServerlessClusterResponse</p>
 */
public class CreateServerlessClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServerlessClusterResponseBody body;

    private CreateServerlessClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServerlessClusterResponse create() {
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
    public CreateServerlessClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServerlessClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServerlessClusterResponseBody body);

        @Override
        CreateServerlessClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServerlessClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServerlessClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServerlessClusterResponse response) {
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
        public Builder body(CreateServerlessClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServerlessClusterResponse build() {
            return new CreateServerlessClusterResponse(this);
        } 

    } 

}
