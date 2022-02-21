// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFabricConsortiumResponse} extends {@link TeaModel}
 *
 * <p>CreateFabricConsortiumResponse</p>
 */
public class CreateFabricConsortiumResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFabricConsortiumResponseBody body;

    private CreateFabricConsortiumResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFabricConsortiumResponse create() {
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
    public CreateFabricConsortiumResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFabricConsortiumResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFabricConsortiumResponseBody body);

        @Override
        CreateFabricConsortiumResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFabricConsortiumResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFabricConsortiumResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFabricConsortiumResponse response) {
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
        public Builder body(CreateFabricConsortiumResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFabricConsortiumResponse build() {
            return new CreateFabricConsortiumResponse(this);
        } 

    } 

}
