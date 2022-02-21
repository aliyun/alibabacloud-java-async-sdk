// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNetworkResponse} extends {@link TeaModel}
 *
 * <p>CreateNetworkResponse</p>
 */
public class CreateNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNetworkResponseBody body;

    private CreateNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNetworkResponse create() {
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
    public CreateNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNetworkResponseBody body);

        @Override
        CreateNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNetworkResponse response) {
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
        public Builder body(CreateNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNetworkResponse build() {
            return new CreateNetworkResponse(this);
        } 

    } 

}
