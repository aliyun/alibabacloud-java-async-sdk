// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLayerVersionResponse} extends {@link TeaModel}
 *
 * <p>GetLayerVersionResponse</p>
 */
public class GetLayerVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Layer body;

    private GetLayerVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLayerVersionResponse create() {
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

    public interface Builder extends Response.Builder<GetLayerVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Layer body);

        @Override
        GetLayerVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLayerVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Layer body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLayerVersionResponse response) {
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
        public GetLayerVersionResponse build() {
            return new GetLayerVersionResponse(this);
        } 

    } 

}
