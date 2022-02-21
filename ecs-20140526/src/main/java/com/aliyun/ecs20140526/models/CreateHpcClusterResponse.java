// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHpcClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateHpcClusterResponse</p>
 */
public class CreateHpcClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateHpcClusterResponseBody body;

    private CreateHpcClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateHpcClusterResponse create() {
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
    public CreateHpcClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateHpcClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateHpcClusterResponseBody body);

        @Override
        CreateHpcClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateHpcClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateHpcClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateHpcClusterResponse response) {
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
        public Builder body(CreateHpcClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateHpcClusterResponse build() {
            return new CreateHpcClusterResponse(this);
        } 

    } 

}
