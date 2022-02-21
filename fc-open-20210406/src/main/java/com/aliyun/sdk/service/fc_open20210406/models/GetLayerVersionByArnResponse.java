// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLayerVersionByArnResponse} extends {@link TeaModel}
 *
 * <p>GetLayerVersionByArnResponse</p>
 */
public class GetLayerVersionByArnResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetLayerVersionByArnResponseBody body;

    private GetLayerVersionByArnResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetLayerVersionByArnResponse create() {
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
    public GetLayerVersionByArnResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetLayerVersionByArnResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetLayerVersionByArnResponseBody body);

        @Override
        GetLayerVersionByArnResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetLayerVersionByArnResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetLayerVersionByArnResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetLayerVersionByArnResponse response) {
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
        public Builder body(GetLayerVersionByArnResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetLayerVersionByArnResponse build() {
            return new GetLayerVersionByArnResponse(this);
        } 

    } 

}
