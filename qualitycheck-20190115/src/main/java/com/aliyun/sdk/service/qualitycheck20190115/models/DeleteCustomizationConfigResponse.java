// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomizationConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomizationConfigResponse</p>
 */
public class DeleteCustomizationConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCustomizationConfigResponseBody body;

    private DeleteCustomizationConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCustomizationConfigResponse create() {
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
    public DeleteCustomizationConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomizationConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCustomizationConfigResponseBody body);

        @Override
        DeleteCustomizationConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomizationConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCustomizationConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomizationConfigResponse response) {
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
        public Builder body(DeleteCustomizationConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomizationConfigResponse build() {
            return new DeleteCustomizationConfigResponse(this);
        } 

    } 

}
