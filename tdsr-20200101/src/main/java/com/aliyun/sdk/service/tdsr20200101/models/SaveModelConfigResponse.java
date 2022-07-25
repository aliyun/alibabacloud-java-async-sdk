// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveModelConfigResponse} extends {@link TeaModel}
 *
 * <p>SaveModelConfigResponse</p>
 */
public class SaveModelConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SaveModelConfigResponseBody body;

    private SaveModelConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SaveModelConfigResponse create() {
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
    public SaveModelConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SaveModelConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SaveModelConfigResponseBody body);

        @Override
        SaveModelConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SaveModelConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SaveModelConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SaveModelConfigResponse response) {
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
        public Builder body(SaveModelConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SaveModelConfigResponse build() {
            return new SaveModelConfigResponse(this);
        } 

    } 

}
