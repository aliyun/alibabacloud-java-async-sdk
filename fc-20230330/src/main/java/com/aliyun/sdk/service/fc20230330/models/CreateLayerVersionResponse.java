// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLayerVersionResponse} extends {@link TeaModel}
 *
 * <p>CreateLayerVersionResponse</p>
 */
public class CreateLayerVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Layer body;

    private CreateLayerVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateLayerVersionResponse create() {
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
    public Layer getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateLayerVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Layer body);

        @Override
        CreateLayerVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateLayerVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Layer body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateLayerVersionResponse response) {
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
        public Builder body(Layer body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateLayerVersionResponse build() {
            return new CreateLayerVersionResponse(this);
        } 

    } 

}
